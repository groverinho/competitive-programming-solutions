import java.util.Scanner;
 
 
public class MaximumProfit {
 
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        while (in.hasNextInt()) 
        {
	        int n = in.nextInt();
	        int vector [] = new int [n];
	        for (int i = 0; i < n; i++) 
	            vector[i]= in.nextInt();
	        int aux = 0;
	        int max = 0;
	        for (int i = 0; i < vector.length; i++)
	        {
	        	for (int j = i; j < vector.length; j++) 
	        	{
	        		if (j+1 != vector.length)
	        		{
		        		if (vector[j]>vector[j+1])
		        			break;
		        		else
		        			 aux = aux + vector[j+1] - vector[j];
		        		
	        		}
				}
	        	max = Math.max(max, aux);
	            aux = 0;
	        }
	        System.out.println(max);
        }
        }
    }
/*
8
3 5 10 20 80 90 40 10
7
3 4 3 3 3 2 1
5
5 7 1 3 4
6
1 3 4 1 5 1
7
5 3 4 5 1 1 5
6
5 3 4 5 1 1
7
10 8 6 5 4 2 1

87
1
3
4
4
2
0

 */
//	        for (int j = 1; j < vector.length; j++) 
//	        {
//	        	int inicio = vector[j-1];
//	            for (int i = j; i < vector.length; i++) 
//	            {
//	                if (vector[i]<vector[i-1] || (i+1) ==vector.length)
//	                {
//	                	if ((i)  ==vector.length) {
//	                	  	aux = vector[i] - inicio;
//						}
//	                	else
//	                	aux = vector[i-1] - inicio;
//	                    break;
//	                }
//
//	            }
//	            max = Math.max(max, aux);
//	            aux = 0;
//	        }
//	        System.out.println(max);
//        }
//    }
// 
//}