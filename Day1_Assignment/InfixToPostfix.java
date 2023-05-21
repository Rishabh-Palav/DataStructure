package Day1_Assignment;

import java.util.Scanner;
/*
 * Rules for the conversion from infix to postfix expression

Print the operand as they arrive.
If the stack is empty or contains a left parenthesis on top, push the incoming operator on to the stack.
If the incoming symbol is '(', push it on to the stack.
If the incoming symbol is ')', pop the stack and print the operators until the left parenthesis is found.
If the incoming symbol has higher precedence than the top of the stack, push it on the stack.
If the incoming symbol has lower precedence than the top of the stack, pop and print the top of the stack. Then test the incoming operator against the new top of the stack.
If the incoming operator has the same precedence with the top of the stack then use the associativity rules. If the associativity is from left to right then pop and print the top of the stack then push the incoming operator. If the associativity is from right to left then push the incoming operator.
At the end of the expression, pop and print all the operators of the stack.
 */
public class InfixToPostfix {

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
			obj.createStack(10);
			System.out.print("Enter Inflix Expression : ");
			String infix = in.next(); 	//Input
			String postfix="" ;	//Result
			for(int i=0;i<infix.length();i++) 
			{
				if(obj.priority(infix.charAt(i))==0 && infix.charAt(i)!='(' && infix.charAt(i)!=')')
				{
					postfix=postfix+infix.charAt(i);
				}
				else if(obj.isEmpty()==true || infix.charAt(i)=='(') 
				{
					obj.push(infix.charAt(i));
				}
				else if(infix.charAt(i)==')')
				{
					while(obj.peek()!='(') 
					{
						postfix+=obj.pop();
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
						postfix+=obj.pop();
					}
					obj.push(infix.charAt(i));
				}
			}
			while(obj.isEmpty()!=true)
			postfix=postfix+obj.pop();
			System.out.println(postfix);
		}
	}
}
