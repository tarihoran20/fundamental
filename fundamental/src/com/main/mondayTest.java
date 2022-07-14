package com.main;
import java.util.Scanner;
import java.util.Random;
import java.math.*;
public class mondayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Baris: ");
		//int baris = scan.nextInt();
		int baris = Integer.valueOf(scan.nextLine());
		
		System.out.print("Kolom: ");
		//int kolom = scan.nextInt();
		int kolom = Integer.valueOf(scan.nextLine());
		
		System.out.print("Nilai maksimal: ");
		Random angkaRandom = new Random();
		//int maks = scan.nextInt();
		int maks = Integer.valueOf(scan.nextLine());
		//System.out.println(angkaRandom.nextInt());
		
		//System.out.println(baris);
		//System.out.println(kolom);
		//System.out.println(maks);
		
		System.out.println();
		
		for(int i=0; i<baris; i++)
		{
			for(int j=0; j<kolom; j++)
			{
				System.out.print(angkaRandom.nextInt(maks+1) + "\t");
				System.out.print(" ");
			}
			System.out.println();
		}
		scan.close();

	}

}
