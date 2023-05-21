package Day2;

import java.util.Scanner;

// 	Node

class Node
{
	public int data;
	public Node next;
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
}

//	LinkedList

public class LinearLinkedList 
{
	private Node root;
	
	
	//create list
	void createList() 
	{
		root=null;
	}
	
	// insert left
	void insertLeft(int data)
	{
		Node t = new Node(data);
		if(root==null)
		{
			root=t;
		}
		else
		{
			t.next = root;
			root=t;
		}
	}
	
	// delete left
	int deletLeft()
	{
		Node t = root;
		root=root.next;
		return t.data;
	}
	
	//insert right 
	void insertRight(int e)
	{ 
		Node n = new Node(e);
		Node t=root;
		if(root==null)
			root=n;
		else
		{
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=n;
		}
		
	}
	
	// delete right 
	int deleteRight()
	{
		Node t = root;
		Node t1= root;
		if(t.next==null)
		{
			int e=t.data;
			root=null;
			return e;
		}
		else
		{
			while(t.next!=null)
			{
				t1=t;
				t=t.next;
			}
			int e=t.data;
			t1.next=null;
			return e;
		}
	}
	
	void print()
	{
		Node t =root;
		if(root==null)
			System.out.println("List is Empty!");
		else 
		{
			System.out.print("Elements in List :");
			while(t!=null)
			{
				System.out.print(" "+t.data);
				t=t.next;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		LinearLinkedList list = new LinearLinkedList();
		list.createList();
		int ch;
		do {
			System.out.println();
			System.out.println("Menu : ");
			System.out.println("1.Insert Left");
			System.out.println("2.Delete Left");
			System.out.println("3.Insert Right");
			System.out.println("4.Delete Right");
			System.out.println("5.Print");
			System.out.print("Enter the Choice : ");
			ch=sc.nextInt();
			System.out.println();
			
			switch (ch) {
			//insert left
			case 1:
				System.out.print("Enter data : ");
				int e = sc.nextInt();
				list.insertLeft(e);
				break;
				
				
			//delete left
			case 2:
				if(list.root==null)
				{
					System.out.println("Cann't Delete! List is Empty!");
				}
				else
				System.out.println("Data Deleted : "+list.deletLeft());
				break;
				
				
			//insert right
			case 3:
				System.out.print("Enter data : ");
				e = sc.nextInt();
				list.insertRight(e);
				break;

				
			//delete right
			case 4:
				if(list.root==null)
				{
					System.out.println("Cann't Delete! List is Empty!");
				}
				else
				System.out.println("Data Deleted : "+list.deleteRight());
				break;
				
				
			//Print
			case 5:
				list.print();
				break;
				
			//Exit
			case 0:
					System.out.print("Thank You For Using MyList\nExiting MyList!");
					System.exit(0);
					break;

			default:
				System.out.println("Please Check Valid Choice!");
				break;
			}
		}while(ch!=0);
		sc.close();
	}
}
