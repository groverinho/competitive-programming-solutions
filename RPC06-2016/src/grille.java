import java.util.*;

public class grille {
  public static int n;
  public static String encriptado,grilla;
  public static int cont[];

  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
      n = in.nextInt();
      cont = new int[n*n];
      Arrays.fill(cont,0);
      grilla = "";
      for (int i = 0; i < n; i++)
    	  grilla += in.next();
      encriptado = in.next();
      process(); 
  }

  public static void process() 
  {
    char descencripta[] = new char[n*n];
    int total = 0;
    boolean invalido = false;
    for (int k = 0; k < 4; k++) {
      rotar();
      String segemento = encriptado.substring(n*(3-k)*n/4,n*n*(4-k)/4);
      int j = 0;
      for (int i = 0; i < n*n; i++) {
        if (grilla.charAt(i) == '.') 
        {
          if (j < segemento.length())
        	  descencripta[i] = segemento.charAt(j++);
          if (cont[i] > 0) {
            invalido = true;
            break;
          }
          cont[i]++;
          total++;
        }
      }
    }
    if (invalido || total != n*n) 
    {
      System.out.println("invalid grille");
    }
    else 
    {
     String cad = "";
      for (int i = 0; i < descencripta.length; i++)
        cad += descencripta[i];
      System.out.println(cad);
    }
  }

  public static void rotar() {
    String cad = "";
    for (int fila = 0; fila < n; fila++)
    {
      for (int col = 0; col < n; col++)
      {
        char c = grilla.charAt(col*n + n-1-fila);
        cad += c;
      }
    }
    grilla = cad;
  }
}