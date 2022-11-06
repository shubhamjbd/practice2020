package control_statement;

import java.util.Scanner;

public class User_input_largest_no {

	public static void main(String[] args) {
 
		int a; int b;
		System.out.println("enter the number ");
		Scanner scan =new Scanner(System.in);
	     a=scan.nextInt();
	     b=scan.nextInt();
	     scan.close();
	     
	    if(a>b) 
	    {
	    	System.out.println(a+ " is greater "+b);
	    }
	    else {
	    	System.out.println(b+" is greater than "+a);
	    }
	}

}