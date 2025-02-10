//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

//add imports as needed

import java.util.ArrayList;

public class LastRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> ray = new ArrayList<Integer>();
		ray.add(9);
		ray.add(10);
		ray.add(-8);
		ray.add(10000);
		ray.add(-5000);
		ray.add(1000);

		System.out.println(ListLast.go(ray));

	}
}
