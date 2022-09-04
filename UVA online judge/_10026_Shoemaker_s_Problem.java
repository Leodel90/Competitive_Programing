import java.io.*;
import java.util.StringTokenizer;
public class _10026_Shoemaker_s_Problem  {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw =  new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringBuilder A = new StringBuilder();
		for (int l = Integer.parseInt(br.readLine()),xd=0; xd < l; xd++){
			br.readLine();
			int n=Integer.parseInt(br.readLine());
			int T[]= new int[n+1],S[]= new int[n+1],N[]=new int[n+1];
			for (int i = 1,j; i <=n; i++){
				StringTokenizer tk = new StringTokenizer(br.readLine());j=i;
				T[i]=Integer.parseInt(tk.nextToken());S[i]=Integer.parseInt(tk.nextToken());N[i]=i;
				while(j>0){
					if(T[N[j]]*S[N[j-1]]<T[N[j-1]]*S[N[j]]){
						N[0]=N[j-1];N[j-1]=N[j];N[j]=N[0];j--;
					}else break;
				}
			}
			if(xd>0)pw.println();
			for (int i = 1; i <n; i++)pw.print(N[i]+" ");
			pw.println(N[n]);
		}
		pw.close();
	}
}

/*
3

4
3 4
1 1000
2 2
5 5

3
4 4
4 4
4 4

3
1000 10
5 4
4 3
*/