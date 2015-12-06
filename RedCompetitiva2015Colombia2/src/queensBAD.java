
import java.util.Scanner;

public class queensBAD {
	
	public static boolean matriz [][] = new boolean [8][8];
	
	public static boolean recorrer()
	{
			for (int j2 = 0; j2 < matriz.length; j2++) 
			{
				for (int k = 0; k < matriz[1].length; k++) 
				{
					if(matriz[j2][k])
					{
						if(verificar(j2, k))
							return false;
					}
				}
			}
			return true;
	}
	
	public static boolean verificar(int i,int j)
	{
		boolean aux = false;
		int auxi = i;
		int auxj = j;
		//derecha
		j++;
		while(j<8)
		{
			if(matriz[i][j])
				return true;
			j++;
		}
		j=auxj;
		j--;
		//izquierda
		while(j>-1)
		{			
			if(matriz[i][j])
				return true;
			j--;
		}
		j=auxj;
		//abajo
		i++;
		while(i<8)
		{			
			if(matriz[i][j])
				return true;
			i++;
		}
		i=auxi;
		//arriba
		i--;
		while(i>-1)
		{
			if(matriz[i][j])
				return true;
			i--;
		}
		i=auxi;
		//Diagonal arriba derecha
		i--;j++;
		while(i>-1 && j<8)
		{
			if(matriz[i][j])
				return true;
			i--;j++;
		}
		i=auxi;
		j = auxj;
		i--;j--;
		//diagonal arriba izquierda
		while(i>-1 && j>-1)
		{
			if(matriz[i][j])
				return true;
			i--;j--;
		}
		i=auxi;
		j = auxj;
		i++;j++;
		//diagonal abajo derecha
		while(i<8 && j<8)
		{
			if(matriz[i][j])
				return true;
			i++;j++;
		}
		i=auxi;
		j = auxj;
		i++;j--;
		//diagonal abajo izquierda
		while(i<8 && j>-1)
		{
			if(matriz[i][j])
				return true;
			i++;j--;
		}
		i=auxi;
		j = auxj;
		return aux;
	}

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		while (entrada.hasNext()) {
			
		
		String linea="";
		for (int i = 0; i < 8; i++)
		{
			linea = entrada.next();
			for (int j = 0; j < 8; j++) 
			{
				if(linea.charAt(j)=='*')
				matriz[i][j] = true;
			}
		}
		
		/*for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[1].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------");*/
		if(recorrer())
			System.out.println("valid");
		else
			System.out.println("invalid");
		}
	}

}
