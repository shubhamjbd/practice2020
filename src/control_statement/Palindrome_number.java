package control_statement;

public class Palindrome_number {

	public static void main(String[] args) {
 
           int n=1235321;int r=0; int sum=0; int temp=n;
           while(n>0)
           {
        	   r= n %10;
        	   sum=sum*10+r;
        	   n=n/10;
           }
           n=temp;
        		   if(n==sum)
        		   {
        			 System.out.println("number is palindrome number");
        		   }
        		   else
        		   {
        		       System.out.println("number is not palindrome number");
        	       }
           }
	}


