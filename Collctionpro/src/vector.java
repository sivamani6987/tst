import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v1=new Vector();
v1.add("andhra");
v1.add("telangana");
v1.add("m.p.");
v1.add("tamilnadu");
v1.add("karnataka");
for(int i=0;i<=v1.size()-1;i++)
{
	Object o1=v1.get(i);
	String s1=(String)o1;
	System.out.println(s1);
}

	}

}
