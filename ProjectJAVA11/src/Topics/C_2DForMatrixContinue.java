package topics;
public class C_2DForMatrixContinue {
	public static void main(String[] args) {
	
// Forloop 1D
		for (int i = 1; i <=4; i++) {
			System.out.println("4 x " +i+ " = "+4*i);	
		}	
		System.out.println();
		
	
//Manual 2D 	
		System.out.println("   j1 j2 j3 j4" );
		System.out.println("i1  1  2  3  4 ");	
		System.out.println("i2  2  4  6  8 ");	
		System.out.println("i3  3  6  9 12" );	
		System.out.println("i4  4  8 12 16"	);	
		System.out.println();
		
//ForLoop 2D		
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();		
		}	
		System.out.println();
				
		
//ForLoop 2D CONTINUE (skip)		
		for (int i = 1; i <=4; i++) {
			if (i ==3) {continue;}
			for (int j = 1; j <=4; j++) {
				if (j ==3) {continue;}
			System.out.print(i*j+ " ");	
			}	
			System.out.println();
		}	
		System.out.println();
	
			
// ForLoop 1D CONTINUE
		for (int i = 1; i <=4; i++) {
			if (i ==3) {continue;}
			System.out.println("4 x " +i+ " = "+4*i);	
		}	
		System.out.println();			
	}
}
