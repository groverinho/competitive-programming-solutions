import java.util.Scanner;


public class gold {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int ttl = in.nextInt();
	        int c = 0;
	        while(c<ttl) {
	            c ++;
	            long w = in.nextLong();
	            long a = in.nextLong();
	            long b = in.nextLong();
	            
	            long g = Math.min(a,b);

	            long minmi = cal(g,0);

	            long days = w - minmi;
	            System.out.println(days);
	        }
	}


    public static long cal(long g, long i){
        if ((Math.pow(2,i)) == g)
            return i;

        if (Math.pow(2,i)<g)
            return (cal(g, i+1));

        if (Math.pow(2,i) > g)
        {
            long temp = g - (long)Math.pow(2,i-1);
            return cal( temp, 0) ;
        }
        return 0;
    }



}
