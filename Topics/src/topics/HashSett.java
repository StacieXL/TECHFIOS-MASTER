// List
// Hashset
// Linked Hashset
// Treeset

package topics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSett {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(); 
		list.add(3);
		list.add(2); 
		list.add(1);
		list.add(3);
		list.add(2);
		System.out.println("ArrayList (as is, add to end, duplication): \n"+list);
		System.out.println(); System.out.println(); System.out.println();
		
		Set<String> hashBigStr = new HashSet<>(); 
		hashBigStr.add("Audidjfskdjfh"); 
		hashBigStr.add("BMW");
		hashBigStr.add("Honda");
		hashBigStr.add("Nissan"); 
		hashBigStr.add("Toyota");
		System.out.println("Hash Set: If large string (randomized): \n"+hashBigStr);
		System.out.println();
			 	
		HashSet<String> hashSmallStr = new HashSet<String>(); 				
		hashSmallStr.add("c");
		hashSmallStr.add("d"); 
		hashSmallStr.add("a"); 
		hashSmallStr.add("e");
		hashSmallStr.add("b");
		System.out.println("Hash Set: If small string (single char) No random, sorted: \n"+hashSmallStr);
		System.out.println();
		
		Set<Integer> hashSmallInt = new HashSet<>(); 				
		hashSmallInt.add(4);
		hashSmallInt.add(5); 
		hashSmallInt.add(1);
		hashSmallInt.add(2);
		hashSmallInt.add(3);
		System.out.println("Hash Set: small integer <16, No Random, sorted): \n"+hashSmallInt);
		System.out.println();
		
		Set<Integer> hashBigInt = new HashSet<>(); 				
		hashBigInt.add(10);
		hashBigInt.add(20); 
		hashBigInt.add(30);
		hashBigInt.add(40);
		hashBigInt.add(40);
		System.out.println("Hash Set: big integer >16, Randomized, Unique): \n"+hashBigInt);
		System.out.println(); System.out.println(); System.out.println();
		
		Set<Integer> tree = new TreeSet<>(); 				
		tree.add(4);
		tree.add(5); 
		tree.add(1);
		tree.add(2);
		tree.add(3);
		System.out.println("Tree set (sorted): \n"+tree);
		System.out.println();                           
		
	}  
}
