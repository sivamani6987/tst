import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueuediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq=new PriorityQueue();
		pq.add(23);
		pq.add(2.3);
		pq.add('o');
		System.out.println(pq);
		Iterator i1=pq.iterator();
		Object o1=i1.next();
		Integer i=(Integer)o1;
		System.out.println(i);
		
		Object o2=i1.next();
		Double i2=(Double)o2;
		System.out.println(i2);
		 
		Object o3=i1.next();
		Character i3=(Character)o3;
		System.out.println(i3);
		
		
	}

}
