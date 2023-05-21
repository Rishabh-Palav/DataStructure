package Day1;

import java.util.Scanner;

public class StackExample {

	//private members
	
	private int tos,Maxsize,Stack[];
	void createStack(int size) 
	{
		Maxsize=size;
		tos = -1;
		Stack = new int[size];
	}
	
	//push function
	
	void push(int num) {
		tos++;
		Stack[tos]=num;
	}
	
	//isFull
	
	boolean isFull()
	{
		if(tos==Maxsize-1)
			return true;
		else {
			return false;
		}
	}
	
	//pop remove add return element at tos
	
	int pop() 
	{
		int temp=Stack[tos];
		tos--;
		return temp;
	}
	
	//isEmpty
	
	boolean isEmpty()
	{
		if(tos==-1)
			return true;
		return false;
	}
	
	//printstack
	
	void printstack() {
		for(int i = tos;i>=0;i--) {
			System.out.println(Stack[i]);
		}
	}
	
	//peek to get element at tos
	
	int peek()
	{
		return Stack[tos];
	}
	

	public static void main(String[] args) {
		int ch,e,size;
		StackExample obj = new StackExample();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of stack : ");
		size=in.nextInt();
		obj.createStack(size);
		
		do {
		
			System.out.println("\nMenu for stack\n1.Push\n2.Pop\n3.peek\n4.Print\n0.Exit\n");
			ch=in.nextInt();
			
			switch (ch) {
			case 1:
				if(obj.isFull()!=true) {
					System.out.println("Enter Element : ");
					e=in.nextInt();
					obj.push(e);
				}
				else
				{
					System.out.println("Stack is Full");
				}
				break;
				
			case 2:
				if(obj.isEmpty()!=true){
					System.out.println("Element poped : "+obj.pop());
				}
				else {
					System.out.println("Stack is Empty");
				}
				break;
			case 3:
				if(obj.isEmpty()!=true) {
					System.out.println("Element : "+obj.peek());
				}
				else {
					System.out.println("Stack is Empty");
				}
				break;
			case 4:
				if(obj.isEmpty()!=true) {
					System.out.println("Stack has : ");
					obj.printstack();
				}
				else {
					System.out.println("Stack is Empty");
				}
				break;
			case 0:
				System.out.println("Exiting Code");
				break;
			default://error trapping
				System.out.println("Pleas check options");
				break;
			}
		}while(ch!=0);

	}
}
