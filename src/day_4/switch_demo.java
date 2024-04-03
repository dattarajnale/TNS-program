package day_4;

public class switch_demo {
	public static void main(String[] args) {
		
		char x = 'c';
		
		switch(x)
		{
		case 'a' :
		case 'A' :
			System.out.println(x + " for Apple"); break;
		
		case 'b' :
		case 'B' :
			System.out.println(x + " for Ball"); break;
			
		case 'c' :
		case 'C' :
			System.out.println(x + " for Cat"); break;
			
		case 'd' :
		case 'D' :
			System.out.println(x + " for Dog"); break;
			
		default : System.out.println(" Enter valid character from A to D"); 
	
		}
		
	}

}
