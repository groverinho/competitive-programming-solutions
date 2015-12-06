
import java.util.Scanner;

public class SoldierAndBadges {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(),aux;
		  
		  int vector[]= new int[1000000];
		  long ans=0;
		  for(int i=0;i<n;i++)
		  {
		    aux = in.nextInt();
		    if(vector[aux]==0) 
		      vector[aux]=1;
		    else 
		    {
		      for(int j=aux+1;j<1000000;j++) 
		      {
		        if(vector[j]==0) 
		        {
		          vector[j]=1;
		          ans+=(j-aux);
		          break;
		        }
		      }
		    }
		  }
		System.out.println(ans);
		

	}

}
