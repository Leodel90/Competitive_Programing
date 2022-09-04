import java.io.*;
public class _10177_2_3_4_D_Sqr_Rects_Cubes_Boxes{
	public static void main(String[] args){
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		long S[][]= new long [3][101];
		long R[][]= new long [3][101];
		for (int i = 1; i <=100; i++){long n=(i*(i+1))>>1,s=n;
			for (int j = 0,c=i; j < 3; j++){
				c=c*i;S[j][i]=S[j][i-1]+c;s=s*n;
				R[j][i]=s-S[j][i];
			}
		}
		try{
			while(true){int n= Integer.parseInt(br.readLine());
			//if(n==0)break;
			for (int i = 0; i < 2; i++) {
				pw.print(S[i][n]+" "+R[i][n]+" ");				
			}pw.println(S[2][n]+" "+R[2][n]);
			}
		}catch(Exception e){}
		pw.close();
	}
}
