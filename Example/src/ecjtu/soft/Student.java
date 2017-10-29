package ecjtu.soft;

public class Student {
	private static int maxno = 0;
	private int no;
	String name;

	double normScore;
	double examScore;
	double finalScore;

	final double rate = 0.5;

	public Student(String name, double norm, double exam) {
		no = ++maxno;
		this.name = name;
		normScore = norm;
		examScore = exam;
		calScore();
	}

	void calScore() {
		finalScore = normScore * rate + examScore * (1 - rate);
	}

	void displayScore() {
		System.out.println("" + no + "\t" + name + "\t" + finalScore);
	}
}
