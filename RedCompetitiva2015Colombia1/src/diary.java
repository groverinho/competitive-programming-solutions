import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Arrays;


public class diary {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(InputStreamReader(System.in));
		char str[]= new char [1024];
		int cnt[] = new int [26];
		int casos, i, mx, mc, d;
		
		casos = Integer.parseInt(in.readLine());
		while(casos>0)
		{
			String frase = in.readLine();
			for (int j = 0; j < frase.length(); j++)
			{
				str[j]=frase.charAt(j);
			}
			Arrays.fill(cnt,0);
			for(i = 0; str[i]>31; i++)
				if(str[i]>32)
					cnt[str[i]-'A']++;
			for(mx = 0, mc = 1, i = 1; i < 26; i++)
			{
				if(cnt[i] > cnt[mx])
				{
					mx = i;
					mc = 1;
				}
					
				else if(cnt[i] == cnt[mx]) 
					mc++;
			}
			if(mc > 1)
				System.out.println("NOT POSSIBLE");
			else 
			{
				if(mx >= 4) 
					d = mx - 4;
				else 
					d = 26 - 4 + mx;
				System.out.println(d);
				for(i = 0; str[i]>31; i++)
					if(str[i]>32) 
						str[i] = (char) ('A' + (str[i]-'A' - d + 26) % 26);
				//fputs(str, stdout);
				for (int j = 0; j < str.length; j++) {
					System.out.print(str[j]);
				}
			}
			System.out.println();
			casos--;
		}
	}

	private static Reader InputStreamReader(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
