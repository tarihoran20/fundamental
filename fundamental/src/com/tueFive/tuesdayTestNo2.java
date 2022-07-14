package com.tueFive;

public class tuesdayTestNo2 {

	public static void main(String[] args) {
		String gan = "ganjil";
	    String gen = "genap";
	    //isi logika loop dan condition
	    
	    int loop = 8;
	    
	         if(loop <=10)
			 {
				 if(loop %2 == 0)
				 {
					 for(int i=1; i<=loop; i++)
					 {
						 //genap
						 if(i%5 == 0)
						 {
							 System.out.println(gen.toLowerCase() + "!"); 
						 }
						 else
						 {
							 System.out.println(gen.toLowerCase());
						 }
					 }
					 	
				 }
				 else if(loop%2 == 1)
				 {
				     for(int i=1; i<=loop; i++)
					 {
						 //genap
						 if(i%5 == 0)
						 {
							 System.out.println(gan.toLowerCase() + "!"); 
						 }
						 else
						 {
							 System.out.println(gan.toLowerCase());
						 }
					 }
				 }
				 
			 }
			 else if(loop > 10)
			 {
				 if(loop %2 == 0)
				 {
					 for(int i=1; i<=loop; i++)
					 {
						 //genap
						 if(i%5 == 0)
						 {
							 System.out.println(gen.toUpperCase() + "!"); 
						 }
						 else
						 {
							 System.out.println(gen.toUpperCase());
						 }
					 }
					 	
				 }
				 else if(loop%2 == 1)
				 {
				     for(int i=1; i<=loop; i++)
					 {
						 //genap
						 if(i%5 == 0)
						 {
							 System.out.println(gan.toUpperCase() + "!"); 
						 }
						 else
						 {
							 System.out.println(gan.toUpperCase());
						 }
					 }
				 }
			 }

	}

}
