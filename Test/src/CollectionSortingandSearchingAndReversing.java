import java.util.*;
class CollectionSortingandSearchingAndReversing
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(34);
		al.add(3);
		al.add(444);
		al.add(66);
		al.add(32);
		al.add(4);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al,32));

	}
}
