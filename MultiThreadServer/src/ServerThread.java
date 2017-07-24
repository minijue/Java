import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ServerThread implements Runnable {
	Socket s = null;
	BufferedReader br = null;

	public ServerThread(Socket s) throws UnsupportedEncodingException, IOException {
		this.s = s;
		br = new BufferedReader(new InputStreamReader(s.getInputStream(), "utf-8"));
	}

	@Override
	public void run() {
		String content = null;
		while ((content = readFromClient()) != null) {
			for (Socket s : MyServer.socketList) {
				OutputStream os;
				try {
					os = s.getOutputStream();
					byte[] outstr = (content + "\n").getBytes("utf-8");
					System.out.println(content + "\n");
					os.write(outstr);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private String readFromClient() {
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			MyServer.socketList.remove(s);
		}
		return null;
	}

}
