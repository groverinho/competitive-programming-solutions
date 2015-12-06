package NacionalACM2013;
import java.util.Scanner;
class CuantosGrafos 
{
	int dimension;
	boolean [] vectorConexionesFila;
	boolean [] vectorConexionesColumna;
	boolean [][] matrizAdyacencias;
	public void buscarAdyacencias(char fc, int posicion)
	{
		if ((fc == 'f')&&(!vectorConexionesFila[posicion]))
		{
			this.vectorConexionesFila[posicion]=true;
			for (int i = 0; i<this.dimension; i++)
			if(matrizAdyacencias[posicion][i])
			{
				buscarAdyacencias('f',i);
				buscarAdyacencias('c',i);
			}
			
		}
		if ((fc == 'c')&&(!vectorConexionesColumna[posicion]))
		{
			this.vectorConexionesColumna[posicion]=true;
			for (int j = 0; j<this.dimension; j++)
			if(matrizAdyacencias[j][posicion])
			{
				buscarAdyacencias('f',j);
				buscarAdyacencias('c',j);
			}
		}
	}
		public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int tamanio = 10000;
		int[] primos = new int[tamanio];
		for (int i=4; i<tamanio; i=i+2)
			primos[i]=1;
		int p = 3;
		//Se coloca 3 por que el subindice que necesitamos en 
		while (p<tamanio/p)
		{
			if (primos[p]==0)
			{
				for(int j=p*p;j<tamanio;j=j+p+p)
					primos[j]=1;
			}
			p=p+2;
		}
		do
		{
			int cantidad1 = entrada.nextInt();
			int cantidad2 = entrada.nextInt();
			CuantosGrafos variables = new CuantosGrafos();
			if (cantidad1 == 0 && cantidad2 == 0)
				break;
			int dimension=cantidad2-cantidad1+1;
			variables.dimension = dimension;
			variables.vectorConexionesFila = new boolean[dimension];
			variables.vectorConexionesColumna = new boolean[dimension];
			variables.matrizAdyacencias = new boolean[dimension][dimension];
			
			for (int i = 0; i<dimension; i++)
				for (int j = i+1; j<dimension; j++)
				{
					int comparador = i+cantidad1+j+cantidad1; 
					if(primos[comparador]==0)
						variables.matrizAdyacencias[i][j]=true;					
				}
			int contador = 0;
			for (int h=0; h<dimension; h++)
			{
				if(!variables.vectorConexionesFila[h])
				{
					variables.buscarAdyacencias('f', h);
					contador++;
				}				
			}
			System.out.println(contador);
		}while(true);	
	}
}

