import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00129_Kripton_Factor {
	public static void main(String[] args) throws IOException{
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
             char letras[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',};
             while(true){StringTokenizer tk = new StringTokenizer(br.readLine());
                  int n = Integer.parseInt(tk.nextToken());
                  int L = Integer.parseInt(tk.nextToken());
                  if(L==0)break;
                  int i = 0,p=0,pi1,pi2;
                  LinkedList<Integer> PI= new LinkedList<Integer>();
                  char C[]= new char[80];
                  while(i<L){
                	  while(i<L){C[p]=letras[i];
                	    boolean q =true;
                	    pi1=p-1;pi2=p;
                	    while(pi1>=((p+1)&1)&&q){q=false;
                	    	for (int j = pi1,k=pi2; k<=p&&!q; j++,k++)q=C[j]!=C[k];
							pi2--;pi1=pi1-2;
                	    }
                	    if(q){PI.add(i);p++;n--;i=0;break;}i++;
                	  }
                	  if(n==0){n=p;break;}
                	  while(i==L&&p>0||p==80){i=PI.removeLast()+1;p--;}
                  }
                  pw.print(C[0]);
                  for (int j = 1; j < n; j++){
					 if((j&3)==0){
						 if(j==64)pw.println();
						 else pw.print(" ");
					 }
					 pw.print(C[j]);
				  }
                  pw.println();
                  pw.println(n);
             }pw.close();
	}
}

/*
30 3
7 3
1000000 26
100000 26
0 0

*/