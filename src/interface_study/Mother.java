package interface_study;

public interface Mother {
	
	default void sum3() 
	{
		int a=50;
		int b=50;
		int sum= a+b;
		int sum1=sum+10;
		System.out.println("sum from mothers method(sum3) is "+sum1);
		System.out.println("this method is same in father interface but diffrenrt definition");
		System.out.println("=========================================================================");
	}
	
	
	
	void sum4();
	 


}
