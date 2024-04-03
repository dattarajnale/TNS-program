package day_4;

import java.util.Scanner;

public class Person_Demo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.println("Enter Person Name :- ");
		name = sc.next();
		System.out.println("Enter Age :- ");
		int age = sc.nextInt();
		System.out.println("Enter Income :- ");
		int income = sc.nextInt();
		System.out.println("Enter Gender :- ");
		String gender = sc.next();
		
		//Person object and initialization values using setter
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		System.out.println(person);
		System.out.println();
		
		tax_calculation tx = new tax_calculation();
		tx.calculateTax(person);
		System.out.println("After calculating Tax :- ");
		System.out.println(person);
		
		sc.close();
		
	}

}
