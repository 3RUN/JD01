package by.htp.les01.linear;

public class LinearTask {

	public static void main(String[] args) {

		// test task #10
		exLine10();

	}

	// linear
	public static void exLine01() {

		float x = 4.0f;
		float y = 3.0f;
		float res = 0.0f;

		res = x + y;
		System.out.println("Sum of " + x + " and " + y + " equals to " + res);

		res = x - y;
		System.out.println("Difference of " + x + " and " + y + " equals to " + res);

		res = x * y;
		System.out.println("Product of " + x + " and " + y + " equals to " + res);

		res = x / y;
		System.out.println("Quotient of " + x + " and " + y + " equals to " + res);

	}

	public static void exLine02() {

		// c = 3 + a
		float a = 2.0f;
		float c = 0.0f;

		c = 3 + a;
		System.out.println("c = 3 + a");
		System.out.println(c);

	}

	public static void exLine03() {

		// z = 2 * x + ((y - 2) * 5)
		float x = 2.0f;
		float y = 4.0f;
		float res = 0.0f;

		res = (2 * x) + ((y - 2) * 5);
		System.out.println("z = 2 * x + ( y - 2 ) * 5");
		System.out.println(res);

	}

	public static void exLine04() {

		// z = ((a - 3) * b / 2) + c
		float a = 2.0f;
		float b = 1.0f;
		float c = 3.0f;
		float res = 0.0f;

		res = ((a - 3) * b / 2) + c;
		System.out.println("z = ( (a - 3 ) * b / 2) + c");
		System.out.println(res);

	}

	public static void exLine05() {

		float a = 5.0f;
		float b = 10.0f;
		float res = 0.0f;

		res = (a + b) / 2;
		System.out.println("Avarage of " + a + " and " + b + " is " + res);

	}

	public static void exLine06() {

		float n = 4.0f;
		float m = 6.0f;
		float res = 0.0f;

		res = ((80 / n) + 12) * m;
		System.out.println("Result: " + res);

	}

	public static void exLine07() {

		float x = 10.0f;
		float y = 0.0f;
		float res = 0.0f;

		y = x / 2;
		res = x * y; // or x * (x / 2)
		System.out.println("Area of rectangular with a given sides " + x + " and " + y + " is " + res);

	}

	public static void exLine08() {

		double a = 3.0D;
		double b = 5.0D;
		double c = 7.0D;
		double res = 0.0D;

		res = ((b + Math.sqrt((Math.pow(b, 2) + (4 * a * c)))) / (2 * a)) - (Math.pow(a, 3) * c) + (Math.pow(b, -2));
		System.out.println(res);

	}

	public static void exLine09() {

		float a = 5.0f;
		float b = 4.0f;
		float c = 2.0f;
		float d = 3.0f;
		float res = 0.0f;

		res = ((a / c) * (b / d)) - ((a * b - c) / (c * d));
		System.out.println(res);

	}

	public static void exLine10() {

		double x = 90.0D;
		double y = 60.0D;
		double res = 0.0D;

		res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.println(res);

	}

}
