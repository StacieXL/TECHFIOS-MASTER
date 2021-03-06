package topics;
public class StaticGlobalVarMethodChain{	
	static int c = 3;
	static int d = 4;
	int e = 5;
	int f = 6;
	
	public static void main(String[] args) { 
		int a = 1;
		int b = 2;	
		
		staticMethod (a,b);    	//static method    - local variables           
		staticMethod (c,d);    	//static method    - global static vars          
		staticMethod2   ();		//static method    - global Nonstatic (e,f)
		
		StaticGlobalVarMethodChain object = new StaticGlobalVarMethodChain ();      
		object.nonStatic(a,b); 	//Nonstatic method - static variables
		object.nonStatic(c,d);  //Nonstatic method - global static vars
		object.nonStatic2  (); 	//Nonstatic method - global Nonstatic (e,f)
	}  

	
	
	
	public static void staticMethod(int num1, int num2) {   //static method - static vars
		System.out.println(num1 + num2);
		staticMethod2();
	}	
	public static void staticMethod2() {                 //static method - Nonstatic vars
		StaticGlobalVarMethodChain object = new StaticGlobalVarMethodChain ();              	
		System.out.println(object.e + object.f + c);  
		object.nonStatic(object.e,object.f);
		object.nonStatic2();
	}	
	public void nonStatic(int num1, int num2) {     	// Nonstatic method - static vars
		System.out.println(num1 + num2);   
		staticMethod(c,d);
	}	
	public void nonStatic2() {                        //Nonstatic method - Nonstatic vars              	
		System.out.println(e + f + c + d); 
		nonStatic(c,d);
		staticMethod(e,f);
		staticMethod2();
	}
}



	