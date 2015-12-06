import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class bookd2 {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
	    	long  s =Long.parseLong(in.readLine());
	    	while (s!=0)
	    	{
		        double n=(-1+Math.sqrt(1+(8*(s+1))))/(2);
		        int ans=  (int) Math.ceil(n);
		        long  aux=   (long) (0.5*ans*(ans+1));
		        aux=aux-s;
		        System.out.println(aux+" "+ans);
		        s = Integer.parseInt(in.readLine());
	    	}
	    }
}
/*
 1
2
3
4
5
6
9000
499977
49999775
 */