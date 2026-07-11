package com.scanner;

import java.util.Scanner;

/**
 * Day 04 - Scanner
 *
 * This program demonstrates how to take user input using the Scanner class.
 *
 * Author : Shahbaj Alam
 */
public class ScannerDemo {

	/**
	 * Entry point of the Java application.
	 *
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("========== Student Information ==========\n");

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		System.out.print("Enter your CGPA: ");
		double cgpa = scanner.nextDouble();

		System.out.print("Are you learning Java? (true/false): ");
		boolean isLearningJava = scanner.nextBoolean();

		System.out.println("\n========== Student Details ==========");
		System.out.println("Name          : " + name);
		System.out.println("Age           : " + age);
		System.out.println("CGPA          : " + cgpa);
		System.out.println("Learning Java : " + isLearningJava);

		scanner.close();
	}
}