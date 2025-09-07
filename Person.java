package stackperson;

public class Person { 
	String 	name;
	int age;
	Gender gen;
	
	public Person(String name,int age, Gender gen)
	{
     	this.name=name;
     	this.age=age;
     	this.gen=gen;
     	
     }
	void displayPerson()
	{
		System.out.println("Name:" + name + "Age:" + age + "Gender" + gen);
		
	}
}
