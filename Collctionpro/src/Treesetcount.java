import java.util.Iterator;
import java.util.TreeSet;

public class Treesetcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(new Integer(34));
		ts.add(new Integer(78));
		ts.add(new Integer(31));
		ts.add(new Integer(61));
		System.out.println(ts);
		Iterator i=ts.iterator();int count=0;
		while(i.hasNext())
		{
			Object o1=i.next();
			Integer i1=(Integer)o1;
			
			
			count++;
		}
			System.out.println(count);	
		

		
	}

}
