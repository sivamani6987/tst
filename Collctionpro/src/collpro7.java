import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class collpro7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(new String("orang"));
		ts.add(new String("pink"));
		ts.add(new String("whit"));
		ts.add(new String("blu"));
		//to retrive elements one by one
		Iterator i=ts.iterator();
		while(i.hasNext())
		{
			Object o1=i.next();
			String s1=(String)o1;
			System.out.println(s1);
		}
	}

	}


