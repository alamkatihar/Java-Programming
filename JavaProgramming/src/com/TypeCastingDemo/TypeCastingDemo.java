package com.TypeCastingDemo;

/**
 * This program demonstrates implicit (widening) and explicit (narrowing) type
 * casting in Java.
 *
 * Author : Shahbaj Alam
 */
public class TypeCastingDemo {

	/**
	 * Entry point of the Java application.
	 *
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {

		// ==============================
		// Implicit Type Casting (Widening)
		// ==============================

		int number = 100;
		double convertedNumber = number;

		System.out.println("===== Implicit Type Casting =====");
		System.out.println("Integer Value : " + number);
		System.out.println("Double Value  : " + convertedNumber);

		// ==============================
		// Explicit Type Casting (Narrowing)
		// ==============================

		double price = 499.99;
		int convertedPrice = (int) price;

		System.out.println("\n===== Explicit Type Casting =====");
		System.out.println("Double Value  : " + price);
		System.out.println("Integer Value : " + convertedPrice);

	}

}