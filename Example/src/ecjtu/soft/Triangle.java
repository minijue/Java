package ecjtu.soft;

public class Triangle implements TwoDShape {
	Triangle(int w, int h, int l1, int l2) {
		width = w;
		height = h;

		length1 = l1;
		length2 = l2;
	}

	@Override
	public	double area() {
		return (double) width * height / 2.0;
	}

	@Override
	public	void showDim() {
		System.out.println("I'm an object of Triangle.");
	}

	void showStyle() {
		System.out.println("I'm a normal Triangle.");
	}

	int length1, length2, width, height;
}
