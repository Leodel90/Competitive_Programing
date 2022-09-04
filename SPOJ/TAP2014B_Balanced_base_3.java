import java.util.*;
public class TAP2014B_Balanced_base_3 {
static String B[];
static LinkedList<Character> g=new LinkedList<Character>();
static int P[]={1,3,9,27,81,243,729},n,l,S[]={1,4,13,40,121,364,1093};
static boolean q;
public static void DP(int i,int k){
	if(q){
		if(i>=1&&i<=1000){
			LinkedList<Character> c=(LinkedList<Character>)g.clone();
			if(B[i].equals("")){
			for (int j = 0; j <=l; j++){
				if(!c.isEmpty())
					B[i]=c.remove()+B[i];
				else B[i]=B[i]+'0';
			}
			}
			if(i==n){q=false;return;}
			if(k>0){
			g.push('+');
			DP(i+P[k-1],k-1);
			g.pop();
			g.push('-');
			DP(i-P[k-1],k-1);
			g.pop();
			g.push('0');
			DP(i,k-1);
			g.pop();
			}
		}
	}
}
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
	    B= new String[1001];
	    for (int i = 1; i <=1000; i++)B[i]="";
	    int t = leer.nextInt();
	    for (int i = 0; i < t; i++){
			n = leer.nextInt();
			for (int j = 0; j < 7; j++){
				if(n<=S[j]){l=j;break;}
			}
			q=true;
			g= new LinkedList<Character>();
			g.push('+');
			DP(P[l],l);
			System.out.println(B[n]);
	    }
	}
}
