import java.io.*;
import java.util.StringTokenizer;
public class _11413_Fill_the_Containers{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		try{
			while(true){
				StringTokenizer tk = new StringTokenizer(br.readLine());
				int n= Integer.parseInt(tk.nextToken()),m= Integer.parseInt(tk.nextToken());
				int V[]= new int[n],max=-1;
				int li=0,ls=0,ant=-1;
				tk = new StringTokenizer(br.readLine());
				for (int i = 0; i < n; ls+=V[i],i++)V[i]=Integer.parseInt(tk.nextToken());
				while(li<=ls && ant!=0){
					int  prom=(li+ls)/2;
					int cm=0,cn=0,s;max=-1;
					while(cm<m&&cn<n){s=0;
						while(cn<n&&s+V[cn]<=prom){s+=V[cn];cn++;}cm++;
						if(s>max)max=s;
					}
					ant = ls-li;
					if(cn<n)li=prom+1;
					else ls=prom;
				}
				pw.println(max);
			}
		}catch(Exception e){}
		pw.close();
	}
}
/*
5 3
1 2 3 4 5
3 2
4 78 9

*/