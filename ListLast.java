//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
        int i = ray.get(ray.size() -1);

        for(int c = 0; c < ray.size()-1; c++)
        {
            if(ray.get(c) == i)
            {
                return true;
            }
        }
		return false;
	}
}
