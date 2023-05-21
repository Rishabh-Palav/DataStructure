package Day1_Assignment;

import java.util.Scanner;

public class Double_Stack {

	//private members
	
	private int tos1,tos2,Maxsize,Stack[];
	void createStack(int size) 
	{
		Maxsize=size;
		tos1 = -1;
		tos2 = Maxsize;
		Stack = new int[size];
	}
	
	//push1 function
	
	void push1(int num) {
		tos1++;
		Stack[tos1]=num;
	}
	void push2(int num) {
		tos2--;
		Stack[tos2]=num;
	}
	
	//isFull
	
	boolean isFull()
	{
		if(tos1==tos2-1)
			return true;
		else {
			return false;
		}
	}
	
	//pop1 remove add return element at tos1
	
	int pop1() 
	{
		int temp=Stack[tos1];
		tos1--;
		return temp;
	}
	int pop2() 
	{
		int temp=Stack[tos2];
		tos2++;
		return temp;
	}
	
	//isEmpty1
	
	boolean isEmpty1()
	{
		if(tos1==-1)
			return true;
		return false;
	}
	boolean isEmpty2()
	{
		if(tos2==Maxsize)
			return true;
		return false;
	}
	
	//printstack1
	
	void printstack1() {
		for(int i = tos1;i>=0;i--) {
			System.out.println(Stack[i]);
		}
	}
	void printstack2() {
		for(int i = tos2;i<Maxsize;i++) {
			System.out.println(Stack[i]);
		}
	}
	
	//peek1 to get element at tos1
	
	int peek1()
	{
		return Stack[tos1];
	}
	int peek2()
	{
		return Stack[tos2];
	}
	

	public static void main(String[] args) {
		int ch,e,size;
		Double_Stack obj = new Double_Stack();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of stack : ");
		size=in.nextInt();
		obj.createStack(size);
		
		do {
		
			System.out.println("\nMenu for stack\n1.push1\n2.push2\n3.pop1\n4.pop2\n5.peek1\n6.peek2\n7.Print1\n8.Print2\n0.Exit\n");
			ch=in.nextInt();
			
			switch (ch) {
			case 1:
				if(obj.isFull()!=true) {
					System.out.println("Enter Element : ");
					e=in.nextInt();
					obj.push1(e);
				}
				else
				{
					System.out.println("Stack is Full");
				}
				break;
			case 2:
				if(obj.isFull()!=true) {
					System.out.println("Enter Element : ");
					e=in.nextInt();
					obj.push2(e);
				}
				else
				{
					System.out.println("Stack is Full");
				}
				break;
			case 3:
				if(obj.isEmpty1()!=true){
					System.out.println("Element poped : "+obj.pop1());
				}
				else {
					System.out.println("Stack is Empty");
				}
				break;
			case 4:
				if(obj.isEmpty2()!=true){
					System.out.println("Element poped : "+obj.pop2());
				}
				else {
					System.out.println("Stack is Empty");
				}
				break;
			case 5:
				if(obj.isEmpty1()!=true) {
					System.out.println("Element : "+obj.peek1());
				}
				else {
					System.out.println("Stack is Empty");
				}
				break;
			case 6:
				if(obj.isEmpty2()!=true) {
					System.out.println("Element : "+obj.peek2());
				}
				else {
					System.out.println("Stack is Empty");
				}
				break;
			case 7:
				if(obj.isEmpty1()!=true) {
					System.out.println("Stack has : ");
					obj.printstack1();
				}
				else {
					System.out.println("Stack is Empty");
				}
				break;
			case 8:
				if(obj.isEmpty2()!=true) {
					System.out.println("Stack has : ");
					obj.printstack2();
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
