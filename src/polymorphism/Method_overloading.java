package polymorphism;

public class Method_overloading {

	public static void main(String[] args) {
	 
		 Method_overloading ob= new  Method_overloading();
		 ob.method();
		 ob.method(10, 20);
		 ob.method(5.5f, 5.5f);
		 ob.method("deepak", "gr'A'", "TRAVELLING");
		 ob.method('A', 'B', 'D', "Deepak94");
		 ob.method("log in", "karo");
		 
		 String password="deepak94";
     	String name="shubham";
     	if(password=="shubham9")
     		{System.out.println("password is correct");
     	if(name=="shubham")
     		{System.out.println("name is correct log in successfull");
     		
     		}
     	else {System.out.println("name is incorrect enter the correct name");}
     	
     		}
     	else {
     		System.out.println("password is incoreecrt");
     		System.out.println("enter the coorect passwor");}
		 
		 
		 
	}
            public void method() {//non parameterised method
            	int a=10;
            	int b=30;
            	int sum=a+b;
            	System.out.println("sum is the "+sum);
            }
            
            public void method(int a,int b)                  //method with parameter
            {                                           
            	int sum=a+b;
            System.out.println("sum is the "+sum);
            	
             
}
            public void method(float a, float b)            //mathod with parameter but different argument or parameter     
            {   
            	float sum=a+b;
            System.out.println("sum is the  "+sum);
    
            	
            }
            
            public void method(String name,String grade,String hobby ) 
            {
            	System.out.println("name is the name "+name);
            	System.out.println("grade is the "+ grade);
            	System.out.println("hobby is the "+hobby);
            }
            
            
             public void method(char grade,char blood_group,char faourite_alphabate,String password) 
             {
            	 System.out.println("grade is "+grade);
            	 System.out.println("blood_group is the "+blood_group);
            	 System.out.println("faourite alphabate is "+faourite_alphabate);
            	 System.out.println("password is the "+password);
            	 
             }
             
            public void method(String a,String b) {
            	String password="deepak94";
            	String name="shubham";
            	if(password=="shubham9")
            		{System.out.println("password is correct");
            	if(name=="shubham")
            		{System.out.println("name is correct log in successfull");
            		
            		}
            	else {System.out.println("name is incorrect enter the correct name");}
            	
            		}
            	else {
            		System.out.println("password is incoreecrt");
            		System.out.println("enter the coorect passwor");
            	}
            		
            		
            		
            	
            }
}
