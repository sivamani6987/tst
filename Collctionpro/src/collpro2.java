import java.util.Iterator;
import java.util.TreeSet;

public class collpro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(new Integer(34));
		ts.add(new Integer(78));
		ts.add(new Integer(31));
		ts.add(new Integer(61));
		System.out.println(ts);
		
		//to retrive elements one by one
		Iterator i=ts.iterator();
		while(i.hasNext())
		{
			Object o1=i.next();
			Integer i1=(Integer)o1;
			System.out.println(i1);
		}
	}

}
