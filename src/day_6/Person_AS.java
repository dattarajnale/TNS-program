package day_6;

public class Person_AS {
	
	private String name;
	private String city;
	private int age;
	
	// generate getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// constructor
	
	public Person_AS() {
		super();
	}
	
	public Person_AS(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}
	
}
