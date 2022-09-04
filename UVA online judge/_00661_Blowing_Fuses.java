import java.util.*;
public class _00661_Blowing_Fuses {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
	    int s=1;
		while(leer.hasNext()){
		int n= leer.nextInt();
	    int m = leer.nextInt();
	    int c = leer.nextInt();
	    if(n+m+c>0){
	    	int C[]= new int[n+1];
	    	for (int i = 1; i <=n; i++)
				C[i]= leer.nextInt();
	    	int r=0,max=0;
	    	boolean V[]= new boolean[n+1];
	    	boolean d=true;
			for (int i = 0; i < m; i++){
				int j= leer.nextInt();
				if(V[j])r-=C[j];
				else r+=C[j];
				V[j]=!V[j];
				if(r>c)d=false;
				else{
					if(r>max)max=r;
				}
			}
			System.out.println("Sequence "+s);
			if(d){System.out.println("Fuse was not blown.");
			System.out.println("Maximal power consumption was "+max+" amperes.");}
			else System.out.println("Fuse was blown.");
			System.out.println();
	    s++;
	    }
	    }
	}
}

