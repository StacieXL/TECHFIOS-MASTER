package homework1Package;

import java.util.Scanner;

public class Homework1 {
public static void main(String[] args) {
	
System.out.println("my name is Stacie");


System.out.println("USer, type in a string");		
Scanner userInput = new Scanner (System.in);
String  userValue = userInput.nextLine(); 
		
System.out.println("Your input is ---> " + userValue);	
System.out.println("The Upper Case is  " + userValue.toUpperCase());	
System.out.println("The length is---->  "+ userValue.length());
System.out.println("Replace O's with Z's ---> " + userValue.replace("o","z"));	
System.out.println("The last character is --->" + userValue.charAt(userValue.length()-1));
System.out.println("The concat is --->" + userValue +  " Test");
System.out.println();
System.out.println("BONUS");
System.out.println("Replace Capped O's with Z's and non-capped o with z ---> " + userValue.replace("o","z").replace("O","Z"));



}
}
