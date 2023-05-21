
package Day2;
import java.util.Scanner;
public class Circular_Queue 
{
	private int front,rear,Maxsize,queue[],count=0;
	void createQueue(int size)
	{
		Maxsize=size;
		front=0;
		rear=-1;
		queue = new int[size];
	}
	void Enqueue(int a)
	{
		count++;
		rear=(rear+1)%Maxsize;
		queue[rear]=a;
	}
	boolean isFull()
	{
		if(count==Maxsize)
			return true;
		return false;
	}
	int Dequeue() {
		int temp = queue[front];
		count--;
		front=(front+1)%Maxsize;
		return temp;
	}
	boolean isEmpty()
	{
		if(count==0)
			return true;
		else
			return false;
	}
	void printQueue()
	{
		int i=front;
		int c=0;
		while(c<count)
		{
			System.out.println(queue[i]);
			i=(i+1)%Maxsize;
			c++;
		}
	}
	
	public static void main(String[] args) 
	{
		int ch,e,size;
		Circular_Queue obj = new Circular_Queue();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of Circular Queue : ");
		size=in.nextInt();
		obj.createQueue(size);
		do {
		
			System.out.println("\nMenu for Circular Queue\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n");
			ch=in.nextInt();
			
			switch (ch) {
			case 1:
				if(obj.isFull()!=true) {
					System.out.println("Enter Element : ");
					e=in.nextInt();
					obj.Enqueue(e);
				}
				else
				{
					System.out.println("Circular Queue is Full");
				}
				break;
				
			case 2:
				if(obj.isEmpty()!=true){
					System.out.println("Element Dequeue : "+obj.Dequeue());
				}
				else {
					System.out.println("Circular Queue is Empty");
				}
				break;
			case 3:
				if(obj.isEmpty()!=true) {
					System.out.println("Circular Queue has : ");
					obj.printQueue();
				}
				else {
					System.out.println("Circular Queue is Empty");
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
