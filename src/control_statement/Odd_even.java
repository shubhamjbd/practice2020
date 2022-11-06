package control_statement;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		
		int number; int remainder;
	     System.out.println("enter the number");
	     
	     Scanner scan =new Scanner(System.in);
	      
	      number=scan.nextInt();
	      scan.close(); 
	      
	      remainder=number%2;
	      
	      if(remainder==0) 
	      {
	    	  
	    	  System.out.println(number+"-is an even number");
           }
	      else
	    	  System.out.println(number+"-number is odd");
	      
		
	}

}
