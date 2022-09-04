import java.util.*;
public class _10264_The_Most_Potent_Corner{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int P2[]= new int [15];
		for (int i = 0,k=1; i < 15; i++){
			P2[i]=k;k=k<<1;
		}
        try{while(true){
        		int n = leer.nextInt();
        		int L=1<<n;
        		int W[]= new int [L];
        		int P[]= new int [L];
        		int max=0;
        		for (int i = 0; i < L; i++)
					W[i]=leer.nextInt();
	        	for (int i = 0; i < L; i++){
					int h=i,k,m=-1;
					for (int j = 0; j < n; j++){
						if(h%2==1){k=i-P2[j];if(P[k]>m)m=P[k];}
						else k=i+P2[j];
						h=h>>1;
						P[i]+=W[k];
					}
					if(P[i]+m>max)max=P[i]+m;
				}
	        	System.out.println(max);
        	}
        }catch(Exception e){}	
        }
}
/*
3
82
73
8
49
120
44
242
58
2
1
1
1
1

*/