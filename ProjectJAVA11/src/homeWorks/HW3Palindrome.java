package homeWorks;
import java.util.Scanner; 
public class HW3Palindrome{
	public static void main(String args[]){
		
		System.out.println("Type something:");
		Scanner userInput = new Scanner (System.in);
		String original = userInput.nextLine();
		System.out.println("Lenght of string is: "+original.length());
		
// reverse the tring	    
	    String reverse = "";
	    for (int i = original.length()-1; i >= 0; i--) { // repeat backwards 3 to 1
	    	reverse = reverse + original.charAt(i);            
	    }
	    System.out.println("The reverse is: "+reverse);
	       
	    	    
// Compare original and reverse with equals()    
	    if (original.equals(reverse)) {
	    	System.out.println("With equals()    method = " + original.equals(reverse)   
	    	+ ".  It is a palindrome.");
	    	// System.out.println(compare(reverse,original)   + "The string is a palindrome.");
	    }	else {
	    	System.out.println("With equals()    method = " + original.equals(reverse)   
	    	+ ".  It is NOT a palindrome.");
	    }
	    
	    
// Compare original and reverse with compareTo()
	    if (original.compareTo(reverse)==0) {
	   	  System.out.println("With compareTo() method = "   + original.compareTo(reverse)
	   	  	+ ".     It is a palindrome.");         
	    }	else {
	    	System.out.println("With compareTo() method = " + original.compareTo(reverse)   
	    	+ ".     It is NOT a palindrome.");
	    }
    } 
} 