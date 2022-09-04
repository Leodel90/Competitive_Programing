import java.util.*;
public class _11742_Social_Constraints{
	static int n,m,c,M[][],P[],x;
	static boolean V[];
	public static void permutacion(){
		if(n==x){boolean q=true;
		for (int i = 0; i < m&&q; i++){
		    	int d=Math.abs(P[M[i][0]]-P[M[i][1]]);
				q=M[i][2]>0&&d<=M[i][2]||M[i][2]<0&&d>=-M[i][2];
			}
		    if(q)c++;
		    return;
		}
		for (int i = 0; i < n; i++){
			if(!V[i]){V[i]=true;
				P[i]=x;
				x++;
				permutacion();
				x--;
				V[i]=false;
			}
		}
	}
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		while(true){
        n = leer.nextInt();
        m = leer.nextInt();
        if(n==0)break;
        M= new int [m][3];
        for (int i = 0; i < m; i++){M[i][0]= leer.nextInt();M[i][1]= leer.nextInt();M[i][2]= leer.nextInt();}
        c=0;P= new int [n];x=0;
        V= new boolean[n];
        permutacion();
        System.out.println(c);
        }
	}
}
/*
3 1
0 1 -2
3 0
4 3
0 1 1 
2 3 2 
0 2 -1 
0 0
*/
