package Condition;
import java.util.*;
public class LinkedListDemo {
public static void main(String args[])
{
	LinkedList<String> l1= new LinkedList<String>();
	l1.add("F");
	l1.add("B");
	l1.add("D");
	l1.add("E");
	l1.add("C");
	l1.addLast("Z");
	l1.addFirst("A");
	l1.add(1,"A2");
System.out.println("Original contents of the linkedList : " +l1);
l1.remove("F");
l1.remove(2);
System.out.println("COntents after  removing the elements : " +l1);
l1.removeFirst();
l1.removeLast();
System.out.println("ll after deleting first and last: " +l1);
String val = l1.get(2);
l1.set(2, val + "Changed");
	
}
}
