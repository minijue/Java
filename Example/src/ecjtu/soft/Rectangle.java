package ecjtu.soft;

public class Rectangle implements TwoDShape {
	int width, height;

	@Override
	public double area() {
		return (double) width * height;
	}

	@Override
	public void showDim() {
		System.out.println("I'm an object of Rectangle.");
	}

	void showStyle() throws NumberException {
		if (width <= 0 || height <= 0)
			throw new NumberException();
		System.out.println("I'm a norm Rectangle.");
	}

	Rectangle(int w, int h) throws NumberException {
		if (width <= 0 || height <= 0)
			throw new NumberException();
		width = w;
		height = h;
	}

}
