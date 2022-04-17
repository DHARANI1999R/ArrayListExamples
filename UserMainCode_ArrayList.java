package assignmentapril14;

import java.util.ArrayList;
import java.util.Iterator;

public class UserMainCode_ArrayList 
{
	public static ArrayList<Integer> getName(ArrayList<Integer> arrayList)
	{
		ArrayList<Integer> arrayList1=new ArrayList<Integer>();
		Iterator<Integer> iterator=arrayList.iterator();
		while(iterator.hasNext())
		{
			arrayList1.add(iterator.next());
			arrayList1.add(iterator.next());
			iterator.next();
			
		}
		return arrayList1;
	}

}
