/*
@author:"Mridul Mishra"
Title:"Queue Implementation using array"
**folows FIFO(First In First Out)/LILO(Last In Last Out)
*/
import java.io.*;
class Queue1 
{
    int front,rear,count;
    final static int capacity=1000; 
    int arr[]=new int[capacity];         // array to store queue elements
    Queue1()
	{
		front = 0;
		rear = -1;
		count = 0;
    }

    public int size()//returns the size of the Queue
	{
		return count;
    }
    public Boolean isEmpty()//checksif the Queue is empty or not
	{
		return (size() == 0);
    }
    public Boolean isFull()//check if the Queue is full or not
	{
		return (size() == capacity);
	}
    
    public void add(int item) //function to add an item to the queue
    {
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Adding " + item);
		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}	
	public void remove() //function to remove front element from the queue
	{
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		System.out.println("Removing " + arr[front]);
		front = (front + 1) % capacity;
		count--;
	}
	public int peek()//function to return front element in the queue
	{
		if (isEmpty()) 
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		return arr[front];
	}

    //Driver Function
	public static void main (String[] args)throws IOException
	{
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        Queue1 ob = new Queue1();
        System.out.println("Enter the values in the Queue, terminate by -1");
        int n;
		do
        {
            n=Integer.parseInt(in.readLine());
            ob.add(n);
        }while(n!=-1);
		
		System.out.println("Front element is: " + ob.peek());
		ob.remove();
		System.out.println("Front element is: " + ob.peek());
		System.out.println("queue size is " + ob.size());

		ob.remove();
		ob.remove();
		
		if (ob.isEmpty())
			System.out.println("Queue Is Empty");
		else
			System.out.println("Queue Is Not Empty");
	}
}