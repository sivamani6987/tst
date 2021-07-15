import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashSet;

public class hashstcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		
		hs.add(new Integer(34));
		hs.add(new Integer(78));
		hs.add(new Integer(31));
		hs.add(new Integer(61));
		System.out.println(hs);
		Iterator i=hs.iterator();
		TreeSet ts=new TreeSet();
		while(i.hasNext())
		{
			Object o1=i.next();
			Integer rv1=(Integer)o1;
			ts.add(rv1);
		}
	Iterator i1=ts.iterator();
	while(i1.hasNext())
		{
		Object o2=i1.next();
		Integer rv2=(Integer)o2;
		System.out.println(rv2);
		
	}
			
	
	
	
	}
}
		
