package com.day7;

public class ThrowException1 {
	
	public void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("Dibawah umur");
		}
		else
		{
			System.out.println("Boleh");
		}

	}

	public static void main(String[] args) {
		

	}

}
