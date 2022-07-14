package com.tueFive;
import java.util.Scanner;

public class tuesdayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int pil;
		System.out.println("Selamat Datang");
		System.out.println("==================\n\n");
		
		
		
		do {
			
			System.out.println("Silahkan pilih");
			System.out.println("1. Masukkan nama");
			System.out.println("2. Tampilkan nama");
			System.out.println("3. Keluar dr program");
			
			System.out.println("Silahkan masukkan pilihan");
			pil = Integer.valueOf(scan.nextLine());
			
		}
		while(pil == 4 );
		;

	}

}
