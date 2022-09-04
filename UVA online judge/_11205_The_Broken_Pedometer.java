import java.util.*;
import java.io.*;
public class _11205_The_Broken_Pedometer{
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter (new BufferedWriter(new OutputStreamWriter(System.out)));
		int t= Integer.parseInt(br.readLine());
		StringTokenizer tk; 
		for (int xd = 0; xd < t; xd++){
			int p = Integer.parseInt(br.readLine()),
					n = Integer.parseInt(br.readLine()),pp=1<<p;
			int N[]= new int [n];
			for (int i = 0; i < n; i++){
				tk= new StringTokenizer(br.readLine());
				N[i]=pp;
				for (int j = pp>>1; j >0; j=j>>1){
					if(tk.nextToken().equals("1"))N[i]|=j;
				}
			}
			
			LinkedList<Integer> C= new LinkedList<Integer>();C.add(pp-1);
			int c=-1,s=0,x,ss=1,i;boolean q=true;
			while(q){
				x=C.removeFirst();
				if(s==0){c++;q=c<p;s=ss;ss=0;}s--;
				if(c>0)i=(x&((~x)+1))>>1;
				else i=1;
				for (int j=x; i>0 && q; i=i>>1,j=x){
					j=j+i;ss++;C.addLast(j);
					boolean VN[]= new boolean[pp<<1];q=false;
					for (int k = 0,kk; k < n && !q; k++){
						kk=N[k]&j;
						if(!VN[kk])VN[kk]=true;
						else q=true;
					}
				}
				
			}
			pw.println(c);
		}pw.close();
	}
	}
/*
4
7
10
1 1 1 0 1 1 1
0 0 1 0 0 1 0
1 0 1 1 1 0 1
1 0 1 1 0 1 1
0 1 1 1 0 1 0
1 1 0 1 0 1 1
1 1 0 1 1 1 1
1 0 1 0 0 1 0
1 1 1 1 1 1 1
1 1 1 1 0 1 1
6
10
0 1 1 1 0 0
1 0 0 0 0 0
1 0 1 0 0 0
1 1 0 0 0 0
1 1 0 1 0 0
1 0 0 1 0 0
1 1 1 0 0 0
1 1 1 1 0 0
1 0 1 1 0 0
0 1 1 0 0 0
1
1
1
2
4
0 0
0 1
1 0
1 1

*/