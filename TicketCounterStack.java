package stackperson;

import java.util.Scanner;

public class TicketCounterStack {
    public static void main(String[] args) { 
		Scanner sc  =new Scanner(System.in);
		Stack st=null;
		
		System.out.println("Choose initialization:");
		System.out.println("1.Empty stack with size");
		System.out.println("2.Stack initialized with array of Persons");
        int choice=sc.nextInt();
        sc.nextLine();
        
        if(choice==1) {
        	System.out.println("enter size:");
        	int size=sc.nextInt();
        	st=new Stack(size);
        }
        else if(choice==2) {
        	System.out.println("enter number of Persons:");
        	int n=sc.nextInt();
        	sc.nextLine();
        	Person arr[]=new Person[n];
        	for (int i=0;i<n;i++) {
        		arr[i]=readPerson(sc,i+1);
        	}
        	st=new Stack(arr);
        }
int option;
do {
	System.out.println("1.Push one Person");
	System.out.println("2.Push two Person" );
	System.out.println("3.Pop one Person");
	System.out.println("4.Pop multiple person");
	System.out.println("5.Display all persons");
	System.out.println("6.Display top n persons");
	System.out.println("7.Exit");
	System.out.println("enter your choice:");
	option=sc.nextInt();
	
	switch(option) {
	case 1: 
		sc.nextLine();
		Person p1=readPerson(sc,1);
		st.push(p1);
		break;
		
	case 2:
		sc.nextLine();
		Person pp1= readPerson(sc,1);
		Person pp2= readPerson(sc,2);
		st.push(pp1,pp2);
		break;
		
	case 3:
		Person popped=st.pop();
		if (popped!=null) {
			System.out.print("popped: ");
			popped.displayPerson();
		}
		break;
		
	case 4:
		System.out.println("enter number of persons to pop:");
		int n=sc.nextInt();
		st.pop(n);
		break;
		
	case 5:
		st.display();
		break;
		
	case 6:
		System.out.println("enter number of top persons: ");
		int topN =sc.nextInt();
		st.display(topN);
		break;
		
	case 7: 
		System.out.println("exiting");
		break;
		
	default:
		System.out.println("invalid choice");
	}
}	
		while(option !=7); 
}
    public static Person readPerson(Scanner sc , int personNum) {
    	System.out.println("enter details for Person" + personNum +":");
    	System.out.println("Name:");
    	String name= sc.nextLine();
    	
    	System.out.println("Age: ");
    	int age= sc.nextInt();
    	sc.nextLine();
    	
    	System.out.println("Gender (MALE/FEMALE/OTHER):");
    	String genderStr=sc.nextLine().toUpperCase();
    	Gender gen;
    	try { 
    		gen=Gender.valueOf(genderStr);
    	}catch (IllegalArgumentException e) {
    		System.out.println("Invalid gender. Defaulting to OTHER.");
    		gen= Gender.OTHER;  
    	}
  return new Person(name, age, gen);
    }
}