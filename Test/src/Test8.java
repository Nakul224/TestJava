import java.util.*;
class Test8
{  
	public static void main(String[] args) 
	{	HashMap hs=new HashMap();
		hs.put(65,"hello");
		hs.put(29,"tree");
		hs.put(135,"hello");
		hs.put(12,"tree");
		System.out.println(hs);
		TreeMap lm=new TreeMap();
		lm.putAll(hs);
		System.out.println(lm);


	}
}
