//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;

public class ListOddToEven
{
	public static int go( ArrayList<Integer> ray )
	{
        int odd = -1;
        int even = -1;

        for (int i = 0; i < ray.size(); i++)
        {
            if (ray.get(i) % 2 == 1)
            {
                odd = i;
                break;
            }
        }

        if (odd == -1)
        {
            return -1;
        }

        for (int i = odd + 1; i < ray.size(); i++)
        {
            if (ray.get(i) % 2 == 0)
            {
                even = i;
                break;
            }
        }

        if (even == -1)
        {
            return -1;
        }

        return even - odd;
    }
}
