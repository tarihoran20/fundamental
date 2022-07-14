package com.wedSix;

public class array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] hewan = new String[2][3];
		
		hewan[0][0] = "[0][0]";
		hewan[0][1] = "[0][1]";
		hewan[0][2] = "[0][2]";
		hewan[1][0] = "[1][0]";
		hewan[1][1] = "[1][1]";
		hewan[1][2] = "[1][2]";
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(hewan[i][j] + " ");
			}
		System.out.println();
		}

	}

}
