package Topics;
public class CurrentClass {
	public static void main(String[] args) { 
		
//CMD input already splitted by space
		int[] numbers = new int[args.length]; 
		for(int i = 0;i < args.length;i++){
			numbers[i] = Integer.parseInt(args[i]);
		}
		System.out.println(numbers[0]+" + "+numbers[1]+" = "+(numbers[0]+numbers[1]));

		
		

		int x,y;
		x = 2;
		y = 1;	
//  Static-Static call methods 4 ways	
		samePLusFunc(x,y);
		CurrentClass.samePLusFunc(x,y);			
		DifferentClass.diffPLusFunc(x,y);
		DifferentClass customObj = new DifferentClass();
		customObj.diffPLusFunc(x,y);
		

//  Static-Non-static call methods 2 ways	
		CurrentClass customObj2 = new CurrentClass();
		customObj2.sameMinusFunc(x,y);
		DifferentClass customObj3 = new DifferentClass();
		customObj3.diffMinusFunc(x,y);

		
	}
	
	
	public static void samePLusFunc(int x, int y) {
		System.out.println(x+y);
	}	
	public void sameMinusFunc(int x, int y) {
		System.out.println(x-y);
	}	
}


