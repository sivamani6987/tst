import java.util.ArrayList;
import java.util.ListIterator;

public class arraylistbidirction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add("lakshmi");
		a1.add("sravani");
		a1.add("siva");
		a1.add("divya");
		ListIterator i1=a1.listIterator();
		while(i1.hasNext())
		{
			Object o1=i1.next();
			String s1=(String)o1;
			System.out.println(s1);
		}
		while(i1.hasPrevious())
		{
			Object o1=i1.previous();
			String s1=(String)o1;
			System.out.println(s1);
		}
	}

}
