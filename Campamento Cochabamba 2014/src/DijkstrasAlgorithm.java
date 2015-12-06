import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class DijkstrasAlgorithm {

	public static int[] doDijkstra(int[][] d, int from) 
	{
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(from);
		boolean[] closed = new boolean[d.length];
		int[] distances = new int[d.length];
		for (int i = 0; i < d.length; i++) 
		{
			if (i != from) 		
				distances[i] = Integer.MAX_VALUE;
			else 
				distances[i] = 0;
		}
		int[] predecessors = new int[d.length];
		predecessors[from] = -1;
		while (!set.isEmpty()) 
		{		
			//find the nearest node
			int minDistance = Integer.MAX_VALUE;
			int node = -1;
			for(Integer i : set)
			{
				if(distances[i] < minDistance)
				{
					minDistance = distances[i];
					node = i;
				}
			}
			set.remove(node);
			closed[node] = true;
			//contract the distances
			for (int i = 0; i < d.length; i++) 
			{
				//edge exists	
				if (d[node][i] != Integer.MAX_VALUE)
				{
					if (!closed[i]) 
					{
						//the path length decreased using the ancestor node	
						if (distances[node] + d[node][i] < distances[i]) 
						{	
							distances[i] = distances[node] + d[node][i];						
							predecessors[i] = node;
							set.add(i);
						}
					}	
				}			
			}		
		}	
		return predecessors;	
	}	

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int tamano = in.nextInt();
		int [][] d = new int [tamano][tamano];
		for (int i = 0; i < tamano; i++) {
			for (int j = 0; j < tamano; j++) {
				d[i][j] = in.nextInt();
			}
		}
		int from = in.nextInt();
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(from);
		boolean[] closed = new boolean[d.length];
		int[] distances = new int[d.length];
		for (int i = 0; i < d.length; i++) 
		{
			if (i != from) 		
				distances[i] = Integer.MAX_VALUE;
			else 
				distances[i] = 0;
		}
		int[] predecessors = new int[d.length];
		predecessors[from] = -1;
		while (!set.isEmpty()) 
		{		
			//find the nearest node
			int minDistance = Integer.MAX_VALUE;
			int node = -1;
			for(Integer i : set)
			{
				if(distances[i] < minDistance)
				{
					minDistance = distances[i];
					node = i;
				}
			}
			set.remove(node);
			closed[node] = true;
			//contract the distances
			for (int i = 0; i < d.length; i++) 
			{
				//edge exists	
				if (d[node][i] != Integer.MAX_VALUE)
				{
					if (!closed[i]) 
					{
						//the path length decreased using the ancestor node	
						if (distances[node] + d[node][i] < distances[i]) 
						{	
							distances[i] = distances[node] + d[node][i];						
							predecessors[i] = node;
							set.add(i);
						}
					}	
				}			
			}		
		}	
		//return predecessors;
		for (int i = 0; i < predecessors.length; i++) 
		{
			System.out.println(predecessors[i]);
		}
	}

}
