import java.util.*;
public class _10986_Sending_email {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int N= leer.nextInt();
		for (int i = 1; i <=N; i++){
			int n = leer.nextInt();
			int m = leer.nextInt();
			int s = leer.nextInt();
			int t = leer.nextInt();
			Lista A[]= new Lista[n+1];
			long h []= new long[n+1];
			for (int j = 0; j <=n; j++){
				A[j]= new Lista();h[j]=Long.MAX_VALUE;
			}
      		for (int j = 0;j<m;j++){
				int x = leer.nextInt();
				int y = leer.nextInt();
				int l = leer.nextInt();
				A[x].add(y, l);
				A[y].add(x, l);
			}
      		boolean V[]= new boolean[n+1];
			long min=0;
			boolean q=false;
			TreeMap<Long, TreeSet<Integer>> T = new TreeMap<Long, TreeSet<Integer>>();
			if(A[t].ini!=null){
			for (int j = 0; j < n&&!V[s];j++){
				Nodo aux = A[s].ini;
				V[s]=true;
				while(aux!=null){
				    if(!V[aux.n]&&h[aux.n]>aux.l+min){
				    	TreeSet<Integer> y;
				    if(T.containsKey(h[aux.n])){
				      y=T.get(h[aux.n]);
				      y.remove(aux.n);
				      if(!y.isEmpty())T.put(h[aux.n], y);
				      else T.remove(h[aux.n]);
				     }
				      h[aux.n]=aux.l+min;
				      if(T.containsKey(h[aux.n])) y=T.get(h[aux.n]);
				      else y=new TreeSet<Integer>();
				      y.add(aux.n);
				      T.put(h[aux.n],y);
				    }
				    aux=aux.sig;
			    }
				if(!T.isEmpty()){
				min=T.firstKey();
				TreeSet<Integer> y=T.get(min);
				s=y.pollFirst();
				if(!y.isEmpty())T.put(min,y);
				else T.pollFirstEntry();
				if(s==t){q=true;break;}
				}else break;
			}
			}
			if(q)System.out.println("Case #"+i+": "+h[t]);
			else System.out.println("Case #"+i+": unreachable");
		}
	}
	public static class Nodo{
		int n,l;
		Nodo sig;
		public Nodo(int x,int y){
			n=x;l=y;sig=null;
		}
	} 
	public static class Lista{
		Nodo ini;
		public Lista(){
			ini=null;
		}
		public void add(int x , int y){
			Nodo aux = new Nodo(x,y);
			aux.sig=ini;
			ini=aux;
		}
	}
}
