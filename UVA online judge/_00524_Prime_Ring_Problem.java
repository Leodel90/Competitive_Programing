import java.io.*;
import java.util.*;
public class _00524_Prime_Ring_Problem{
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int P[]={3,5,7,11,13,17,19,23,29,31},xd=1;
		try{
			while(true){int n = Integer.parseInt(br.readLine());if(n==0)break;
				LinkedList<Integer> L[]= new LinkedList[n+1];
				for (int i = 1; i <=n; i++){L[i]= new LinkedList<Integer>();
					for (int j = 0,k; j<P.length; j++){
						if(P[j]>i){k=P[j]-i;
							if(k<=n){L[i].add(k);}
							else break;
						}
					}
				}
				LinkedList<Integer> Pn= new LinkedList<Integer>();
				LinkedList<Iterator> Pit= new LinkedList<Iterator>();
				LinkedList<StringBuilder> Psb= new LinkedList<StringBuilder>();
				StringBuilder sb= new StringBuilder(""),csb;
				boolean q=true,qq=true;
				int v=0,l=(1<<(n+1))-2,i=1,c=0,ni;Iterator<Integer> k=L[i].iterator();
				if(xd>1)pw.println();
				pw.println("Case "+xd+":");xd++;
				while(true){
					if(q){
						if(qq){k=L[i].iterator();v|=1<<i;
							if(l==v){q=false;
								if(L[i].contains(1)){
								    sb.append(i);
								pw.println(sb);
								}
							}
						}qq=false;
						while(q&&k.hasNext()){ni=k.next();
							if((v&(1<<ni))==0){Psb.add(sb);csb= new StringBuilder(sb);csb.append(i+" ");sb=csb;Pn.add(i);i=ni;Pit.add(k);
								qq=true;break;
							}
						}q=qq;
					}else{v&=~(1<<i);if(v==0)break;
						i=Pn.removeLast();k=Pit.removeLast();sb=new StringBuilder(Psb.removeLast());
						qq=false;q=true;
					}
				}
			}
		}catch(Exception e){}
		pw.close();
	}
}


/*
2
4
6
8
10
12
14
16
0
*/





