//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

//add imports as needed

public class ListOddToEvenRunner
{
	public static void main( String args[] )
	{
        ArrayList<Integer> ray = new ArrayList<>();
        ray.add(7);
        ray.add(1);
        ray.add(5);
        ray.add(3);
        ray.add(11);
        ray.add(5);
        ray.add(6);
        ray.add(7);
        ray.add(8);
        ray.add(9);
        ray.add(10);
        ray.add(12345);
        ray.add(11);

        System.out.println(ListOddToEven.goList(ray));
	}
}
