package control_statement;

import java.util.Scanner;

public class TableOfAnyNumber {

	public static void main(String[] args) {
 
		int a;
		System.out.println("enter the number");
		
		Scanner scan =new Scanner(System.in);
	     a=scan.nextInt();
	     scan.close();
	     
	     for(int i=1;i<=10;i++)
	     {
	    	 System.out.println(a*i);
	    	 
	      }
	   System.out.println("=============================================\n");  //===>\n to print line at output
	     for(int i=1;i<=10;i++)
	     {
	    	 System.out.println(a+"*"+i+"="+a*i);
	     }
	}

}
