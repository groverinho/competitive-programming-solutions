import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class football
{
 
    public static void main(String[] args){

   	Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            int partidos = in.nextInt();
            int bonus = in.nextInt();
            int puntos=0;
            int []goles = new int[partidos*2];
            ArrayList<Integer> diferencia = new ArrayList<Integer>();
            int i=0;
            while (i <goles.length)
            {
                goles[i] = in.nextInt();
                goles[i+1] = in.nextInt(); 
                if (goles[i]<=goles[i+1])
                    diferencia.add(goles[i+1]- goles[i]);
                else
                    puntos+=3;
                i+=2;
            }
            int [] vector = new int[diferencia.size()];
            int j=0;
            while (j<vector.length)
            {
                vector[j]=diferencia.get(j);
                j++;
            }
            Arrays.sort(vector);
            int k=0;
            while(k<=vector.length-1)
            {
                if(bonus>=(vector[k]+1))
                {
                    bonus -=(vector[k]+1);
                    puntos +=3;
                }
                else if(bonus==(vector[k]))
                {
                    bonus -=(vector[k]);
                    puntos ++;
                }
                else if(bonus<=0)
                    break;
                k++;
            }
            System.out.println(puntos);
    }
    }
}