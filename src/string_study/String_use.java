package string_study;

import java.util.Arrays;

public class String_use {

	public static void main(String[] args) {

           String m="my life";
           String m1="my life";    //creating string without using new keyword.
           
           String n=new String("my life");    //creating string with 'NEW' key word
           String n1=new String("my life");
           String n2=new String("my fight");
           String n3=new String("Welcome"); 
           String n4=new String("Welcome");
           
           System.out.println(m==m1);  //memory location is SAME both m and m1 denotes same memory size therefore boolean value will generate as TRUE.
           System.out.println(m==n);   //memory location is DIFFERNT therefore boolean value will be FALSE
           System.out.println("===================================================================================================================");
  //===========================================================================================================================================
           
                                  //*******equals method*********
           
           System.out.println(m.equals(m1));  //equals will check the content if same then true and if not then will generate false boolean value
           System.out.println(m.equals(n1));  //different string creation method but content is same therefore true boolean value
           System.out.println(n.equals(n2));  //content is different therefore false boolean value will bw given
           System.out.println("equals mthod to check case sensitivness "+n3.equals(n4));
           System.out.println("===================================================================================================================");
    //==========================================================================================================================================   
           
                                       //==>length method<==
           
           int a=m.length();  //where a is called REFFERENCE VARIABLE
           System.out.println("length of m is "+a);//space is also counted
           
           System.out.println("length of m is "+m.length());//we can also write like this
           System.out.println("===================================================================================================================");
    //========================================================================================================================================
           
                                           //UPPER CASE METHOD
           
          System.out.println(n2.toUpperCase());   //for converting string value in upper case
          String b= n2.toUpperCase();             //here b is REFFERENCE variable
          System.out.println("print "+b);         //we can also do like this
          System.out.println(b);                  //if we do not want printing statement
          System.out.println("===================================================================================================================");
    //==========================================================================================================================================  
          
                                            //lower case method
          System.out.println(n3.toLowerCase());//
          System.out.println("===================================================================================================================");  
    //========================================================================================================================================== 
          
                                             //EQUALSIGNORE METHOD
          
          System.out.println(n3.equals(n4));//will give boolean value as false,though content is same but .equals method is  case sensitive.
          System.out.println(n3.equalsIgnoreCase(n4));//will give boolean value as true although cases are different
          System.out.println("this time ignore works and boolean value is "+n3.equalsIgnoreCase(n4));//to study we can write like this.
          
          System.out.println("===================================================================================================================");
      //=========================================================================================================================================   
          
                           //CONTAINS method:
 //                                           is case sensitive,generate boolean values.we check sequence of string
          
          String c="deepak";
          String d="Deepak";
          
          System.out.println("contain concept 1 output is "+c.contains("de"));//check the spell and compares our given ,and generates boolean value.
          System.out.println("contain concept 2 output is"+c.contains("d")); //single letter will also be treated as string and compare given and actual
          System.out.println("contains concept 3 output is "+c.contains("Deepak"));//contains will check upper and lower case also, like equals do
          System.out.println("contains output for d variable "+d.contains("deepak"));
          
          System.out.println("===================================================================================================================");
     // =====================================================================================================================    
          
                                       //.isEmpty method----> gives boolean value
          
          String e="";       //===>SPACE IS NOT PRESENT
          String f="   ";   //====>SPACE IS PRESENT
          String g="goodness";
          
          System.out.println(e.isEmpty());                   // e is empty ie without space this will generate boolean value as true
          System.out.println("output of .isEmpty method trial 1, is "+e.isEmpty());       //we can also write it as for revision
          
          System.out.println("output for .isEmpty method tria2 is "+f.isEmpty());    //*false because space is present,is EMPTY CONSIDERS the space
          
          System.out.println("output for .isBlank trial 1 (no space) is "+e.isBlank());  //true bcs "" nothing is there(EMPTY VS BLANK)IMP DIFF
          
          System.out.println("output for .isBlank method trial 2 is "+f.isBlank());       //true bcs nothing in there although space is present
          
          System.out.println("output for .isBlank for somethink is wriiten as string "+g.isBlank());
        
          //CONCLUSION  --->is.Blank will not consider space
          //blank is blank no content,no space consideration,even if space present blank will give true value
          //WHEREAS empty method considers space which mean if space is present empty will give false value that is string is not empty
          
          System.out.println("===================================================================================================================");
  //  ===========================================================================================================================================  
          
                                                     //charAt method
                                                     //objectname.charAt
          
          String h="Sambhajinagar";
       System.out.println("output for .charAt method trial 1 is "+h.charAt(8));//return value will be char as per the index value
       
       char out=h.charAt(7);
       System.out.println("output for charAt tria2 is "+out);
       
       System.out.println("===================================================================================================================");
  //===============================================================================================================================
       
  //                           startsWith and endsWith:
  //                                                  gives boolean value
      
       String j="velocity";
       System.out.println("output for startsWith(trial 1)is ="+j.startsWith("vel"));
       System.out.println("outpu for endsWith method is= "+j.endsWith("ty"));
       System.out.println("output for endswith method (trial3) is="+j.endsWith("t"));    //make changes and see the result
       
       System.out.println("===================================================================================================================");
 // ============================================================================================================  
       
 //      null
  //     String k=null;
  //     System.out.println("length of null string is ="+k.length());     //this is called NULL EXCEPTION
       
       System.out.println("===================================================================================================================");
 //=================================================================================================================     
       
 //                          Substring:
 //                                   it will fetch the string by eliminating string as per indexing
       
       String L="velocity";
       System.out.println("outpput for method substring is--> "+L.substring(4));//  it considers space
       System.out.println("output for substring with two values in bracket is= "+L.substring(2,4));//two time and two ways substring is extracted
       
       System.out.println("===================================================================================================================");
//===========================================================================================================================================   
       
//                                                       concate method
       
  String o="Shubham";
  String p=" life";
  String r=" demands learning from your past";
  String s=" apply it.";
  System.out.println(o.concat(p).concat(r).concat(s));
   String q=(o).concat(p).concat(r).concat(s);
   System.out.println("output of concat method is -->"+q);
      
        System.out.println("===================================================================================================================");
 //============================================================================================================================================
        
 //                                   indexOF method we get integer or index value as return type 
        
        String object="i hate indian dirty politics";// /working on string
        
       System.out.println("index of h is "+object.indexOf('h'));
       System.out.println("index of space is "+object.indexOf(" ")); //note: if we left blank without space it gives index as 0 ,,and also 
                                                                    //gives zero for i(index)for  initial character
       
       System.out.println("===================================================================================================================");
 //==============================================================================================================================================
       
 //                                    lastIndexOF method gives last index of required character
       
        System.out.println("last indewx of i is "+object.lastIndexOf('i'));
        
        System.out.println("===================================================================================================================");
        
//========================================================================================================================================  
        
 //                                        *replace method*
        
        System.out.println("replacing hate to love therefor result is ===> "+object.replace("hate", "love"));
        
        System.out.println("===================================================================================================================");
//========================================================================================================================================    
        
//                                            *split method*
        
        String object1="i hate indian dirty politics";
        
        String space=" ";     /////je asel te dyayach  (space or semicolon,ultimately it will   split) bcs here strings seperated by space
        String[] ob2=object1.split(space);  //storing space into the string array
        
       for(int i=0;i<=4;i++)   //=====>we can use object.lenght-1,then we can take string of any length,then we dont need to change i value called
    	                                                                                                                // dynamic loop
       {System.out.println(ob2[i]);   ////iterator ca be use,use here all crsor
       }
       
       System.out.println("===================================================================================================================");
 //=============================================================================================================================================`
  
    //                            (=======>Arrays.sort method  <=======)
       
       char grade[]=new char[9];
		 
		 grade[0]='b';   grade[1]='a';
		 grade[2]='d';    grade[3]='c';
		 grade[4]='f';	 grade[5]='e';
		 grade[6]='h';	 grade[7]='g';
		 grade[8]='i';
		 
		 Arrays.sort(grade);               //syntax for sort method it will make ascending by default
		 
		 for(int i=0;i<grade.length;i++)
		 {
			 
		 System.out.println("print "+grade[i]);
		 }
System.out.println("======================================================================");		 
	System.out.println("printing array descending order");	 
	
	          //for descending order/		 
		 for(int i=grade.length-1; i>=0;i--)	 //we have to use .length -1 because we will star from lower index which will be length-1
		 {
		 
		 System.out.println("print "+grade[i]);
		 }
        
        
         
          }

}
