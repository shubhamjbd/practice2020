package variable_type;

public class infoemp {
              
	//variable declaration
	String student_name;                // (1ST STEP) //data type variable name"=value/info of variable"
	String student_id;
	String student_fee_status;
	String student_class;
	int feepaid;
	int roll_no;
	char grade;
	public static void main(String[] args) {      //(3RD STEP) giving value to the variables those declared in 1st step
		
		infoemp rutvij=new infoemp();
		rutvij.student_name="rutvij valmic pawar";
		rutvij.student_id="rutvij1234";
		rutvij.student_fee_status="paid";
		rutvij.student_class="class A";
		rutvij.feepaid=58000;
		rutvij.roll_no=30;
		rutvij.grade='A';                            //DO SAME FOR VIRAJ
		
		rutvij.info();
		 
	}
	
	public void info() 
	{
		System.out.println("student name is "+student_name);   // (2ND STEP) //making printing statement which is going to our actual sheet representation
		System.out.println("student id is "+student_id);
		System.out.println("student fee status: "+student_fee_status);
		System.out.println("student class is"+student_class);
		System.out.println("feepaid by student:"+feepaid);
		System.out.println("roll no.is "+roll_no);
		System.out.println("grade is: "+grade);
		
		
	}

}
