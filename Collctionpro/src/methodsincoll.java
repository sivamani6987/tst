import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;

public class methodsincoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(89);
		a1.add(21);
		a1.add(65);
		a1.add(43);
		a1.add(16);
		a1.add(13);
		a1.add(15);
	System.out.println(a1);
		a1.add(1,2);//at one index position we are adding 2 o/p:89,2,21,65,43,16,13,15
		a1.remove(3);//index 3 is removd
		System.out.println(a1.contains(65));//true or false
		a1.set(2,3);//o/p:[89,21,3,43,16,13,15]at index 2 the num 65 is removd and it adds 3
		System.out.println(a1.isEmpty());//false because it contains elements
		a1.addAll(1,a1);//all elements will b added from index position
       // a1.clear();//it will clears th arraylist 
System.out.println(a1);

		
		
		
	}

}
