package method;

public class Calling_same_class {

	public static void main(String[] args) {
		test1();//calling static regular method from same class//
		test1();
		test1();
		test1();
		test1();//you can call it multiple time//
		
		Calling_same_class ob=new Calling_same_class();
		ob.test2();
		ob.test2();
		ob.test2();
		ob.test2();
		
	}
	public static void test1()
	{
		System.out.println("calling  static method from same class");
	}
	public void test2()
	{
		System.out.println("calling non static method from same class"); 
	} 
	
	
	}


