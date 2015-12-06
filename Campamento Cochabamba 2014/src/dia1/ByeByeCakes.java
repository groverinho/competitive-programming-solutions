package dia1;

import java.util.Scanner;
/*
 Input:
a b c d aabbccdd
2 3 4 5 1 1 1 1
3 6 9 0 1 2 3 4
-1 -1 -1 -1 -1 -1 -1 -1
Output:
3 2 1 0
0 0 0 12
 */
public class ByeByeCakes {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		int a, b, c, d, aa, bb, cc, dd, at, bt, ct, dt, mx;
		a=in.nextInt();b=in.nextInt();c=in.nextInt();d=in.nextInt();
		aa=in.nextInt();bb=in.nextInt();cc=in.nextInt();dd=in.nextInt();
		do
		{
			at = (a + aa - 1) / aa;
			bt = (b + bb - 1) / bb;
			ct = (c + cc - 1) / cc;
			dt = (d + dd - 1) / dd;
			mx = at;
			mx = mx>bt? mx:bt;
			mx = mx>ct? mx:ct;
			mx = mx>dt? mx:dt;
			System.out.printf("%d %d %d %d\n", aa*mx-a, bb*mx-b, cc*mx-c, dd*mx-d);
			a=in.nextInt();b=in.nextInt();c=in.nextInt();d=in.nextInt();
			aa=in.nextInt();bb=in.nextInt();cc=in.nextInt();dd=in.nextInt();

		}while(a!=-1 &b!=-1 &c!=-1 &d!=-1 &aa!=-1 &bb!=-1 &cc!=-1 &dd!=-1 );
	}

}
