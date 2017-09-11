public class EmployeeTest {
	public static void main(String[] args)
	{
		Employee employee = new Employee("John", "Doe", 2.0);
		employee.giveRaise();
		Employee employee1 = new Employee("Jane", "Doe", 2.0);
		employee1.giveRaise();
	}
}
