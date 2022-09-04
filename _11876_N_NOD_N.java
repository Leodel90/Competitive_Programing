import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _11876_N_NOD_N {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int P[]= new int[100000],p=0,NOD[]= new int[1000001];
		boolean V[]= new boolean[1000001];
		for (int i = 2; i <=1000000; i++){
			if(!V[i]){P[p]=i;p++;
				for (int j = i+i; j <=1000000; j=j+i)V[j]=true;
			}
		}NOD[1]=1;
		for (int i = 0; i < p; i++){
			LinkedList<Integer> L1= new LinkedList<Integer>(),L2= new LinkedList<Integer>(),
					L3= new LinkedList<Integer>(), L4= new LinkedList<Integer>();
			L1.add(P[i]);L2.add(2);L3.add(2);L4.add(i);
			while(!L1.isEmpty()){
				int  n=L1.removeFirst(),nd=L2.removeFirst(),pp=L3.removeFirst(),pi=L4.removeFirst();NOD[n]=nd;
				if((long)P[pi]*n<=1000000){L1.add(P[pi]*n);L2.add(nd+(nd/pp));L3.add(pp+1);L4.add(pi);
					for (int j = pi+1; j <p; j++){
						if(P[j]*n<=1000000){L1.add(P[j]*n);L2.add(nd<<1);L3.add(2);L4.add(j);}else break;
					}
				}
			}
		}
		for (int i = 1,n=1; i <=1000000; i++){
			if(i==n){n=n+NOD[n];NOD[i]=1;}else NOD[i]=0;
			NOD[i]+=NOD[i-1];
		}
		for (int i=1,t=Integer.parseInt(br.readLine()); i <=t; i++) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			pw.print("Case "+i+": ");
			pw.println(-NOD[Integer.parseInt(tk.nextToken())-1]+NOD[Integer.parseInt(tk.nextToken())]);
		}
		
		pw.close();
	}
}

/*
3
1 18
1 100
3000 4000

*/