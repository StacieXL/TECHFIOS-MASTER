package Topics.staticNonstatic;
public class Class1{	
	public static void main(String[] args) { 		
		int x = 2;
		int y = 1;	
		
// STATIC CALLS STATIC
		sum (x,y);                      // 1 way (same class)
		Class1.sum(x, y);               // 2 way (same class)	
		Class2.sum(x, y);               // 3 way (different class)	
		Class2 object1 = new Class2();  // 4 way (different class)
		object1.sum(x,y);	
		System.out.println();
		
// STATIC CALLS NON-STATIC
		Class1 object2 = new Class1();	// 1 way (same class)	
		object2.minus(x,y);		
				
		//Class2 object1 = new Class2();	// 2 way (different class)	
		object1.minus(x,y);		
		System.out.println();
		
// CALLING RETURNS STATIC CALLS STATIC
		String z = Class2.returnString();	
		System.out.println(z);
		
		int w = Class2.returnInt(x,y);
		System.out.println(w);
		
		System.out.println();
// CALLING RETURNS STATIC CALLS NON-STATIC		
		Class2 object3 = new Class2();
		int t = object3.returnNonStatic(x,y);	
		System.out.println(t);
	}	
	
	
	

	public static void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}	
	public void minus(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
}






////CMD input already splitted by space
//		int[] numbers = new int[args.length]; 
//		for(int i = 0;i < args.length;i++){
//			numbers[i] = Integer.parseInt(args[i]);
//		}
//		System.out.println(numbers[0]+" + "+numbers[1]+" = "+(numbers[0]+numbers[1]));
//
//		