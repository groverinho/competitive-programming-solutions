package NacionalACM2013;
import java.util.Scanner;

 class Ajtapi2 {
	public static String cadenaTotal = ""; 
	public static void main(String[] args) {
		Scanner entradaint = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		int cantidad=entradaint.nextInt();	
		String cadena;
		boolean resul = false;
		boolean auxResul = false;
		while(cantidad!=0)
		{
			auxResul = false;
			for (int i = 0; i < cantidad; i++) 
			{
				cadena = entrada.nextLine();
				resul = buscar(cadena);
				if(resul==true)
					auxResul = true;			
			}
			if (auxResul = true)
			{
				//cadenaTotal = cadenaTotal + "EXISTE\n";
				System.out.println("EXISTE");
			}
			else
			{		
				//cadenaTotal = cadenaTotal +  "NO EXISTE\n";
				System.out.println("NO EXISTE");
				
			}
			cantidad=entradaint.nextInt();
		}
		//.out.println(cadenaTotal);
	}
	
	public static boolean buscar(String palabra)
	{
		boolean [] vocales = new boolean[5];
		for (int i = 0; i < palabra.length(); i++)
		{
			Character caracter = palabra.charAt(i);
			if(caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u')
			{
				switch (caracter) {
				case 'a':if(vocales[0]==false)
							vocales[0]=true;
						else
							return false; 	
						break;
				case 'e':if(vocales[1]==false)
					vocales[1]=true;
				else
					return false; 	
				break;
				case 'i':if(vocales[2]==false)
					vocales[2]=true;
				else
					return false; 	
				break;
				case 'o':if(vocales[3]==false)
					vocales[3]=true;
				else
					return false; 	
				break;
				case 'u':if(vocales[4]==false)
					vocales[4]=true;
				else
					return false; 	
				break;
				}			
			}
			
		}
		boolean aux=true;
		for (int i = 0; i < vocales.length; i++) 
		{
			if(vocales[i]==false)
				aux= false;	
		}
		return aux;
		
	}
}
