package com.main;
import java.util.Scanner;
public class mondayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1000;
		String kata;
		
		do {
			System.out.print("Jumlah uang: ");
			System.out.println(x);
			String c = "ukup";
			System.out.println("Ketik apapun untuk menggandakan, ketik 'cukup' untuk berhenti");
			Scanner scan = new Scanner(System.in);
			kata = scan.nextLine();
			x*=2;
		}
		while(!kata.toLowerCase().equals("cukup"));
		//break;
		System.out.println("\nProgram penggandaan uang selesai");

	}

}
