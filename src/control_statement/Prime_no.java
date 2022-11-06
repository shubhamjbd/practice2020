package control_statement;

public class Prime_no {

	public static void main(String[] args) {
 
		int no=89;
		int temp=0;
		
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
	         	if(temp==0)
	      	   {
			      System.out.println(no+ " is  prime number ");
		       }
		                else {
		                	     System.out.println(no+" is not prime number");
		                     }
	}

}
