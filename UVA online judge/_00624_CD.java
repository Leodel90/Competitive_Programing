import java.io.*;
import java.util.*;
public class _00624_CD{
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer tk;
		try{
			while(true){tk= new StringTokenizer(br.readLine());
				int N= Integer.parseInt(tk.nextToken()),t=Integer.parseInt(tk.nextToken());
				int T[]= new int [t];
				for (int i = 0; i < t; i++)T[i]=Integer.parseInt(tk.nextToken());
				LinkedList<Integer> Pt= new LinkedList<Integer>();
				LinkedList<Integer> R= new LinkedList<Integer>();
				int p=0,s=0,max=0;
				boolean q =true,qq=true,r=true;
				while(true){
					if(q){q=s<=N;
						if(q){
							if(qq){if(p==t){q=false;if(s>max){max=s;R=(LinkedList<Integer>)Pt.clone();}if(max==N)break;}}
							if(q){
								if(r){Pt.add(T[p]);s=s+T[p];}
								else{Pt.add(-1);r=true;}p++;
								qq=true;
							}
						}
					}else{if(p==0)break;
						qq=false;
						if(Pt.getLast()>=0){r=false;s=s-Pt.removeLast();q=true;}
						else Pt.removeLast();
						p--;
					}
				}
				while(!R.isEmpty())
					if(R.getFirst()!=-1)pw.print(R.remove()+" ");
					else R.remove();
				pw.println("sum:"+max);
			}
		}catch(Exception e){}
		pw.close();
	}
}

/*
5 3 1 3 4
10 4 9 8 4 2
20 4 10 5 7 4
90 8 10 23 1 2 3 4 5 7
45 8 4 10 44 43 12 9 8 2
*/