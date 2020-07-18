package Condition;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
public static void main(String args[])
{
	HashSet<String> set = new HashSet<String>();
	//here data is  not added as index approach.
	set.add("john");
	set.add("jenny")
;
	set.add("jim");
	set.add("john");
	set.add("John");
	
	set.add("Jack");
	System.out.println("Set is : " +set);
	Iterator <String> itr = set.iterator();
	while(itr.hasNext())
	{String str = itr.next();
	System.out.println(str);
	}
	
	}
}
//Set is : [John, john, jenny, Jack, jim] output is unordered. data is unique