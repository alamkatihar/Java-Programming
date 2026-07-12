package com.passbyvalue;

/**
 * Day 11 - Pass By Value
 *
 * This program demonstrates how Java uses pass by value.
 *
 * Author : Shahbaj Alam
 */
public class PassByValueDemo {

	/**
	 * Changes the value of the local copy of the variable.
	 *
	 * @param number integer value
	 */
	public static void changeValue(int number) {

		number = 100;

		System.out.println("Inside Method : " + number);
	}

	public static void main(String[] args) {

		int number = 10;

		System.out.println("Before Method Call : " + number);

		changeValue(number);

		System.out.println("After Method Call  : " + number);

	}

}