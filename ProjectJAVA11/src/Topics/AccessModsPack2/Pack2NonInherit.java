package topics.AccessModsPack2;

import topics.AccessModsPack1.Pack1Parents;

public class Pack2NonInherit {
	public static void main(String[] args) {
//		Pack1AccessMods.privateFunc();			// not allowable
//		Pack1AccessMods.noIDFunc();				// not allowable
//		Pack1AccessMods.protectedFunc(); 		// not allowable
		Pack1Parents.publicFunc();  
	}
}
