import java.util.Scanner;


public class Ecuacion {
	static Scanner s = new Scanner(System.in);
	static int gcd(int a,int b){
		if(b==0){
			 return a;
		}else{
			return gcd(b,a%b);
		}	
	}
	public static void main(String[] args) {
		String ecuacion = s.next();
		int a = 0;
		int b = 0;
		int c = 0;
		int pos =0;
		if(ecuacion.charAt(0)=='-'){
			pos++;
		}
		for(;ecuacion.charAt(pos) != 'x';pos++){
			a*=10;
			char car = ecuacion.charAt(pos);
			switch(car){
			case '0':
				a += 0;
				break;
			case '1':
				a += 1;
				break;
			case '2':
				a += 2;
				break;
			case '3':
				a += 3;
				break;
			case '4':
				a += 4;
				break;
			case '5':
				a += 5;
				break;
			case '6':
				a += 6;
				break;
			case '7':
				a += 7;
				break;
			case '8':
				a += 8;
				break;
			case '9':
				a += 9;
				break;
			default:
				break;
			}
		}
		if(ecuacion.charAt(0)=='-'){
			a=-a;
		}
		pos++;
		char signo = ecuacion.charAt(pos);
		pos++;
		for(;ecuacion.charAt(pos) != '=';pos++){
			b*=10;
			char car = ecuacion.charAt(pos);
			switch(car){
			case '0':
				b += 0;
				break;
			case '1':
				b += 1;
				break;
			case '2':
				b += 2;
				break;
			case '3':
				b += 3;
				break;
			case '4':
				b += 4;
				break;
			case '5':
				b += 5;
				break;
			case '6':
				b += 6;
				break;
			case '7':
				b += 7;
				break;
			case '8':
				b += 8;
				break;
			case '9':
				b += 9;
				break;
			default:
				break;
			}
		}
		pos++;
		int poss=0;
		if(ecuacion.charAt(pos)=='-'){
			poss=pos;
			pos++;
		}
		for(;pos < ecuacion.length();pos++){
			c*=10;
			char car = ecuacion.charAt(pos);
			switch(car){
			case '0':
				c += 0;
				break;
			case '1':
				c += 1;
				break;
			case '2':
				c += 2;
				break;
			case '3':
				c += 3;
				break;
			case '4':
				c += 4;
				break;
			case '5':
				c += 5;
				break;
			case '6':
				c += 6;
				break;
			case '7':
				c += 7;
				break;
			case '8':
				c += 8;
				break;
			case '9':
				c += 9;
				break;
			default:
				break;
			}
		}
		if(poss !=0){
			c=-c;
		}
		if(a==0) a=1;
		int nuevoc;
		if(signo == '+'){
			nuevoc =c-b;
		}else{
			nuevoc =c+b;
		}
		double doublea =a;
		double doublec =nuevoc;
		if(nuevoc/a ==doublec/doublea)
		{
			System.out.println(nuevoc/a);
		}else
		{
			int max =gcd(nuevoc,a);
			if(nuevoc < 0 && a >= 0){
				System.out.println(nuevoc/max*-1+"/"+a/max*-1);
			}else{
				System.out.println(nuevoc/max+"/"+a/max);
			}
		}
	}

}