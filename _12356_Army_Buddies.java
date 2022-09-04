import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class _12356_Army_Buddies{
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		while(true){
			StringTokenizer line= new StringTokenizer(br.readLine());
			int s=Integer.parseInt(line.nextToken());
			int b=Integer.parseInt(line.nextToken());
			if(b+s==0)break;
			int R[]= new int [s+2];
			int L[]= new int [s+2];
			boolean Rr[]= new boolean[s+2];
			boolean Ll[]= new boolean[s+2];
			for (int i = 0; i < b; i++){
				line= new StringTokenizer(br.readLine());
				int l = Integer.parseInt(line.nextToken()),ll;
				int r = Integer.parseInt(line.nextToken()),rr;
				if(!Ll[l]){ll=l-1;Ll[l]=true;}
				else ll=L[l];
				if(!Rr[r]){rr=r+1;Rr[r]=true;}
				else rr=R[r];
				R[ll]=rr;Rr[ll]=true;
				L[rr]=ll;Ll[rr]=true;
				if(ll>=1&&ll<=s)out.print(ll+" ");
				else out.print("* ");
				if(rr>=1&&rr<=s)out.println(rr);
				else out.println("*");
			}
			out.println("-");
		}
		out.close();br.close();
	}
}

/*
1 1
1 1
10 4
2 5
6 9
1 1
10 10
5 1
1 1
0 0
*/