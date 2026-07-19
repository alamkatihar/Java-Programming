package com.MethodOverloadingDemo;

public class MethodOverloadingDemo {

	/**
	 * Adds two integer values.
	 *
	 * @param number1 First integer
	 * @param number2 Second integer
	 * @return Sum of two integers
	 */
	public static int add(int number1, int number2) {

		return number1 + number2;

	}

	/**
	 * Adds three integer values.
	 *
	 * @param number1 First integer
	 * @param number2 Second integer
	 * @param number3 Third integer
	 * @return Sum of three integers
	 */
	public static int add(int number1, int number2, int number3) {

		return number1 + number2 + number3;

	}

	/**
	 * Adds two double values.
	 *
	 * @param number1 First double value
	 * @param number2 Second double value
	 * @return Sum of two double values
	 */
	public static double add(double number1, double number2) {

		return number1 + number2;

	}

	/**
	 * Concatenates two strings.
	 *
	 * @param firstName First name
	 * @param lastName  Last name
	 * @return Full name
	 */
	public static String add(String firstName, String lastName) {

		return firstName + " " + lastName;

	}

	/**
	 * Entry point of the Java application.
	 *
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {

		System.out.println("========== Method Overloading ==========\n");

		System.out.println("Addition of Two Integers   : " + add(20, 30));

		System.out.println("Addition of Three Integers : " + add(10, 20, 30));

		System.out.println("Addition of Two Doubles    : " + add(15.5, 20.5));

		System.out.println("Full Name                  : " + add("Shahbaj", "Alam"));

	}

}
