import java.util.Scanner;


public class leonardoDePisa {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n,k,ind,max;
	n=in.nextInt();
	k=in.nextInt();
	max=0;
	ind=0;
	int v[]=new int[k];
	for (int i = 0; i < v.length; i++) {
		v[i]=in.nextInt();
		if (v[i]>max) {
			max=v[i];
			ind=i;
		}
	}
	boolean flag=true;
			if (max>n) 
				flag=false;
		//if ((ind-1)>=0||(ind+1)<v.length)
			if (ind==0)
			{
				if (v[ind]!=v[ind+1]+1 && v[ind]!=v[ind+1]+2) {
					flag=false;
				}
			}
			else if(ind==k-1)
			{
				if (v[ind]!=v[ind-1]+1 && v[ind]!=v[ind-1]+2) {
					flag=false;
				}
			}
			else if (((v[ind-1]==max-1)&&v[ind+1]==max-2)||((v[ind-1]==max-2)&&v[ind+1]==max-1)) {
				for (int i = ind; i < v.length-1; i++) 
				{
					int uno =v[i+1]+1; 
					int dos=v[i+1]+2;
					
					if (v[i]!=uno&&v[i]!=dos) {
						flag=false;
						break;
					}
				}
				if (flag) {
					for (int i = 0; i < ind-1; i++) {
						if (v[i]!=(v[i+1]-1)&&(v[i]!=v[i+1]-2)) {
							flag=false;
							break;
						}
					}
				
				}
			}
			
			else 
				flag=false;
		
	
		if (flag==false) 
			System.out.println("N");
		else 
			System.out.println("S");
	}
}