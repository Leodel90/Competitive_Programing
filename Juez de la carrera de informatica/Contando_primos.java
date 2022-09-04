import java.util.*;
public class Contando_primos {
static long p[];
static int u,k,a,b;
public static void primos(){
	for (int i = k; i <=b; i++) {
		if(p[i]==0&&i>1){
			u++;p[i]=u;
		    for (int j = i+i; j <=10000000; j=j+i) {
				p[j]=-1;
			}
		}else
		p[i]=-u;
	}k=b+1;
}
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
        p= new long [10000001];
        u=0;k=0;
		while(leer.hasNext()){
			int n = leer.nextInt();
			for (int i = 0; i < n; i++) {
				a=leer.nextInt();
				b=leer.nextInt();
				if(b>=k)primos();
				long x=p[b],y=p[a];
				if(x<0)x=-x;
				if(y<=0)y=-y;else x++;
			    System.out.println(x-y);
			}
		}
	}

}
/*
4
2 1000
100000 1000000
1000000 10000000
2 10000000
*/