import java.util.Scanner;

public class squawk {

	public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int s = scanner.nextInt();
    int t = scanner.nextInt();
      int[][] matriz = new int[n][n];
      for(int i = 0; i < m; i++) 
      {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        matriz[x][y] = 1;
        matriz[y][x] = 1;
      }
      long[][] matriz2 = new long[t+1][n];
      matriz2[0][s] = 1;
      for (int i = 1; i < t+1; i++) {
        for (int x = 0; x < n; x++) {
          for (int y = 0; y < n; y++) {
        	  matriz2[i][x] += matriz2[i-1][y]*matriz[x][y];
          }
        }
      }
      long total = 0;
      for (int x = 0; x < n; x++) {
        total += matriz2[t][x];
      }
      System.out.println(total);
  }
}