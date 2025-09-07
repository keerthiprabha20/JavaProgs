package stackperson;

public class Stack {
	Person arr[];
	int top; 
	int element;
	
	Stack(int size)
	{
		element=size;
		arr=new Person[element];
		top=-1;
	}
	
   Stack(Person[] inputArr)
   {
	   element= inputArr.length;
	   arr=new Person[element];
	   top=-1;
	   for (int i=0; i<inputArr.length;i++ ) {
		   push (inputArr[i]);
	   }
   }
   
   void push(Person p) {
	   if (top>=element-1){
		   System.out.println("Stack overflow"+p);
		   return;
	   }
	   arr[++top]=p;
   }
   void push(Person p1, Person p2) {
	   push(p1);
	   push(p2);
	   }
   
Person pop()
{
	if(top==-1) {
		System.out.println("stack underflow ");
		return null;
	}
	return arr[top--];
	}
void pop(int n) {
	if(n>top+1) {
		System.out.println("stack empty");
		n=top+1;
	}
	for (int i=0;i< n;i++) {
		Person p=pop();
		if(p!=null) {
			System.out.println("popped: ");
			p.displayPerson();
		}
	}
}

void display()
{
	if(top==-1) {
		System.out.println("Stack is empty");
		return;
	}
	System.out.println("stack from top to  bottom");
	for(int i=top; i>=0; i--)
	{
		arr[i].displayPerson();
	}
}
void display(int n)
{
	if (n>top+1) {
		System.out.println("only"+(top+ 1)+"person in stack");
		n=top+1;
		
	}
	System.out.println("top "+n+" persons");
	for(int i=top; i>top-n;i--) {
		arr[i].displayPerson();
	}
}
}
		
	


