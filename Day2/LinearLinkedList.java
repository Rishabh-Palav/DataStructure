package Day2;
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
public class LinearLinkedList {
	private Node root;
	
	void createList() 
	{
		root=null;
	}
	
	void insertLeft(int data)
	{
		Node t = new Node(data);
		if()
	}
	void deletLeft()
	{
		
	}
	void deteleRight()
	{
		
	}
	void print()
	{
		Node t =root;
		while(t.next!=null)
		{
			System.out.println(t.data);
		}
	}
}
