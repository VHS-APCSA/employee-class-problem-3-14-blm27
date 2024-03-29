public class Employee 
{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	public Employee()
	{
		this.firstName = "";
		this.lastName = "";
		this.monthlySalary = 0.0;
	}
	public Employee(String firstName, String lastName, double monthlySalary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setMonthlySalary(double monthlySalary)
	{
		if (monthlySalary >= 0.0)
		{
			this.monthlySalary = monthlySalary;
		}
		else 
		{
			System.out.println("Cannot have a negative salary!");
		}
	}
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	public void giveRaise()
	{
		monthlySalary = monthlySalary * 1.1;
	}
}

	
