import java.util.LinkedHashSet;
import java.util.Iterator;

public class linkhashdiff {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LinkedHashSet hs=new LinkedHashSet();
		hs.add(34);
		hs.add("divya");
		hs.add(3.1);
		hs.add('a');
		//to retrive elements one by one
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			Object o1=i.next();
			
			System.out.println(o1);
		}
	
	}

}
