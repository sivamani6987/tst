import java.util.Vector;
import java.util.Iterator;
public class vectordiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		v1.add(23);
		v1.add(2.3);
		v1.add(true);
		Iterator i=v1.iterator();
		
		Object o1=i.next();
		Integer i1=(Integer)o1;
		System.out.println(i1);
		
		Object o2=i.next();
		Double i2=(Double)o2;
		System.out.println(i2);
		
		Object o3=i.next();
		Boolean i3=(Boolean)o3;
		System.out.println(i3);
		

	}

}
