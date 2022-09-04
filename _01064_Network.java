import java.io.*;
import java.util.*;
public class _01064_Network {
	// wrong answer...
	public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	StringTokenizer tk;
	int casos=1;
		while(true){tk= new StringTokenizer(br.readLine());
			int n=Integer.parseInt(tk.nextToken()),m=Integer.parseInt(tk.nextToken()),min=0; 	
			if(n==0)break;
			int lm[]= new int[n];
			tk= new StringTokenizer(br.readLine());
			for (int i = 0; i<n; i++){lm[i]=Integer.parseInt(tk.nextToken())+1;min+=lm[i];}
			int P[][]= new int[m][3];
			for (int i = 0; i < m; i++){
				tk= new StringTokenizer(br.readLine());
				P[i][0]= Integer.parseInt(tk.nextToken())-1;
				P[i][1]= Integer.parseInt(tk.nextToken());
				P[i][2]= Integer.parseInt(tk.nextToken());
			}
			LinkedList<Integer> Pi= new  LinkedList<Integer>();
			int p=0,v=0,a=-1;
			boolean q=true,qq=true;
			while(true){
				if(q){
					if(qq){
						if(n==Pi.size()){
							int M[][]= new int [n][0],mm[]= new int [n],B=0,k,pp=0,max=0;
							for (int i = 0; i < n; i++) {M[i]= new int[lm[i]+1];mm[i]=1;}
							Iterator <Integer>xd= Pi.iterator();
							while(xd.hasNext()&&a==-1){k=xd.next();
								if(mm[k]==lm[k])B=B-mm[k]+1;
								while(mm[k]<lm[k]&&a==-1){
									int li=P[pp][1],ls=P[pp][2];
									boolean qqq=true; 
									if(M[P[pp][0]][li-1]!=0)
										li=M[P[pp][0]][li-1];
									if(M[P[pp][0]][ls+1]!=0)
										ls=M[P[pp][0]][ls+1];
									M[P[pp][0]][li]=ls;M[P[pp][0]][ls]=li;
									if(P[pp][1]==mm[P[pp][0]]){
										mm[P[pp][0]]=ls+1;
										if(P[pp][0]==k){qqq=false;B=B-(ls-P[pp][2]);}
									}
									if(qqq){B=B+P[pp][2]-P[pp][1]+1;
										if(B>max){max=B;if(max>=min)a=k;}
									}
								    pp++;
								}
							}q=false;
							if(a==-1){min=max;}
						}
					}qq=false;
					while(p<n&&q){
						if((v&(1<<p))==0){v=v|(1<<p);qq=true;Pi.add(p);p=0;break;}
						p++;
					}
					q=qq;
				}else{
					if(Pi.isEmpty())break;
					p=Pi.removeLast();v=v&~(1<<p);
					if(a==-1||a==p){p++;a=-1;q=true;qq=false;}
				}
			}
			pw.println("Case "+casos+": "+min);casos++;
			pw.println();
		}
	pw.close();
	}
}

/*
3 3
5 5 5
1 1 5
2 1 5
3 1 5
3 5
10 20 5
2 16 20
1 6 10
3 1 5
1 1 5
2 1 15
0 0

*/