package topics.ConstructorDemo;
public class Other {
	int id;
	String name;
	static String school = "TechFios";
	int ssn;
	int lic;
	
	
	public Other(int input1, String input2) {
		this()
		id   = input1;
		name = input2; 
	};
		
	
	
	void display () {
		System.out.println(id +"   "+ name + "     "+school);
	}

	public Other (int input1, int input3) {
	
		lic=input1;
		ssn=input3;
	}

	public void personalinfo() {
		System.out.println(lic + " "+ssn);
	}
}
