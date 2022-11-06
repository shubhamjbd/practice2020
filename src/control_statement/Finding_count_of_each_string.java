package control_statement;

import java.util.Scanner;

public class Finding_count_of_each_string {

	public static void main(String[] args) {
		System.err.println("entert the string ");
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
 
		int count=1;
		
		for(int i=0;i<s.length()-1;i++)                  //same result for length() and length()-1  ???????????????????????
			                                             //ans:eception occurs when by default string limit is get over
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1) !=' '))
			{
				count++;
			}
		}
		
		System.out.println("count of each string without considering space is "+count);
	}

}
