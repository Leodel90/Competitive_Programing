import java.io.*;
import java.util.LinkedList;
public class _11201_The_problem_of_the_crazy_linguist{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int S3[]= new int [5],C3[]= new int [5];
		int P[]= {1253,142,468,586,1368,69,101,70,625,44,0,497,315,671,868,251,88,687,798,463,393,90,2,22,90,52};
		LinkedList<Integer> Pp = new LinkedList<Integer>();
		LinkedList<Long>Ps = new LinkedList<Long>();
		boolean q=true,qq=true;
		int i=2,p=0,c=0,V[]= new int[21];long s=0;
		char VOC[]= {'a','e','i','o','u'};C3[0]=1;
		while(true){
			if(q){
				if(qq)q=c<3;
				qq=false;
				while(q&&p<VOC.length){
					if(V[p]<2){V[p]++;
						Ps.add(s);Pp.add(p);
						c++;C3[c]++;s+=i*P[VOC[p]-97];S3[c]+=s;
						i+=2;p=0;qq=true;break;
					}p++;
				}q=qq;
			}else{if(c==0)break;
				i-=2;s=Ps.removeLast();p=Pp.removeLast();
				c--;V[p]--;p++;
				q=true;qq=false;
			}
		}
		p=0;i=1;q=true;qq=true;
		char CONS[]= {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		long S[][]= new long[26][8];
		int C[][]= new int[26][8],pp=0;
		while(true){
			if(q){
				if(qq)q=c<4;
				qq=false;
				while(q&&p<CONS.length){
					if(V[p]<2){V[p]++;
						Ps.add(s);Pp.add(p);s+=i*P[CONS[p]-97];
						if(c==0)pp=p;
						S[CONS[pp]-97][i-1]+=S3[c]+s*C3[c];
						C[CONS[pp]-97][i-1]+=C3[c];c++;
						S[CONS[pp]-97][i]+=S3[c]+s*C3[c];
						C[CONS[pp]-97][i]+=C3[c];
						i+=2;p=0;qq=true;break;
					}p++;
				}q=qq;
			}else{if(c==0)break;
				i-=2;s=Ps.removeLast();p=Pp.removeLast();
				c--;V[p]--;p++;
				q=true;qq=false;
			}
		}
		for (int N = Integer.parseInt(br.readLine()); N >0; N--){
			char W[]= br.readLine().toCharArray();s=0;
			for (int j = 0; j < W.length; j++)s+=(j+1)*P[W[j]-97];
			if(s>=S[W[0]-97][W.length-1]/(double)C[W[0]-97][W.length-1])pw.println("above or equal");
			else pw.println("below");
		}
		
		pw.close();		
		
	}
}
/*
5
bubu
terabit
hacer
qed
loco
*/