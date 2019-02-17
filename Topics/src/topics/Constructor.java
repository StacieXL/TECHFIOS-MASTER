package topics;
//the constructor name must match the class name, and it cannot have a return type (like void).
public class Constructor {
	 static int a;
	 int b;
	 
	 public Constructor(int b) {
		 a=5;
	 }
		
	 public static void main(String[] args) {
		 
		 Constructor object= new Constructor(a);
		 System.out.println(object.a);
	 }
		
	 
}
