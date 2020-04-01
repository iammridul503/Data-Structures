/*
@author:"Mridul Mishra"
Title:"Stack Implementation using Java collections"
**folows LIFO(Last In First Out)/FILO(First In Last Out)
*/
import java.util.*;  
public class Stack3
{  
    public static void main(String args[])
    {  
        Stack<String> stack = new Stack<String>();//declaring a stack  

        stack.push("Data");  
        stack.push("Structures");  
        stack.push("and");  
        stack.push("Algorithms");  
        stack.push("in");
        stack.push("Java"); 
        System.out.println(stack);
    
        Iterator<String> itr=stack.iterator();  
        while(itr.hasNext())
        {  
        System.out.print(itr.next()+" ");  
        } 
        
        System.out.println(); 

        stack.pop();   
        stack.pop();
        System.out.println(stack);

    }  
}  