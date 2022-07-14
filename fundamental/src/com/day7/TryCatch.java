package com.day7;

public class TryCatch {

	public static void main(String[] args) {
		
		int[] dataInt = new int[2];
		
		
		try
		{
			try
			{
			dataInt[2] = 2;	
			}
			catch (ArrayIndexOutOfBoundsException a)
			{
				System.out.println("Error on Array");
			}
		int data = 50/0;	
		}
		catch (ArithmeticException e)
		{
			System.out.println("Error on Aritmethic "
					+ "" + e);
		}
		catch (Exception e)
		{
			System.out.println();
		}
		finally
		{
			System.out.println("Error keep coming");
		}
	
		
		
		
		
		System.out.println("\nNext code");	
		

	}

}
