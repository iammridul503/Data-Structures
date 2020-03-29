/*
@author:"Mridul Mishra"
Title:"Queue Implementation using Linked List"
**folows FIFO(First In First Out)/LILO(Last In Last Out)
*/
import java.io.*;
class Queue2
{
    QNode front, rear; 
    static class QNode //declaring a queue structure as a linked list
    { 
        int key; 
        QNode next; 
        public QNode(int key) 
        { 
            this.key = key; 
            this.next = null; 
        } 
    } 
	

	Queue2() 
	{ 
		front = rear = null; 
	} 

	 
	void enqueue(int key) // Method to add an key to the queue.
	{  
		QNode newNode = new QNode(key); 
        if (rear == null) 
        { 
			front = rear = newNode; 
			return; 
		} 

		rear.next = newNode; 
		rear = newNode;
		System.out.println(key+" entered the queue");
	} 
    void dequeue() // Method to remove an key from queue.
	{ 
        if (front == null)
        {
            System.out.println("Queue is Empty");
        } 
		QNode temp = front; 
		front = front.next;  
		if (front == null) 
		{
            rear = null;
        } 
        System.out.println("First Element exited the Queue");
    } 
    public static void main(String[] args) throws IOException
	{ 
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        Queue2 ob = new Queue2();
        System.out.println("Enter the values in the Queue, terminate by -1");
        int n;
		do
        {
            n=Integer.parseInt(in.readLine());
            ob.enqueue(n);
        }while(n!=-1);
        ob.dequeue();
		System.out.println("Queue Front : " + ob.front.key); 
		System.out.println("Queue Rear : " + ob.rear.key); 
		ob.dequeue(); 
		ob.dequeue(); 
		ob.dequeue(); 
		System.out.println("Queue Front : " + ob.front.key); 
		System.out.println("Queue Rear : " + ob.rear.key); 
	} 
} 


