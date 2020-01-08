
public class Foreach {

	public static void main(String[] args) {
		String s[]= {"hi","hello","tree"};
		for(int i=0;i<s.length;i++)
		{
		System.out.println(s[i]);
		}
	
		for(String naveen : s)
		{
			System.out.println(naveen);
		}
	
	
	}

}
