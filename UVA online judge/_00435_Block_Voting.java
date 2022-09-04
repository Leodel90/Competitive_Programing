import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00435_Block_Voting {
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
    int t=Integer.parseInt(br.readLine());
    StringTokenizer tk;
    for (int xd = 0; xd < t;xd++){
    	tk= new StringTokenizer(br.readLine());
    	int p=Integer.parseInt(tk.nextToken());
    	int P[]= new int[p],DP[]=new int [p];
    	double m=0;
    	for (int i = 0,j,aux; i < p; i++){P[i]=Integer.parseInt(tk.nextToken());j=i;DP[i]=i;m=m+P[i];
    	  	while(j>0){
    	  		if(P[j]<P[j-1]){aux=P[j];P[j]=P[j-1];P[j-1]=aux;aux=DP[j];DP[j]=DP[j-1];DP[j-1]=aux;j--;
    	  		}else j=0;
    	  	}
    	}m=m/2.0;
		LinkedList<Integer> PI= new LinkedList<Integer>();
		LinkedList<Integer> PS= new LinkedList<Integer>();
		int v=0,R[]= new int[p],i=0,s=0;
		boolean q=true,qq=true;
		while(true){
			if(q){
				if(qq){
					for (int k=p-1,j=1<<k; k >=0; j=j>>1,k--){
						if(s+P[k]>m){
							if((v&j)==0){
								R[DP[k]]++;}
						}else break;
					}
				}q=i<p;
				while(q){
					if(s+P[i]<=m){
						if((v&(1<<i))==0){v=v|(1<<i);PS.add(s);PI.add(i);s+=P[i];i++;qq=true;break;
						}
						i++;
					}else i=p+1;
					q=i<p;
				}
			}else{
				if(!PI.isEmpty()){
				  i=PI.removeLast();s=PS.removeLast();v=v&~(1<<i);
				  i++;qq=false;q=true;
				}else break;
			}
		}
		for (int j = 1; j <=p; j++)pw.println("party "+j+" has power index "+R[j-1]);
		pw.println();
	}pw.close();
	}
}

/*
3
5 7 4 2 6 6
6 12 9 7 3 1 1
3 2 1 1


*/