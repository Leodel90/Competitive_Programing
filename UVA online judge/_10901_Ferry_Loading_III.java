import java.util.*;
public class _10901_Ferry_Loading_III {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int c = leer.nextInt();
        for (int xd = 0; xd < c; xd++){
        	int n = leer.nextInt();
        	int t=leer.nextInt();
        	int m=leer.nextInt();
			LinkedList<Integer> L= new LinkedList<Integer>();
			LinkedList<Integer> R= new LinkedList<Integer>();
			boolean q=true;
			int V []= new int[m];
			for (int i = 0; i < m; i++){
				V[i]=leer.nextInt();
				if(leer.next().charAt(0)=='l')L.add(i);else R.add(i);
			}
			int time=0;
			int x=0,y=0;
			boolean a=L.isEmpty(),b=R.isEmpty();
			if(!a)x=L.getFirst();
			if(!b)y=R.getFirst();
			while(!a||!b){
					if(!a){
						if(V[x]<=time){int o =time+t;
							if(q){
								for (int i = 0; i < n; i++){
									if(!L.isEmpty()&&V[L.getFirst()]<=time)V[L.remove()]=o;
									else break;
								}
								a=R.isEmpty();b=L.isEmpty();
								if(!a)x=R.getFirst();
								if(!b)y=L.getFirst();
							}else{
								for (int i = 0; i < n; i++){
									if(!R.isEmpty()&&V[R.getFirst()]<=time)V[R.remove()]=o;
									else break;
								}
								b=R.isEmpty();a=L.isEmpty();
								if(!a)x=L.getFirst();
								if(!b)y=R.getFirst();
							}
							q=!q;time=o;
						}else{
							if(!b){
								if(V[y]>time){
									if(V[y]<V[x]){
										q=!q;time=V[y]+t;
										boolean u=a;a=b;b=u;
										int aux=x;x=y;y=x;
									}else time=V[x];
								}else {time+=t;q=!q;
								boolean u=a;a=b;b=u;
								int aux=x;x=y;y=aux;
								}
							}else time=V[x];
						}
					}else{
						time=Math.max(time,V[y])+t;q=!q;
						boolean u=a;a=b;b=u;
						int aux=x;x=y;y=x;
					}
			}
			if(xd>0)System.out.println();
			for (int i = 0; i < m; i++) 
				System.out.println(V[i]);
			
		}
	}
}
/*
2
2 10 10
0 left
10 left
20 left
30 left
40 left
50 left
60 left
70 left
80 left
90 left
2 10 3
10 right
25 left
40 left

*/