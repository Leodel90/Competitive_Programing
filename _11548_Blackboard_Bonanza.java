import java.io.*;
public class _11548_Blackboard_Bonanza {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int t = Integer.parseInt(br.readLine()); t >0; t--){
			int n = Integer.parseInt(br.readLine());
			char N[][]= new char [n][];
			for (int i = 0; i < N.length; i++)N[i]=br.readLine().toCharArray();
			int max=0;
			for (int i = 0; i < n; i++){
				for (int j = i+1; j < n; j++){
					for (int i1=0,c,e=1,min=Math.min(N[i].length,N[j].length),l=Math.min(max+1, min),i2=N[j].length-l;
							l>max; i2=Math.max(i2-1, 0),l+=e){c=0;
						for (int j1 = i1,j2=i2,cc=l; cc>0; cc--,j1++,j2++){if(N[i][j1]==N[j][j2])c++;}
						max=Math.max(max, c);
						if(l==min)e=0;
						if(i2==0){
							if(i1+min==N[i].length)e=-1;
							i1++;
						}
					}
				}
			}
			pw.println(max);
		}
		pw.close();
	}
}
/*
4
2
ALICE
BOB
2
ABCB
BCAB
7
A
B
C
TQWRARB
E
A
QMRRR
7
A
B
C
RRR
E
A
TQWRARB
*/