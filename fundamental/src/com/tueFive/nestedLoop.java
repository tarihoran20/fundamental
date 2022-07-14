package com.tueFive;

public class nestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float data = 6.9f;
		
		for (int i = 0; i < 5; i++) {
			System.out.println(data%2);
			data=+1;
			if ((int)data % 2 == 0) {
				System.out.println("Cek Modulus");
			}
		}
		
		System.out.println();
		for (int i = 0; i < 3; i++) {
			//System.out.println(i);
			for (int j = 0; j < 2; j++) {
				//System.out.println(j);
				for (int j2 = 0; j2 < 2; j2++) {
					System.out.println();
				}System.out.println();
			}//System.out.println();
		}

	}

}
