import java.util.ArrayList;
import java.util.Scanner;



class nuevaspalabrascris {
	static class TrieNode {
		TrieNode[] hijos = new TrieNode[128];
		boolean  hoja;
	}
	
	public static ArrayList<String> palabrasAprendidas = new ArrayList<String>();
	public static void insertString(TrieNode root, String palabra) {
		TrieNode v = root;
		for (char ch : palabra.toCharArray()) {
			TrieNode siguiente = v.hijos[ch];
			if (siguiente == null)
				v.hijos[ch] = siguiente = new TrieNode();
			v = siguiente;
		}
		v.hoja = true;
	}

	public static void printSorted(TrieNode nodo, String palabra) {
		for (char ch = 0; ch < nodo.hijos.length; ch++) {
			TrieNode hijo = nodo.hijos[ch];
			if (hijo != null)
				printSorted(hijo, palabra + ch);
		}
		if (nodo.hoja) {
			//System.out.println(s);
			palabrasAprendidas.add(palabra);
		}
	}
	
	public static void llenar(TrieNode root,ArrayList<String> conocidas)
	{
		for (String pala : conocidas ) 
		{
		        printSorted(root, pala);
		}
	}

	// Usage example
	public static void main(String[] args) {
		TrieNode root = new TrieNode();
		Scanner entrada = new Scanner(System.in);
		int n1 = entrada.nextInt();
		ArrayList<String> conocidas = new ArrayList<String>();
		for (int i = 0; i < n1; i++) 
		{
			String pal = entrada.next();
	    	conocidas.add(pal);
	    	insertString(root, pal);
		}
		llenar(root, conocidas);
		int n2= entrada.nextInt();
		for (int i = 0; i < n2; i++)
		{
			String nueva = entrada.next();
			if(palabrasAprendidas.contains(nueva))
			{
				palabrasAprendidas.clear();
				insertString(root, nueva);
				conocidas.add(nueva);
				llenar(root, conocidas);
				System.out.println("SI");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}