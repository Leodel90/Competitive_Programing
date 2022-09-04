import java.util.*;
public class _01209_Wordfish{
	static int P[],n,e,y,M,m,PT[];
	static char L[],R[];
	static boolean V[],q;
	static String r;
	public static void next_Per(){
		if(y==n){
			if(m>M){r="";for (int i = 0; i < n; i++)r+=R[i];M=m;}
			e--;q=e>0;
			return;
		}
		int a=m;
		for (int i = P[y]; i <n&&q; i++){
			if(!V[i]){
				V[i]=true;
				R[y]=L[i];
				if(y>0&&Math.abs(R[y]-R[y-1])<m)m=Math.abs(R[y]-R[y-1]);
				y++;
			    next_Per();
			    y--;V[i]=false;
			    m=a;
			}
		}
		P[y]=0;
	}
	public static void prev_Per(){
		if(y==n){
			if(m>=M){r="";for (int i = 0; i < n; i++)r+=R[i];M=m;}
			e--;q=e>0;
			return;
		}int a=m;
		for(int i = P[y]; i >=0&&q; i--){
			if(!V[i]){
				V[i]=true;
				R[y]=L[i];
				if(y>0&&Math.abs(R[y]-R[y-1])<m)m=Math.abs(R[y]-R[y-1]);
				y++;prev_Per();
				y--;V[i]=false;
				m=a;
			}
		}P[y]=n-1;
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
           try{
        	   while(true){
        		   String cad = leer.next();
        		   int Q[]= new int[52];
        		   n=cad.length();
        		   for (int i = 0; i < n; i++){
        			   if(cad.charAt(i)>=97)Q[cad.charAt(i)-70]=i+1;else Q[cad.charAt(i)-65]=i+1;
        		   }
        		   L= new char[n];
        		   int c=0;
        		   P= new int [n];
        		   PT= new int [n];
        		   for (int i = 0; i < 52; i++){
					if(Q[i]>0){
						int x=65;
						if(i>=27)
						x=70;
					    L[c]=(char)(i+x);
					    P[Q[i]-1]=c;
					    PT[Q[i]-1]=c;
					    c++;
				   }
        		   }
        		   m=1000000000;
        		   e=11;V= new boolean[n];M=0;y=0;q=true;R=new char[n];
        		   next_Per();
        		   P=PT;m=1000000000;e=11;
        		   V= new boolean[n];y=0;q=true;R=new char[n];
        		   prev_Per();
        		   System.out.println(r+M);
        	   }
           }catch(Exception e){}
	}
}
