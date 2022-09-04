package rpc2017_12;
import java.io.*;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedList;
public class B {
	static char D[],I[];
	static LinkedList<Integer>LD[],LI[];
	static BitSet V;
	static int c=0;
	static boolean q;
	static LinkedList<Character> R;
	public static void DFS(int x){
		for (int i = 0,d; i < D.length; i++){
			d=LD[x].removeFirst();LD[x].add(d);
			if(!V.get(d)){
				if(I[d]=='$'){if(c==I.length-2){q=false;}return;}
				else{
					V.set(d,true);c++;
					R.add(I[d]);
					DFS(I[d]-97);
					if(q){R.removeLast();V.set(d,false);c--;}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		PrintWriter  pw = new PrintWriter (new BufferedWriter (new OutputStreamWriter(System.out)));
		//try{
			while(true){
				D=br.readLine().toCharArray();
				if(D.length==0)break;
				I=D.clone();Arrays.sort(I);
				LD= new LinkedList[26];LI= new LinkedList[26];
				V= new BitSet(I.length+1);
				int ini=-1;q=true;c=0;
				for (int i = 0; i < 26; i++){LD[i]= new LinkedList<Integer>();LI[i]= new LinkedList<Integer>();}
				for (int i=0;i<I.length;i++){if(D[i]!='$'){LD[D[i]-97].add(i);}else ini=I[i]; if(I[i]!='$')LI[I[i]-97].add(i);}
				R=new LinkedList<Character>();
				R.add((char)ini);
				if(ini!=-1){
					DFS(ini-97);
					Iterator<Character> it = R.iterator();
					while(it.hasNext()){
						pw.print(it.next());
					}
				}
				pw.println();
			}
		//}catch(Exception e){}
			
		pw.close();
	}
}

