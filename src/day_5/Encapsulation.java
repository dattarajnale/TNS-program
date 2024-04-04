package day_5;

public class Encapsulation {
	
	private int serial_num;
	private String Name;
	private int age;
	public int getSerial_num() {
		return serial_num;
	}
	public void setSerial_num(int serial_num) {
		this.serial_num = serial_num;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// Object class method - to return string representation of the object
	@Override
	public String toString() {
		return "Encapsulation [serial_num=" + serial_num + ", Name=" + Name + ", age=" + age + "]";
	}
	
	

}
