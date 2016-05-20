import java.util.ArrayList;
import java.util.Scanner;

public class soccer {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int equipos = entrada.nextInt();
		int numEquipos = 1;
		while(equipos-->0)
		{
			int juegos = entrada.nextInt();
			int puntos = entrada.nextInt();
			ArrayList<String> resultados = new ArrayList<String>();
			System.out.printf("Team #%d\nGames: %d\nPoints: %d\nPossible records:\n",numEquipos,juegos,puntos);
			int puntosGanados = 0,puntosEmpates=0,juegosGanados=0,juegosEmpates=0;
			for (int i = 0; i <= juegos; i++)
			{
				puntosGanados = 0;puntosEmpates=0;juegosGanados=0;juegosEmpates=0;
				puntosGanados = i*3;
				juegosGanados = i;
				for (int j = 1; j <=puntos-puntosGanados && juegosGanados+juegosEmpates<juegos; j++)
				{
					juegosEmpates++;
					puntosEmpates++;
				}
				if((juegosEmpates+juegosGanados)<=juegos && puntos==(puntosGanados+puntosEmpates))
					resultados.add(juegosGanados+"-"+juegosEmpates+"-"+(juegos-juegosGanados-juegosEmpates));
				
			}
			for (int i = resultados.size()-1; i>=0; i--) {
				System.out.println(resultados.get(i));
			}
			System.out.println();
			numEquipos++;
		}
	}

}
