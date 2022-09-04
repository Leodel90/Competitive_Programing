import java.util.*;
public class _11297_Census_1{
	static int MAX[],MIN[],P[],max,min,l,r,v;
	public static void Llena(int L, int R, int x){
		if(L==R){MAX[x]=P[L];MIN[x]=P[L];return;}
		Llena(L,(L+R)/2,(x<<1)+1);
		Llena(((L+R)/2)+1,R,(x<<1)+2);
		MAX[x]=Math.max(MAX[(x<<1)+1], MAX[(x<<1)+2]);
		MIN[x]=Math.min(MIN[(x<<1)+1], MIN[(x<<1)+2]);
	}
	public static void q(int L, int R, int x){
		if(L>r||R<l)return;
		if(L>=l&&R<=r){max=Math.max(max,MAX[x]);min=Math.min(min,MIN[x]);}
		else{int m=(L+R)/2,y=(x<<1)+1;q(L,m,y);q(m+1,R,y+1);}
       }
	public static void c(int L,int R,int x){
		if(L<R){int m =(L+R)/2,y=(x<<1)+1;
		     if(max>=L&&max<=m)c(L,m,y);
		     else c(m+1,R,y+1);
		     MIN[x]=Math.min(MIN[y], MIN[y+1]);
		     MAX[x]=Math.max(MAX[y], MAX[y+1]);
		}
		else{MAX[x]=v;MIN[x]=v;}
	}
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
        int n = leer.nextInt(),p=n*n;
        P= new int [p];
        for (int i = 0; i < p; i++)P[i]=leer.nextInt();
		double u=Math.log(p)/Math.log(2)+1;
		if((int)u<u)u++;
		MAX= new int[1<<(int)u];
		MIN= new int[1<<(int)u];
		Llena(0,p-1,0);
		int q = leer.nextInt();
		for (int i = 0; i < q; i++){
			if(leer.next().charAt(0)=='q'){
				l=(leer.nextInt()-1)*n;int c1=leer.nextInt()-1,c2=(leer.nextInt()-1)*n+c1;
				r=l+leer.nextInt()-1;
				l+=c1;
			max=-1;min=999999999;
			while(l<=c2){
				q(0,p-1,0);
				l+=n;r+=n;
			}
			 System.out.println(max+" "+min);
			}else{
				max=(leer.nextInt()-1)*n+leer.nextInt()-1;v=leer.nextInt();
				c(0,p-1,0);
			}
		}
	}
}
/*
5
1 2 3 4 5
0 9 2 1 3
0 2 3 4 1
0 1 2 4 5
8 5 3 1 4
4
q 1 1 2 3
c 2 3 10
q 1 1 5 5
q 1 2 2 2
*/

