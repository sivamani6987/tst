import java.util.ArrayList;

public class collpro5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(8.9);
		a1.add(2.1);
		a1.add(6.5);
		a1.add(4.3);
		a1.add(1.6);
		/*Object o1=a1.get();
		 * Integer i1=(Integer)o1;
		 * System.out.println(i1);
		 * 
		 */
		//for all elements
		for(int i=0;i<=a1.size()-1;i++)
		{
			Object o1=a1.get(i);
			Double rv=(Double)o1;
			System.out.println(rv);
			
		}

			}

		

	}


