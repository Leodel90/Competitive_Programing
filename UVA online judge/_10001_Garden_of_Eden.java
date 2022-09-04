import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _10001_Garden_of_Eden {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		try{
			while(true){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int CA= Integer.parseInt(tk.nextToken());
			LinkedList<Integer> L[]= new LinkedList[2];
			L[0]=new LinkedList<Integer>();L[1]=new LinkedList<Integer>();
			for (int i = 0; i < 8; i++)L[(CA&(1<<i))>>i].add(i);			
			int n = Integer.parseInt(tk.nextToken());
			char S[]=tk.nextToken().toCharArray();
			long M[][]={{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
			boolean q=true;
			for (int i = 0; i < n&&q; i++){
				long nm[][]= new long[4][4];q=false;
				for (int j = 0,v; j < 4; j++){
					Iterator<Integer> it= L[(int)S[i]-48].iterator();
					while(it.hasNext()){
						v=it.next();
						if((j<<1)==(v&6)){
							for (int k = 0; k < 4; k++){nm[k][v&3]+=M[k][j];q=q||nm[k][v&3]>0;}
						}
					}
				}
				M=nm;
			}
			if(q){q=false;
				for (int i = 0; i < 4&&!q; i++)q=M[i][i]>0;
			}
			if(q)pw.println("REACHABLE");
			else pw.println("GARDEN OF EDEN");}
		}catch(Exception e){}
		pw.close();
	}
}

/*
0 4 1111
204 5 10101
255 6 000000
154 16 1000000000000000
255 5 11111
0 1 0
4 4 1010
4 4 0101
2 4 1010

*/