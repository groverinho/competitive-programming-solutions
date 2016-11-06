import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 05-11-16
 */

public class commonkn {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		int casos = in.nextInt();
//		while (casos-->0)
//		{
//			int n = in.nextInt();
//			
//			System.out.println();
//		}
	
	BigInteger r =BigInteger.valueOf(2);
	r = r.pow(128);
	String cad = r+"";
	System.out.println(cad.length()
			);
		String[] v =new String[20];
		v[0]= "8";
		v[1]= "64";
		v[2]= "512";
		v[3]= "4096";
		v[4]=  ("32768");
		v[5]=  ("262144");
		v[6]=  ("2097152");
		v[7]=  ("16777216");
		v[8]=  ("134217728");
		v[9]=  ("1073741824");
		v[10]=  ("8589934592");
		v[11]=  ("68719476736");
		v[12]=  ("549755813888");
		v[13]=  ("4398046511104");
		v[14]=  ("35184372088832");
		v[15]=  ("281474976710656");
		v[16]=  ("2251799813685248");
		v[17]=  ("18014398509481984");
		v[18]=  ("144115188075855872");
		v[19]=  ("1152921504606846976");
//		for (int i = 1; i <=20; i++) {
//			BigInteger r =BigInteger.valueOf(8);
//			r = r.pow(i);
//					System.out.println(r);
		int n  = Integer.parseInt(in.readLine());
		System.out.println(v[n-1]);
		
		
	
	
		
	}

}
