import java.util.Iterator;
import java.util.TreeSet;

public class collpro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		//conversion from object to integer is implicit
		//it stores  integer object 
		ts.add((34));
		ts.add((78));
		ts.add((31));
		ts.add((61));
		Iterator i=ts.iterator();
		while(i.hasNext())
		{
			Object o1=i.next();
			Integer i1=(Integer)o1;
			System.out.println(i1);
		}
	}



	}


