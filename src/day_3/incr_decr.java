package day_3;

public class incr_decr {
	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		//int c = (a++) + (a) + (++a) + (++b) - (++b) + (a++) - (++a) + (b++) - (a) + (b) + (++b) + (++a);
		//System.out.println(c);
		System.out.println((a++) + (a) + (++a) + (++b) - (++b) + (a++) - (++a) + (b++) - (a) + (b) + (++b) + (++a));
		
		a = 0;
		b = 1;
		System.out.println((a--) + (a) + (--a) + (--b) - (--b) + (a--) - (--a) + (b--) - (a) + (b) + (--b) + (--a));
	}
}
