import java.util.ArrayList;
import java.util.Iterator;
public class collpro6 {
	public static void main(String[]args)
	{
		
	
	ArrayList a1=new ArrayList();
	a1.add(89);
	a1.add("divya");
	a1.add(6.5);
	a1.add('a');
	a1.add(16);
	/*Object o1=a1.get();
	 * Integer i1=(Integer)o1;
	 * System.out.println(i1);
	 * 
	 */
	//for all elements
	
	
		/*Object o1=a1.get(0);
		Integer i1=(Integer)o1;
		System.out.println(i1);
		
		Object o2=a1.get(1);
		String s1=(String)o2;
		System.out.println(s1);
		
		Object o3=a1.get(2);
		Double d1=(Double)o3;
		System.out.println(d1);
		
		Object o4=a1.get(3);
		Character c1=(Character)o4;
		System.out.println(c1);*/
	for(int i=0;i<=a1.size()-1;i++)
	{
	Object o1=a1.get(i);
	System.out.println(o1);
	}
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			
			Object o=i.next();
			
			System.out.println(o);
		}
	}

		
}





