package interface_study;

public interface Demo2 {
	void method1(); 
	
	static void method2()
	{ int a=100;
	int b=100;
	int sum=a+b;
	System.out.println("sum from interface Demo2 of the mathod name method2 is "+sum );
		System.out.println("static method(method name:method2) from interface demo2");
		System.out.println("samed method is available in interface Demo3");
		System.out.println("==================================================================");
	}
}
