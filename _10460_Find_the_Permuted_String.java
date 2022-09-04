import java.io.*;
public class _10460_Find_the_Permuted_String {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int j = Integer.parseInt(br.readLine()); j > 0; j--) {
				char N[]=br.readLine().toCharArray();
				int n=N.length,F[]= new int[n],I=Integer.parseInt(br.readLine());F[n-1]=1;
				for (int i = n-2; i >=0; i--)F[i]=(int)Math.min((long)(F[i+1])*(i+2),Integer.MAX_VALUE);
				StringBuilder r=new StringBuilder();
				for (int i1=0,li=1,Ii; i1 < n; i1++){
					Ii=(int)((double)(I-li)/(double)F[i1]);li+=Ii*F[i1];
					r=new StringBuilder(r.substring(0,Ii)+N[i1]+
							r.substring(Ii,i1));
				}pw.println(r);
		}
		pw.close();
	}
}
/*
9
ACB
2
ABC
1
ABC
6
ABCD
12
A
1
AB
1
ABCDEFGHIJKLMNOPQRSTUVWXYZ
2147483647
ABCDEFGHIJKLMNOPQRSTUVWXYZ
2147483646
ABCDEFGHIJKLMNOPQRSTUVWXYZ
3


*/