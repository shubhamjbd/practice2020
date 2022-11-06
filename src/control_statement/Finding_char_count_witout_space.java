package control_statement;

public class Finding_char_count_witout_space {

	public static void main(String[] args) {
 
		String s="i hat  ";
		int count=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
		
				
			}
		
		}
	
		System.out.println("count of characters "+count);
	}
	

}
