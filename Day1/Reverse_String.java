import java.util.Scanner;

public class Reverse_String {
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
		Reverse_String obj = new Reverse_String();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = in.next();
		String rev;
		obj.createStack(str.length());	//create stack 
		
		for(int i=0;i<str.length();i++) {
			char e = str.charAt(i);
			if(str.isEmpty()!=true) {
				obj.push(e);
			}
		}
		
		System.out.print("Reverse String : ");
		/*
		for(int i=0;i<str.length();i++) 
		{
			char e = str.charAt(i);
			if(obj.isEmpty()!=true) {
				System.out.print(obj.pop()); 
			}
		}
		*/
		 while(obj.isEmpty()!=true) {
			 System.out.print(obj.pop());
		 }
		 
	}
}


