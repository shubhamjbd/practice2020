package array;

import java.util.Arrays;

public class Sort_Method {

	public static void main(String[] args) {
		 char grade[]=new char[9];
		 
		 grade[0]='b';   grade[1]='a';
		 grade[2]='d';    grade[3]='c';
		 grade[4]='f';	 grade[5]='e';
		 grade[6]='h';	 grade[7]='g';
		 grade[8]='i';
		 
		 Arrays.sort(grade);               //syntax for sort method
		 
		 for(int i=0;i<grade.length;i++)
		 {
			 
		 System.out.println("print "+grade[i]);
		 }
System.out.println("======================================================================");		 
	System.out.println("printing array descending order");	 
	
 	          //for descending order/		 
		 for(int i=grade.length-1; i>=0;i--)	 //we have to use .length -1 because we will star from lower index which will be length-1
		 {
		 
		 System.out.println("print "+grade[i]);
		 }
	}

}
