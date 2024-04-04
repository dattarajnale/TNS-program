package day_4;

public class tax_calculation {
	
	public void calculateTax(Person person)
	{
		if(person.getAge()>65 || person.getGender().equalsIgnoreCase("female"))
		{
			person.setTax(0);
			System.out.println("Tax Not Applicable !!!");
		}
		
		else
		{
			if(person.getIncome() <= 160000)
			{
				person.setTax(0);
			}
			else if(person.getIncome() > 160000 && person.getIncome() <= 500000)
			{
				person.setTax((person.getIncome() - 160000) * 5/100);
			}
			else if(person.getIncome() > 500000 && person.getIncome() <= 800000)
			{
				person.setTax((person.getIncome() - 500000) * 10/100 + 340000);
			}
			else
			{
				person.setTax((person.getIncome() - 800000) * 20/100 + 94000);
			}
		}
		
	}

}
