import java.util.Arrays;
import java.util.Scanner;

public class legends {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t= in.nextInt();
	    
	    while (t-->0)
	    {
	    	double [] winningK = new double[5];
	    	double []  losingK= new double[5];
	    	double [] winningD= new double[5];
	    	double []  losingD= new double[5];
	        double []aux2 = new double[5];
	        double []aux1 = new double[5];
	        String []winningN= new String[5];
	        String[] losingN= new String[5];
	        for (int i = 0; i < 5; i++)
	        {
	        	winningN[i] = in.next();
	        	winningK[i] = in.nextLong();
	        	winningD[i] = in.nextLong();
	        }
	        for (int i = 0; i < 5; i++)
	        {
	        	losingN[i] = in.next();
	        	losingK[i] = in.nextLong();
	        	losingD[i] = in.nextLong();
	        }
	       for (int i = 0 ; i < 5; i++)
	        {
	            if (winningD[i] != 0)
	            	aux1[i] = winningK[i] / winningD[i];
	            else
	            	aux1[i] = Integer.MAX_VALUE;
	        }
	        double var1 = (double)1 / (double)3;
	        for (int i = 0 ; i < 5; i++)
	        {
	            if (aux1[i] < var1)
	                System.out.println(winningN[i]+" plz uninstall");
	        }
	        for (int i = 0; i < 5; i++)
	        {
	            if (losingD[i] != 0)
	            	aux2[i] = losingK[i] / losingD[i];
	            else
	            	aux2[i] = Integer.MAX_VALUE;
	        }
	        double []auxLose = new double[5];
		    for (int i = 0; i < 5; i++) {
				auxLose[i]= aux2[i];
			}
		    Arrays.sort(auxLose);
		    
	        double var2 = (double)1 / (double)2;
	        boolean bandera = false;
	        	 for (int i = 0 ; i < 5; i++)
	 	        {
	 	            if (aux2[i] < var2)
	 	            {
	 	            	bandera = true;
	 	            	 System.out.println(losingN[i]+" plz uninstall");
	 	            }
	 	                
	 	        }
	        	 if (bandera==false) 
	        	 {
	        		 int index = 0;
	        		 for (int i = 0; i < auxLose.length; i++) 
	        		 {
	 					if (auxLose[0] == aux2[i])
	 					{
	 						System.out.println(losingN[i]+" plz uninstall");
						}
	 				}	

	        	
				}
	        	 
	    }

	}
/*
 1
JarvanIV 5 1
Udyr 1 1
Ahri 1 4
Vayne 4 1
Sona 1 4
Heimerdinger 2 1
Ashe 5 1
Kassadin 7 2
Darius  2 1
Elise 7 1
 * */
}
