package com.day5.practice;

public class MethodInputDanOutput {
	
	private int a = 6;

	public int tambah(int a, int b) {
		int result = this.a + b;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		MethodInputDanOutput obj = new MethodInputDanOutput();
		
		int a = obj.tambah(3, 4);
		System.out.println(a);
		
	}

}
