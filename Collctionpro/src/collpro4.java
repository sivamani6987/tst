import java.util.ArrayList;
public class collpro4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList();
a1.add(89);
a1.add(21);
a1.add(65);
a1.add(43);
a1.add(16);
/*Object o1=a1.get();
 * Integer i1=(Integer)o1;
 * System.out.println(i1);
 * 
 */
//for all elements
for(int i=0;i<=a1.size()-1;i++)
{
	Object o1=a1.get(i);
	Integer rv=(Integer)o1;
	System.out.println(rv);
	
}

	}

}
