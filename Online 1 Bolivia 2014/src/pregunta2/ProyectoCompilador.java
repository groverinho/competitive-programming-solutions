package pregunta2;

public class ProyectoCompilador 
{
	public static void main(String[] args) 
	{
		AnalizadorLexicografico miCodigo = new AnalizadorLexicografico();
		miCodigo.cargarLibreria();
		//mostrarLibreria(miCodigo.miLibreria);
		miCodigo.cargarCodigo();
		miCodigo.clasificarCodigo();
		miCodigo.mostrarClasificacion();
		AnalizadorSintactico miSintesis = new AnalizadorSintactico();
		miSintesis.cargarAutomataOpAr();
		String[] resultado = miCodigo.obtenerClasificacion();
		miSintesis.analizarSintaxis(resultado);
	}

}
