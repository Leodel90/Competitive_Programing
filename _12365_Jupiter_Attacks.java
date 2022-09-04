import java.util.*;
public class _12365_Jupiter_Attacks {
    static int P[],B[],p,b,l,r,s,pb,v;
    public static void act(int L ,int R ,int x){
    	if(L==R){P[x]=r;return;}
    	int m = (L+R)/2,y=(x<<1)+1;
    	if(l<=m)act(L,m,y);else act(m+1,R,y+1);
    	long w=B[R-m];w=((w*P[y])%p+P[y+1])%p;
    	P[x]=(int)w;
    }
    public static void Q(int L, int R, int x){
    	if(L>r||R<l)return;
    	if(L<l||R>r){
    		int m = (L+R)/2,y=(x<<1)+1;
    		Q(m+1,R,y+1);Q(L,m,y);
    	}else{long w = P[x];w=((w*B[pb])%p+s)%p;
    		s=(int)w;pb=pb+R-L+1;
    	}
    }
    public static void main(String[] args){
    	Scanner leer = new Scanner(System.in);
    	double u= Math.log(2);    	
         while(true){
        	  b=leer.nextInt();
        	  p=leer.nextInt();
        	  int n = leer.nextInt();
        	  int q=leer.nextInt();
        	  if(b+p+n+q==0)break;
        	  double y = Math.log(n)/u+1;if((int)y<y)y++;
        	  P=new int [1<<(int)y];
        	  B= new int [n];B[0]=1;
        	  for (int i = 1; i < n; i++){long w=B[i-1];w=(w*b)%p;B[i]=(int)w;}
        	  for (int i = 0; i < q; i++){
        		  String D=leer.next();l=leer.nextInt()-1;r=leer.nextInt();
        		  if(D.charAt(0)=='H'){r--;s=0;pb=0;Q(0,n-1,0);System.out.println(s);}
        		  else act(0,n-1,0);
			  }System.out.println("-");
         }
	}
}
/*
20 139 5 7
E 1 12
E 2 14
E 3 2
E 4 2
E 5 4
H 2 5
E 2 14
10 1000003 6 11
E 1 3
E 2 4
E 3 5
E 4 6
E 5 7
E 6 8
H 1 6
E 3 0
E 3 9
H 1 3
H 4 6
999999935 999999937 100000 7
E 100000 6
E 1 7
H 1 100000
E 50000 8
H 1 100000
H 25000 75000
H 23987 23987
0 0 0 0



*/