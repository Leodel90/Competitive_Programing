import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class _11057_Exact_Sum {
	public static void main(String[] args) {
		PrintWriter pw= new PrintWriter(new BufferedWriter( new OutputStreamWriter(System.out)));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			while(true){
				int nb = Integer.parseInt(br.readLine());
				StringTokenizer tk = new StringTokenizer(br.readLine());
				int P[]= new int[nb];
				for (int i = 0; i < nb; i++)P[i]=Integer.parseInt(tk.nextToken());
				int M=Integer.parseInt(br.readLine()),b1=0,b2=1000000;
				br.readLine();Arrays.sort(P);
				for (int i = 0; i < nb-1; i++){
					if(P[i]<=M>>1){
						int li=i+1,ls=nb-1;
						while(li<ls){int m=(li+ls)>>1;
							if(P[i]+P[m]>=M)ls=m;else li=m+1;
						}if(P[i]+P[li]==M){b1=i;b2=li;}
					}else break;
				}
				pw.println("Peter should buy books whose prices are "+P[b1]+" and "+P[b2]+".");
				pw.println();
			}
		}catch(Exception e){}
		pw.close();
	}
}


/*
2
40 40
80

5
10 2 6 8 4
10

*/