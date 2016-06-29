
import java.util.Scanner;


class cheating {


	
	public static void main(String[] args) throws Exception {
		
Scanner in = new Scanner(System.in);
int casos = in.nextInt();
for (int i=0; i<casos; i++) {
	int x, y, d;
	d = in.nextInt();
	x = in.nextInt();
	y = in.nextInt();
	if (x == 0 && y == 0)
        System.out.println("0");
	else if(x*x+y*y<d)
		System.out.println("2");
        else
        {
        	System.out.println(1+(int)(Math.sqrt((x*x+y*y)/1./d)-1e-9));
        }
        	
}

	}
}
/*
5
5 0 0
5 2 3
25 -3 -4
100 0 -100
1 2345 6789

0
2
1
10
7183

*/