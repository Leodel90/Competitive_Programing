import java.util.*;
public class _12247_Jollo {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(leer.hasNext()){
        	int L[]= new int[3];
        	L[0]=leer.nextInt();
        	L[1]=leer.nextInt();
        	L[2]=leer.nextInt();
        	Arrays.sort(L);
        	int P[]= new int[2];
        	P[0]= leer.nextInt();
        	P[1]= leer.nextInt();
        	Arrays.sort(P);
        	if(L[0]!=0 || L[1]!=0 || L[2]!=0 || P[0]!=0 || P[1]!=0 ){
        	boolean V[]= new boolean [53];
        	V[L[0]]=true;V[L[1]]=true;V[L[2]]=true;V[P[0]]=true;V[P[1]]=true;
        	int p=-1;
        	int v=-1;
        	if(P[0]<L[2]){
        	if(P[0]<L[1]){
        		if(P[1]>L[2])p=L[2];
        	}else p=L[1];
        	}else p=1;
        	if(p>=1){
        	while(p<=52&&V[p])
        		p++;
        	if(p<=52)v=p;
        	}
        	System.out.println(v);
        	}else break;	
        }
	}
}
