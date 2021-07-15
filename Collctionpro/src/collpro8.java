import java.util.Iterator;
import java.util.TreeSet;

public class collpro8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(34);
		ts.add("divya");
		ts.add(3.1);
		ts.add('a');
		//to retrive elements one by one
		Iterator i=ts.iterator();
		while(i.hasNext())
		{
			Object o1=i.next();
			
			System.out.println(o1);
		}
	}


	}


