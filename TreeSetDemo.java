package Condition;
import java.util.*;
public class TreeSetDemo {
public static void main(String args[])
{
	TreeSet<String> t = new TreeSet<String>();
	t.add("N");
	t.add("I");
	t.add("S");
	t.add("H");
	t.add("A");
	System.out.println("TreeSet output : " +t);
}
}
//ouput TreeSet output : [A, H, I, N, S] based on sorting