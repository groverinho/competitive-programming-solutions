
import java.util.Scanner;

public class a {
	
	public static String procesar(String numero){
			String result="";
			String s = numero;			
			int n = s.length();
			char[] num = s.toCharArray();
			char[] original = num.clone();
			int medio = n/2;
			int x = medio - 1;
			int y = x+2;
			if(n % 2 == 0) y = x+1;
			while(x >= 0 && y < n) {
				if(num[x] != num[y]) {
					num[y] = num[x];
				}
				x--; y++;
			}
			if(mayor(original, num)) tocarVector(num, medio-(n%2==0?1:0), medio);
			if(num[0] == '0' || (num[0] == '1' && num.length == 1)) result +="1";;
			return result+=new String(num);
	}
	
	public static boolean mayor(char[] num1, char[] num2) {
		for(int i=0; i<num1.length; i++) {
			if(num1[i] < num2[i]) return false;
			if(num1[i] > num2[i]) return true;
		}
		return true;
	}
	
	public static void tocarVector(char[] num, int izq, int der) {
		if(num[izq] < '9') {
			num[izq] = num[der] = (char) (num[izq]+1);
		}
		else {
			while(izq >=0 && num[izq] == '9') {
				num[izq] = num[der] = '0';
				izq--; der++;
			}
			if(izq >= 0) {
				num[izq] = num[der] = (char) (num[izq]+1);
			}
		}
		if(izq < 0) {
			num[num.length-1] = '1';
		}
	}
 
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		while(entrada.hasNextInt())
		{
			int cantidad = entrada.nextInt();
			String numero = entrada.next();
			while(cantidad-->0)
			{
				if(numero.length()==1)
				{
					int n = Integer.parseInt(numero.charAt(0)+"");
					if(n==9)
					{
						numero = (n+1)+"";
						cantidad++;
					}
					else
					{
						System.out.println(n+1);
						numero = (n+1) + "";
					}
				}
				else
				{
					numero = procesar(numero);
					System.out.println(numero);
				}
			}
		}
	}
}
