package topics;

public class C_1DForWhile {
	public static void main(String[] args) {

// For loop
		int j =5;
		for (j=j; j <11; j++) {
			System.out.print(j+" ");	
		}			
		System.out.println();
		
		
		
// while loop
		j--;
		while (j >= 5) {
			System.out.print(j+" ");
			j--;
		}
		System.out.println();
		
		
		
// do while 	
		do {
		  System.out.print(j+ " ");
		  j++;
		}
		while (j < 11);		
		System.out.println();
		
		 
//do while print 1
		do {
			  System.out.print(j+ " ");
			  j++;
			}
		while (j < 10);		
	}
}

