public class EmployeeTest {
	public static void main(String[] args)
	{
		Employee employee = new Employee("John", "Doe", 4500.0);
		System.out.println("Employee" +" "+ employee.getFirstName() +" " + employee.getLastName() +": "+ employee.getMonthlySalary());
		employee.giveRaise();
		Employee employee1 = new Employee("Jane", "Doe", 5100.0);
		System.out.println("Employee" +" "+ employee1.getFirstName() +" " + employee1.getLastName() +": "+ employee1.getMonthlySalary());
		employee1.giveRaise();
		System.out.println("");
		System.out.println("Employee's salary after 10% increase:");
		System.out.println("Employee" +" "+ employee.getFirstName() +" " + employee.getLastName() +": "+ employee.getMonthlySalary());
		System.out.println("Employee" +" "+ employee1.getFirstName() +" " + employee1.getLastName() +": "+ employee1.getMonthlySalary());
	}
}
