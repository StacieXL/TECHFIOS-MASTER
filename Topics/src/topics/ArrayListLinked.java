package topics;
import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayListLinked {
	public static void main(String[] args) {
		
// Array List: type String		
		//Time measured
		long startTime =  System.currentTimeMillis();	
		ArrayList<String> objectStr = new ArrayList<>(); 		
		objectStr.add("Str1");
		objectStr.add("Str2"); 
		objectStr.add("Str3"); 
		objectStr.add("Str4");
		System.out.println("Array List: "+objectStr);
		System.out.println("Size of Array       : "+ objectStr.size());
		System.out.println("Last index (size -1): "+ objectStr.get(objectStr.size()-1));
		System.out.println("First index [0]     : "+ objectStr.get(0));
		System.out.println();
		
		objectStr.remove("Str1");	
		objectStr.remove(1);
		objectStr.add("Str5");
		objectStr.add(0,"Str6");
		objectStr.add("Str7");
		System.out.println("Remove \"Str1\", \nRemove index [1], \n"
				+ "Add \"Str5\", \nAdd \"Str6\" at [0], \nAdd \"Str7\"");
		System.out.println();
		System.out.println("New Array List becomes: \n"+objectStr);
		System.out.println("Size of Array    : "+ objectStr.size());
		System.out.println("Index of \"Str5\"  : " +objectStr.indexOf("Str5"));
		System.out.println("Contains \"Str5\"  : " +objectStr.contains("Str5"));
		System.out.println("Contains \"Str1\"  : " +objectStr.contains("Str1"));
		System.out.println();
		
		long endTime =  System.currentTimeMillis();
		System.out.println("Time measured: " +(endTime - startTime)+" ms");	
		System.out.println("====================================");System.out.println();
		
		

// Array Linked List: type Integer (Array list and Array linked list is same, 
//									only link list is faster when you have massive data)			
//Linked List is quicker because when changes made>>>it doesnt shift position
		
		
		
		long startTime3 =  System.currentTimeMillis();			
		LinkedList<Integer> objectInt = new LinkedList<>(); 	
		objectInt.add(1);
		objectInt.add(2); 
		objectInt.add(3); 
		objectInt.add(4);
		System.out.println("Array Linked List: "+objectInt);
		System.out.println("Size of Array       : "+ objectInt.size());
		System.out.println("Last index (size -1): "+ objectInt.get(objectInt.size()-1));
		System.out.println("First index [0]     : "+ objectInt.get(0));
		System.out.println();
		
		objectInt.remove(new Integer(1));	//wrap in Integer. Remove value 1
		objectInt.remove(1);				//Remove index 1
		objectInt.add(5);
		objectInt.add(0,6);
		objectInt.add(7);
		System.out.println("Remove 1, \nRemove index [1], \n"
				+ "Add 5, \nAdd 6 at [0], \nAdd 7");
		System.out.println();
		System.out.println("New Linked list becomes: \n"+objectInt);
		System.out.println("Size of Array: "+ objectInt.size());
		System.out.println("Index of 5   : " +objectInt.indexOf(5));
		System.out.println("Contains 5   : " +objectInt.contains(5));
		System.out.println("Contains 1   : " +objectInt.contains(1));
		System.out.println();
		
		long endTime3 =  System.currentTimeMillis();
		System.out.println("Time measured: " +(endTime3 - startTime3)+" ms");	
		System.out.println("====================================");System.out.println();
	}
}  