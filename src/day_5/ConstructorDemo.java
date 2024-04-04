package day_5;

import java.util.Scanner;

public class ConstructorDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, city;
		int id;
		System.out.println("Enter Customer ID :- ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name :- ");
		name = sc.nextLine();
		System.out.println("Enter Customer City :- ");
		city = sc.nextLine();
		
		System.out.println();
		
		
		/*Constructors c1 = new Constructors();  //default constructor invoked
		c1.setCust_id(id);
		c1.setCust_name(name);
		c1.setCust_city(city);
		System.out.println(c1);
		
		System.out.println(c1.getCust_id());
		System.out.println(c1.getCust_name());
		System.out.println(c1.getCust_city()); */
		
		//Parameterized constructor
		Constructors c2 = new Constructors(name, id, city);
		System.out.println(c2);
		
		
	}

}
