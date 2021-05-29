
import java.util.*;

public class StackOperations {
	private int stack[],top,max=100;
	
	StackOperations(){
		top=-1;
		stack=new int[max];
	}
	
	void push(int data) {
		if(top>=max)
			System.out.println("Stack Overflow");
		else
			stack[++top]=data;
	}
	
	boolean checkEmpty() {		
		if(top==-1)
			return true;
		else
			return false;
	}
	
	int pop() {
		if(checkEmpty())
			return -1;	
		else
			return stack[top--];
	}
	
	
	void Count(StackOperations s2) {
		if(this.top==s2.top && s2.top>-1)
			System.out.println("The number of elements "+(s2.top+1));
	}
	
	void display() {
		if(checkEmpty()) 
			System.out.println("Stack Underflow");
		for(int i=0;i<=top;i++)
			System.out.print(stack[i]);
	}
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		StackOperations s1=new StackOperations();
		StackOperations s2=new StackOperations();
		int ch,temp;
		do {
			System.out.println("1. Push Element in stack 1 ");
			System.out.println("2. Pop Element in stack 1 ");
			System.out.println("3. Push Element in stack 2 ");
			System.out.println("4. Pop Element in stack 2 ");
			System.out.println("Enter your choice? ");
			ch=sc.nextInt();
			s1.Count(s2);
			switch(ch){
			case 1:
				System.out.println("Enter the data you want to add to stack 1");
				s1.push(sc.nextInt());
				break;
			
			case 2:
				temp=s1.pop();
				if(temp==-1) 
					System.out.println("Stack Underflow!!");
				else	
					System.out.println("Element popped");
				s1.display();
				break;
			
			case 3:
				System.out.println("Enter the data you want to add to stack 2");
				s2.push(sc.nextInt());
				break;
				
			case 4:
				temp=s2.pop();
				if(temp==-1) 
					System.out.println("Stack Underflow!!");
				else	
					System.out.println("Element popped");
				s2.display();
				break;
				
			}
			System.out.println("\n\nEnter 1 to continue");
			ch=sc.nextInt();
		}while(ch==1);
	}
}
