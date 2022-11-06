package method;

public class Example5 {

	public static void main(String[] args)
	{
		 Example5 e5=new Example5();   //syntax to create object-class name object=new class name();//
		                               
		 e5.test5();                   //syntax for calling non static method within same class---object name.method name();//
		 
//		 calling non static method from another class
		 
//		 step1:creating object using syntax--class name object=new class name
		 Pro1 prob=new Pro1();
		 
//		 step2:calling method with syntax object.method name();
		 prob.p2();
				 

	}
	public void test5()
	{
		
		System.out.println("calling non static regular method within the same class");
	}

}
