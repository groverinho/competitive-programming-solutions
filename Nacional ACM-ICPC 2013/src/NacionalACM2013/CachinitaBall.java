package NacionalACM2013;
import java.util.Scanner;

class ProblemaD 
{
	int[][] lanzamientos;
	int izqX,izqY,derX,derY;
	double A,B,C,MP,A1,B1,C1,C2,distanciaEje,distancia,distanciaPR1,distanciaPR2,distanciaP1,distanciaP2;
	static class NodoSemilla
	{
		int posX;
		int posY;
		boolean marcado;
		NodoSemilla siguiente;
	}
	NodoSemilla primero=null;
	
	public void adicionarEnLista(int x,int y)
	{
		NodoSemilla cajaNueva = new NodoSemilla();
		cajaNueva.posX = x;
		cajaNueva.posY = y;
		cajaNueva.marcado = true;
		cajaNueva.siguiente = null;
		if (this.primero == null)
		{
			this.primero = cajaNueva;
		}
		else
		{
			NodoSemilla aux=primero;
			while (aux.siguiente!=null)
			{
				aux = aux.siguiente;
			}
			aux.siguiente = cajaNueva;
		}		
	}
	public int contarSemillas()
	{
		int cont = 0;
		NodoSemilla aux = primero;
		while(aux!=null)
		{
			if(!aux.marcado)
				cont++;
			aux = aux.siguiente;
		}
		return cont;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner( System.in );	   
		int NC = sc.nextInt();
		int contador=1;
		do
		{
			ProblemaD caso = new ProblemaD();
			int N = sc.nextInt();
			int M = sc.nextInt();
			caso.lanzamientos = new int[N][6];
			for(int i=0 ; i<N ; i++)
			{
				caso.lanzamientos[i][0]=sc.nextInt();
				caso.lanzamientos[i][1]=sc.nextInt();
				caso.lanzamientos[i][2]=sc.nextInt();
				caso.lanzamientos[i][3]=sc.nextInt();
				caso.lanzamientos[i][4]=sc.nextInt();
				caso.lanzamientos[i][5]=sc.nextInt();
			}
			for(int j=0 ; j<M ; j++)
			{
				int posSemX = sc.nextInt();
				int posSemY = sc.nextInt();
				caso.adicionarEnLista(posSemX, posSemY);
			}
			for (int k=0 ; k<N; k++)
			{
				NodoSemilla aux = caso.primero;
				if(caso.lanzamientos[k][0]<caso.lanzamientos[k][3])
				{
					caso.izqX=caso.lanzamientos[k][0];
					caso.izqY=caso.lanzamientos[k][1];
					caso.derX=(caso.lanzamientos[k][3]*caso.lanzamientos[k][5])+caso.lanzamientos[k][0];
					caso.derY=(caso.lanzamientos[k][4]*caso.lanzamientos[k][5])+caso.lanzamientos[k][1];
				}
				else
				{
					caso.derX=caso.lanzamientos[k][0];
					caso.derY=caso.lanzamientos[k][1];
					caso.izqX=(caso.lanzamientos[k][3]*caso.lanzamientos[k][5])+caso.lanzamientos[k][0];
					caso.izqY=(caso.lanzamientos[k][4]*caso.lanzamientos[k][5])+caso.lanzamientos[k][1];
				}
				caso.A=caso.derY-caso.izqY;
				caso.B=caso.izqX-caso.derX;
				caso.C=(caso.izqY*(caso.derX-caso.izqX))+(caso.izqX*(caso.izqY-caso.derY));
				
				caso.MP = caso.B/caso.A;
				caso.A1 = caso.MP;
				caso.B1 = -1;
				caso.C1 = caso.izqY-(caso.MP*caso.izqX);
				caso.C2 = caso.derY-(caso.MP*caso.derX);
				caso.distanciaEje = Math.sqrt(Math.pow(caso.derX-caso.izqX,2)+Math.pow(caso.derY-caso.izqY,2));
				while (aux!=null)
				{
					if(aux.marcado)
					{
						caso.distanciaPR1 = Math.abs((caso.A1*aux.posX)+(caso.B1*aux.posY)+caso.C1)/Math.sqrt((caso.A1*caso.A1)+(caso.B1*caso.B1));
						caso.distanciaPR2 = Math.abs((caso.A1*aux.posX)+(caso.B1*aux.posY)+caso.C2)/Math.sqrt((caso.A1*caso.A1)+(caso.B1*caso.B1));
						if (Math.round(caso.distanciaEje)==Math.round(caso.distanciaPR1+caso.distanciaPR2))
						{
							caso.distancia = Math.abs((caso.A*aux.posX)+(caso.B*aux.posY)+caso.C)/Math.sqrt((caso.A*caso.A)+(caso.B*caso.B));
							if(caso.distancia<=caso.lanzamientos[k][2])
								aux.marcado = false;
						}
						else
						{
							caso.distanciaP1 = Math.sqrt(Math.pow(caso.izqX-aux.posX,2)+Math.pow(caso.izqY-aux.posY,2));
							caso.distanciaP2 = Math.sqrt(Math.pow(caso.derX-aux.posX,2)+Math.pow(caso.derY-aux.posY,2));
							if (caso.distanciaP1<=caso.lanzamientos[k][2]||caso.distanciaP2<=caso.lanzamientos[k][2])
									aux.marcado = false;
						}						
					}
					aux = aux.siguiente;
				}
			}
			System.out.printf("Caso %d: %d\n",contador,caso.contarSemillas());
			contador++;
		}while (contador<=NC);    
	}
}