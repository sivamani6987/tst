import java.util.LinkedHashSet;
import java.util.Iterator;

public class linkdhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("hydrabad");
		hs.add("vijayawada");
		hs.add("simla");
		hs.add("darjling");
		//to retrive elements one by one
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			Object o1=i.next();
			System.out.println(o1);
		}
	
	}

}
