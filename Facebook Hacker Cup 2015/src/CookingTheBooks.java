import java.util.Scanner;

class CookingTheBooks
{
	public static void main (String[] args) throws java.lang.Exception{
		 Scanner sc = new Scanner(System.in);
		 int z= 0;
		 int v;
		 int count = sc.nextInt();
		 
		  for (int j=1 ; j<=count;j++){
		 	v = sc.nextInt();
		 	System.out.println("Case" + " " +"#"+ j + ":" + " " + min(v) + " " + max(v));
		 }
	}
	
	private static int max(int n) {
        int result = n;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                char[] ca = str.toCharArray();
                char tmp = ca[i];
                ca[i] = ca[j];
                ca[j] = tmp;
                if (ca[0] == '0') {
                    continue;
                }
                int m = Integer.parseInt(new String(ca));
                result = Math.max(result, m);
            }
        }
        return result;
    }

    private static int min(int n) {
        int result = n;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                char[] ca = str.toCharArray();
                char tmp = ca[i];
                ca[i] = ca[j];
                ca[j] = tmp;
                if (ca[0] == '0') {
                    continue;
                }
                int m = Integer.parseInt(new String(ca));
                result = Math.min(result, m);
            }
        }
        return result;
    }		
}