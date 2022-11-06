package string_study;

public class ReversString {

	  public static void main(String[] args) {    
	        String string = "ganesh jadhav";    
	            
	        String reversedStr = "";    
	            
	         
	        for(int i = string.length()-1; i >= 0; i--){    
	            reversedStr = reversedStr + string.charAt(i);    
	        }    
	            
	        System.out.println(" actual mstring " + string);    
	           
	        System.out.println(" desire strin " + reversedStr);    
	    }    
	}  
