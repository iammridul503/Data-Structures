/*
@author:"Mridul Mishra"
Title:"Stack Implementation using array"
**folows LIFO(Last In First Out)/FILO(First In Last Out)
*/
import java.io.*;
public class Stack1
{
        
    static final int max = 1000; //maximum value in the stack, lets say 1000
    int top;
    int arr[]= new int[max];

    boolean isEmpty()
    {
        return (top<0);
    }
    Stack1()
    {
        top=-1;
    }

    boolean push(int x) //function to push element at the end  
    {
        if(top>=(max-1))
        {
            System.out.println("Stack OverFlow");
            return false;
        }
        else
        {
            arr[++top]= x;
            System.out.println(x +" pushed");
            return true;
        }
    }
    int pop() //function to remove last element from the stack 
    {
        if(top<0)
        {
            System.out.println("Stack UnderFlow");
            return 0;
        }
        else
        {
            int x= arr[top--];
            return x;
        }
    }
    int peek() //function to return the last element of the stack
    {
        if(top<0)
        {
            System.out.println("Stack underFlow");
            return 0;
        }
        else
        {
            int x=arr[top];
            return x;
        }
    }                   
}
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        Stack1 ob= new Stack1();
        int n;
        System.out.println("Enter the values in the stack, terminate by -1");
        do
        {
            n=Integer.parseInt(in.readLine());
            ob.push(n);
        }while(n!=-1);
        ob.pop();// to pop out the -1 entered into the stack
        System.out.println(ob.pop() + " popped from stack");
    }
}