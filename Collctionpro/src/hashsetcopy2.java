import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class hashsetcopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs=new HashSet();
		
		hs.add(new Integer(34));
		hs.add(new Integer(78));
		hs.add(new Integer(31));
		hs.add(new Integer(61));
		System.out.println(hs);
		
		TreeSet ts=new TreeSet(hs);
		Iterator i=ts.iterator();
		while(i.hasNext())
		{
		Object o1=i.next();
		Integer rv1=(Integer)o1;
		System.out.println(rv1);
		
	}
	}

}
