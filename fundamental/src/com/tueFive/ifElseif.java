package com.tueFive;

public class ifElseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gen = "genap";
		//System.out.println(gen.lo);
		int usia = 1;
		
		if (usia == 4 || usia == 5) {
			System.out.println("TK");
			
		}
		else if(usia >= 6 && usia <= 12) //&& salah satu false kesimpulan false, || salah satu trua kesimpulan tru
		{
			System.out.println("SD");
		}
		else
		{
			System.out.println("Tidak ada yang sesuai");
		}
	}

}
