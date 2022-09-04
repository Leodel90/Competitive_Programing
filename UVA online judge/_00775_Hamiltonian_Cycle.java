import java.io.*;
import java.util.*;
public class _00775_Hamiltonian_Cycle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		try{
		while(true){
			int N= Integer.parseInt(br.readLine());
			LinkedList<Integer> G[]= new LinkedList[N+1];
			for (int i = 1; i <=N; i++)G[i]=new LinkedList<Integer>();
			while(true){
				StringTokenizer tk= new StringTokenizer(br.readLine());
				if(tk.countTokens()==1)break;
				int v1=Integer.parseInt(tk.nextToken()),v2=Integer.parseInt(tk.nextToken());
				G[v1].add(v2);G[v2].add(v1);
			}
			if(N>2){
				LinkedList<Integer>Pp= new LinkedList<Integer>(),Pc= new LinkedList<Integer>();
				int p=1,cv=0,a=0,c;
				boolean V[]= new boolean[N+1],q=true,qq=true;
				while(true){
					if(q){
						if(qq){
							if(!V[p]){
								V[p]=true;cv++;a=G[p].size();
								if(cv==N&&G[p].contains(1))break;
							}else a=-1;
						}qq=false;
						c=a;
						if(c>0){c--;Pc.add(c);Pp.add(p);
							a=G[p].removeFirst();G[p].addLast(a);
							p=a;qq=true;
						}q=qq;
					}else{
						if(cv==0)break;
						if(a==0){cv--;V[p]=false;}
						qq=false;q=true;
						p=Pp.removeLast();a=Pc.removeLast();
					}
				}
				while(!Pp.isEmpty())pw.print(Pp.removeFirst()+" ");
				pw.println(p+" 1");
			}else pw.println("N");
			
		}
		}catch(Exception e){}
		pw.close();
	}
}
/*
1
1 1
%
2
1 2
1 1
%
3
1 2
2 3
3 1
%
4
1 2
2 3
2 4
3 4
3 1
%
6
1 2
1 3
1 6
3 2
3 4
5 2
5 4
6 5
6 4
%

*/
