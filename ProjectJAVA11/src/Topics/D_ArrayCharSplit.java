package topics;
public class D_ArrayCharSplit {
	public static void main(String[] args) {
	
//toCharArray		
		String string ="How are you doing?";
		char[] b = string.toCharArray();
		System.out.println(b);
		System.out.println("Length of charArray = "+b.length);
		for (int i=0;i<b.length;i++) {
			System.out.println("Index["+i+"] = " +b[i]);
		}
		

//split Array
		System.out.println("===========");
		String[] splitArray = string.split(" ");	
		System.out.println("Length of splitArray = "+splitArray.length);
		for (int j=0;j<splitArray.length;j++) {
			System.out.println("Index["+j+"] = " +splitArray[j]);
		}
		
		
//doubleSplit 		
		System.out.println("===========");
		String[] split = string.split(" ");	
		System.out.println("Length of splitArray = "+split.length);
		for (int k=0;k<split.length;k++) {
			String[] splitAgain = split[k].split("o");	
			System.out.println("Length of splitAgain["+k+"] = "+splitAgain.length);
			for (int l=0;l<splitAgain.length;l++) {
				System.out.println("Index["+l+"] = " +splitAgain[l]);
			}
		}
			
		
// FOR EACH		
//		for (String item:split) {
//			System.out.println(item);
//		}
		System.out.println("===========");
		for (int m=0;m<split.length;m++) {
			for (String item: split[m].split("o")) {
				System.out.print(item+ "   ");	
			}
			System.out.println();
		}
	}
}	
		


