package topics.AccessModsPack2;
import topics.AccessModsPack1.Pack1Parents;
	public class Pack2Inherit extends Pack1Parents{
		public static void main (String[] args){
//			System.out.println(statPrivate);         // not allowed
//			System.out.println(statDefault);         // not allowed
			System.out.println(statProtected);
			System.out.println(statPublic);	
			System.out.println();
			
//			privateFunc();		 // not allowable
//			noIDFunc();			// not allowable
			protectedFunc(); 
			publicFunc(); 
		}

}