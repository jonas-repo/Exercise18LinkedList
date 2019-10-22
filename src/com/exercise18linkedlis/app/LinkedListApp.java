package com.exercise18linkedlis.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Iterator;

public class LinkedListApp {

	public static void main(String[] args) {
		
		//object declaration
		LinkedList<Byte> myList = new LinkedList<Byte>();
		ArrayList<Short> myArrayList = new ArrayList<Short>();
		Stack<Integer> myStack = new Stack<Integer>();
		PriorityQueue<Double> myQueue = new PriorityQueue<Double>();
		HashMap<Integer,String> myDictionary = new HashMap<Integer, String>();
		
		
		//Process
		myList.add((byte)5);
		myList.add((byte)10);
		myList.add((byte)20);
		myList.add((byte)30);
		myList.add((byte)40);
		myList.add((byte)50);
		myList.add((byte)60);
		System.out.println(myList.toString());
		System.out.println("Get: " +myList.get(1));
		System.out.println("Remove: "+myList.remove());
		System.out.println("Remove: "+myList.remove());
		System.out.println("Set to 3 to pos: "+myList.set(0,(byte) 3));
		
		System.out.println(myList.toString());  
		System.out.println("Is empty: "+ myList.isEmpty());
		System.out.println("Size: "+ myList.size());
		System.out.println("Contains 2: "+myList.contains((byte)2));
		
		System.out.println(myList.toString());
		
		Iterator myIterator = myList.iterator(); 
		
		while(myIterator.hasNext()) //iterate with the elements of the list
		{
			System.out.println("While has next: "+myIterator.next());
		}
		
		for(Byte myNumber : myList) //iterate for each variable in the list
		{
			System.out.println("Foreach: "+myNumber);
		}
		
		myArrayList.add((short)5);
		myArrayList.add((short)10);
		myArrayList.add((short)20);
		myArrayList.add((short)30);
		myArrayList.add((short)40);
		myArrayList.add((short)50);
		
		System.out.println("Array list:"+myArrayList.toString());
		System.out.println("Array list get pos 1: "+myArrayList.get(1));
		System.out.println("Array list remove pos 2: "+myArrayList.remove(2));
		
		myIterator = myArrayList.iterator();
		while(myIterator.hasNext())
		{
			System.out.println("Has next array list: "+myIterator.next());
		}
		for(Short number : myArrayList)
		{
			System.out.println("Array list for each: "+number);
		}
		
	
		

	}

}
