import java.util.*;
public class _00414_Machined_Surfaces {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
        	int n = leer.nextInt();
        	if(n==0)break;
        	leer.nextLine();
        	int r = 0;
        	int m=0;
        	for (int i = 0; i < n; i++){
				String h= leer.nextLine();
				int c=0;
				for (int j = 0; j <25; j++){
					if(h.charAt(j)=='X')c++;
				}
			    if(c>m){
			    	r+=(c-m)*(i);
			    	m=c;
			    }else r+=m-c;
        	}
        	System.out.println(r);
        }
	}
}
/*
5
XXXX                XXXXX
XXX               XXXXXXX
XXXXX                XXXX
XX                 XXXXXX
XXXXXXXXXXXXXXXXXXXXXXXXX
2
XXXXXXXXXXXXXXXXXXXXXXXXX
XXXXXXXXXXXXXXXXXXXXXXXXX
1
XXXXXXXXX              XX
2
X XXXXXXXXXXXXXXXXXXXXXXX
XXXXXXXXXXXXXXXXXXXXXXXXX
2
XXXXXXXXXXXXXXXXXXXXXXXXX
X XXXXXXXXXXXXXXXXXXXXXXX
0
*/