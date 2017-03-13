package lambdaDemo;

interface MyValue {
	double getValue();
}

interface MyParamValue {
	double getValue(double v);
}

public class lambdaDemo {

	public static void main(String[] args) {
		MyValue myVal=()-> 98.6;		
		System.out.println("A constant value: "+myVal.getValue());
		
		MyParamValue myPval=(n)->1.0/n;
		System.out.println("Reciprocal of 4 is "+myPval.getValue(4.0));
		System.out.println("Reciprocal of 8 is "+myPval.getValue(8.0));		
	}

}
