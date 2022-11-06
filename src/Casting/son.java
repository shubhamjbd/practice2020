package Casting;

public class son extends father {             //first and foremost we extends fathers properties into the son or son extends fathers properties//

	public static void main(String[] args)
    {
		
		father obf= new father();  
		obf.money();
		
		father ob=new son();          //we create object of subclass and giving superclass reference-->superclass ob=new subclass(); 
		ob.money();                   //which is equivalent to int a=10;
		                              //thats why we call that assigning subclass property into the superclass is called up casting// 
		
		// ob.car();                    //we can assign those property which are same in the super and subclass,thats why we cant call sons own property
		
	}                                 //we can call only common method while up casting

	
	public void money()
	{
		System.out.println("sons money is 10K");
	}
	
	
	 public void car()
	 {
		 System.out.println("sons car is BMW");
		 
	 }
}
