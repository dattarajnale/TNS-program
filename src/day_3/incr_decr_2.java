package day_3;

public class incr_decr_2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//int x = 30;
		System.out.println("a and b values before operations : " + a + " " + b);
		
		// increment ++
		// decrement --
		
		++a;
		int c = (++a) + (--a) - (a) + (--a) + a++;
		System.out.println("C value after the operation is = " + c);
		
		int d = c++ + a + b--;
		System.out.println("d value after the operation = " + d);
		
	}

}
