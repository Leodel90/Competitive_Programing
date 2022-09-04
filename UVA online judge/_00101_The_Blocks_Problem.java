import java.util.*;
public class _00101_The_Blocks_Problem {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		int n = leer.nextInt();
		int P[]= new int [n];
		int C[][]= new int [n][n]; 
		int A[]= new int [n];
		for (int i = 0; i < n; i++){
			P[i]=i;
			C[i][0]=i;
			A[i]=1;
		}
		while(true){
			String c=leer.next();
			if(c.charAt(0)!='q'){
			   int a = leer.nextInt();
			   String t= leer.next();
			   int b = leer.nextInt();
			   if(a!=b&&P[a]!=P[b]){
				 boolean as=c.charAt(0)=='m';
				 boolean bs=t.charAt(1)=='n';
				 int x =0,y=0;
				 for (int i = 0; i < A[P[a]]; i++){
					if(C[P[a]][i]==a){x=i;break;}
				 }
				 for (int i = 0; i < A[P[b]]; i++){
					if(C[P[b]][i]==b){y=i;break;}
				 }
				 if(bs){
					   for (int i = y+1; i < A[P[b]]; i++){
						 P[C[P[b]][i]]=C[P[b]][i];A[C[P[b]][i]]=1;C[C[P[b]][i]][0]=C[P[b]][i];
					   }
					   A[P[b]]=y+1;
				  }
				 if(as){
				   for(int i = x+1; i < A[P[a]]; i++){
					  P[C[P[a]][i]]=C[P[a]][i];A[C[P[a]][i]]=1;C[C[P[a]][i]][0]=C[P[a]][i];
				   }
				   A[P[a]]=x;
				   C[P[b]][A[P[b]]]=a;
				   A[P[b]]++;
				   P[a]=P[b];
				 }else{int h = P[a];
					 for (int i = x; i < A[h]; i++){
						C[P[b]][A[P[b]]]=C[h][i];A[P[b]]++;P[C[h][i]]=P[b];
					 }
					 A[h]=x;
				 }
					
               }
			}else{
				 for (int i = 0; i < n; i++) {
						System.out.print(i+":");
						if(A[i]>0){
							for (int j = 0; j < A[i]; j++) 
								System.out.print(" "+C[i][j]);
						}
						System.out.println();
					}
				break;
			}
		}
	}
}

/*
10
move 9 onto 1
move 8 over 1
move 7 over 1
move 6 over 1
pile 8 over 6
pile 8 over 5
move 2 over 1
move 4 over 9
quit
*/