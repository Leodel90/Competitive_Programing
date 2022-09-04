import java.util.*;
public class _10158_War{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int P[] = new int [n];
        int R[]= new int[n];
        int E []= new int[n];
        int X[]= new int[2];
        while(true){
        	int c = leer.nextInt();
        	X[0]= leer.nextInt();X[1]= leer.nextInt();
        	if(c+X[0]+X[1]==0)break;
        	LinkedList<Integer> L[]= new LinkedList[2];
        	for (int i = 0; i < 2; i++){
				L[i]= new LinkedList<Integer>();
				while(P[X[i]]!=0){L[i].add(X[i]);X[i]=P[X[i]]-1;}
			}
        	if(c==1){
        		if(X[0]!=X[1]){
        			if(X[0]!=E[X[1]]-1){
        				int n1=E[X[0]]-1,n2=E[X[1]]-1,np;
        				if(R[X[0]]>=R[X[1]]){
        					P[X[1]]=X[0]+1;np=0;
        					if(R[X[1]]==R[X[0]])R[X[0]]++;
        					if(n2>-1&&n1==-1){E[X[0]]=n2+1;E[n2]=X[0]+1;}
        				}else{P[X[0]]=X[1]+1;np=1;if(n1>-1&&n2==-1){E[X[1]]=n1+1;E[n1]=X[1]+1;}}
        					if(n1>-1&&n2>-1){
        						if(R[n1]>=R[n2]){
        							P[n2]=n1+1;E[n1]=X[np]+1;E[X[np]]=n1+1;
        							if(R[n1]==R[n2])R[n1]++;
        						}else{P[n1]=n2+1;E[n2]=X[np]+1;E[X[np]]=n2+1;}
        					}
        					X[0]=X[np];X[1]=X[np];
        				}else System.out.println(-1);
        		}
        	}
        	if(c==2){
        		if(X[0]!=X[1]){
        			if(E[X[0]]-1!=X[1]){int n1=E[X[0]]-1,n2=E[X[1]]-1,np1=X[0],np2=X[1];
        			        if(n1>-1){
        			        	if(R[X[1]]>=R[n1]){
        			        		P[n1]=X[1]+1;
        			        		if(R[X[1]]==R[n1])R[X[1]]++;
        			        	}else{P[X[1]]=n1+1;np2=n1;}
        			        }
        			        if(n2>-1){
        			        	if(R[X[0]]>=R[n2]){
        			        		P[n2]=X[0]+1;
        			        		if(R[X[0]]==R[n2])R[X[0]]++;
        			        	}else{P[X[0]]=n2+1;np1=n2;}
        			        }
        			        E[np2]=np1+1;
        			        E[np1]=np2+1;
        			        X[0]=np1;X[1]=np2;
        			}
        		}else System.out.println(-1);
        	}
        	if(c>=3){
        		if(X[0]==X[1]&&c==3||E[X[0]]-1==X[1]&&c==4)System.out.println(1);
        		else System.out.println(0);
        	}
        	for (int i = 0; i < 2; i++){
				while(!L[i].isEmpty())P[L[i].remove()]=X[i]+1;
			}
        }
	}
}

/*
10
1 0 1
1 1 2
2 0 5
3 0 2
3 8 9
4 1 5
4 1 2
4 8 9
1 8 9
1 5 2
3 5 2
0 0 0

20
1 0 1
1 2 3
2 1 4
2 2 5
1 4 5
3 1 2
1 8 9
1 6 8
1 7 9
1 6 4
4 7 3
2 10 11
2 11 5
3 3 11
3 10 6
4 0 10
  
*/