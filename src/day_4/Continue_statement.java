package day_4;

public class Continue_statement {
	public static void main(String[] args) {
		
		for(int k = 5; k<=10; k++)
		{
			// skip odd numbers
			
			if(k%2 != 0)
				continue;
			// Print Even numbers
			
			System.out.println(k + " ");
		}
	}

}
