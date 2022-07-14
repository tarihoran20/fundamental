package com.day5.abstractandgeneric;

public class CallGeneric {

	public static void main(String[] args) {
		
		GenericClass<String> nama = new GenericClass<>();
		GenericClass<Integer> usia = new GenericClass<>();
		
		nama.setData("Dana");
		usia.setData(12);
		
		System.out.println("Nama: " + nama.getData());
		System.out.println("Usia: " + usia.getData());;
	}

}
