import java.io.*;
import java.util.StringTokenizer;
public class _12190_Electric_Bill {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		long W[]={0,100,10000,1000000,1000000000},C[]={0,2,3,5,7};
		while(true){
			StringTokenizer tk =new StringTokenizer(br.readLine());
			long A = Long.parseLong(tk.nextToken()),B = Long.parseLong(tk.nextToken());
			if(A==0)break;
			long ls=0,li=0;
			for (int i = 1; i < 5; i++){
				if(A>=(W[i]-W[i-1])*C[i]){ls+=W[i]-W[i-1];A=A-(W[i]-W[i-1])*C[i];}
				else {ls+=A/C[i];break;}
			}A=ls;
			while(li<ls){
				long r=(li+ls)>>1,bill1=0,bill2=0;
				for (int i = 1; i < 5; i++){
					if(r<W[i]){bill1=bill1+(r-W[i-1])*C[i];break;}
					else bill1+=(W[i]-W[i-1])*C[i];
				}
				for (int i = 1; i < 5; i++){
					if(A-r<W[i]){bill2=bill2+((A-r)-W[i-1])*C[i];break;}
					else bill2+=(W[i]-W[i-1])*C[i];
				}
				if(bill2-bill1<=B)ls=r;else li=r+1;
			}
			long bill1=0;
			for (int i = 1; i < 5; i++){
				if(li<W[i]){bill1=bill1+(li-W[i-1])*C[i];break;}
				else bill1+=(W[i]-W[i-1])*C[i];
			}
			pw.println(bill1);
		}
		pw.close();
	}
}

/*
1100 300
35515 27615
0 0

*/