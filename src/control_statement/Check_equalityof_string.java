package control_statement;

import java.util.Arrays;

public class Check_equalityof_string {

	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {1,2,3,4,5};
		
		boolean status=Arrays.equals(a1,a2);
		if(status==true)                         // ==========>we can write only as--if(status) it will take by default as true value because
         {                                              //body of if runs only when boolean value is true,,otherwise body of else will execute
			System.out.println("arraya are equal");
         }

		else {
			System.out.println("arrays are not equal");
		}
	}
}