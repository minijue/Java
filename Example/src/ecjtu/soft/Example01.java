package ecjtu.soft;

import java.io.IOException;

public class Example01 {
	static void showArea(TwoDShape t) throws IOException {
		char c = (char) System.in.read();
		System.out.println("The area is " + t.area());
	}

	public static void main(String[] args) {
		TwoDShape t1;
		try {
			t1 = new Rectangle(-4, 6);
			showArea(t1);
		} catch (NumberException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		TwoDShape t2 = new Triangle(4, 6, 8, 7);

		try {

			showArea(t2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
