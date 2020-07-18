package Condition;
import java.util.*;


public class TreeSetDemo1 {
public static void main(String args[])
{
	TreeSet<String> s = new TreeSet<String>();
	s.add("J");
	s.add("A");
	s.add("V");
	s.add("A");
	System.out.println("Output : " +s);
	System.out.println(s.subSet ("J","V"));
}
}
//Output : [A, J, V]
//[J]
