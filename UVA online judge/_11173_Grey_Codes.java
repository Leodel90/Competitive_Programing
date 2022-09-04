import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class _11173_Grey_Codes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter ot = new PrintWriter(System.out);
		int N= Integer.parseInt(br.readLine());
        int P[]= new int [31];P[0]=1;
        for (int i = 1; i <=30; i++)P[i]=P[i-1]*2;
        for (int i = 0; i < N; i++){
        	StringTokenizer A = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(A.nextToken());
			int k = Integer.parseInt(A.nextToken());
			long r=0,m=P[n-1],x=0,y=m;
			for (int j = n-2; j>=0; j--){
				if(k>=m){r+=y;y=0;x=P[j];m+=P[j];}
				else {r+=x;x=0;y=P[j];m-=P[j];}
			}
			if(k>=m)r+=y;else r+=x;
			ot.println(r);
		}
        br.close();ot.close();
	}
}

/*
14
1 0
1 1
2 0
2 1
2 2
2 3
3 0
3 1
3 2
3 3
3 4
3 5
3 6
3 7
*/
