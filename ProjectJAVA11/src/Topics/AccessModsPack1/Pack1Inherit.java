package topics.AccessModsPack1;

public class Pack1Inherit extends Pack1Parents{
	public static void main (String[] args){
		System.out.println("Global Variables");
//		System.out.println(statPrivate);         // not allowable
		System.out.println(statDefault);
		System.out.println(statProtected);
		System.out.println(statPublic);	
		System.out.println();
		
//		privateFunc();		 // not allowable
		noIDFunc();
		protectedFunc(); 
		publicFunc();    
	}

}
 