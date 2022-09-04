import java.util.*;
public class _10258_Contest_Scoreboard {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        leer.nextLine();
        leer.nextLine();
        for (int xd = 0; xd < t; xd++){
        	int P[]= new int [101];
        	boolean V[]= new boolean [101];
        	int T[]= new int[101];
        	int TP[][]= new int [101][10];
        	LinkedList<Integer> L =new LinkedList<Integer>();
        	try{
			while(true){
        	  String H= leer.nextLine();
			  if(H.length()==0)break;
			  int c=0,j=0;
			  while(H.charAt(j)!=' '){
				  c=c*10+(H.charAt(j)-48);j++;
			  }j++;
			  int p = H.charAt(j)-48,tp=0;;j=j+2;
			  while(H.charAt(j)!=' '){
				  tp=tp*10+H.charAt(j)-48;j++;
			  }j++;
			  char v=H.charAt(j);
			  if(!V[c])L.add(c);
			  V[c]=true;
			  if(TP[c][p]>-1&&(v=='I'||v=='C')){
				  if(v=='C'){
					  T[c]+=tp+TP[c][p];
					  TP[c][p]=-1;
					  P[c]++;
				  }else TP[c][p]+=20;
			  }
			}
			}catch(Exception e){}
        	
        	int R[]= new int [L.size()]; 
        	for (int i = 0; i < R.length; i++){
				R[i]=L.remove();
				int h = i;
				while(h>0){
					boolean q=P[R[h]]>P[R[h-1]]||P[R[h]]==P[R[h-1]]&&(T[R[h]]<T[R[h-1]]||T[R[h]]==T[R[h-1]]&&R[h]<R[h-1]);
					if(q){int aux=R[h];R[h]=R[h-1];R[h-1]=aux;h--;}else break;
				}
			}
        	if(xd>0)System.out.println();
        	for (int i = 0; i < R.length; i++) {
			System.out.println(R[i]+" "+P[R[i]]+" "+T[R[i]]);	
			}
		}
	}
}
/*
1

1 2 10 I
3 1 11 C
1 2 19 R
1 2 21 C
1 1 25 C

*/