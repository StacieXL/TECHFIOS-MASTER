package topics;

//2 Types of funcs: Static & Non-Static
// 
//when the word "static" is present>>>>become static
//only can be called in "public static" method 
//static funcs can only be called in static main func & static func
//A non-static func can not be called in a static main func
//we have to create an object for calling non-static func in the static main func
//static means that the variable or method marked as such is available at the class level.
//In other words, you don't need to create an instance of the class to access it.
//To creat an object>>>have to name it exact as Class name
//All built-in func are non-static
//After creating an object, we can access the non-static func



public class C_staticandnonstatic {

	public static void main(String[] args) {
		
		C_staticandnonstatic X= new C_staticandnonstatic();	
	
	}

}
