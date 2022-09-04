import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _10128_Queue {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		long F[]= new long[13];F[0]=1;
		long C[][]= new long [13][];C[0]= new long[1];C[0][0]=1;
		long M[][][]= new long[14][][];M[1]=new long [2][2];M[1][1][1]=1;
		for (int i = 1; i < 13; i++){
			M[i+1]= new long[i+2][i+2];
			F[i]=F[i-1]*i;C[i]= new long[i+1];
			for (int j = 0; j <=i; j++){C[i][j]=F[i]/(F[j]*F[i-j]);}
		}
			boolean q=true;
			int i=1,c=0,CC[]= new int[12];LinkedList<Integer>Pi= new LinkedList<Integer>();
			while(true){
				if(q){
					q=false;
					if(i<=12){q=true;Pi.add(i);CC[c]=i;i++;
						LinkedList<Long> Ps= new LinkedList<Long>();
						LinkedList<Integer> Pii= new LinkedList<Integer>();
						boolean q1=true,qq1=true;
						int y=0,l=0,p=0,ii=0;c++;long s=1,S=0;
						while(true){
							if(q1){
								if(qq1){l=CC[y]-1-p-y;ii=0;
									if(y==c-1){q1=false;
										S+=s*F[l];
									}
								}qq1=false;
								if(ii<=l&&q1){Ps.add(s);Pii.add(ii);
									s*=F[ii]*C[l][ii];y++;p+=ii;qq1=true;
								}q1=qq1;
							}else{if(y==0)break;
								s=Ps.removeLast();ii=Pii.removeLast();
								p-=ii;y--;ii++;q1=true;qq1=false;
								l=CC[y]-1-p-y;
							}
						}
						for (int j = 0; j <=c>>1; j++)M[i][j+1][c-j+1]+=S*C[c][j];
					}
				}else{if(c==0)break;
					i=Pi.removeLast()+1;q=true;c--;
				}
			}
		for (int t = Integer.parseInt(br.readLine()),n,p,r; t >0; t--){
				StringTokenizer tk = new StringTokenizer(br.readLine());
				n=Integer.parseInt(tk.nextToken());p=Integer.parseInt(tk.nextToken());r=Integer.parseInt(tk.nextToken());
				if(p+r<=n+1)pw.println(M[n][Math.min(p, r)][Math.max(p, r)]);
				else pw.println(0);
		}
		pw.close();
	}
}
/*
3
10 4 4
11 3 1
3 1 2
*/