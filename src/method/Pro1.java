package method;

public class Pro1 {

	public static void main(String[] args) {
		 

	}
	public static void p1()
	{
		System.out.println("calling static regular method from class Pro1");
	}
	public void p2()
	{
		
		System.out.println("calling non static regular method from class Pro1");
	
		
	}
	public void division()
	{
		float a=50f;
		float b=30f;
		float division=a/b;
		System.out.println("division is "+division);
		
	}
	public static void multiplication()
	{
		int a=35;
		int b=40;
		int multi=a*b;
       System.out.println("multiplication is "+multi);
       
	}

}
