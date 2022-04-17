package assignmentapril14;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainMaxAdmissions 
{

	public static void main(String[] args)throws Exception 
	{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bufferedReader.readLine());
		ArrayList<Integer>inpList=new ArrayList<Integer>();
		for(int i=0;i<n*2;i++)
		{
			inpList.add(Integer.parseInt(bufferedReader.readLine()));
			
		}
		System.out.println(UserMainCode_MaxAdmissions.getYear(inpList));
		
		
		

	}

}
