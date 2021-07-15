import java.util.LinkedList;

public class linkedlistdiffrnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList li=new LinkedList();
		li.add(23);
		li.add(2.3);
		li.add('s');
		li.add(true);
			Object o1=li.get(0);
			Integer i1=(Integer)o1;
			System.out.println(i1);
			
			Object o2=li.get(1);
			Double i2=(Double)o2;
			System.out.println(i2);
			
			Object o3=li.get(2);
			Character i3=(Character)o3;
			System.out.println(i3);
			
			Object o4=li.get(3);
			Boolean i4=(Boolean)o4;
			System.out.println(i4);
			
			
		}
		
		
	}


