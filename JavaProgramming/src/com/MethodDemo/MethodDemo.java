package com.MethodDemo;

public class MethodDemo {

	/**
	 * Displays a welcome message.
	 */
	public static void displayMessage() {
		System.out.println("Welcome to Java Learning Journey!");
	}

	/**
	 * Displays student information.
	 *
	 * @param name Student name
	 * @param age  Student age
	 */
	public static void displayStudent(String name, int age) {
		System.out.println("Student Name : " + name);
		System.out.println("Student Age  : " + age);
	}

	/**
	 * Returns the sum of two numbers.
	 *
	 * @param number1 First number
	 * @param number2 Second number
	 * @return Sum of two numbers
	 */
	public static int addNumbers(int number1, int number2) {
		return number1 + number2;
	}

	/**
	 * Entry point of the Java application.
	 *
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {

		displayMessage();

		System.out.println();

		displayStudent("Shahbaj Alam", 25);

		System.out.println();

		int result = addNumbers(20, 30);

		System.out.println("Sum : " + result);

	}

}
