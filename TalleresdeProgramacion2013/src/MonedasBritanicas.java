import java.util.Scanner;


public class MonedasBritanicas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos>0)
		{	
			int n = in.nextInt();
			int libra = 0;
			int aux = 240;
			while (aux<=n)
			{
				aux= aux+240;
				libra++;
			}
			int pequines = n-(240*libra);
			int chelines = pequines / 12;
			int pequines2 = pequines % 12;
			System.out.println(3);
			System.out.println(libra);
			System.out.println(chelines);
			System.out.println(pequines2);
			casos--;
		}
	}

}
