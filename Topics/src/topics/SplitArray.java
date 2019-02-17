package topics;
import java.util.Scanner;
public class SplitArray {
	public static void main(String[] args) {
	//to convert a string to array
	
	System.out.println("Please type something in");
	Scanner userInput= new Scanner(System.in);
	String userResult= userInput.nextLine();	
	System.out.println("string is "+userResult);
	
	//char [] arrayName = userResult.toCharArray();
	String[] splitArray = "a b c d e f".split(" ");
	 for (int i = 0; i < 6; i++) {  
		 System.out.print(splitArray[i]);
	 	}
	
	}
}
