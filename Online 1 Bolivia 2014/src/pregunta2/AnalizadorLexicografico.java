package pregunta2;

import java.util.Scanner;

public class AnalizadorLexicografico 
{
	private String[] codigo = new String[100];
	private String[] clasificacion = new String[100];
	Libreria[] miLibreria = new Libreria[22];
	public static class Libreria
	{
		String instruccion;
		String descripcion;
		String tipo;
	}
	public void cargarCodigo ()
	{
		Scanner entrada = new Scanner(System.in);
		String cadena2;
		int contador = 0;
		System.out.println("Ingrese el codigo(finaliza con un ;)");
		do
		{
			cadena2 = entrada.next();
			cadena2 = cadena2.toUpperCase();
			this.codigo[contador]=cadena2;
			contador++;			
		}while(!(cadena2.equals(";")));		
		
	}
	
	public static Libreria cargarInstruccion (String inst, String desc, String tipo)
	{
		Libreria nuevo = new Libreria();
		nuevo.instruccion = inst;
		nuevo.descripcion = desc;
		nuevo.tipo = tipo;
		return nuevo;
	}
	
	public void clasificarCodigo()
	{
		String clasifica;
		//int i;
		for (int i = 0; i<this.codigo.length ; i++)
		{
			//if(this.codigo[i].equals(";"))
			if(this.codigo[i]==null)
				break;
			else
			{
				if (validaLenguaje(this.codigo[i]))
					clasifica = "Válido";
				else
					clasifica = "Inválido";					
				boolean bandera = true;
				for (int j = 0; j<this.miLibreria.length; j++)
				{					
					if(this.codigo[i].equals(this.miLibreria[j].instruccion))
					{
						this.clasificacion[i]=this.miLibreria[j].tipo;
						bandera = false;
					}				
				}
				if (bandera)
				{
					if (this.codigo[i].charAt(0)=='"'&
					    this.codigo[i].charAt(this.codigo[i].length()-1)=='"')
						this.clasificacion[i]="ARGUMENTO CADENA";
					else
					{						
						try
						{
							int convierte = Integer.parseInt(this.codigo[i]);
							this.clasificacion[i]="ARGUMENTO NUMERICO";	
						}
						catch(NumberFormatException e )
						{
							if (this.codigo[i].equals(";"))
								this.clasificacion[i]=";";
							else
								this.clasificacion[i]="VARIABLE";	
						}
					}	
				}		
			}
		}
		//this.clasificacion[i] = ";";
	}
	
	public boolean validaLenguaje (String palabra)
	{
		boolean respuesta = true;
		palabra = palabra.toUpperCase();
		for(int i = 0; i<palabra.length(); i++)
		{
			char c = palabra.charAt(i);
			int ascii = c;
			if (!((ascii>=65&ascii<=90)|(ascii>=48&ascii<=57)|
			      (ascii==209)|(ascii==241)|(ascii==34)|(ascii==95)))
			{
				respuesta = false;
				break;
			}		
			//System.out.println(ascii);
		}
		return respuesta;
	}
	
	public static void mostrarLibreria(Libreria[] libreria)
	{
		for (int i = 0; i<libreria.length; i++)
			System.out.println(libreria[i].instruccion+"-"+libreria[i].descripcion);
	}
	
	public void cargarLibreria()
	{
		this.miLibreria[0] = cargarInstruccion("MAS", "Operación Aritmetico Suma","OPERADOR ARITMETICO");
		miLibreria[1] = cargarInstruccion("MENOS", "Operación Aritmetico Resta","OPERADOR ARITMETICO");
		miLibreria[2] = cargarInstruccion("POR", "Operación Aritmetico Multiplicacion","OPERADOR ARITMETICO");
		miLibreria[3] = cargarInstruccion("ENTRE", "Operación Aritmetico Division","OPERADOR ARITMETICO");
		miLibreria[4] = cargarInstruccion("RESIDUO", "Operación Aritmetico Modulo","OPERADOR ARITMETICO");
		miLibreria[5] = cargarInstruccion("ELEVADO_A", "Operación Aritmetico Potencia","OPERADOR ARITMETICO");
		miLibreria[6] = cargarInstruccion("Y", "Operación Lógico Y","OPERADOR LOGICO");
		miLibreria[7] = cargarInstruccion("O", "Operación Lógico O","OPERADOR LOGICO");
		miLibreria[8] = cargarInstruccion("ES", "Operación Asignación Igual","OPERADOR ASIGNACION");
		miLibreria[9] = cargarInstruccion("PARA", "Operación iteracion Para","OPERADOR ITERATIVO");
		miLibreria[10]= cargarInstruccion("MIENTRAS_CUMPLA", "Operación iteracion mientras","OPERADOR ITERATIVO");
		miLibreria[11]= cargarInstruccion("HACER_MIENTRAS", "Operación Iteración hacer mientras","OPERADOR ITERATIVO");
		miLibreria[12]= cargarInstruccion("CUMPLA", "Operación Iteración hacer mientras","OPERADOR ITERATIVO");
		miLibreria[13]= cargarInstruccion("SI", "Operación Decision Si","OPERADOR DECISION");
		miLibreria[14]= cargarInstruccion("SI_NO", "Operación Decision Si No","OPERADOR DECISION");
		miLibreria[15] = cargarInstruccion("ES_IGUAL", "Operación Comparación Igual","OPERADOR COMPARACION");
		miLibreria[16] = cargarInstruccion("MAYOR_QUE", "Operación Comparación mayor que","OPERADOR COMPARACION");
		miLibreria[17] = cargarInstruccion("MAYOR_IGUAL", "Operación Comparación mayor Igual","OPERADOR COMPARACION");
		miLibreria[18] = cargarInstruccion("MENOR_QUE", "Operación Comparación Menor que","OPERADOR COMPARACION");
		miLibreria[19] = cargarInstruccion("MENOR_IGUAL", "Operación Comparación Menor Igual","OPERADOR COMPARACION");
		miLibreria[20] = cargarInstruccion("ES_DISTINTO", "Operación Comparación Distinto","OPERADOR COMPARACION");
		miLibreria[21] = cargarInstruccion("CADENA", "Operación Comparación Distinto","ARGUMENTO CADENA");
	}
	public void mostrarClasificacion()
	{
		for (int i=0; i<this.clasificacion.length; i++)
		{
			if (this.clasificacion[i]==null)
			{
				break;
			}
			else
				System.out.print(this.clasificacion[i]+" ");
		}
		System.out.println();
	}
	public String[] obtenerClasificacion()
	{
		return this.clasificacion;
	}
}
