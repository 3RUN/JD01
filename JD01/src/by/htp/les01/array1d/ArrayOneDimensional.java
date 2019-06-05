package by.htp.les01.array1d;

import by.htp.les01.helper.Helper;

public class ArrayOneDimensional {

	public static void main(String[] args) {

		// test task #10
		exArray10();

	}

	// one-dimensional arrays. part 1
	public static void exArray01() {

		int i = 0;
		int K = 2;
		int sum = 0;
		int[] a = new int[5];

		System.out.println("Array with random numbers: ");

		for (i = 0; i < a.length; i++) {
			a[i] = Helper.getRandomRange(1, 10);
			System.out.print(a[i] + " ");
		}

		for (i = 0; i < a.length; i++) {

			if ((a[i] % K) == 0) {
				sum += a[i];
			}

		}

		System.out.println("\nSum of all multiples to " + K + " equals to " + sum);

	}

	public static void exArray02() {

		int i = 0;
		int counter = 0;
		int[] array = new int[10];
		int[] res = new int[10];

		System.out.println("Array with random numbers: ");

		for (i = 0; i < array.length; i++) {
			array[i] = Helper.getRandomRange(0, 10);
			System.out.print(array[i] + " ");
		}

		for (i = 0; i < array.length; i++) {

			if (array[i] == 0) {
				res[counter] = i;
				counter++;
			}

		}

		if (counter > 0) {

			System.out.println("\nTotal of " + counter + " zero number(s) was(were) found");
			System.out.println("List of indexes:");

			for (i = 0; i < counter; i++) {
				System.out.print(res[i] + " ");
			}

		} else {
			System.out.println("\nZero numbers were not found");
		}

	}

	public static void exArray03() {

		int i = 0;
		int[] array = new int[10];

		System.out.println("Array with random numbers: ");

		for (i = 0; i < array.length; i++) {
			array[i] = Helper.getRandomRange(-10, 10);
			System.out.print(array[i] + " ");
		}

		// Check first number in the array!
		if (array[0] >= 0) {
			System.out.println("\nFirst number in the array is positive!");
		} else {
			System.out.println("\nFirst number in the array is negative!");
		}

	}

	public static void exArray04() {

		boolean check = true;
		int i = 0;
		int[] array = new int[10];

		System.out.println("Array with random numbers: ");

		for (i = 0; i < array.length; i++) {
			array[i] = Helper.getRandomRange(-10, 10); // replace with i to check
			System.out.print(array[i] + " ");
		}

		// start looping from the second index!
		for (i = 1; i < array.length; i++) {

			if (array[i] > array[i - 1] && check) {
				// still going up
				check = true;
			} else {
				check = false;
				break;
			}

		}

		if (check) {
			System.out.println("\nNumbers in the array are increasing.");
		} else {
			System.out.println("\nNumbers in the array aren't increasing.");
		}

	}

	public static void exArray05() {

		int i = 0;
		int counter = 0;
		int[] a = new int[5];
		int[] res = new int[5];

		System.out.println("Array with random numbers: ");

		for (i = 0; i < a.length; i++) {

			a[i] = Helper.getRandomRange(1, 10);
			if (a[i] == 0) {
				a[i] = 1;
			}
			System.out.print(a[i] + " ");

		}

		for (i = 0; i < a.length; i++) {

			if ((a[i] % 2) == 0) {
				res[counter] = a[i];
				counter++;
			}

		}

		if (counter <= 0) {
			System.out.println("\nNo even numbers were found in this array!");
		} else {

			System.out.println("\nTotal of " + counter + " even number(s) was(were) found!");
			for (i = 0; i < counter; i++) {
				System.out.print(res[i] + " ");
			}

		}

	}

	public static void exArray06() {

		int i = 0;
		int min = -10;
		int max = 10;
		int[] a = new int[10];

		System.out.println("Array with random numbers: ");

		for (i = 0; i < a.length; i++) {
			a[i] = Helper.getRandomRange(-10, 10);
			System.out.print(a[i] + " ");
		}

		for (i = 0; i < a.length; i++) {

			if (a[i] < 0 && a[i] > min) {
				min = a[i];
			}
			if (a[i] > 0 && a[i] < max) {
				max = a[i];
			}

		}

		System.out.println("\nShortest numeric axis was found at " + min + " " + max);

	}

	public static void exArray07() {

		int i = 0;
		int Z = 5;
		int counter = 0;
		int[] a = new int[10];

		System.out.println("Array with random numbers: ");

		for (i = 0; i < a.length; i++) {

			a[i] = Helper.getRandomRange(0, 10);
			if (a[i] > Z) {
				a[i] = Z;
				counter++;
			}
			System.out.print(a[i] + " ");

		}

		System.out.println("\nTotal of " + counter + " number(s) was(were) lowered to " + Z);

	}

	public static void exArray08() {

		int i = 0;
		int negativeCounter = 0;
		int positiveCounter = 0;
		int zero_counter = 0;
		int[] a = new int[10];

		System.out.println("Array with random numbers: ");

		for (i = 0; i < a.length; i++) {

			a[i] = a[i] = Helper.getRandomRange(-10, 10);
			System.out.print(a[i] + " ");
			if (a[i] > 0) {
				positiveCounter++;
			}
			if (a[i] == 0) {
				zero_counter++;
			}
			if (a[i] < 0) {
				negativeCounter++;
			}

		}

		System.out.println("\nAmount of positive numbers " + positiveCounter);
		System.out.println("Amount of zeros " + zero_counter);
		System.out.println("Amount of negative numbers " + negativeCounter);

	}

	public static void exArray09() {

		int i = 0;
		int min = 0;
		int max = 0;
		int[] a = new int[10];

		System.out.println("Array with random numbers: ");

		for (i = 0; i < a.length; i++) {

			a[i] = Helper.getRandomRange(0, 10);
			System.out.print(a[i] + " ");
			// find index of largest number
			if (a[i] > a[max]) {
				max = i;
			}
			// find index of the smallest number
			if (a[i] < a[min]) {
				min = i;
			}

		}

		System.out.println("\n\nMax number is " + a[max] + "; with index of " + max);
		System.out.println("Min number is " + a[min] + "; with index of " + min + "\n");

		int temp = a[max];
		a[max] = a[min];
		a[min] = temp;

		System.out.println("End result looks like this:");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static void exArray10() {

		int i = 0;
		int[] a = new int[10];

		for (i = 0; i < a.length; i++) {
			a[i] = Helper.getRandomRange(0, 10);
			System.out.print(a[i] + " ");
		}

		System.out.println("\nResult:");

		for (i = 0; i < a.length; i++) {

			if (a[i] > i) {
				System.out.print(a[i] + " ");
			}

		}

	}

}
