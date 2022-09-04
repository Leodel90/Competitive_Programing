import java.io.*;
import java.util.*;
public class _00331_Mapping_the_Swaps{
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer tk;
		int xd=1;
		while(true){
			tk= new StringTokenizer(br.readLine());
			int n=Integer.parseInt(tk.nextToken());
			if(n==0)break;
			int N[]= new int[n];
			for (int i = 0; i < n; i++)N[i]=Integer.parseInt(tk.nextToken()); 
			LinkedList<Integer> Pi= new LinkedList<Integer>();
			int c=0,i=0,Pq=0,qq=0,aux;
			boolean q=true;
			while(true){
				if(q){q=i+1<n;
					while(q){
						if(N[i]>N[i+1]){Pq=Pq|(1<<qq);aux=N[i];N[i]=N[i+1];N[i+1]=aux;
							Pi.add(i);i=0;qq++;break;
						}i++;
						q=i+1<n;
					}
				}else{
					if((Pq&(1<<qq))==0&&qq>0)c++;
					Pq=Pq&~(1<<qq);
					if(qq==0)break;
					i=Pi.removeLast();
					aux=N[i];N[i]=N[i+1];N[i+1]=aux;
					i++;q=true;qq--;
				}
			}
			pw.println("There are "+c+" swap maps for input data set "+xd+".");xd++;
		}
		pw.close();
	}
}
/*
2 9 7
2 12 50
3 3 2 1
3 9 1 5
0

*/