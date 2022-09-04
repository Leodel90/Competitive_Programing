import java.util.*;
public class _10801_Lift_Hopping{
	public static void main(String[] args){
		// 
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
		int n = leer.nextInt();
		int k = leer.nextInt();
		Lista P[]= new Lista[101];
		long C[]= new long [101];
		boolean A[][]= new boolean[101][n];
		for (int i = 0; i < 101; i++){
			P[i]= new Lista();C[i]= Long.MAX_VALUE;
		}
		int E[]= new int[n];
		for (int i = 0; i < n; i++)
			E[i]= leer.nextInt();
		leer.nextLine();
		for (int i = 0; i < n; i++){
			StringTokenizer g = new StringTokenizer(leer.nextLine());
			int a= Integer.parseInt(g.nextToken());
			while(g.hasMoreTokens()){
				int h = Integer.parseInt(g.nextToken());
				P[h].add(a,i);
				P[a].add(h,i);
				a=h;
			}
		}
		boolean q = false;
		boolean V[]= new boolean[101];
		if(P[k].ini!=null){
			long min=0;
			int p=0;
			TreeMap<Long, TreeSet<Integer>> T= new TreeMap<Long, TreeSet<Integer>>();
			for (int i = 1; i < 101 && !V[p]; i++){
				V[p]=true;
				if(p==k){
					q=true;break;
				}
				Nodo aux = P[p].ini;
				int c;
				System.out.println(min+" "+p);
				while(aux!=null){
					if(!V[aux.n]){
						c=0;
						if(!A[p][aux.t] && p!=0)c=60;
						int d=Math.abs(p-aux.n);
						if(C[aux.n]>=min+E[aux.t]*d+c){
							if(C[aux.n]>min+E[aux.t]*d+c){
							TreeSet<Integer> y;
						    if(T.containsKey(C[aux.n])){
						    	y=T.get(C[aux.n]);
						    	y.remove(aux.n);
						    	if(!y.isEmpty()){
						    	T.put(C[aux.n], y);
						    	}else T.remove(C[aux.n]);
						    }
						    C[aux.n]=min+E[aux.t]*d+c;
						    if(T.containsKey(C[aux.n]))y=T.get(C[aux.n]);
						    else y= new TreeSet<Integer>();
						    y.add(aux.n);
						    T.put(C[aux.n],y);
						    A[aux.n]= new boolean[n];
						    }
						    A[aux.n][aux.t]=true;
						}
					}
					aux=aux.sig;
				}				
				if(!T.isEmpty()){
				min=T.firstKey();
				TreeSet<Integer> y= T.get(min);
				p=y.pollFirst();
				if(!y.isEmpty())T.put(min, y);
				else T.pollFirstEntry();
			    }else break;
			}
		}
		if(q)System.out.println(C[k]);
		else System.out.println("IMPOSSIBLE");
		}
	}
	public static class Nodo{
		int n; int t;
		Nodo sig;
		public Nodo(int x, int y){
			n=x;t=y;sig=null;
		}
	}
	public static class Lista{
		Nodo ini;
		public Lista(){
			ini=null;
		}
		public void add(int x, int y){
		Nodo aux = new Nodo(x, y);
		aux.sig=ini;
		ini=aux;
		}
	}
}
