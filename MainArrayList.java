package assignmentapril14;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arrayList.add(scanner.nextInt());
		}
		ArrayList<Integer> arrayList2=UserMainCode_ArrayList.getName(arrayList);
		Iterator<Integer> iterator1=arrayList2.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		
		

	}

}
