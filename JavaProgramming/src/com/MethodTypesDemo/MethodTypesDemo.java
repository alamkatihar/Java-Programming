package com.MethodTypesDemo;

public class MethodTypesDemo {

	/**
	 * Type 1: No Arguments, No Return Value
	 */
	public static void displayMessage() {

		System.out.println("Welcome to Java Learning Journey!");

	}

	/**
	 * Type 2: Arguments, No Return Value
	 *
	 * @param name Student name
	 * @param age  Student age
	 */
	public static void displayStudent(String name, int age) {

		System.out.println("Student Name : " + name);
		System.out.println("Student Age  : " + age);

	}

	/**
	 * Type 3: No Arguments, Return Value
	 *
	 * @return Course Name
	 */
	public static String getCourseName() {

		return "Java Full Stack Development";

	}

	/**
	 * Type 4: Arguments, Return Value
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

		System.out.println("========== Method Type 1 ==========");
		displayMessage();

		System.out.println("\n========== Method Type 2 ==========");
		displayStudent("Shahbaj Alam", 25);

		System.out.println("\n========== Method Type 3 ==========");
		String course = getCourseName();
		System.out.println("Course : " + course);

		System.out.println("\n========== Method Type 4 ==========");
		int sum = addNumbers(25, 15);
		System.out.println("Sum : " + sum);

	}

}
