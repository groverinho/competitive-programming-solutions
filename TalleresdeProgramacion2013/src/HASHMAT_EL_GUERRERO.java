import java.util.Scanner;


public class HASHMAT_EL_GUERRERO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextLine()) {
			String a = in.nextLine();
			String [] v = new String[2];
			v = a.split(" ");
			int n1 = Integer.parseInt(v[0]);
			int n2 = Integer.parseInt(v[1]);
			System.out.println(Math.abs(n1-n2));	
		}
	}
}
