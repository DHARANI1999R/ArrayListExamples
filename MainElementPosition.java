package assignmentapril14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainElementPosition {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String a[]=new String[n];
		for (int i=0;i<n;i++)
		{
			a[i]=scanner.next();
		}
		String b=scanner.next();
		getvalues(a,b);
	}
	public static void getvalues(String[] a,String b)
	{
		ArrayList<String>arrayList=new ArrayList<String>();
		for(int i=0;i<a.length;i++)
		{
			arrayList.add(a[i]);
		}
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		for(int i=0;i<arrayList.size();i++)
		{
			if(b.equals(arrayList.get(i)))
			{
				System.out.println(i+1);
			}
		}
		
	}

}
