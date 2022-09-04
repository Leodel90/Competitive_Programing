import java.util.*;
public class _00467_Synching_Signals {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        try{
        	int t=1;
		while(true){
        	String cad = leer.nextLine()+" ";
        	LinkedList<Integer> L= new LinkedList<Integer>();
        	int r=0;
        	for (int i = 0; i < cad.length(); i++){
				if(cad.charAt(i)==' '){
					if(r!=0){
						L.add(r);r=0;
					}
				}else{
					r=r*10+(cad.charAt(i)-48);
				}
			}
        	int C[]= new int [L.size()];
        	int T[]= new int [L.size()];
        	int p=0,m=0;
        	while(!L.isEmpty()){
        		C[p]=L.remove();
        		T[p]=0;
        		if(C[p]<C[m])m=p;
        		p++;
        	}
        	boolean q = false;
        	int M=m;
        	while(!q){
        		T[m]+=C[m]<<1;
        		if(T[M]>3600)break;
        		q=true;
        		for (int i = 0; i < T.length; i++){
					for (int j = i+1; j < T.length&&q; j++)
						q=T[i]<=T[j]&&T[j]<=T[i]+C[i]-6||T[i]<=T[j]+C[j]-6&&T[j]+C[j]-6<=T[i]+C[i]-6||T[j]<=T[i]&&T[i]<=T[j]+C[j]-6;
					if(T[i]+C[i]<T[m]+C[m])m=i;
					if(T[i]>T[M])M=i;
				}
        	}
        	if(q){
        		int mm = T[M]/60;
        		int ss = T[M]%60;
        		System.out.println("Set "+t+" synchs again at "+mm+" minute(s) and "+ss+" second(s) after all turning green.");
        	}else System.out.println("Set "+t+" is unable to synch after one hour.");
        t++;
		}
		}catch(Exception e){}
	}
}

/*
30 25 35
25 25 25 25 25
15 30
20 21  30 23 29 25 27 22
19 20
60 75 69 78 31 89 74 72
30 40
10 40

*/