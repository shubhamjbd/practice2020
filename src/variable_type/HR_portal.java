package variable_type;

public class HR_portal {

	public static void main(String[] args) {
		Employee deepak=new Employee();
		deepak.Employee_name="Deepak";       //object.variable name=variable value,,variable declare in other class?
		deepak.Employee_grade='A';
		deepak.Employee_code=101;
		deepak.Employee_salary=9756303.2235f;
		
		deepak.employee_info();//calling non static method from another class,object is already created//
		
		Employee sagar=new Employee();
		sagar.Employee_name="sagar";
		sagar.Employee_code=100;
		sagar.Employee_grade='A';
		sagar.Employee_salary=9854230.55f;
	
		sagar.employee_info();

	}

}
