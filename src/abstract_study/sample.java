package abstract_study;

public abstract class sample {

	public static void main(String[] args) { 
		test4();
		
		//sample ob=new sample(); we can not create the object of abstract class//
		
		
	}
	public void test1() {
		
		System.out.println("this is complte method");
	}
	public void test2() {
		
		//method have body,even if body is empty therefore it is complete method //
	}
	
	public abstract void test3();// incomplete method
	
	public static void test4() {
		
		System.out.println("this is the static method with body ");
	}
	


}
