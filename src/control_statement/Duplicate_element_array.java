package control_statement;

public class Duplicate_element_array {

	public static void main(String[] args) {
		 
		String arr[]= {"deeepak","sagar","deepak","sai","cat"};
		
		boolean flag=false;
		
		for(int i =0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if((arr[i]==arr[j]) && (i!=j))
						{
					       System.out.println("found duplicate element:"+ arr[i]);
					       flag=true;
					       
						}
			}
		}
		 if(flag==false)
	       {
	    	   System.out.println("duplicate value not found");				       
		   }

	}

}
