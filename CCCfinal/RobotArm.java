
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class RobotArm{

	public static void main(String[] args) throws FileNotFoundException
	{

		Scanner entrada = new Scanner(System.in);
		int casos = entrada.nextInt();
		while(casos-->0)
		{
			Stack<Integer> pila = new Stack<Integer>();
			Queue<Integer> cola = new LinkedList<Integer>();
			int n =entrada.nextInt();
			int m = entrada.nextInt();
			while(n-->0)
			{
				int orden = entrada.nextInt();
				if(orden==1)
				{
					int num = entrada.nextInt();
					pila.add(num);
				}
				else if(orden==2)
				{
					System.out.println(pila.peek());
					pila.pop();
				}
				else if(orden == 3)
				{
					if(pila.size()<m)
					{
						cola = new LinkedList<Integer>();
						int tamanio = pila.size();
						for (int i = 0; i < tamanio; i++)
						{
							cola.add(pila.peek());
							pila.pop();
						}
						pila = new Stack<Integer>();
						int tam2= cola.size();
						for (int i = 0; i < tam2; i++) 
						{
							pila.add(cola.peek());
							cola.remove();
						}
					}
					else
					{
						ArrayList<Integer> array = new ArrayList<Integer>();
						for (int i = 0; i < m; i++) 
						{
							array.add(pila.peek());
							pila.pop();
						}
						for (int i = 0; i<array.size(); i++) 
						{
							pila.add(array.get(i));
						}
					}
				}
			}
		}

	}

}