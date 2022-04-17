package assignmentapril14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.nextLine();
		List<String> list=new ArrayList<String>();
		
		StringTokenizer stringTokenizer=new StringTokenizer(s1," ");
		while(stringTokenizer.hasMoreTokens())
		{
			String s2=stringTokenizer.nextToken();
			list.add(s2);
			
		}
		String s3=list.get(0);
		String s4=list.get(list.size()-1);
		if(s3.equals(s4))
		{
			int n=s3.length();
			System.out.println(n);
		}
		else
		{
			int n1=s3.length();
			int n2=s4.length();
			System.out.println(n1+n2);
		}
		

	}

}
