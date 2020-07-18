package Condition;
import java.util.ArrayList;
import java.util.Iterator;
public class ListDemo {
	public static void main(String args[])
	{
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList list2 = new ArrayList();
		//Student s1 = new Student();
		//s1.roll = 101;
		//s1.name= "Mike";
		list1.add("john"); //0
		list1.add("jemmy"); //1
		list1.add("john"); //2
		list1.add("jim"); //3
		list1.add("jack"); //4
		
		list2.add("john");
		list2.add(2);
		list2.add(2.2);
		
		System.out.println("list1 = " +list1);
		System.out.println("list2 = " +list2);
		//get the element from the list
		Object o = list2.get(2);
		System.out.println("o is ; " +o);
		//update element in list
		list1.set(2,"Fionna");
		System.out.println("list1 now is : " +list1);
		//remove the element
		list1.remove(2);
		System.out.println("list1 after delete is : " +list1);
		//append
		//list1.append(5);
		if(list1.contains("john")) {
			System.out.println("John is in the list");
			//Iterate in ArrayList
			System.out.println("Iterate the list");
			
			for(String str :list1)
			{
				System.out.println(str);
				
			}
			System.out.println("********");
			
			
		}
		System.out.println("*****Iterating with Iterator");
		Iterator <String> itr = list1.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		System.out.println("**********");
		
		while(itr.hasNext())
		{
			String str= itr.next();
			System.out.println(str);
			if(str.equals("jack")) {
				itr.remove();
			}
			
		}
		System.out.println("**********");
		System.out.println("list after remove the element " +list1);
		
	}

}
