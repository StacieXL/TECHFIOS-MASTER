package topics.AccessModsPack1;
public class Pack1NonInherit {
	public static void main (String[] args){
	
//		Pack1AccessMods.privateFunc();		 // not allowable
		Pack1Parents.noIDFunc();
		Pack1Parents.protectedFunc(); 
		Pack1Parents.publicFunc();   
	}
}
 