package day_2;

public class nested_if_pro {
	public static void main(String[] args) {
		
		int a=10,b=20,c=30;
		if(a>b)
		{
			if(a>c)
				System.out.println("A is greater than B and C");
			else
				System.out.println("A is smaller than C");
		}
		else
			System.out.println("A is smaller than B and C");
		
		
		
	}

}
