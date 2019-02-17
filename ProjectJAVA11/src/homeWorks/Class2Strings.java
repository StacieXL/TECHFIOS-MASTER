package homeWorks;
import java.util.Scanner;
public class Class2Strings {
	public static void main(String[] args) {
		System.out.println("Type something that starts with letter 'O'and hit Enter:");	
		Scanner userInput = new Scanner (System.in);
		String userValue = userInput.nextLine();  
		
		System.out.println();
		System.out.println("Convert to Upper Cases          ---> " + userValue.toUpperCase());
		System.out.println("Length of string is             ---> " + userValue.length());
		System.out.println("Replace All letter O's with Z's ---> " + userValue.replace("O", "Z" ).replace("o", "z"));	
		System.out.println("Last letter of the string is    ---> " + userValue.charAt(userValue.length()-1));
		System.out.println("Concat string with 'Test'       ---> " + userValue + " Test");
		
		//Bonus
		char firstLetter = userValue.charAt(0);	
	    String printout;			
	    printout =(firstLetter == 'o') ? userValue.replaceFirst("o", "z")			
                 :(firstLetter == 'O') ? userValue.replaceFirst("O", "Z")					
                 : " ";
        System.out.println();
		System.out.println("Bonus- Replace only First letter --> " + printout);
	}
}
