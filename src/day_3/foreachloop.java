package day_3;

public class foreachloop {
	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40, 50, 60};
		// for integer array
		System.out.println(a);
		for(int x : a)
		{
			System.out.println(x);
		}
		
		System.out.println();
		
		char ch[] = {'j', 'k', 'l', 'm'};
		System.out.println(ch);
		
		for(char c : ch)
		{
			System.out.print(c);
		}
		
		System.out.println();
		
		String s1[] = {" Java", " Programming", " Learning"};
		System.out.println(s1);
		for(String s : s1)
		{
			System.out.print(s);
		}
		
	
	}

}
