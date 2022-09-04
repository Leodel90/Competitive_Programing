import java.io.*;
import java.util.TreeMap;
public class _01262_Password {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		TreeMap<Integer,Character> P2= new TreeMap<>();
		for (int i = 0; i < 26; i++)P2.put(1<<i, (char)(i+65));
		for (int t=Integer.parseInt(br.readLine()); t >0; t--){
			int k=Integer.parseInt(br.readLine());
			int G[][]=new int [2][5];G[1]= new int[6];
			for (int i = 0; i < 2; i++){
				for (int j1 = 0; j1 < 6; j1++){
					char C[]=br.readLine().toCharArray();
					for (int j = 0; j < 5; j++)G[i][j]|=1<<(C[j]-65);
				}
			}
			char C[][]= new char[5][6];G[1][5]=1;
			for (int i = 4,aux1,aux2; i >=0; i--){
				G[0][i]&=G[1][i];aux1=G[0][i];G[1][i]=0;
				while(aux1!=0){aux2=aux1&(~aux1+1);
					C[i][G[1][i]]=P2.get(aux2);
					G[1][i]++;aux1&=~aux2;
				}G[1][i]*=G[1][i+1];
			}
			if(k<=G[1][0]){StringBuilder sb= new StringBuilder();
				for (int i = 0,li=1,x; i < 5; i++){
					x=(int)((double)(k-li)/(double)G[1][i+1]);li+=x*G[1][i+1];
					sb.append(C[i][x]);
				}
				pw.println(sb);
			}else pw.println("NO");
		}
		pw.close();
	}
}
/*
3
1
AYGSU
DOMRA
CPFAS
XBODG
WDYPK
PRXWO
CBOPT
DOSBG
GTRAR
APMMS
WSXNU
EFGHI
5
AYGSU
DOMRA
CPFAS
XBODG
WDYPK
PRXWO
CBOPT
DOSBG
GTRAR
APMMS
WSXNU
EFGHI
64
FGHIJ
EFGHI
DEFGH
CDEFG
BCDEF
ABCDE
WBXDY
UWYXZ
XXZFG
YYFYH
EZWZI
ZGHIJ

1
1
WBXDY
UWYXZ
XXZFG
YYFYH
EZWZI
ZGHIJ
WBXDY
UWYXZ
XXZFG
YYFYH
EZWZI
ZGHIJ

*/