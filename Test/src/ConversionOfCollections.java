import java.util.*;
class ConversionOfCollections
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(27);
		al.add("hi");
		al.add('f');
		al.add(27);
		al.add(22.99);
		al.add("hi");
		al.add(null);
		al.add(287);
		System.out.println(al);
		HashSet hs=new HashSet();
		hs.addAll(al);
		System.out.println(hs);


	}
}
