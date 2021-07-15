import java.util.ArrayList;

public class arraylistpros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this question is in new notes arraylist with double
		ArrayList a1=new ArrayList();
		a1.add(8.9);
		a1.add(2.1);
		a1.add(6.5);
		a1.add(4.3);
		a1.add(1.6);
		a1.add(1.3);
		a1.add(1.5);
		System.out.println(a1);
		a1.add(2,5.2);
		System.out.println(a1);
		                                             
		a1.set(3,9.8);
		System.out.println(a1);
		a1.get(4);
		a1.set(4, 5.8);
		System.out.println(a1);
		
		System.out.println(a1.size());
	}

}
