package parameterisied_method;

public class data_entry {

	public static void main(String[] args) {
		 
data_entry ob=new data_entry();
ob.studentinfo();

ob.studentinfo1("Deepak",72,'A',65.6f);

ob.studentinfo1("sagar",60,'A',75.456f);
	}
	
	public void studentinfo()     //non parameterised method//
	{
		String Name="shubham babasaheb ambilke";
		int rollnumber=70;
		char grade='A';
		float weight=71.2f;
		System.out.println("=====================================");
		System.out.println("Name is "+Name);
		System.out.println("rollnumber is "+rollnumber);
		System.out.println("weight is "+weight);
		System.out.println("grade is "+grade);
		System.out.println("=====================================");
	
	}

	public void studentinfo1(String name,int rollnumber,char grade,float weight)// with parameter method//
	{  
		System.out.println("=======================================");
		System.out.println("name is "+name);
		System.out.println("Roll number is "+rollnumber);
		System.out.println("grade is "+grade);
		System.out.println("weight is "+weight);
		System.out.println("=======================================");
	}
	
}
