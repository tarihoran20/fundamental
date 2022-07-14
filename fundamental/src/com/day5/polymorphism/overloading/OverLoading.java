package com.day5.polymorphism.overloading;

public class OverLoading {
	
	public int tambah(int a) {
		
		int hasil = a*2;
		
		return 0;
	}
	
	public int tambah(int a, int b) {
		
		int hasil = a*b; 
		
		
		return hasil;
	}
	

	public static void main(String[] args) {
		OverLoading a = new OverLoading();
		System.out.println(a.tambah(2, 4));
	}

}
