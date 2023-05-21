import java.util.Scanner;

public class DecToBinary {
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
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Decimal Number : ");
		int num = in.nextInt();
		DecToBinary obj = new DecToBinary();
		obj.createStack(16);
		
		while(num>0)
		{
			obj.push(num%2);
			num/=2;
		}
		while(obj.isEmpty()!=true)
		{
			System.out.print(obj.pop());
		}
	}
}
