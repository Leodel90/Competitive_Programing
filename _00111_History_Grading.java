import java.io.*;
import java.util.StringTokenizer;
public class _00111_History_Grading {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		String h=br.readLine();
		while(h.length()>0){
			int n =Integer.parseInt(h);
			int N[]= new int[n+1];
			StringTokenizer tk = new StringTokenizer(br.readLine());
			for (int i = 1; i <=n; i++)N[i]=Integer.parseInt(tk.nextToken());
			try{
				while(true){int max=0;
					h=br.readLine();
					tk = new StringTokenizer(h);
					if(tk.countTokens()<=1)break;
					int NS[]= new int[n+1],S[]=new int[n+1];
					for (int i = 1; i <=n; i++)NS[Integer.parseInt(tk.nextToken())]=i;
					for (int i = 1; i <=n;i++){
						for (int j = i-1; j >=1; j--){
							if(N[NS[j]]<N[NS[i]]&&S[j]>S[i])S[i]=S[j];
						}S[i]++;
						max=Math.max(S[i], max);
					}	 	
					pw.println(max);
				}
			}catch(Exception e){h="";}
		}
		pw.close();
	}
}
/*
4
4 2 3 1
1 3 2 4
3 2 1 4
2 3 4 1
10
3 1 2 4 9 5 10 6 8 7
1 2 3 4 5 6 7 8 9 10
4 7 2 3 10 6 9 1 5 8
3 1 2 4 9 5 10 6 8 7
2 10 1 3 8 4 9 5 7 6



*/