package employee;

public class Employee
{
	String name;
	int id;
	double salary;
	Employee(String n, int id, long sal)
	{
	name=n;
	this.id=id;
	salary=sal;
	}
	void displayDetails()
	{
	System.out.println("Name: "+ name);
	System.out.println("Employee ID: "+ id);
	System.out.println("Salary: "+ salary);
	}
	void increaseSalary(double percentage)
	{
	salary+=salary*percentage;
	System.out.println(name + "'s salary increased by "+ salary);
	}
	}