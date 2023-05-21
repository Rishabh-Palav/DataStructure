package Day1_Assignment;

import java.util.Scanner;

public class InflixToPrefix {
    
	private int tos,Maxsize;
	private char Stack[];
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
	
	//printstack
	
	void printstack() {
		for(int i = tos;i>=0;i--) {
			System.out.println(Stack[i]);
		}
	}
	
	//peek to get element at tos
	
	char peek()
	{
		return Stack[tos];
	}
	
	int priority(char c) {
		if(c=='/' || c=='*' || c=='%')
			return 2;
		else if(c=='+' || c=='-')
			return 1;
		return 0;
	}
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			InfixToPostfix obj = new InfixToPostfix();
			System.out.print("Enter Inflix Expression : ");
			String infix = in.next(); 	//Input
			String prefix="" ;	//Result
            obj.createStack(infix.length());
			for(int i=infix.length()-1;i>=0;i--) 
			{
				if(obj.priority(infix.charAt(i))==0 && infix.charAt(i)!='(' && infix.charAt(i)!=')')
				{
					prefix=prefix+infix.charAt(i);
				}
				else if(obj.isEmpty()==true || infix.charAt(i)==')') 
				{
					obj.push(infix.charAt(i));
				}
				else if(infix.charAt(i)=='(')
				{
					while(obj.peek()!=')') 
					{
						prefix+=obj.pop();
					}
					obj.pop();
				}
				else if(obj.priority(infix.charAt(i))>obj.priority(obj.peek())) 
				{
					obj.push(infix.charAt(i)); 
				}
				else
				{
					while(obj.isEmpty()!=true) 
					{
						prefix+=obj.pop();
					}
					obj.push(infix.charAt(i));
				}
			}
			while(obj.isEmpty()!=true)
			prefix=prefix+obj.pop();
            //System.out.println(prefix);
            for(int i=prefix.length()-1;i>=0;i--)
            {
                System.out.print(prefix.charAt(i));//(a+b)*(c-b)/(e*f/g) 
            }
		}
	}
}
