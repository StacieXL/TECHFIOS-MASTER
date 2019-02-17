package topics;
public class A_Strings {
	public static void main(String[] args) {
		String str = "ABC_EF";	
		System.out.println("String str =          ---> \"ABC_EF\"");
		System.out.println();
		System.out.println("str.length ()         ---> " + str.length());
		System.out.println("str.indexOf('A')      ---> " + str.indexOf('A'));	
		System.out.println("str.charAt (0)        ---> " + str.charAt(0));	
		//System.out.println("str.charAt(0)         ---> "  + str[0]);	
		System.out.println("str.charAt (str.length()-1) --> "+ str.charAt(str.length()-1)+" (last index [5])");
		System.out.println("str.replace(\" \", \"\")  ---> "+ str.replace(" ", ""));	
		System.out.println("str.substring (1)     ---> "    + str.substring (1  ));
		System.out.println("str.substring (1,5)   ---> "    + str.substring (1,5) + "  (start, cutoff)");
		System.out.println("str.startsWith(\"abc\") ---> " + str.startsWith("abc"));
		System.out.println("str.contains  (\"ABC\") ---> " + str.contains("ABC"));
		System.out.println("(1==1)                ---> "   + (1==1)); 
		System.out.println("str.equals   (\"ABC_EF\") -> " + str.equals("ABC_EF"))   ;
		System.out.println("str.compareTo(\"ABC_EF\") -> " + str.compareTo("ABC_EF")+" (true, ASCII)");	
		System.out.println("str.compareTo(\"A\")    ---> " + str.compareTo("A"  ))   ;	
		System.out.println("str.compareTo(\"Abc_ef\") -> " + str.compareTo("Abc_ef"));
		System.out.println("str.compareToIgnoreCase(\"Abc_ef\") --> " + str.compareToIgnoreCase("Abc_ef"));
	}
}
 