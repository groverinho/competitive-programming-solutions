
public class Problem1 {

	public static void main(String[] args)
	{
		int acu = 0;
		for (int i = 3; i < 1000; i++)
		{
			if (i%3 == 0 || i%5 == 0) 
			{
				acu = acu + i;
			}
		}
		System.out.println(acu);
	}

}
