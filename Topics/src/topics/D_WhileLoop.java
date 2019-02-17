package topics;
import java.util.Scanner;
public class D_WhileLoop {
	public static void main(String[] args) {
		int j = 4;
	    while (j <= 16) {
	      System.out.println(j);
	      j+=4;
	    }  
	    System.out.println();
	   
	    
		int age = 5;
	    while(age <18) {
	    	if (age < 10) {
	    		System.out.println("Your age is: "+age+" too young");
	    		age++;
	    	} 
	    	else {
	    		System.out.println("Your age is: "+age + ".   You are still under 18");
	    		System.out.println("PLease enter age again");
	    		Scanner userInput = new Scanner (System.in);
	    		age = userInput.nextInt();
	    	}
	    }
	}
}