import java.util.ArrayList;

public class arraylidiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList hs=new ArrayList();
		hs.add(34);
		hs.add("divya");
		hs.add(3.1);
		hs.add('a');
		
		Object o1=hs.get(0);
		Integer i1=(Integer)o1;
		System.out.println(i1);
		
		Object o2=hs.get(1);
		String i2=(String)o2;
		System.out.println(i2);
		
		Object o3=hs.get(2);
		Double i3=(Double)o3;
		System.out.println(i3);
		
		Object o4=hs.get(3);
		Character i4=(Character)o4;
		System.out.println(i4);
		
	}

}
