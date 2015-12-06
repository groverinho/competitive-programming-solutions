import java.util.*;

public class bounty {
	static ArrayList<Integer> conexiones[] = new ArrayList[1001];
	static int pred[] = new int[1001];
	static int cantidadConexion;
	static boolean visitado[] = new boolean[1001];
	static 	int planetas;
	static boolean bfs	(int n)
	{
		if (n == -1) 
			return true;
		for (int i : conexiones[n]) 
		{
			if (visitado[i]) 
				continue;
			visitado[i] = true;
			if (bfs(pred[i])) 
			{
				pred[i] = n;
				return true;
			}
		}
		return false;
	}

	static int verificaVisitas() {
		Arrays.fill(pred, -1);
		int cont = 0;
		for (int i = 0; i < planetas; i++) {
			Arrays.fill(visitado, false);
			if (bfs(i)) cont++;
		}
		return cont;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		planetas = in.nextInt();
		for (int i = 0; i < planetas; i++) 
		{
			cantidadConexion = in.nextInt();
			conexiones[i] = new ArrayList<Integer>();
			for (int j = 0; j < cantidadConexion; j++) 
				conexiones[i].add(in.nextInt());
		}
		System.out.println(planetas-verificaVisitas());
	}
}
