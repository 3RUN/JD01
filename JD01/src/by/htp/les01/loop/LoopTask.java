package by.htp.les01.loop;

import by.htp.les01.helper.Helper;

public class LoopTask {

	public static void main(String[] args) {

		// test task #25
		exLoop25();

	}

	// loops
	public static void exLoop01() {

		int i = 0;

		for (i = 0; i < 5; i++) {
			System.out.println(i + 1);
		}

	}

	public static void exLoop02() {

		int i = 5;

		for (i = 5; i > 0; i--) {
			System.out.println(i);
		}

	}

	public static void exLoop03() {

		int i = 0;

		for (i = 0; i < 10; i++) {
			System.out.println("3 x " + (i + 1) + " : " + (3 * (i + 1)));
		}

	}

	public static void exLoop04() {

		int i = 1;

		while (i <= 100) {

			if ((i % 2) == 0) {
				System.out.println(i);
			}

			i++;
		}

	}

	public static void exLoop05() {

		int i = 1;

		while (i < 100) {

			if ((i % 2) != 0) {
				System.out.println(i);
			}

			i++;
		}

	}

	public static void exLoop06() {

		int input = Helper.getInputPositiveInt();
		int i = 1;
		int res = 0;

		while (i <= input) {

			res = res + i;
			System.out.println(res);
			i++;

		}

	}

	public static void exLoop07() {

		double a = -2.0D;
		double b = 2.0D;
		double x = a;
		double y = 0.0D;
		double h = 0.5D;

		while (x <= b) {

			y = Math.tan(x) + x * x * x;
			System.out.println(x + " " + y);
			x = x + h;

		}

	}

	public static void exLoop10() {

		int i = 0;
		double res = 1.0D;

		for (i = 1; i <= 200; i++) {

			res = res * Math.pow(i, 2);
			System.out.println(res);

		}

	}

	public static void exLoop24() {

		int n = Helper.getInputPositiveInt();
		int sum = 0;

		while (n > 0) {

			if (((n % 10) % 2) == 0) {
				sum = sum + (n % 10);
			}

			n = n / 10;
		}

		System.out.println(sum);

	}

	public static void exLoop25() {

		int input = Helper.getInputPositiveInt();
		int i = 1;
		int factorial = 1;

		while (i <= input) {

			factorial = factorial * i;
			i++;

		}

		System.out.println("!" + input + " = " + factorial);

	}

}
