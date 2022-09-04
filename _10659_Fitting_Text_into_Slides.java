import java.util.*;
public class _10659_Fitting_Text_into_Slides {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);		
        int t = leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < t; i++){
			int n= leer.nextInt();
			leer.nextLine();int T[]= new int [n];
			LinkedList<Integer> L= new LinkedList<Integer>();
			for (int j = 0; j < n; j++){
				StringTokenizer C= new StringTokenizer(leer.nextLine());
				while(C.hasMoreTokens())
				 L.add(C.nextToken().length());	
				T[j]=L.size();
			}
			int P[]= new int [L.size()];
			int u=0;
			while(!L.isEmpty()){
				P[u]=L.remove();u++;
			}
			int x=leer.nextInt(),y=leer.nextInt(),p=-1;
			for (int j = 28; j >=8&&p==-1; j--){
				u=0;
				int f=y;int a =0,k=0;
				while(a<P.length&&f>=0){f-=j;int c =x;
					while(a<T[k]){c=c-P[a]*j-j;a++;
						if(c<0)break;
					}
					if(c<=0){
					  if(c+j>=0){if(a==T[k])k++;}else a--;
					}else k++;
				}
				if(a==P.length&&f>=0)p=j;
			}
			if(p>-1)System.out.println(p);
			else System.out.println("No solution");
		}
	}
}
/*
3
3
En un lugar de la mancha
de cuyo nombre no quiero acordarme
no ha mucho que vivia...
375 35
1
LE LO
40 40
2
I love this hyper-mega-cosmic-contest.
The winner.
100 80
*/