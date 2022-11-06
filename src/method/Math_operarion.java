package method;

public class Math_operarion {
	
	public void addition() 
	{
		int a=50;
		int b=30;
		int add=a+b;
		System.out.println("addition is "+add);
		
	}

	public static void main(String[] args)
	{
		 subtraction();                               //calling static regular method from same class//
		
		 Math_operarion math=new  Math_operarion();   //creating object //
		 math.addition();                             //calling non static regular method from same class/ 
		 
		 Pro1 ob=new Pro1();                          //creating object//
		 ob.division();                               //calling non static method from another class//
		
		 Pro1.multiplication();
		 
	
		 
	 
		 

	}
	public static void subtraction()
	{
		int a=50;
		int b=30;
		int subtract=a-b;
		System.out.println("subtraction is "+subtract);
	}

}
