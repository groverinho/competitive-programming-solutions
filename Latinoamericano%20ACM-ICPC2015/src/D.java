import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 21-09-16

public class D {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{		
		int n = in.nextInt();	
		int m = in.nextInt();
		int acu=0;
		int vec[]={1,10,100,1000,10000};
		while (m-->0) {
			int b = in.nextInt();
			int v [] = new int [n];
			int sum =0;
			for (int i = 0; i < v.length; i++) {
				v[i]=in.nextInt();
				if (i!=0) {
					sum+=v[i];
				}
				
			}
			int c=0;
			int max=0;
			if (sum<b) {
				while (sum<=b && c<5) {
					if (sum+vec[c]>b) {
						break;
					}
					else {
						max=vec[c];
						c++;
					}
					
				}
				if (max<v[0]) {
					acu+=max;
				}
				else {
					acu+=max-v[0];
				}
			}
			
		}
		System.out.println(acu);
		}
		
	}

}
