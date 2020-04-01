/*
@author:"Mridul Mishra"
Title:"Queue Implementation using Linked List "
**folows FIFO(First In First Out)/LILO(Last In Last Out)
*/
import java.io.*;
import java.util.*;
class Queue3
{
    public static void main(String[] args) throws  IOException
    {
        Queue<String> queue= new LinkedList<String>();
        queue.add("Data");
        queue.add("Structures");
        queue.add("And");
        queue.add("Algorithms");
        queue.add("in");
        queue.add("Java");
        System.out.println(queue);
        String head = queue.peek(); 
        System.out.println("head of queue-" + head);
        int size = queue.size(); 
        System.out.println("Size of queue-" + size);   

        System.out.println("Removed Element:"+queue.remove());
        System.out.println("Removed Element:"+queue.remove());
        System.out.println(queue);

        head = queue.peek(); 
        System.out.println("head of queue-" + head); 
        size = queue.size(); 
        System.out.println("Size of queue-" + size);          
    }
}