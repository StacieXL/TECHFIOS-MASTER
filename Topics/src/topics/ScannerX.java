package topics;
import java.util.Scanner;
public class ScannerX {
	public static void main(String[] args) {
	//After type "Scanner">>>hover over it to choose "import.java..." in order to import java.util.Scanner on top of page	
		System.out.println("Please type sth in");
		Scanner userInput= new Scanner(System.in);
		String userResult= userInput.nextLine();
		System.out.println(userResult);
	}
}
