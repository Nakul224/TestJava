import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20.50f);
		Integer a=(Integer)al.get(0);
		Float b=al.get(1);
		System.out.println(a+"...."+b);
		//System.out.println(Float(a+b));

	}

}
