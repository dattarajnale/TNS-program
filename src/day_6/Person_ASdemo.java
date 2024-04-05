package day_6;

import java.util.Scanner;

public class Person_ASdemo {
	
	public static void main(String[] args) {
		
		Person_AS p = new Person_AS(); //Default constructor invoked
		Scanner sc = new Scanner(System.in);
		String name, city;
		int age;
		System.out.println("Enter person details : Name, City, Age");
		name = sc.nextLine();
		city = sc.nextLine();
		age = sc.nextInt();
		
		p.setName(name);
		p.setCity(city);
		p.setAge(age);
		
		System.out.println("Person details are : " + "\tName = " + p.getName() + "\tCity = " + p.getCity() + "\tAge = " + p.getAge());
		
		
		System.out.println("Enter person details : Name, City, Age");
		name = sc.nextLine();
		city = sc.nextLine();
		sc.nextLine();
		age = sc.nextInt();
		
		Person_AS p1 = new Person_AS(name, city, age); //Parameterized constructor invoked
		
		System.out.println("Person details are : " + "\tName = " + p1.getName() + "\tCity = " + p1.getCity() + "\tAge = " + p1.getAge());
		
		sc.close();
	}

}
