import java.util.Iterator;
import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(34);
		hs.add("divya");
		hs.add(3.1);
		hs.add(true);
		System.out.println(hs);
		//to retrive elements one by one
		Iterator i=hs.iterator();
		/*while(i.hasNext())
		{
			
			Object o=i.next();
			System.out.println(o);
			
			
		}*/
			
			
			
		Object o1=i.next();//next(),it returns the next element in collection and can read the input only till the space it can't read two words
		
		Integer i1=(Integer)o1;
		System.out.println(i1);
		//2nd obj
		Object o2=i.next();
		Double i2=(Double)o2;
		System.out.println(i2);
		//3rd obj
		Object o3=i.next();
		String i3=(String)o3;
		System.out.println(i3);
		//4rth obj
		Object o4=i.next();
		Boolean i4=(Boolean)o4;
		System.out.println(i4);



		
	}
	}


