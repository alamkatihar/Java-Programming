package com.AdvancedTypeCastingDemo;

public class AdvancedTypeCastingDemo {

	public static void main(String[] args) {

		System.out.println("========== Widening Type Casting ==========\n");

		byte byteValue = 10;
		short shortValue = byteValue;
		int intValue = shortValue;
		long longValue = intValue;
		float floatValue = longValue;
		double doubleValue = floatValue;

		System.out.println("Byte   : " + byteValue);
		System.out.println("Short  : " + shortValue);
		System.out.println("Int    : " + intValue);
		System.out.println("Long   : " + longValue);
		System.out.println("Float  : " + floatValue);
		System.out.println("Double : " + doubleValue);

		System.out.println("\n========== Narrowing Type Casting ==========\n");

		double marks = 95.75;
		float percentage = (float) marks;
		long totalMarks = (long) percentage;
		int finalMarks = (int) totalMarks;
		short shortMarks = (short) finalMarks;
		byte byteMarks = (byte) shortMarks;

		System.out.println("Double : " + marks);
		System.out.println("Float  : " + percentage);
		System.out.println("Long   : " + totalMarks);
		System.out.println("Int    : " + finalMarks);
		System.out.println("Short  : " + shortMarks);
		System.out.println("Byte   : " + byteMarks);

	}

}
