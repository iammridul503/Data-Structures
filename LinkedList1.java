/*@author:"Mridul Mishra"
Title:"Linked List Implementation using Class"*/
import java.io.*;
public class LinkedList1
{
    Node root;   //head of the list

    /*Linked List node*/
    static class Node
    {
        int data; //declaring the data part 
        Node next; //this stores the next address
        /*constructor to initialise node*/
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /*method to insert a new node*/
    static LinkedList1 insert(LinkedList1 l,int da)
    {
        Node new_node= new Node(da);//creating a new node with a given data
        new_node.next= null;

        if(l.root==null)//if list is empty, make new node as the root node
        {
            l.root= new_node;
        }
        else
        {
            Node last =l.root;
            while(last.next!=null)//traversing to the last node to add new node at the last
            {
                last=last.next;
            }
            last.next= new_node;
        }
        return l;
    }

    /*method to print the linked list*/
    static void print(LinkedList1 l)
    {
        Node curr=l.root;
        System.out.println("linked list:");
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }


    /*main function*/
    public static void main(String[] args) throws IOException
    { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        LinkedList1 list = new LinkedList1();//starting an empty list
        System.out.println("Enter the elements in the linked list, enter -1 to stop");
        int n=0;
        while(n>=0)
        {
            int dat=Integer.parseInt(in.readLine());
            if (dat!=-1)
            {
                list=insert(list,dat);
            }
            else
            {
                break;
            }
        } 
        print(list);        
    }
}