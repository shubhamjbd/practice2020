package interface_study;

public interface Demo3 {

	
	void method1();
	
	static void method2()
	{
		int a=50;
		int b=50;
		int sum=a+b;
	    System.out.println("sum is from Demo3 intrface and (method2) method "+sum);
		System.out.println("same STATIC method is available in Demo3 interface,but diffrent definition");
		System.out.println("==================================================================================");
	}
}
