public class Employee 
{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	private boolean giveRaise;
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
		this.monthlySalary = monthlySalary;
	}
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
}

	
