package com.tueFive;

import java.util.Scanner;

public class tuesdayTestNo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String pil;
		
		System.out.println("Selamat Datang");
		System.out.println("==================\n");
		boolean jalan=true;
		String nama = "";
	
		
		while(jalan){
			System.out.println("Silahkan pilih");
			System.out.println("1. Masukkan nama");
			System.out.println("2. Tampilkan nama");
			System.out.println("3. Keluar dr program");
			
			System.out.print("Silahkan masukkan pilihan: ");
			pil = scan.nextLine();
			
			switch(pil)
			{
			
			case "1":
				System.out.print("\nMasukkan nama : ");
				nama = scan.nextLine();
				System.out.println("Sudah memasukkan nama\n");
				if(!nama.equals(""))
				{
					System.out.println("nama sudah terisi");
				}
				break;
				
			case "2":
				if (nama == "") {
					System.out.println("Nama belum ada, silahkan diisi");
				}
				else
				{
					System.out.println("Nama: " + nama);
				}
				break;
				
			case "3":
				jalan = false;
				break;
				
			default:
				System.out.println("\nTidak ada pilihan");
				break;
			}
			if (jalan){
					System.out.println("\nPilih yang lain untuk lanjut\n");
					//scan.nextLine();		
			}
			
		}
		System.out.println("\nTerima kasih");
		scan.close();
	}

}
