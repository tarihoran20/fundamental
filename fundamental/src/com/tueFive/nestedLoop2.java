package com.tueFive;

public class nestedLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String gan = "ganjil";
		 String gen = "genap";
		 int loop = 18;
		 
		 if(loop <=10)
		 {
			 if(loop %2 == 0)
			 {
				 for(int i=0; i<loop; i++)
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
		 }
		 else if(loop > 10)
		 {
			 if(loop %2 == 0)
			 {
				 for(int i=0; i<loop; i++)
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
		 }

	}

}
