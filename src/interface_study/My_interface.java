package interface_study;

public interface My_interface {

   	int a=10;      //data member in the interface are static and final,thats why a became italic
	 void test1();  //in the interface bodies are by default public and abstract
	 void test2();  
	 void test3();
}
//by default public ,static ,final,
//no constructor is used
//no object allowed therefore constructor can not be allowed
//multiple inheritance is possible by using interface
//implement class need to be created to give the definition for incomplete methods of interface