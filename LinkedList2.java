/*@author:"Mridul Mishra"
Title:"Linked list Implementation"*/

import java.util.*; 
public class LinkedList2
{ 
	public static void main(String args[]) 
	{ 
		// Creating object of class linked list 
		LinkedList<Integer> list = new LinkedList<Integer>(); 

		// Adding elements to the linked list 
		list.add(1); 
		list.add(2); 
		list.addLast(3); 
		list.addFirst(4); 
		list.add(2, 5); 
		list.add(6); 
		list.add(7); 
		System.out.println("Linked list : " + list); 

		// Removing elements from the linked list 
		list.remove(5); 
		list.remove(3); 
		list.removeFirst(); 
		list.removeLast(); 
		System.out.println("Linked list after deletion: " + list); 

		// Finding elements in the linked list 
		boolean status = list.contains(1); 

		if(status) 
			System.out.println("List contains the element '1' "); 
		else
			System.out.println("List doesn't contain the element '1'"); 

		// Number of elements in the linked list 
		int size = list.size(); 
		System.out.println("Size of linked list = " + size); 

		// Get and set elements from linked list 
		Object element = list.get(2); 
		System.out.println("Element returned by get() : " + element); 
		list.set(2, 25); 
		System.out.println("Linked list after change : " + list); 
	} 
} 
