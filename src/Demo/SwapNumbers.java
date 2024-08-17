package Demo;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 22;
		int b = 33;

		System.out.println("Before swap a is " + a + " b is " + b);

		int c = a;
		a = b;
		b = c;

		System.out.println("After swap a is " + a + " b is " + b);

		System.out.println();
		
		// swap without 3rd variable

		int x = 48;
		int y = 77;
		System.out.println("Before swap x is " + x + " y is " + y);

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swap x is " + x + " y is " + y);
	}

}
