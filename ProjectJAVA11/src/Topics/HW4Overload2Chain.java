package topics;
public class HW4Overload2Chain {

	public HW4Overload2Chain() {         				 	//default no input
		this ("Minh", "Stacie");
	}	
	
	public HW4Overload2Chain(String x) {  					//single argument
		System.out.println("Print default constructor");	
		System.out.println("1 argument String = \"" +x+"\"");
	}		
	
	public HW4Overload2Chain(int x) {
		this ("abc");
		System.out.println("1 argument int    =  " +x);	
	}	
	
	public HW4Overload2Chain(String x, String y) { 			 //two argument
		this (5);
		System.out.println("2 args: String + String     = "+  x+" & "+y);	
	}	
}







//package topics;
//public class HW4Overload2Chain {
//	
//	public HW4Overload2Chain() {         				 	//default no input
//		this("ABC",123,456);
//	}	
//	public HW4Overload2Chain(String x) {  					//single argument
//		System.out.println("Print default constructor");	
//		System.out.println("1 argument String = \"" +x+"\"");
//	}		
//	public HW4Overload2Chain(int x) {
//		this("abc");
//		System.out.println("1 argument int    =  " +x);	
//	}	
//	public HW4Overload2Chain(String x, String y) { 			 //two argument
//		this(5);
//		System.out.println("2 args: String + String     = "+  x+" & "+y);	
//	}	
//	public HW4Overload2Chain(int x, String y) {
//		this("Minh","Stacie");
//		System.out.println("2 args: int + String        = "+y+ " #"+x);		
//	}	
//	public HW4Overload2Chain(String y, int x) {
//		this(1, "We are");
//		System.out.println("2 args: (Reverse parameter) = "+y+ " still #"+x);
//	}	
//	public HW4Overload2Chain(String y, int x, int z) {
//		this("We are", 1);
//		System.out.println("3 args: arg1 + arg2 + arg3  = "+y+" "+x+" "+z);			
//	}
//}