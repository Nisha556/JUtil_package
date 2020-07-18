package Condition;
import java.util.*;
public class ArrayListDemo {
	public static void main(String args[])
	{
		ArrayList<String> a1 = new ArrayList <String>();
		System.out.println("Initial size of a1 " +a1.size());
		a1.add("C");
		a1.add("A");
		a1.add("B");
		a1.add("D");
		a1.add("F");
		a1.add(1,"A2"); //add A2 on index 1
		System.out.println("Size of a1 after addition " +a1.size());
		System.out.println("Contents of a1 after addition " +a1);
		// Remove elements from the array list
		a1.remove("F");
		a1.remove(2);
		System.out.println("Size of a1 after removing the item" +a1);
		System.out.println("Size of a1 after deletion" +a1.size());
		System.out.println("contents if array after deletion : " +a1);
		
	}

}
/*  output Initial size of a1 0
Size of a1 after addition 6
Contents of a1 after addition [C, A2, A, B, D, F]
Size of a1 after removing the item[C, A2, B, D]
Size of a1 after deletion4
contents if array after deletion : [C, A2, B, D]*/
