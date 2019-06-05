package by.htp.les01.branch;

import by.htp.les01.helper.Helper;

public class BranchTask {

	public static void main(String[] args) {

		// test task #10
		exBranch10();

	}

	// if-else branching
	public static void exBranch01() {

		int x = 10;
		int y = 20;

		if (x < y) {
			System.out.println(7);
		} else {
			System.out.println(8);
		}

	}

	public static void exBranch02() {

		int x = 20;
		int y = 10;

		if (x < y) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

	public static void exBranch03() {

		System.out.println("Please enter a positive number!");
		int i = Helper.getInputPositiveInt();

		if (i < 3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

	public static void exBranch04() {

		int a = 5;
		int b = 6;

		if (a == b) {
			System.out.println("Number a equals to number b!");
		} else {
			System.out.println("Number a doesn't equal to number b!");
		}

	}

	public static void exBranch05() {

		int a = 5;
		int b = 6;

		if (a < b) {
			System.out.println("Number a is smaller than number b!");
		} else {
			System.out.println("Number b is smaller than number a!");
		}

	}

	public static void exBranch06() {

		int a = 5;
		int b = 6;

		if (a > b) {
			System.out.println("Number a is bigger than number b!");
		} else {
			System.out.println("Number b is bigger than number a!");
		}

	}

	public static void exBranch07() {

		int a = 2;
		int b = 3;
		int c = 1;
		int x = -4;
		int res = (a * x * x) + (b * x) + c;

		if (res < 0) {
			res = -res;
		} // or Math.abs(res);
		System.out.println(res);

	}

	public static void exBranch08() {

		double a = 2.0D;
		double b = 3.0D;

		if (Math.pow(a, 2) < Math.pow(b, 2)) {
			System.out.println(Math.pow(a, 2));
		} else {
			System.out.println(Math.pow(b, 2));
		}

	}

	public static void exBranch09() {

		int sideA = 5;
		int sideB = 5;
		int sideC = 5;

		if (sideA == sideB && sideA == sideC) {
			System.out.println("Given triangle is equilateral!");
		} else {
			System.out.println("Given triangle is not equilateral!");
		}

	}

	public static void exBranch10() {

		float PI = 3.14f;
		double radA = 5D;
		double radB = 2D;
		double circleA = Math.pow(radA, 2) * PI;
		double circleB = Math.pow(radB, 2) * PI;

		if (circleA < circleB) {
			System.out.println("Area of a circle \"A\" is smaller!");
		} else {
			System.out.println("Area of a circle \"B\" is smaller!");
		}

	}

}
