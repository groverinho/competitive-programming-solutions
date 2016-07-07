import java.util.Scanner;

public class j {
	static int n=0;
	static int matriz[][]= new int[n][n];
	static char c;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 StringBuilder cad = new StringBuilder();
		  while(in.hasNextInt())
		  {
			  n= in.nextInt();
			  int b=in.nextInt();
			  c= in.next().charAt(0);
			  int rondas[]= new int[b];
			  String votosRonda[]= new String[b];
		    for(int i = 0; i < b; i++)
		    {
		    	rondas[i]=in.nextInt();
		    	votosRonda[i]= in.next();
		    }
		     matriz= new int[n][n];
		     rellena(n, matriz);
		    for(int i = 'a'; i < 'a' + n;i++)
		    {
		      for(int j = i + 1; j < 'a' + n;j++)
		      {
		        int marca1 = 0,marca2 = 0;
		        for(int k = 0; k < b; k++)
		        {
		        	String aux = votosRonda[k];
		    		char[] cha = aux.toCharArray();
		    		int m1 =busqueda(cha, (char)i);
		    		int m2 =busqueda(cha, (char)j);
		          if(m1 < m2) 
		        	  marca1 += rondas[k];
		          else       
		        	  marca2 += rondas[k];
		        }
		        
		        if(marca1 == marca2 )
		        {
		          if((char)i == c)
		            matriz[i - 'a'][j - 'a'] = 1;
		          if((char)j == c)
		            matriz[j - 'a'][i - 'a'] = 1;
		        }
		        else if(marca1 > marca2)
		          matriz[i - 'a'][j - 'a'] = 1;
		        else
		          matriz[j - 'a'][i - 'a'] = 1;
		      }
		    }
		    algFloyd(n, matriz);
		    int cont = 0;
		    for(int i = 0; i < n;i++)
		    {
		      if(i != c-'a' &&  matriz[c-'a'][i] != 999999999 )
		    	  cont++;
		    }
		    System.out.println((cont >= n-1)?"Y":"N");
		  }
		  
	
	}
	 public static void rellena(int n , int matriz[][])
	 {
		 for(int i = 0; i < n; i++)
		 {
		        for(int j = 0; j < n; j++)
		        matriz[i][j] =  999999999;
		 }
	 }

	 public static int busqueda(char[]cha,char buscar)
	 {
		 int cont=0;
	 	for (int i = 0; i < cha.length; i++) 
		{	
			if (cha[i]==buscar)
				break;
			cont++;
		}
		 return cont;
	 }
	public static void algFloyd(int n , int G[][]) 
	{
		for(int k = 0; k < n; k++)
		      for(int i = 0; i < n; i++)
		        for(int j = 0; j < n; j++)
		          G[i][j] = Math.min(G[i][j],G[i][k] + G[k][j]);
	
	}
}
