package topics;
import java.util.Scanner;
public class A_Scannerr {
	public static void main(String[] args) {

//integer		
		System.out.println("Enter number");	
		Scanner input1 = new Scanner (System.in);
		int number = input1.nextInt(); 
		System.out.println(number);

//string 		
		System.out.println("Enter string");	
		Scanner input2 = new Scanner (System.in); 
		String string = input2.nextLine(); 
		System.out.println(string);
		
// char (single quote)
		System.out.println("Enter character");	
		Scanner input3 = new Scanner (System.in);
		char char1 = input3.next().charAt(0);
		System.out.println(char1);
	}
}
