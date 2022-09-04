import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00124_Following_Orders {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		try{boolean xd=false;
			while(true){
				StringTokenizer tk = new StringTokenizer(br.readLine());
				char L[]= new char[tk.countTokens()];
				LinkedList<Integer> LA[]= new LinkedList[26];
				for (int i = 0; tk.hasMoreTokens(); i++){
					L[i]=tk.nextToken().charAt(0);
					LA[L[i]-97]= new LinkedList<Integer>();
				}Arrays.sort(L);
				tk = new StringTokenizer(br.readLine());
				int CA[]= new int[26];
				while(tk.hasMoreTokens()){
					int x=tk.nextToken().charAt(0)-97,y=tk.nextToken().charAt(0)-97;CA[y]++;
					LA[x].add(y);
				}
				int v=0,p=0;
				boolean q=true,qq=true;
				LinkedList<Integer> PP= new LinkedList<Integer>();
				if(xd)pw.println();
				else xd=true;
				while(true){
					if(q){
						if(qq){q=v<(1<<L.length)-1;
							if(!q){Iterator<Integer> it=PP.iterator();
								while(it.hasNext())pw.print(L[it.next()]);
								pw.println();
							}
						}
						qq=false;
						for (int i = p; i < L.length&&q; i++){
							if((v&(1<<i))==0 && CA[L[i]-97]==0){
								v|=(1<<i);p=0;qq=true;
								Iterator<Integer> it = LA[L[i]-97].iterator();
								while(it.hasNext())CA[it.next()]--;
								PP.add(i);break;
							}
						}q=qq;
					}else{if(PP.isEmpty())break;
						p=PP.removeLast();v-=(1<<p);
						Iterator<Integer> it = LA[L[p]-97].iterator();
						while(it.hasNext())CA[it.next()]++;q=true;qq=false;p++;
					}
				}
			}
		}catch(Exception e){}
		pw.close();
	}
}

/*
a b f g
a b b f
v w x y z
v y x v z v w v




*/