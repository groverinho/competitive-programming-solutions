import java.util.Scanner;

public class kusac {

	static int calcular(int n,int m)
	{
	    int k,i,j,cnt = 0;
	    if(n==0 || m==0)
	    	return 0;
	    if(n==m)
	    	return 0;
	    if(n%m==0)
	    	return 0;
	    if(n>m)
	    {
	        k=n/m;
	        return calcular(n-m*k,m);
	    }
	    if(m>n)
	    {
	        k=m*n;
	        cnt=0;
	        for(i=0;i<=k;i+=n)
	        {
	           if(i%m!=0 && i!=0)
	           {
	             cnt++;
	           }
	        }
	        return cnt;
	    }
		return cnt;
	}
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int m = entrada.nextInt();
		System.out.println(calcular(n,m));
	}

}
