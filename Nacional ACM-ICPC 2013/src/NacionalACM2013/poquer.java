package NacionalACM2013;

import java.util.Arrays;
import java.util.Scanner;

public class poquer {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int [] dados;
		do
		{
		dados = new int [5];
		int [] vis = new int [7];
		for (int i = 0; i < 5; i++)
			dados[i]= entrada.nextInt();
		if(dados[0]==0)
			break;
		int val=0;
		
		for (int j = 0; j < 5; j++) 
		{
			vis[dados[j]]++;
			if (vis[dados[j]]==3)
				val = dados[j];
		}
		
		if (val!=0&&vis[7-val]!=0)
		System.out.println("Poquer de huevo");
		else
			System.out.println("No");
		}while(dados[0]!=0);
	}

}