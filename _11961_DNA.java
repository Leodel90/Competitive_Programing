import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _11961_DNA {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		char E[]={'A','C','G','T'};
		for (int t = Integer.parseInt(br.readLine()),n,k; t >0; t--){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			n=Integer.parseInt(tk.nextToken());k=Integer.parseInt(tk.nextToken());
			LinkedList<Integer>Pi= new LinkedList<Integer>();
			LinkedList<Character>Pc= new LinkedList<Character>();
			char N[]=br.readLine().toCharArray();
			boolean q=true,qq=true;
			int p=0,i=0,ck=0,CM=0;
			LinkedList<String> LM= new LinkedList<String>();
			while(true){
				if(q){
					if(qq){
						if(p==n||ck==k){String m="";
							for (int j = 0; j < n; j++)m=m+N[j];
							LM.add(m);q=false;CM++;
						}
					}qq=false;
						if(q&&i<4){Pc.add(N[p]);Pi.add(i);
							if(N[p]!=E[i])ck++;N[p]=E[i];i=0;qq=true;p++;
						}q=qq;
				}else{if(p==0)break;
					i=Pi.removeLast();p--;
					N[p]=Pc.removeLast();
					if(N[p]!=E[i])ck--;
					q=true;qq=false;i++;
				}
			}
			Iterator<String>it= LM.iterator();
			pw.println(CM);
			while(it.hasNext())pw.println(it.next());
			
		}
		pw.close();
	}
}
/*
*/