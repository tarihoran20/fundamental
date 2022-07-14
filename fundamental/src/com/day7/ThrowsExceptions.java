package com.day7;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;

public class ThrowsExceptions {
	
	void m() throws IOException {
		System.out.println("Posibility error on IOException");
		int data = 50/0;
	}	
	
	public static void main(String[] args) throws Exception {
		ThrowsExceptions obj = new ThrowsExceptions();
		
		obj.m();
		
		System.out.println("Next Code");
		
	}

}
