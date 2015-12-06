import java.util.*;

public class queue545 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>();
        for (int i=0;i<n;i++) 
        	a.add(in.nextInt());
        Collections.sort(a);
        int sum=0,res=0;
        for (int i=0;i<n;i++) 
        	if (a.get(i)>=sum) 
        	{
	            res++;
	            sum+=a.get(i);
        	}
        System.out.println(res);
    }
}
