package assignmentapril14;

import java.util.ArrayList;

public class UserMainCode_MaxAdmissions 
{
	public static Integer getYear(ArrayList<Integer>inpList)
	{
		int i,maxyear=0,maxcount=0;
		for(i=0;i<inpList.size();i++)
		{
			int num=inpList.get(i);
			if(maxcount<num)
				maxcount=num;
			
		}
		maxyear=inpList.get((inpList.indexOf(maxcount))-1);
		return maxyear;
		
	}

}
