package homeWorks;
public class HW4Overload2 {

	public HW4Overload2() {          // default constructor no input
		System.out.println("Print default constructor");		
	}	
	public HW4Overload2(String x) {  //single argument
		System.out.println("1 argument String = \"" +x+"\"");
	}
	public HW4Overload2(int x) {
		System.out.println("1 argument int    =  " +x);	
	}	
	public HW4Overload2(String any, String any1) {  //two argument
		System.out.println("2 args: String + String     = "+  any+" & "+any1);
	}	
	public HW4Overload2(int x, String y) {
		System.out.println("2 args: int + String        = "+y+ " #"+x);		
	}	
	public HW4Overload2(String y, int x) {
		System.out.println("2 args: (Reverse parameter) = "+y+ " still #"+x);
	}	
	public HW4Overload2(String y, int x, int z) {
		System.out.println("3 args: arg1 + arg2 + arg3  = "+y+" "+x+" "+z);			
	}
		
		
		
		
	
	//method	
	
	public int MethodOverload(int x) {           		
		return x;           
	}
	public int MethodOverload(int x, int y) {
		return x+y;
	}
	public String MethodOverload(String y) {
		return y;
	}
}
