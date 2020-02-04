import java.util.*;
class CollectionViewsofMap
{  	public static void main(String[] args) 
	{	HashMap m=new HashMap();
		m.put("nag",500);
		m.put("chiru",800);
		m.put("bala",300);
		m.put("venki",600);
		System.out.println(m);
		Set s=m.keySet();
		System.out.println(s);
		Collection c=m.values();
		System.out.println(c);
		Set s1=m.entrySet();
		System.out.println(s1);
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{	Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+",,,,"+m1.getValue());
			if(m1.getKey().equals("nag"))
			{
				m1.setValue("30000");
			}
		}
		System.out.println(m);
	}
}
