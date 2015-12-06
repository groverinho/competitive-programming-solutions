import java.util.Scanner;


public class hora {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
		int n = in.nextInt();
		int hora =0, minuto = 0;
		while (n>=3600)
		{
			n = n-3600;
			hora++;
		}
		while(n>=60)
		{
			n = n-60;
			minuto++;
		}	
		String hour = hora+"", minute = minuto+"", second = n+"";
		if (hour.length()==1) hour = "0"+hour;
		if (minute.length()==1) minute = "0"+minute;
		if (second.length()==1) second = "0"+second;
		System.out.println(hour+":"+minute+":"+second);	
		}
	}
}
