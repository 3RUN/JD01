package by.htp.les01.array2d;

import by.htp.les01.helper.Helper;

public class ArrayMultiDimensional {

	public static void main(String[] args) {

		// test task #10
		exMulArray10();

	}

	// multidimensional arrays
	public static void exMulArray01() {

		int i = 0;
		int j = 0;
		int[][] array = new int[3][4];

		System.out.println("2d array " + array.length + "x" + array[0].length + "\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {

				if (j == 0) {
					array[i][j] = 1;
				} else {
					array[i][j] = 0;
				}
				System.out.printf("%3d ", array[i][j]);

			}
			System.out.println(" ");

		}

	}

	public static void exMulArray02() {

		int i = 0;
		int j = 0;
		int[][] array = new int[2][3];

		System.out.println("2d array " + array.length + "x" + array[0].length + "\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {
				array[i][j] = Helper.getRandomRange(0, 10);
				System.out.printf("%3d ", array[i][j]);
			}
			System.out.println(" ");

		}

	}

	public static void exMulArray03() {

		int i = 0;
		int j = 0;
		int[][] array = new int[4][5];

		System.out.println("2d array " + array.length + "x" + array[0].length + "\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {
				array[i][j] = (i * array[0].length) + j + 1;
				System.out.printf("%3d ", array[i][j]);
			}
			System.out.println(" ");

		}

		System.out.println("_____________");
		System.out.println("Only 1st and last columns\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {

				if (j == 0 || j == (array[0].length - 1)) {
					System.out.printf("%3d ", array[i][j]);
				}

			}
			System.out.println(" ");

		}

		System.out.println("_____________");

	}

	public static void exMulArray04() {

		int i = 0;
		int j = 0;
		int[][] array = new int[4][5];

		System.out.println("2d array " + array.length + "x" + array[0].length + "\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {
				array[i][j] = (i * array[0].length) + j + 1;
				System.out.printf("%3d ", array[i][j]);
			}
			System.out.println(" ");

		}

		System.out.println("_____________");
		System.out.println("Only 1st and last rows\n");

		for (i = 0; i < array.length; i++) {

			if (i != 0 && i != (array.length - 1)) {
				continue;
			}
			for (j = 0; j < array[0].length; j++) {
				System.out.printf("%3d ", array[i][j]);
			}
			System.out.println(" ");

		}

		System.out.println("_____________");

	}

	public static void exMulArray05() {

		int i = 0;
		int j = 0;
		int[][] array = new int[4][5];

		System.out.println("2d array " + array.length + "x" + array[0].length + "\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {
				array[i][j] = (i * array[0].length) + j + 1;
				System.out.printf("%3d ", array[i][j]);
			}
			System.out.println(" ");

		}

		System.out.println("_____________");
		System.out.println("Only even rows\n");

		for (i = 0; i < array.length; i++) {

			if ((i % 2) != 0) {
				continue;
			}
			for (j = 0; j < array[0].length; j++) {
				System.out.printf("%3d ", array[i][j]);
			}
			System.out.println(" ");

		}

		System.out.println("_____________");

	}

	public static void exMulArray06() {

		int i = 0;
		int j = 0;
		int[][] array = new int[5][10];

		System.out.println("2d array " + array.length + "x" + array[0].length + "\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {
				array[i][j] = ((array.length - i) * (array[0].length - j)) + j + 1;
				System.out.printf("%3d ", array[i][j]);
			}
			System.out.println(" ");

		}

		System.out.println("_____________");
		System.out.println("Only odd columns with 1st element larger than the last ones\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {
				if (j > 0 && (j % 2) != 0 && array[0][j] > array[array.length - 1][j]) {
					System.out.printf("%3d ", array[i][j]);
				}
			}
			System.out.println(" ");

		}

		System.out.println("_____________");

	}

	public static void exMulArray07() {

		int sum = 0;
		int i = 0;
		int j = 0;
		int[][] array = new int[5][5];

		System.out.println("2d array " + array.length + "x" + array[0].length + "\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {

				array[i][j] = Helper.getRandomRange(-10, 10);
				System.out.printf("%3d ", array[i][j]);
				if ((array[i][j] % 2) != 0 && array[i][j] >= 0) {
					sum += array[i][j];
				}

			}
			System.out.println(" ");

		}

		System.out.println("_____________");
		System.out.println("Sum of all negative and odd numbers equals to " + sum);

	}

	public static void exMulArray08() {

		int counter = 0;
		int i = 0;
		int j = 0;
		int[][] array = new int[5][5];

		System.out.println("2d array " + array.length + "x" + array[0].length + "\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {

				array[i][j] = Helper.getRandomRange(1, 10);
				System.out.printf("%3d ", array[i][j]);
				if (array[i][j] == 7) {
					counter += 1;
				}

			}
			System.out.println(" ");

		}

		System.out.println("_____________");
		System.out.println("In this array number 7 occurs " + counter + " time(s)");

	}

	public static void exMulArray09() {

		int i = 0;
		int j = 0;
		int[][] array = new int[4][4];

		System.out.println("2d array " + array.length + "x" + array[0].length + "\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {
				array[i][j] = (i * array[0].length) + j + 1;
				System.out.printf("%3d ", array[i][j]);
			}
			System.out.println(" ");

		}

		System.out.println("_____________");
		System.out.println("Display only diagonal elements\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {

				if (j == i) {
					System.out.printf("%3d ", array[i][j]);
				}

			}
			System.out.println(" ");

		}

	}

	public static void exMulArray10() {

		int i = 0;
		int j = 0;
		int[][] array = new int[6][10];

		int k = 5; // row
		if (k >= array.length) {
			k = array.length - 1;
		}
		int p = 4; // column
		if (p >= array[0].length) {
			p = array[0].length - 1;
		}

		System.out.println("2d array " + array.length + "x" + array[0].length + "\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {
				array[i][j] = (i * array[0].length) + j + 1;
				System.out.printf("%3d ", array[i][j]);
			}
			System.out.println(" ");

		}

		System.out.println("_____________");
		System.out.println("Display row - k=" + k + "; and column p=" + p + ";\n");

		for (i = 0; i < array.length; i++) {

			for (j = 0; j < array[0].length; j++) {
				if (i != k && j != p) {
					System.out.printf("%3s ", "");
					continue;
				}
				System.out.printf("%3d ", array[i][j]);

			}
			System.out.println(" ");

		}

	}

}
