package assignmentapril14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainArrayMergingAndSorting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer> arrayList1=new ArrayList<Integer>();
		ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		ArrayList<Integer> answer=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
			arrayList1.add(scanner.nextInt());
		for(int j=0;j<5;j++)
			arrayList2.add(scanner.nextInt());
		answer=Main1.answer(arrayList1,arrayList2);
		//System.out.println(answer);
		for(int k=0;k<3;k++)
		System.out.println(answer.get(k));
	}

}
class Main1
{
	public static ArrayList<Integer> answer (ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2)
	{
		arrayList1.addAll(arrayList2);
		Collections.sort(arrayList1);
		ArrayList<Integer> answer=new ArrayList<Integer>();
		answer.add(arrayList1.get(2));
		answer.add(arrayList1.get(6));
		answer.add(arrayList1.get(8));
		return answer;
		
		
	}
}
