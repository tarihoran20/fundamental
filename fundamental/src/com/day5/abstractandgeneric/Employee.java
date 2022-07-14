package com.day5.abstractandgeneric;

public class Employee extends Kontrak {

	@Override
	public void salary() {

	System.out.println("500000");
	super.vaksin("Boster");
	}
	
	public static void main(String[] args) {
		new Employee().salary();
		
		new Employee().vaksin("Booster 2");
	}

}
