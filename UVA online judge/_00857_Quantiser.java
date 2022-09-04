import java.util.*;
public class _00857_Quantiser{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
        while(true){
        	int n = leer.nextInt();
        	if(n>=0){int C[]= new int[n];
        	        int N[]= new int [n],p=n;
        	        int M[]= new int [n];
        	        int B[]= new int [n];
        	        int T[]= new int [n];
        	        boolean V[]= new boolean[n];
        		for (int i = 0; i < n; i++){
					C[i]=leer.nextInt(); 
                    N[i]=leer.nextInt();
                    M[i]=leer.nextInt();
                    B[i]=leer.nextInt();
                    T[i]=leer.nextInt();
                    if(T[i]%60!=0){
                    	int li=T[i]-T[i]%60,ls=T[i]+60-T[i]%60;
                    	if(T[i]-li>=ls-T[i]){
                    		T[i]=ls;
                    		if(T[i]>=480){T[i]=0;B[i]++;
                    		if(B[i]>=5){B[i]=1;M[i]++;}
                    		}
                        }else T[i]=li;
                    }
                    if(C[i]==0){
                        for (int j = i-1; j >=0; j--){
                        	if(N[j]==N[i]){
							if(M[j]==M[i]&&B[j]==B[i]&&T[j]==T[i]&&C[j]==1&&!V[j]){
									p=p-2;
									V[j]=true;V[i]=true;
							}break;
							}	
						}
                     }
				}
        		System.out.println(p);
        		for (int i = 0; i < n; i++){
				if(!V[i])System.out.println(C[i]+" "+N[i]+" "+M[i]+" "+B[i]+" "+T[i]);
				}
        	}else break;
        }System.out.println(-1);
	}
}

/*
10
1 35 23 1 6
1 52 23 1 17
1 43 23 2 10
0 52 23 3 15
0 35 23 3 252
1 35 23 4 473
1 33 23 4 478
0 43 24 1 11
0 33 24 1 12
0 35 24 2 3
10
1 42 14 1 55
1 38 14 1 126
0 42 14 1 177
1 42 14 1 230
1 51 14 1 241
0 42 14 1 248
1 42 14 1 352
0 38 14 1 356
0 51 14 1 472
0 42 14 2 244
4
1 23 40 2 240
1 24 40 2 270
0 23 40 2 270
0 24 40 2 330
7
1 2 1 4 0
1 2 1 4 1
1 2 1 4 2
0 2 1 4 3
0 2 1 4 4
0 2 1 4 5
1 2 1 4 6
6
0 33 13 4 478
1 33 14 1 12
1 33 23 4 478
0 33 24 1 12
1 33 33 4 478
0 33 34 1 12	
14
0 33 13 4 478
1 33 14 1 12
1 33 23 4 478
0 33 24 1 12
1 33 33 4 478
0 33 34 1 12
1 42 14 1 15
0 42 17 1 15
1 42 19 4 450
1 42 20 1 6
1 43 19 4 450
0 43 20 1 6
0 44 19 4 450
1 44 20 1 6
-1
*/