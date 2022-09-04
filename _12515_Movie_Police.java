import java.io.*;
import java.util.StringTokenizer;
public class _12515_Movie_Police{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	    StringTokenizer tk = new StringTokenizer(br.readLine());
	    int m=Integer.parseInt(tk.nextToken()),q=Integer.parseInt(tk.nextToken());
	    char M[][]= new char[m][100];
	    int LM[]= new int[m];
	    String h;
	    for (int i = 0; i < m; i++){h=br.readLine();M[i]=h.toCharArray();LM[i]=h.length();}
	    for (int i = 0,max,si; i < q; i++){char C[]=br.readLine().toCharArray();
	       max=0;si=0;
		   for (int j = 0,lim; j < m; j++){lim=LM[j]-C.length;
			     for (int k = 0,c; k <=lim; k++){c=0;
					for (int l = 0; l < C.length; l++){
						if(C[l]==M[j][l+k])c++;	
					}
					if(c>max){si=j;max=c;}
				}
		   }
		   pw.println(si+1);
	    }pw.close();
	}
}
/*
3 1
000011
1101111111
1111100000
1000111


*/