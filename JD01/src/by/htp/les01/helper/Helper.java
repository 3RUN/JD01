package by.htp.les01.helper;

import java.util.Random;
import java.util.Scanner;

public class Helper {
	
	// helper functions	
	public static int getInputInt() {
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		System.out.println("Please enter a number!");
		
	    while (!sc.hasNextInt()) {
	        System.out.println("That not a number!");
	        sc.next();
	    }
	    
	    input = sc.nextInt();
	    
		return input;
		
	}
	
	public static int getInputPositiveInt() {
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		do {
		    System.out.println("Please enter a positive number!");
		    
		    while (!sc.hasNextInt()) {
		        System.out.println("That not a number!");
		        sc.next(); 
		    }
		    
		    input = sc.nextInt();
		    
		} while (input <= 0);
		
		return input;
		
	}
	
	public static int getAreaOfTriangle(int aX, int aY, int bX, int bY, int cX, int cY) {
		
		return (Math.abs(((aX - cX) * (bY - cY) - (bX - cX) * (aY - cY)) / 2));
		
	}
	
	public static double getAreaOfHexagon(double a) {
		
		return ((Math.sqrt(3) / 4) * Math.pow(a, 2) * 6);
		
	}
	
	public static int getGCD(int a, int b) {
		
		// find Greatest Common Divisor
		int t;
		while (b != 0) {
			t = b;
			b = a % b;
			a = t;
		}
		
		return a;
		
	}
	
	public static int getGCD(int a, int b, int c, int d) {
		
		// find Greatest Common Divisor of 4 given numbers
		return (getGCD(getGCD(a, b), getGCD(c, d)));
		
	}
	
	public static int getLCM(int a, int b) {
		
		// find Least Common Multiple
		return (a / getGCD(a, b) * b);
		
	}
	
	public static int getLCM(int a, int b, int c) {
		
		// find Least Common Multiple of 3 given numbers
		return (getLCM(getLCM(a, b), c));
		
	}
	
	public static int getSumMinMax(int a, int b, int c) {
		
		int max = 0;
		int min = 0;
		
		System.out.println("Given numbers are " + a + ", " + b + " and " + c);
		
		if (a > b && a > c) { max = a; }
		if (b > a && b > c) { max = b; }
		if (c > a && c > b) { max = c; }
		
		if (a < b && a < c) { min = a; }
		if (b < a && b < c) { min = b; }
		if (c < a && c < b) { min = c; }
		
		System.out.println("Smallest number from those three numbers is " + min);
		System.out.println("Biggest number from those three numbers is " + max);
		
		return (max + min);
		
	}
	
	public static int getLenght(int x, int y){
		
		int res = 0;
		
		if (x > y) { res = x - y; }
		else { res = y - x; }
		
		return res;
		 
	}
	
	public static int[] findMaxDistance(int coords[][], int max, int maxDistance){
		
		int i = 0;
		int counter = 0;
		int[] res = new int[2];
		
		for (i = 0; i < max; i++) {
			if (getLenght(coords[i][0], coords[i][1]) > maxDistance) {
				res[0] = getLenght(coords[i][0], coords[i][1]);
				res[1] = i + 1;
			}
			else {
				if (getLenght(coords[i][0], coords[i][1]) == maxDistance) {
					counter += 1;
				}
			}
		}
		
		// this means that all given distances have equal length!
		if (counter == max) { res[0] = -1; res[1] = -1; }
		
		return res;
		
	}
	
	public static int findBiggestNumber(int array[]) {
		
		int max = -1;
		int i = 0;
		
		for (i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
		
	}
	
	public static int findPrebiggestNumber(int array[]) {
		
		int i = 0;
		int max = -1;
		int biggestNumber = findBiggestNumber(array);
		
		for (i = 0; i < array.length; i++) {
			if (array[i] >= biggestNumber) { continue; }
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
		
	}
	
	public static int checkPrimeNumber(int a, int b, int c) {
		
		return (getGCD(getGCD(a, b), c));
		
	}
	
	public static int getFactorialSum(int num) {
		
		int i = 1;
		int factorial = 1;
		int sum = 0;
		
		for (i = 1; i < num; i++) {
			factorial = factorial * i;
			sum += factorial;
		}
		
		return sum;
		
	}
	
	public static int getRandomRange(int min, int max) {
		
		if (min >= max) {
			System.out.println("max parameter should be greater than min!");
			return 0;
		}
		
		Random rnd = new Random();
		return (rnd.nextInt((max - min) + 1) + min);
		
	}

}
