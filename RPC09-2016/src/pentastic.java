import java.util.Scanner;

public class pentastic {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int  casos = in.nextInt();
		int contador = 1;
		while (casos-->0)
		{
			int [] v = new int [5];
			int min= Integer.MAX_VALUE;
			int index = 0;
			for (int i = 0; i < v.length; i++) {
				v[i]=in.nextInt();
								
			}
			while (true)
			{
				if (v[0]>=0&&v[1]>=0&&v[2]>=0&&v[3]>=0&&v[4]>=0) break;
		
				int sup =0, inf=0;
				min = Integer.MAX_VALUE;
				for (int i = 0; i < v.length; i++) {
					if (v[i]<min) 
					{
						min =v[i];
						index=i;
					}
					
				}
				if (index==4)
				{
					sup=0;
					inf = 3;
					
				}
				else if(index==0)
				{
					sup= 1;
					inf = 4;
				}
				else
				{
					sup = index+1;
					inf = index-1;
				}
				int aux = v[index];
				v[index] = v[index]*(-1);
				v[sup]= v[sup]+aux;
				v[inf]= v[inf]+aux;
				
//				v[4-(index)]=v[4-(index)]+aux;
//				v[4-(index)]=v[4-(index)]+aux;
//				v[5%(index+1)]=v[5%(index+1)]+aux;
//				v[5%(index-1)]=v[5%(index+1)]+aux;
				
			}
			System.out.println("Pentagon #"+contador+":");
			for (int i = 0; i < 4; i++) {
				System.out.print(v[i]+" ");
			}
			System.out.println(v[4]);
			contador++;
		}

	}

}
