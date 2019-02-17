package homeWorks;
import java.util.Scanner;
public class Calc1Inheritance extends FunctionsForCalc {
	public static void main(String[] args) {
//Plan v1
//3 scanners + parameter check
//operator if then
// 1 function for each operator, passing scanner to arguments		
//Plan v2
//3 scanners + parameter check + 2 numbers, 1 char
//operator Switch char
// 1 function for each operator, passing scanner to arguments		
		System.out.println("Enter a number:");	
		Scanner input1 = new Scanner (System.in); 
		double number1 = input1.nextDouble();
		
		System.out.println();
		System.out.println("Enter an operator (+ - x /):");	
		Scanner input2 = new Scanner (System.in);
		char operator = input2.next().charAt(0);
		
		System.out.println();
		System.out.println("Enter another number:");	
		Scanner input3 = new Scanner (System.in); 
		double number2 = input3.nextDouble();
		
		System.out.println();
		System.out.println("Your final calculation is:");
		
		Calc1Inheritance C = new Calc1Inheritance ();
	    switch (operator) {		
	    	case '+':		
	    		C.addition 	(number1, number2);	
	    		break;		
	    	case '-':		
		  		C.subtract 	(number1, number2);	
		  		break;		
	    	case 'x':		
		  		C.multiply 	(number1, number2);
		  		break;
	    	case '/':		
		  		C.divide 	(number1, number2);	
		  		break;
	    }
	}
}
//Summary:  scanner double and char + switch + arguental functions
//local and global variables		
//static non static functions and object
//inheritance