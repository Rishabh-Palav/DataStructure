import java.util.Scanner;

public class Check_tokenization {
	
	//private member
	private char Stack[];
	private int Maxsize,tos;
	
	void createStack(int size) 
	{
		Maxsize=size;
		tos = -1;
		Stack = new char[size];
	}
	
	//push function
	
	void push(char num) {
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
	
	char pop() 
	{
		char temp=Stack[tos];
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check_tokenization obj = new Check_tokenization();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = in.next();
		obj.createStack(str.length());	//create stack 
		
		for(int i=0;i<str.length();i++) {
			char e = str.charAt(i);
			if(e=='{') {
				obj.push(e);
			}
			else if (e=='}') 
			{
				if (obj.isEmpty()==true) {
					System.out.println("Error : '}' Excepted");
					System.exit(0); // break
				}
				char temp=obj.pop();
			}
		}
		if(obj.isEmpty()!=true)
		{
			System.out.println("Error : '}' Excepted");
		}
		else
		{
			System.out.println("Balance");
		}
	}

}
