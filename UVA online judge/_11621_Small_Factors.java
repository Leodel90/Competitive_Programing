import java.io.*;
public class _11621_Small_Factors {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		long C23[][]= new long[32][22],h=0,p2=1,p3;
		for (int i = 0; i < 32; i++,p2=p2<<1){p3=1;
			for (int j = 0; j<21; j++,p3*=3){
				h=p2*p3;
				if(h<=(long)Integer.MAX_VALUE+1){C23[i][j]=h;C23[i][21]++;}
				else break;
			}
		}
		while(true){
			long m  = Long.parseLong(br.readLine()),n=Long.MAX_VALUE;
			if(m==0)break;
			for (int i = 0,li,ls,l; i < 32; i++){
				li=0;ls=(int)C23[i][21]-1;
				while(li<ls){
					l=(li+ls)/2;
					if(C23[i][l]<m)li=l+1;
					else ls=l;
				}l=(li+ls)/2;
				if(C23[i][l]>=m&&C23[i][l]-m<n-m)n=C23[i][l];
			}
			pw.println(n);
		}
		pw.close();
	}
}
/*
100
108
1000
3000
1
2147483648
0


*/