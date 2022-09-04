import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _10506_The_Ouroboros_Problem{
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		try{
			while(true){
				StringTokenizer tk = new StringTokenizer(br.readLine());
				int m=Integer.parseInt(tk.nextToken()),n=Integer.parseInt(tk.nextToken());
				if(n>1){
					LinkedList<Integer> L= new LinkedList<Integer>();
					int nm=(int)Math.pow(n, m),nm1=nm/n,V[]= new int[nm1];
					double nm2=nm1/(double)n;
					StringBuilder sb= new StringBuilder();
					for (int i = 1,s=0,p=(int)nm2; i < m; i++,p/=n){sb.append("0");L.add(0);s+=(n-1)*p;V[s]++;}
					for (int i = m-1,p=0,c; i < nm; i++){
						sb.append(V[p]);L.add(V[p]);c=V[p];V[p]++;
						p=(int)((p-L.remove()*nm2)*n+c);
					}
					pw.println(sb);
				}else pw.println(0);
			}
		}catch(Exception e){}
			pw.close();
	}
}

