import java.io.*;
import java.util.StringTokenizer;
public class _00147_Dollars {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		long V[][]= new long [30001][12];
		int C[]={0,5,10,20,50,100,200,500,1000,2000,5000,10000};
		for (int i = 1; i <=11; i++)V[0][i]=1;
		for (int i = 5; i <=30000; i=i+5){
			for (int j = 1; j<=11; j++){
				V[i][j]=V[i][j-1];
				if(i>=C[j])V[i][j]+=V[i-C[j]][j];
			}
		}
		while(true){
			String n=new StringTokenizer(br.readLine()).nextToken();
			double rr=Double.parseDouble(n)*1000;int r=((int)rr)/10;
			if(((int)rr)%10!=0)r++;
			if(r==0)break;
			for (int i = 0; i < 6-n.length();i++)pw.print(" ");
			pw.print(n);
			for (int i = 0; i < 17-(V[r][11]+"").length();i++)pw.print(" ");
			pw.println(V[r][11]);
		}
		pw.close();
	}
}
/*
0.20
	2.00
0.00
*/