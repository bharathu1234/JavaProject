package com.deloitte.exceptions;


public class MainClass {
	public static void main(String[] param) {
		
		int num1 = Integer.parseInt(param[0]);
		int num2 = Integer.parseInt(param[1]);
		
		try {
			int div = num1/num2;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
		}
		catch(NumberFormatException e) {
			System.out.println("Enter 2 valid numbers.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter 2 numbers.");
		}
		
	}
}
