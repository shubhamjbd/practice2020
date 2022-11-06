package interface_study;

public interface Father {
	
	void sum1();
	void sum2();
	default void sum3()//earlier this method was incomplete but while running there may be problem for compiler as same method exist in mother also//
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum of fathers method (from sum3) is the "+sum);
		System.out.println("this method(sum3)is same in mother interface but diffrent defination ");
		System.out.println("==================================================================================");
		
	}
	
	 

}
