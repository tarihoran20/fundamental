package com.wedSix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {3,4,5};
		
		ArrayList<Integer> dataArr = new ArrayList<>();
		dataArr.add(90);
		dataArr.add(90);
		dataArr.add(90);
		dataArr.add(90);
		dataArr.add(90);
		dataArr.add(90);
		
		System.out.println(dataArr);
		
		for (int i = 0; i < dataArr.size(); i++) {
			System.out.print(dataArr.get(i) + " ");
		}
		
		ArrayList<ArrayList<Integer>> arrList2D = new ArrayList<>();
		for (int i = 0; i < args.length; i++) {
			
		}
		
		List<String> buah = new ArrayList<>();
		buah.add("apel");
		buah.add("jeruk");
		buah.add("semangka");
		
		System.out.println();
		for (String item : buah) {
			System.out.println(item);
		}
		
		buah.remove(1);
		
		System.out.println("\nSesudah dihapus");
		for (String item : buah) {
			System.out.println(item);
		}
	
		buah.set(1, "jambu");
		
		System.out.println("\nSesudah diubah");
		for (String item : buah) {
			System.out.println(item);
		}
		
		System.out.println("\nTEST 4");
		 ArrayList<Double> xx = new ArrayList<>();
			xx.add(5.80);
			xx.add(5.20);
			xx.add(3.99);
			
			for (int i = 0; i < xx.size(); i++) {
				System.out.println(xx.get(i));
			}
		
		

	}

}
