package day_6;

public class access_executor {
	public static void main(String[] args) {
		
		//accessing same package class
		Access_Specifiers obj = new Access_Specifiers();
		obj.methodDefault();
		obj.methodPublic();
		obj.methodProtected();
		//obj.methodPrivate();  //Compile Time error
		
		obj.varDefault=11;
		obj.methodDefault();
		
		//obj.varPrivate = 21; // cannot access private variables and members
		//obj.methodPrivate(); // compile time error
		
		obj.varProtected = 31;
		obj.methodProtected();
		
		obj.varPublic = 41;
		obj.methodPublic();
		
		//instance of operator
		System.out.println(obj instanceof Access_Specifiers); //returns true or false
		
	}

}
