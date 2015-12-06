package day1;

import java.util.Arrays;
import java.util.Scanner;

public class SaladBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	int paleta = in.nextInt();
	int[] vector = new int[paleta];
	int[] aux = new int[paleta];
	 int numConsul = in.nextInt();
	char sabor = in.next().charAt(0);
	if (sabor == 't')
	{
        vector[0]=2;
        aux[0]=2;
    }
    else
    {
    	vector[0]=1;
    	   aux[0]=1;
    }
	for (int i = 1; i < paleta; i++) 
	{
		sabor = in.next().charAt(0);
		if (sabor == 't')
		{
	        vector[i]= vector[i]+ vector[i-1]+ 2;
	        aux[i]=2;
	    }
	    else
	    {
	    	vector[i]= vector[i]+ vector[i-1]+ 1;
	    	aux[i]=1;
	    }
	 
	}
	  while(numConsul>0)
	    {
	        int consulta;
	         consulta= in.nextInt();
	        if(consulta>paleta)
	        {
	         System.out.println("NIE");
	        }
	        else
	        {
	        chau:	for (int i = 0; i < paleta; i++)
				{
					if (consulta==2 && aux[i]==2)
					{
						System.out.println("hola2 "+(i +1)+" "+ (i+1));
						break ;
					}
					else if(consulta==1 && aux[i]==1)
					{
						System.out.println("hola1 "+(i +1)+" "+ (i+1));
						break ;
					}
					
					int suma = vector[i];
					if(suma==consulta)
					{
	                   System.out.println("holamismo "+(i +1)+" "+ (i+1));
	                    break;
					}
					
					for (int j = i+1; j < paleta; j++)
					{
						 
						if(suma+vector[j]<=consulta)
						{
							suma +=vector[j];
							if(suma==consulta)
	                        {
								 System.out.println((i +1)+" "+ (j+1));
								break chau;
							}
						}
						else
							break chau;
					}
					
				}			
	        	}
	        numConsul--;
	    }
	}

}
