import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class TheDepartmentofRedundancyDepartment484 {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String cad;
        HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
    
        while ((cad = entrada.readLine()) != null) 
        {
            String[] line = cad.split(" ");
            for (int i = 0; i < line.length; i++) 
            {
                int x = Integer.parseInt(line[i]);
                if (mapa.containsKey(x)) 
                {
                    mapa.put(x, mapa.get(x) + 1);
                }   
                else 
                {
                    list.add(x);
                    mapa.put(x, 1);
                }
            }
        }
        
        for (int i : list)
        {
            int x = mapa.get(i);
            System.out.println(i + " " + x);
        }
    }
}
                                                                   