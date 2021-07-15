import java.util.TreeSet;
import java.util.Iterator;
public class pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet ts=new TreeSet();
ts.add(new Integer(34));
ts.add(new Integer(78));
ts.add(new Integer(31));
ts.add(new Integer(61));
System.out.println(ts);
Iterator i=ts.iterator();//helper method upcasted to interface
//1st element or object
Object o1=i.next();//next(),it returns the next element in collection and can read the input only till the space it can't read two words
Integer i1=(Integer)o1;
System.out.println(i1);
//2nd obj
Object o2=i.next();
Integer i2=(Integer)o2;
System.out.println(i2);
//3rd obj
Object o3=i.next();
Integer i3=(Integer)o3;
System.out.println(i3);
//4rth obj
Object o4=i.next();
Integer i4=(Integer)o4;
System.out.println(i4);



	}

}
