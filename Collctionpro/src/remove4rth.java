import java.util.Iterator;
import java.util.LinkedHashSet;

public class remove4rth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hs=new LinkedHashSet();
		hs.add('s');
		hs.add(2.3);
		hs.add(23);
		hs.add("hydrabad");
		hs.add(true);
		System.out.println(hs);
		
		//to retrive elements one by one
		Iterator i=hs.iterator();
		  
			Object o1=i.next();
			Character i1=(Character)o1;
			System.out.println(i1);
			
			Object o2=i.next();
         	Double i2=(Double)o2;
			System.out.println(i2);
			
			Object o3=i.next();
			Integer i3=(Integer)o3;
			System.out.println(i3);
			
			i.next();
			i.remove();
			
			Object o4=i.next();
			Boolean i4=(Boolean)o4;
			System.out.println(i4);
			
			
			
			
		}
	
	}


	


