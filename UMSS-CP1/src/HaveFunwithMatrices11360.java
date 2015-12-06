
import java.util.*;
import java.io.*;

public class HaveFunwithMatrices11360 {
	
	static void row(char[][] mat, int a, int b)
	{
		int N = mat.length;
		char[] tmp = new char[N];
		
		for (int i = 0; i < N; ++i)
			tmp[i] = mat[a][i];
		for (int i = 0; i < N; ++i)
			mat[a][i] = mat[b][i];
		for (int i = 0; i < N; ++i)
			mat[b][i] = tmp[i];
	}
	
	static void col(char[][] mat, int a, int b) 
	{
		int N = mat.length;
		char[] tmp = new char[N];
		
		for (int i = 0; i < N; ++i)
			tmp[i] = mat[i][a];
		for (int i = 0; i < N; ++i)
			mat[i][a] = mat[i][b];
		for (int i = 0; i < N; ++i)
			mat[i][b] = tmp[i];
	}
	
	static void inc(char[][] mat) 
	{
		int N = mat.length;
		for (int i = 0; i < N; ++i)
			for (int j = 0; j < N; ++j)
				mat[i][j] = (char)((mat[i][j] - '0' + 1) % 10 + '0');
	}
	
	static void dec(char[][] mat) 
	{
		int N = mat.length;
		for (int i = 0; i < N; ++i)
			for (int j = 0; j < N; ++j) 
			{
				mat[i][j] = (char)(mat[i][j] - 1);
				if (mat[i][j] < '0')
						mat[i][j] = '9';
			}
	}
	
	static void transpose(char[][] mat)
	{
		int N = mat.length;
		char[][] tmp = new char[N][N];
		for (int i = 0; i < N; ++i)
			for (int j = 0; j < N; ++j)
				tmp[j][i] = mat[i][j];
		for (int i = 0; i < N; ++i)
			for (int j = 0; j < N; ++j)
				mat[i][j] = tmp[i][j];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int casos = Integer.parseInt(in.readLine());
		for (int t = 1; t <= casos; ++t) {
			int n = Integer.parseInt(in.readLine());
			char[][] matriz = new char[n][n];
			for (int i = 0; i < n; ++i)
				matriz[i] = in.readLine().toCharArray();
			int consultas = Integer.parseInt(in.readLine());
			for (int i = 0; i < consultas; ++i)
			{
				StringTokenizer stk = new StringTokenizer(in.readLine());
				String comando = stk.nextToken();
				if (comando.equals("row"))
				{
					int a = Integer.parseInt(stk.nextToken()) - 1;
					int b = Integer.parseInt(stk.nextToken()) - 1;
					row(matriz, a, b);
				} else if (comando.equals("col")) {
					int a = Integer.parseInt(stk.nextToken()) - 1;
					int b = Integer.parseInt(stk.nextToken()) - 1;
					col(matriz, a, b);
				} else if (comando.equals("inc")) {
					inc(matriz);
				} else if (comando.equals("dec")) {
					dec(matriz);
				} else if (comando.equals("transpose")) {
					transpose(matriz);
				}
			}
			
			System.out.println("Case #" + t);
			for (int i = 0; i < n; ++i)
				System.out.println(matriz[i]);
			System.out.println();
		}
	}
}
