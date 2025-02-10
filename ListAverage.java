//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListAverage
{
	public static double go( List<Integer> ray)
	{
        int inital = ray.get(0);

        for(int i = 1; i < ray.size(); i++)
        {
            if(ray.get(i) < inital)
            {
                inital = ray.get(i);
            }
        }

        int smallestInt = inital;

        int inital2 = ray.get(0);

        for(int i = 1; i < ray.size(); i++)
        {
            if(ray.get(i) > inital2)
            {
                inital2 = ray.get(i);
            }
        }

        int LargestInt = inital2;


        return((LargestInt + smallestInt) / 2);
	}
}
