import java.io.*;
import java.util.*;
public class _00639_Dont_Get_Rooked {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		while(true){int n= Integer.parseInt(br.readLine()),nrof=((n*n)>>1)+(n&1);
			if(n==0)break;
			int LF[]= new int[nrof],LC[]= new int[nrof],c=0;
			char KB[][]= new char[n][n];
			for (int i = 0; i < n; i++){
				KB[i]= br.readLine().toCharArray();boolean q=true;
				for (int j = 0; j <n; j++){
				      if(KB[i][j]=='.'){
				    	  if(q){LF[c]=i;LC[c]=j;q=false;c++;}}else q=true;
				}
			}nrof=c;
			int i=0,j=0,max=0,p=0;c=0;
			boolean q=true,qq=true;
			LinkedList<Integer> Pi= new LinkedList<Integer>();
			LinkedList<Integer> Pj= new LinkedList<Integer>();
			while(true){
				if(q){
					if(qq){if(p<nrof){i=LF[p];j=LC[p];}else q=false;}
					if(q){
					while(j<n&&KB[i][j]!='X'){
						if (KB[i][j]=='.'){
							for (int k = i-1; k>=0&&KB[k][j]!='X';k--)KB[k][j]='o';
							for (int k = i+1; k<n&&KB[k][j]!='X';k++)KB[k][j]='o';
							c++;max=Math.max(max,c);break;
						}j++;
					}Pi.add(i);Pj.add(j);p++;qq=true;}
				}else{p--;if(p==-1)break;
					i=Pi.removeLast();j=Pj.removeLast();
					if(j<n&&KB[i][j]!='X'){c--;
						for (int k = i-1; k>=0&&KB[k][j]!='X';k--)KB[k][j]='.';
						for (int k = i+1; k<n&&KB[k][j]!='X';k++)KB[k][j]='.';
						j++;q=true;qq=false;	
					}
				}
			}pw.println(max);
		}pw.close();
	}
}
/*
4
.X..
....
XX..
....
2
XX
.X
3
.X.
X.X
.X.
3
...
.XX
.XX
4
....
....
....
....
4
.X.X
X.X.
.X.X
X.X.
4
.X.X
.XX.
X...
.X.X
3
.X.
X.X
.X.
0

*/