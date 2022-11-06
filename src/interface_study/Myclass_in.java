package interface_study;

public class Myclass_in implements My_interface {

	public static void main(String[] args) {
		
		
		Myclass_in ob=new Myclass_in();
		ob.test1();
		ob.test2();
		ob.test3();
		ob.demo();
		  
		  
	}

	

	@Override
	public void test2() {
		System.out.println("the method is complted in the implementation class");
		
	}

	@Override
	public void test3() {
		System.out.println("test3 method is completed in implementation class");
		
	}



	@Override
	public void test1() {
		System.out.println("test1 is completed in implemetarion class");
		
		
}
	public void demo() {
		System.out.println("own body of implentation class");
	}


}
