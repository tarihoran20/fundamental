package com.truSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		//1
//		int jumlahDeret = 5;
//		
//		for(int i=1; i<jumlahDeret*2; i++)
//	    {
//	        if(i%2 == 0)
//	        {
//	            //System.out.print(" x ");
//	        }
//	        else if(i%2 == 1) {
//	        	System.out.print(i + " x ");
//	        }
//	    }
		
		//1
//		void printDeret(int jumlahDeret){
//		    // logic loop and print
//		    for(int i=1; i<jumlahDeret*2; i++)
//			    {
//			        if(i%2 == 0)
//			        {
//			            //System.out.print(" x ");
//			        }
//			        else if(i%2 == 1) {
//			        	System.out.print(" " + i + " x");
//			        }
//			    }
//		}

		//2
//		void mainMethod()
//		{
//		// logic print
//		String nilai1 = "95";
//		double nilai2 = 0.5;
//		int nilai1_c = Integer.parseInt(nilai1);
//
//		System.out.println(nilai1_c*nilai2);
//
//		}
		
		//3
		//int x =1;
		//0 1 2 3 4 5 6 7 8
		//2 4 4 4 6 6 6 6 6
		//1 3 5
		
		
		    int ukuranDeret = 8;
		    int d = 2;
		    int sign = 0;
		    
				for(int i=0; i<ukuranDeret; i++)
			    {
			       System.out.print(" "+ d);
			       sign++;
			       if(sign == d-1)
			       {
			           d+=2;
			           sign = 0;
			       }
			    }
		
	    
		
		//4
		//
		
		//4
//		void arrayList(int b, int c, String operator) {
//			   // java.util.ArrayList<Double> a = new java.util.ArrayList<Double>();
//			    // isi array list a dengan data double
//			    
//			        java.util.ArrayList<Double> dataArr = new java.util.ArrayList<>();
//					dataArr.add(5.80);
//					dataArr.add(5.20);
//					dataArr.add(3.99);
//					
////			 		b = 2;
////			 		c = 1;
//					//operator = "";
//					
////			 		Scanner scan = new Scanner(System.in);
////			 		operator = scan.nextLine();
//					
//					//System.out.println(dataArr.get(1));
//					
//					
//					
//					switch (operator)
//					{
//					
//					
//					
//					case "+":
//						System.out.print(dataArr.get(b) + " + " + dataArr.get(c) + " = ");
//						System.out.print(dataArr.get(b) + dataArr.get(c));
//						break;
//						
//					case "-":
//						System.out.print(dataArr.get(b) + " - " + dataArr.get(c) + " = ");
//						System.out.println(dataArr.get(b) - dataArr.get(c));
//						break;
//					}
//					
//					//scan.close();
//			    
//			    //logic arraylist
//			}
		
	}

}
