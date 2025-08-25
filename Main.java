package employee;

public class Main 
{
	
		public static void main(String[] args)
		{
		Employee e1= new Employee("Keerthi",1,50000);
		Employee e2= new Employee("Chaithra",2,60000);
		System.out.println("Initial Employee Details: ");
		e1.displayDetails();
		e1.increaseSalary(10);
		e2.displayDetails();
		e2.increaseSalary(10);
		System.out.println("Updated Employee Details:");
		e1.displayDetails();
		e2.displayDetails();
		
		}


}
