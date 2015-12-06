import java.util.Arrays;
import java.util.Scanner;



public class trener {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int mp[] = new int[26];
		 while(in.hasNextLine()){
			 Arrays.fill(mp, 0);
			 int N = Integer.parseInt(in.nextLine());
			 for(int i = 0; i < N ; i++)
			 {
				 String nombre = in.nextLine();
				 int pos = nombre.charAt(0)-'a';
				 mp[pos] ++;				 
			 }
			 
			 boolean bandera = false;			 
			 for(int i = 0; i < 26; i++)
			 {
				 if(mp[i] >= 5)
				 {
					 System.out.print((char)(i+'a'));
					 bandera = true;
				 }
			 }
			 if(!bandera) 
				 System.out.print("PREDAJA");
			 System.out.print("\n");
		 }
	}
}
