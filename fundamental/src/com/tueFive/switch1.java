package com.tueFive;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "sEnin";
		String materi = "java";
		
		switch(day.toLowerCase())
		{
		case "senin":
			System.out.println("Hari kerja");
			switch(materi)
			{
				case "java":
					System.out.println("Materi Switch case");
			}
			break;
		default:
			System.out.println("Tidak ada di case");
			break;
		}
		
		int bulan = 1;
		int hari = 4;
		
		switch(bulan)
		{
		case 1:
			System.out.println("Januari");
			switch(hari)
			{
				case 4:
					System.out.println("Kamis");
			}
			break;
		default:
			System.out.println("Tidak ada di case");
			break;
		}

	}

}
