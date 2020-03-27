/*
@author:"Mridul Mishra"
Title:"Stack Implementation using array"
**folows LIFO(Last In First Out)/FILO(First In Last Out)
*/
import java.io.*;
public class Stack2
{
   SNode root;
   static class SNode//declaring a stack structure as a linked list
   {
      int data;
      SNode next;
      SNode(int dat)
      {
         this.data=dat;
      }
   }

   boolean isEmpty() //checks whether stack is empty or not
   {
      if(root==null)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   void push(int data)//
   {
      SNode newNode = new SNode(data);
      if(root==null)
      {
         root=newNode;
      }
      else
      {
         SNode temp = root;
         root = newNode;
         newNode.next = temp;
      }
      System.out.println(data+ " pushed in the stack");
   }
   int pop()
   {
      int pop=0;
      if(root==null)
      {
         System.out.println("Stack is empty");
      }
      else
      {
         pop=root.data;
         root=root.next;
      }
      return pop;
   }
   public int peek()
   {
      if(root == null)
      {
         System.out.println("Stack is empty");
         return 0;
      }
      else
      {
         return root.data;
      }
   }
    public static void main(String[] args)throws IOException
    {
      BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
      Stack2 ob= new Stack2();
      int n;
      System.out.println("Enter the values in the stack, terminate by -1");
      do
      {
          n=Integer.parseInt(in.readLine());
          ob.push(n);
      }while(n!=-1);
      ob.pop();
      System.out.println(ob.pop() + " popped from stack");
      System.out.println("Top element is " + ob.peek()); 
    }
}