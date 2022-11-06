package control_statement;

public class Switch {

	public static void main(String[] args) {
		
		
		example_2();
		 
		String month="jan";
		switch (month)
		{
		case "jan":System.out.println("this is the first month of the year ");
		break;
		
		case "feb":System.out.println("this is the second month of the year");
		break;
		
		case "march":System.out.println("this is the third month of the year");
		break;
		
		case "april":System.out.println("this is the 4th  month of the year");
		break;
		
		
		case "may":System.out.println("this is the 5th month year ");//if u wont give the break the it will run all the cases at single time,,it can be benefited to 
		break;
		                                                              //benefited to type like sunday,maonday,tuesday...//
			
			
		}
	}
	
	public static void example_2() {
		
		int day=1;
		switch(day) {
		
		case 1:System.out.println("this is the sunday");
		break;
		case 2:System.out.println("this the the monday");
		break;
		case 3:System.out.println("this the tuesday");
		break;
		case 4:System.out.println("this the wednesday");
		break;
		case 5:System.out.println("this is the thursday");
		break;
		case 6:System.out.println("this is the friday");
		break;
 		}
				
		
		
	}

}
