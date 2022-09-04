import java.io.*;
import java.util.StringTokenizer;
public class _11959_Dice {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int t=Integer.parseInt(br.readLine()); t >0; t--){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			String d=tk.nextToken();int D2= Integer.parseInt(tk.nextToken());
			boolean q =true;
			int L[][]= new int[3][4],D[][]=new int [3][2];
			D[0][0]=d.charAt(0)-48;D[0][1]=d.charAt(1)-48;
			D[1][0]=d.charAt(2)-48;D[1][1]=d.charAt(4)-48;
			D[2][0]=d.charAt(3)-48;D[2][1]=d.charAt(5)-48;
			for (int i = 2; i < 6; i++)L[0][i-2]=d.charAt(i)-48;
			L[1][0]=d.charAt(1)-48;L[1][1]=d.charAt(3)-48;L[1][2]=d.charAt(0)-48;L[1][3]=d.charAt(5)-48;
			L[2][0]=d.charAt(2)-48;L[2][1]=d.charAt(1)-48;L[2][2]=d.charAt(4)-48;L[2][3]=d.charAt(0)-48;
			for (int i = 0; i < 3&&q; i++){
				for (int j = 0,c,s; j < 2&&q; j++){
					c=L[i][0];L[i][0]=L[i][2];L[i][2]=c;
					c=(D[i][1-j]*10+D[i][j])*10000;s=0;
					for (int k = 3,p=1; k >=0; k--,p*=10)s+=L[i][k]*p;
					for (int k = 0; k < 4&&q; k++){
						q=c+s!=D2;s=(s%1000)*10+s/1000;
					}
				}
			}
			if(q)pw.println("Not Equal");
			else pw.println("Equal");
		}
		pw.close();
	}
}
/*
3
345678 345678
123123 123456
123456 351624

*/