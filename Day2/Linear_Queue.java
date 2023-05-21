package Day2;
import java.util.Scanner;
public class Linear_Queue {
	private int front,rear,Maxsize,queue[];
	void createQueue(int size)
	{
		Maxsize=size;
		front=0;
		rear=-1;
		queue = new int[size];
	}
	void Enqueue(int a)
	{
		rear++;
		queue[rear]=a;
	}
	boolean isFull()
	{
		if(rear==Maxsize-1)
			return true;
		return false;
	}
	int Dequeue() {
		int temp = queue[front];
		front++;
		return temp;
	}
	boolean isEmpty()
	{
		if(front>rear)
			return true;
		else
			return false;
	}
	void printQueue()
	{
		for(int i=front;i<=rear;i++ ) 
		{
			System.out.println(queue[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		int ch,e,size;
		Linear_Queue obj = new Linear_Queue();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of Queue : ");
		size=in.nextInt();
		obj.createQueue(size);
		do {
		
			System.out.println("\nMenu for Queue\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n");
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
					System.out.println("Queue is Full");
				}
				break;
				
			case 2:
				if(obj.isEmpty()!=true){
					System.out.println("Element Dequeue : "+obj.Dequeue());
				}
				else {
					System.out.println("Queue is Empty");
				}
				break;
			case 3:
				if(obj.isEmpty()!=true) {
					System.out.println("Queue has : ");
					obj.printQueue();
				}
				else {
					System.out.println("Queue is Empty");
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
