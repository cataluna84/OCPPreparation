package com.oca.chapter3;

public class PrimitiveCastingScenarios {

	public static void main(String[] args) {
		int i = 97; // 97 is 'a' in ASCII
		char c = (char) i; // c is now 'a'

		System.out.println(Character.toChars(65)); // Prints 'A'

		byteScenarios();

	}

	public static void byteScenarios() {
		System.out.println((byte) 132);
	}
}

class PrimitiveCastingBADScenarios {
	//http://stackoverflow.com/questions/11599005/why-is-type-compatibility-not-applicable-to-primitives-as-well-when-overriding-m
	public class Person {
		public int getId() {
			return 1;
		}
	}

	public class Employee extends Person {
		public short getId() {
			return 0;
		}
	}
}