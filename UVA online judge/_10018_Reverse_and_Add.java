import java.util.*;
public class _10018_Reverse_and_Add {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
			long p = leer.nextLong();
			int s =0;
			boolean q = false;
		    while(!q){
		        String C = p+"";q=true;
		        for (int j = 0; j < C.length()>>1&&q; j++)
					q=C.charAt(j)==C.charAt(C.length()-j-1);
		        if(!q){
		        	long h=p,c=0;
		        	while(h>0){
		        		c=c*10+(h%10);h=h/10;
		        	}p+=c;
		        s++;	
		        }
		    }
		    System.out.println(s+" "+p);
		}
	}
}
