package day_5;

public class Constructors {
	
	private String cust_name;
	private int cust_id;
	private String cust_city;
	
	// default constructor
	
public Constructors()
{
	System.out.println("Default Constructor");
}

	//Parameterized constructor
	public Constructors(String cust_name, int cust_id, String cust_city) {
		super();
		this.cust_name = cust_name;
		this.cust_id = cust_id;
		this.cust_city = cust_city;
	}
	
	// getter setter

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_city() {
		return cust_city;
	}

	public void setCust_city(String cust_city) {
		this.cust_city = cust_city;
	}

	// To string
	@Override
	public String toString() {
		return "Constructors [cust_name=" + cust_name + ", cust_id=" + cust_id + ", cust_city=" + cust_city + "]";
	}
	
	
}
