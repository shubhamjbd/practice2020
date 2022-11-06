package method;

public class Example2_calling_static_method_from_same_class {

	public static void main(String[] args) {
		test1();//calling static regular method from same class//
		test1();
		//you can call it multiple time//
		System.out.println("printing  line with regular method");
		
		//calling method of class Example3 to this class//
		//syntax is -classname.method name
		
		Example3.test3();
		Example3.test3();     //you can call it multiple time//
		
	    Example4.test4();    //calling static regular method from class Example4 having main function//
	   
	    Pro1.p1();           //calling static regular method from class Pro1//
		
	}
	public static void test1()
	{
		System.out.println("calling method from same class ");
	}
}
	
	
	
