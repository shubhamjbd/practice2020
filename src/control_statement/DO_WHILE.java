package control_statement;

public class DO_WHILE {
	
	
	 
			
       public static void main(String[] args) {
    	   
    	   DO_WHILE OB=new DO_WHILE();
    	   OB.ex3();
    	   OB.ex4();
    	   
		 int i=1;
		 
		 do {
			 System.out.println("jyoti ambilke");
			 i++;
		 }
			while(i<=5);

	}
	
	public void ex3()
	{
		int i=5;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);
	}
	
	public void ex4()
	{
		int i=5;
		do {
			System.out.println("i");  // five times i will be printed
			i++;
		}
		while(i<=10);
	}

}
