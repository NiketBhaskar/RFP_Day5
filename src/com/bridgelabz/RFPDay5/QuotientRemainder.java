package com.bridgelabz.RFPDay5;

import java.util.Scanner;

public class QuotientRemainder {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter the divisor : ");
	int divisor = scanner.nextInt();
	System.out.println("Enter the dividend(should be greater than divisor) : ");
	int dividend = scanner.nextInt();
	int remainder = remainder(divisor, dividend);
	int quotient = quotient(divisor, dividend);
System.out.println("reaminder is " +remainder+ ". Quotient is " +quotient+ ".");
	}
	static int remainder(int divisor, int dividend) {
		int remainder = dividend % divisor;
		return remainder;
	}
	static int quotient(int divisor, int dividend) {
		int quotient = dividend / divisor;
		return quotient;
	}
}
