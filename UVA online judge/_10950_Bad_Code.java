import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _10950_Bad_Code{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int xd=1;
		while(true){
			int t=Integer.parseInt(br.readLine());
			if(t==0)break;
			int D[]= new int [100];
			int L[]= new int [26];
			for (int i = 0,c,n; i < t; i++){
				StringTokenizer tk = new StringTokenizer(br.readLine());
				c=tk.nextToken().charAt(0);n=Integer.parseInt(tk.nextToken());D[n]=c;
				L[c-97]=1;if(n>9)L[c-97]=2;
			}
			char E[]= br.readLine().toCharArray();
			LinkedList<Integer> Pp= new LinkedList<Integer>(),Pi= new LinkedList<Integer>();
			LinkedList<Character> LE= new LinkedList<Character>();
			boolean q=true,qq=true;
			int p=0,i=0,M[][]= new int[E.length+1][],C=0;
			pw.println("Case #"+xd);xd++;
			while(true){
				if(q){
					if(qq){
						if(p<E.length){if(E[p]=='0')p++;
							M[p]= new int[3];
							for (int j = 0,n=0,c=0;j < 2&&p+j<E.length; j++){
								n=n*10+E[p+j]-48;
								if(D[n]!=0){M[p][c]=D[n];c++;}
							}
							if(M[p][0]!=0&&M[p][1]!=0&&M[p][1]<M[p][0]){
								int aux=M[p][0];M[p][0]=M[p][1];M[p][1]=aux;
							}
						}else{
							Iterator<Character> it =LE.iterator();
							while(it.hasNext())pw.print(it.next());
							pw.println();C++;if(C==100)break;q=false;
						}
					}qq=false;
					if(q&&M[p][i]!=0){
						Pp.add(p);Pi.add(i);LE.add((char)M[p][i]);
						qq=true;p+=L[M[p][i]-97];i=0;
					}q=qq;
				}else{
					if(LE.isEmpty())break;
					p=Pp.removeLast();i=Pi.removeLast()+1;LE.removeLast();
					q=true;qq=false;
				}
			}pw.println();
		}
		pw.close();
	}
}
/*

5
a 12
b 1
c 2
d 3
e 23
123
2
o 10
x 1
1010101
0
*/