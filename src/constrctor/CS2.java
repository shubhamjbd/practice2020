package constrctor;

public class CS2 {
	
	int a;
	int b;
	int c;
	
	public CS2()
	{
	a=100;
	b=200;
	c=300;
		
		System.out.println("running zero parameter method");

	}
	
	public CS2(int num1)//constructor with one parameter//
	{
		a=num1;         //int a is  100//
		System.out.println("value of a is "+a);
	
	}
	
	public CS2(int num1,int num2){
		a=num1;
		b=num2;
		System.out.println("runing constructor with two parameter");
		
	}
	
	public CS2(int num1,int num2,int num3)
	{
		a=num1;
		b=num2;
		c=num3;
		System.out.println("running constructor with three parameter");
		
	}
	
	public static void main(String[] args) {
		
		CS2 ob1=new CS2();//creating object//
		ob1.addition();
		
		CS2 ob2 =new CS2(20);// object for one parameter method//
		ob2.addition();
		
		CS2 ob3=new CS2(20,50);//object for two parameter//
		ob3.addition();
		
		CS2 ob4=new CS2(20,40,20);
		ob4.addition();
				
		

	}
	public void addition() {
		int sum=a+b+c;
		System.out.println("addition is "+sum);

	}

}
