package day_6;

public class Access_Specifiers {
	
	//declare default, private , public, protected variables
	
	int varDefault = 10;
	public int varPublic = 20;
	protected int varProtected = 30;
	private int varPrivate = 40;
	
	//declare default, private , public, protected variables
	
	void methodDefault() {
		System.out.println(" default access base class");;
		System.out.println("Default Variable = " + varDefault);
	}
	
	public void methodPublic() {
		System.out.println(" Public access base class");;
		System.out.println("Public Variable = " + varPublic);
	}
	
	private void methodPrivate() {
		System.out.println(" Private access base class");;
		System.out.println("Private Variable = " + varPrivate);
	}
	
	protected void methodProtected() {
		System.out.println(" Protected access base class");;
		System.out.println("Protected Variable = " + varProtected);
	}
}
