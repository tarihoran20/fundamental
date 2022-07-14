package com.day5.practice.polymorphism.overriding2;

public class SubKelas extends SuperKelas {
	
	@Override
	public void logic1(int loop) {
		
		System.out.println("Dari Sub Kelas");

	}

	public static void main(String[] args) {
		SuperKelas tampil = new SuperKelas();
		tampil.main(args);
		
		SubKelas tampil2 = new SubKelas();
		tampil2.logic1(3);

	}

}
