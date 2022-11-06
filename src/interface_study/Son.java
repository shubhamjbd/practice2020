package interface_study;

public class Son implements Mother,Father {

	public static void main(String[] args) {
		Son ob=new Son();
		ob.sum3();
		ob.sum1();
		ob.sum2();
		ob.sum4();

	}

	@Override
	public void sum1() {
		System.out.println("sum1 method from interface mother");

			}

	@Override
	public void sum2() {
		System.out.println("sum2 method from interface mother");
		
	}


	public void sum3()     //common for both mother and father,may confuse during running time////
	{
		 Father.super.sum3();             //to call specific default method from super interface follow the syntax 
		 Mother.super.sum3();            //interface name.super.methodname);
		
	}

	@Override
	public void sum4() {
		System.out.println("sum4 method from interface father");
		
	}

	 
	}

	 


