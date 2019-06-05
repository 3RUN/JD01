package by.htp.les01.decomposition;

import by.htp.les01.helper.Helper;

public class Decomposition {

	public static void main(String[] args) {

		// test task #10
		exDecom10();

	}

	// decomposition
	public static void exDecom01() {

		int aX = -3;
		int aY = 0;
		int bX = 0;
		int bY = 3;
		int cX = 0;
		int cY = -3;

		System.out.println("Area of triangle with a given vertex coordinages:");
		System.out.println("x1 = " + aX + "; y1 = " + aY + ";\nx2 = " + bX + "; y2 = " + bY + ";\nx3 = " + cX
				+ "; y3 = " + cY + ";");
		System.out.println("Equals to " + Helper.getAreaOfTriangle(aX, aY, bX, bY, cX, cY));

	}

	public static void exDecom02() {

		int a = 3;
		int b = 4;

		System.out.println("Greatest Common Divisor of numbers " + a + ", " + b + " is " + Helper.getGCD(a, b));
		System.out.println("Least Common Multiple of numbers " + a + ", " + b + " is " + Helper.getLCM(a, b));

	}

	public static void exDecom03() {

		int a = 12;
		int b = 24;
		int c = 10;
		int d = 11;

		System.out.println("Greatest Common Divisor of numbers " + a + ", " + b + ", " + c + ", " + d + " is "
				+ Helper.getGCD(a, b, c, d));

	}

	public static void exDecom04() {

		int a = 3;
		int b = 4;
		int c = 2;

		System.out.println(
				"Least Common Multiple of numbers " + a + ", " + b + ", " + c + " is " + Helper.getLCM(a, b, c));

	}

	public static void exDecom05() {

		int a = 3;
		int b = 6;
		int c = 10;

		System.out.println("Their sum equals to " + Helper.getSumMinMax(a, b, c));

	}

	public static void exDecom06() {

		double a = 5;

		System.out.println("Area of hexagon with a size of a side " + a + " equals to " + Helper.getAreaOfHexagon(a));

	}

	public static void exDecom07() {

		// enter amount of coordinates
		System.out.println("Setting max amount of pairs (from 2 up to 10).");

		int limit = 10;
		int max = Helper.getInputPositiveInt();
		if (max < 2) {
			max = 2;
		}
		if (max > limit) {
			max = limit;
		}
		int[][] coords = new int[max][2];

		System.out.println("Max amount of pairs was set to " + max);

		int i = 0;
		int j = 0;

		// enter info into coordinates
		for (i = 0; i < max; i++) {

			for (j = 0; j < 2; j++) {

				if (j == 0) {
					System.out.println("Setting coordinates for point x" + (i + 1));
				} else {
					System.out.println("Setting coordinates for point y" + (i + 1));
				}
				coords[i][j] = Helper.getInputInt();

			}

		}

		// set default max distance
		int maxDistance = Helper.getLenght(coords[0][0], coords[0][1]);
		int[] res = Helper.findMaxDistance(coords, max, maxDistance);

		// all segments have equal length?
		if (res[0] == -1 && res[1] == -1) {
			System.out.println("All gives pairs have same length!");
		} else {
			System.out.println("Max distance " + res[0] + " was found between points x" + res[1] + " and y" + res[1]);
		}

	}

	public static void exDecom08() {

		// enter amount of coordinates
		System.out.println("Setting size of an array (from 2 up to 10).");

		int limit = 10;
		int i = 0;
		int max = Helper.getInputPositiveInt();
		if (max < 2) {
			max = 2;
		}
		if (max > limit) {
			max = limit;
		}

		int[] array = new int[max];

		System.out.println("Array end index was set to " + max);

		// enter info into coordinates
		for (i = 0; i < max; i++) {
			System.out.println("Writting a number into " + i + " idex of an array.");
			array[i] = Helper.getInputInt();
		}

		System.out.println("Prebiggest number is " + Helper.findPrebiggestNumber(array));

	}

	public static void exDecom09() {

		int i = 0;
		int res = 0;
		int[] num = new int[3];

		for (i = 0; i < 3; i++) {
			System.out.println("Enter number " + (i + 1));
			num[i] = Helper.getInputInt();
		}

		res = Helper.checkPrimeNumber(num[0], num[1], num[2]);

		if (res == 1) {
			System.out.println("Numbers " + num[0] + ", " + num[1] + " and " + num[2] + " are mutually prime numbers!");
		} else {
			System.out.println(
					"Numbers " + num[0] + ", " + num[1] + " and " + num[2] + " are not mutually prime numbers!");
		}

	}

	public static void exDecom10() {

		int sum = Helper.getFactorialSum(9);
		System.out.println("Sum of all factorials from 1 up to 9 equals to " + sum);

	}

}
