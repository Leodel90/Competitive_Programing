import java.util.*;
public class _00647_Chutes_and_Ladders {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		LinkedList<Integer> D= new LinkedList<Integer>();
		while(true){
			int d = leer.nextInt();
			if(d!=0)
				D.add(d);
			else break;
		}
		while(true){int n = leer.nextInt();
		if(n>0){
        int B[]= new int[101];
        while(true){
        	int x= leer.nextInt(),y=leer.nextInt();
        	if(x+y>0)
        		B[x]=y;
        	else break;
        }
        while(true){
        	int x = leer.nextInt();
        	if(x!=0)
        		B[Math.abs(x)]=x;
        	else break;
        }
        int P[]= new int [n];int p=0,c;
        LinkedList<Integer>C= (LinkedList<Integer>)D.clone();
        while(!C.isEmpty()){
		    if(P[p]>=0){c=C.remove();
		    	P[p]+=c;
		    	if(P[p]<100){
		    		if(B[P[p]]!=0){
		    			if(Math.abs(B[P[p]])==P[p]){
		    				if(B[P[p]]==P[p])p--;
		    				else P[p]=-P[p];
		    			}else P[p]=B[P[p]];
		    		}
		    	}else {if(P[p]==100)break;else P[p]-=c;}
		    }else P[p]=-P[p];
		    p=(p+1)%n;
        
        }
        System.out.println(p+1);
		}else break;
		}
	}

}

/*
3 6 3 2 5 1 3 4 2 3 1 2 0
2 6 95 
99 1
0 0 
-3 
98
0 
2
3 99
6 90
0 0
0
0


*/