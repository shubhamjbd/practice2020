package control_statement;

public class Else_if_study {

	public static void main(String[] args) {
		 
		int marks=40;
		
		if(marks>=40 & marks<60)
		{
			System.out.println("congratulation you are second class");
		}
		else if(marks>=60 & marks<75)
		{
			System.out.println("congratulation you are in first class ");
		}
		else if(marks>75)
		{
			System.out.println("congratulation you are in distinction");
		}
		else
		{
			System.out.println("you are failed");
		}

	}

}
