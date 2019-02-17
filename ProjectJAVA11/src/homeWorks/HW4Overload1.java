package homeWorks;
public class HW4Overload1 {
	
	public static void main(String[] args) {
//Constructor		
		HW4Overload2 object1 = new HW4Overload2();      //dfaultconstruct
		HW4Overload2 object2 = new HW4Overload2("abc");
		HW4Overload2 object3 = new HW4Overload2(5);
		HW4Overload2 object4 = new HW4Overload2("Minh","Stacie");
		HW4Overload2 object5 = new HW4Overload2(1, "We are");
		HW4Overload2 object6 = new HW4Overload2("We are", 1);  // reverse sequence is OK
		HW4Overload2 object7 = new HW4Overload2("ABC",123,456);
		System.out.println();
		
		
// Constructor Chain
//		HW4Overload2 object11  = new HW4Overload2();			
		
		
		

		
		
//Methods	
		int a =object1.MethodOverload(1) + object1.MethodOverload(1,2);
		System.out.println("From Methods = "+a);
		
//		object1.MethodOverload();
//		
//		int w = object1.MethodOverload(1,23);
//		System.out.println(w);
//		
//
//		String x = object1.MethodOverload("ABC");
//		System.out.println(x);
//		System.out.println();

	}
}
 