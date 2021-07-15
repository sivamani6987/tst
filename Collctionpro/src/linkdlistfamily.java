import java.util.Iterator;
import java.util.LinkedList;



public class linkdlistfamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a1=new LinkedList();
		a1.add("lakshmi");
		a1.add("sravani");
		a1.add("siva");
		a1.add("divya");
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			Object o1=i.next();
			String i1=(String)o1;
			System.out.println(i1);
		}
	}

}
