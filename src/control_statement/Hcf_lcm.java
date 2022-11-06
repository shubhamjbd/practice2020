package control_statement;

import java.util.Scanner;

public class Hcf_lcm {

	public static void main(String[] args) {
		
		 
		int a,b,i,hcf=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		a=scan.nextInt();
		System.out.println("enter the second number");
		b=scan.nextInt();
		scan.close();
		
		for(i=1;i<=a && i<=b;i++)
	    {
			if(a%i==0 && b%i==0) 
			{
				hcf=i;
			}
	     }
		System.out.println("hcf of two number is "+hcf);
		
		int lcm=(a*b)/hcf;
		System.out.println("the lcm of number is "+lcm);
		   
     
	}

}
