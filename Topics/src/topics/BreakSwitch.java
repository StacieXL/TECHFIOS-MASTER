package topics;

import java.util.Scanner;

public class BreakSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please type your day in");
		int userResult;
		
		Scanner userInput= new Scanner(System.in);
					userResult= Integer.parseInt (userInput.nextLine());
			
//Integer.parseInt () is to convert String to Int to match with "day" datatypes below
			
		
		 int day= userResult;
		    switch (day) {
		      case 1:
		        System.out.println("Monday");
		        break;
		      case 2:
		        System.out.println("Tuesday");
		        break;
		      case 3:
		        System.out.println("Wednesday");
		        break;
		      case 4:
		        System.out.println("Thursday");
		        break;
		      case 5:
		        System.out.println("Friday");
		        break;
		      case 6:
		        System.out.println("Saturday");
		        break;
		      case 7:
		        System.out.println("Sunday");
		        break;
		    }
		  }
		}
		
		
		
		
		
		
		
		
		
	


