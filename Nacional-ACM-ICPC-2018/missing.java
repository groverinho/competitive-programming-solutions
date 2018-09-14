/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 14/09/2018
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

class missing {
	static int INF =Integer.MAX_VALUE;
	static HashMap<Integer, ArrayList<Nodo>> lisAdy;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			lisAdy = new HashMap<Integer,ArrayList<Nodo>>();
			int v = in.nextInt(), e = in.nextInt(), s = in.nextInt(), y = in.nextInt();
			
			for (int i=0; i<v; i++)
				lisAdy.put(i, new ArrayList<Nodo>());
			for (int i=0; i<e; i++) {
				int a = in.nextInt()-1, b = in.nextInt()-1, w = in.nextInt();
				lisAdy.get(a).add(new Nodo(b,w));
				lisAdy.get(b).add(new Nodo(a,w));
			}
			int d = dijkstra(in.nextInt()-1, in.nextInt()-1);
			double tiempo = d/(double)(s+y);
			System.out.printf("%.2f\n",tiempo);
		}
	}
	
	public static int dijkstra (int inicio, int destino) {
		int n = lisAdy.keySet().size();
		PriorityQueue<Nodo> pq = new PriorityQueue<Nodo>();
		int distancia[] = new int[n]; 
	  
		Arrays.fill (distancia, INF);
		pq.add (new Nodo(inicio,0));
		distancia[inicio] = 0;
		while (!pq.isEmpty ()) {
			Nodo actual = pq.remove ();
			if (actual.second>distancia[actual.first] || actual.first == destino)
				continue;
			for (Nodo vec : lisAdy.get(actual.first)) {
				if (distancia[actual.first]+vec.second<distancia[vec.first]) {
					distancia[vec.first] = distancia[actual.first]+vec.second;
					pq.add (new Nodo(vec.first,distancia[vec.first]));
				}
			}
		}
		return distancia[destino];
	}
	
	public static class Nodo implements Comparable<Nodo> {
		int first, second;
		
		public Nodo( int v , int w ){
			this.first = v;
			this.second = w;
		}
		
		public int compareTo( Nodo o){
			if( second > o.second ) return 1;
			if( second == o.second ) return 0;
			return -1;
		}
	}
}