import java.util.Scanner;


public class Problem2 {

	public static long fiboIterativo(long n)
	{
		if(n <= 2){
			if(n==0)
				return 1;
			else
		return n;
		}
		int res = 0;
		int act = 1;
		int ant = 0;
		int i = 0;
		while( i < n )//n-1
		{
		int temp;
		res = act + ant;
		temp = act;
		act = res;
		ant = temp;
		i++;
		}
		return res;
	}

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		//int n = in.nextInt();
		System.out.println(fiboIterativo(3999999));

	}

}
