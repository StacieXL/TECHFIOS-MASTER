package topics;

public class Function {

	 
	//create new func. New func needs to be called inside the "main" func first
	//A method can also be called multiple times	
		//state(); 
		//equation(11,13); 
		//argumentalequation(22,44,33); 
		//nameargument("Robert","Mary");
	
	
	public static void state() {
		 System.out.println("Bingo");
		 }
	
	public static void equation(int c, int d) {
		
		
		int r=c*d+c;
		System.out.println(r);
		
	}
		
	public static void argumentalequation(int a, int b, int c) {
		int equation= a+ b*c;
		System.out.println(equation);
		}
	
		public static void nameargument(String matchname, String matchname2) {
			System.out.println("Nice to meet "+ matchname);
			System.out.println("Nice to meet "+ matchname2);
	
		}
	
	
	
	

}
