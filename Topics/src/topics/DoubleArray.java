package topics;

public class DoubleArray {

	public static void main(String[] args) {
		
	//need to declare number of rows & columns first like below
		
	String flights [][]= new String [3][2];
	// start with firstrow
	flights[0][0]="dallas";
	flights[0][1]="Mon";
// 2nd row
	flights[1][0]="LAX";
	flights[1][1]="Tues";
//3rd row
	flights[2][0]="Atlanta";
	flights[2][1]="Wed";
	
	
System.out.println(flights [1][1]);
//For Row

 for (int rownum=1; rownum<flights.length; rownum++) {  

	 //For Column>>> [0] is to specify the first column>>>tell Jva to look at the column
	 
	 for (int colnum=0; colnum<flights[0].length; colnum++) {
		 System.out.println(flights[rownum][colnum]);
	 }
 }  
	 

	
	
	
	
	
	
	
	
	
	
	
	}

}
