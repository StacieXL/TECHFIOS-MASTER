package topics;

public class A_dataType {

	public static void main(String[] args) {

    // numbers
		byte byteVar = 127; // MAX: 127, MIN: -128
		System.out.println("byteVar: " + byteVar);
		
		short shortVar = -32768; // MAX: 32767, MIN: -32768
		System.out.println("shortVar: " + shortVar);
		
		int intVar = 2147483647; // MAX: 2147483647, MIN: -2147483648
		System.out.println("intVar: " + intVar);
		
		long longVar = 217657657657648L; // MAX: 2^63, MIN: 2^-63
		System.out.println("longVar: " + longVar);
		// for long denote the number by putting an "L" at the end
		
		float floatVar = 0.1234564845643213213213210F; 
		System.out.println("floatVar: " + floatVar);
		// for long denote the number by putting an "F" at the end
		// 7 decimal places
		
		double doubleVar = 0.1234564845643213213213210d; 
		System.out.println("doubleVar: " + doubleVar);
		// for long denote the number by putting an "D" at the end
		//more precise 15 decimal places
		
		//---------------------------------------------------------------------------
		
		
		char charVar = 'a';
		System.out.println("charVar: " + charVar);
		
		boolean booleanVar = false; // true and false in small cap
		System.out.println("booleanVar: " + booleanVar);
		
		//========================= NON Primitive (Reference Data Type)
		
		String stringVar ="hj hgj ytdytd";
		System.out.println("stringVar: " + stringVar);
	}
}
