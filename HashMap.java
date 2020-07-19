package Condition;
import java.util.*;
public class HashMap {
public static void main(String args[])
{
	HashMap<String , Integer> map = new HashMap();
	print(map);
	map.put("abc",10);
	map.put("bcd", 20);
	map.put("xyz", 30);
	System.out.println("Size of map is " +map.size());
	print(map);
	if(map.containKey("abc")) {
		Integer a = map.get("abc");
		System.out.println("value for key \"abc\" is : " +a);
		
	}
	map.clear();
	print(map);
	
	
	
	
}
public static void print("Map(Map<String , Integer">map)
{
	if(map.isEmpty())
	{
		System.out.println("msp is empty");
		
	}
	else {
		System.out.println(map);
		
	}
}

}