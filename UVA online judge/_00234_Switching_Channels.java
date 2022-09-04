import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class _00234_Switching_Channels{
	static int R[],RD[],TMT[],TMTD[],AP[],p1,p2,p3,p,a,V,P[],L[];
	public static void switching(long S){
		if(p1==p+1){R=RD.clone();TMT=TMTD.clone();return;}
		for (int i = 0,h,cp3=p3,cp2=p2; i <p || i==p&&p1==p; i++){h=1<<i;
			if((V&h)==0){boolean q=true;long NS=S+P[i],d;
				while(p2<a && AP[p2]<=NS&&q){
					if(S>0)d=Math.min(NS-AP[p2], AP[p2]-S);else d=NS-AP[p2]; q=L[p2]>=p3||d==0&&L[p2]<p3;
					if(q){TMTD[L[p2]]+=d;p2++;
					   while(p3<5&&TMTD[p3]>=TMT[p3]&&q){q=TMTD[p3]==TMT[p3];if(q)p3++;}
					   q=q&&p3<5;
					}
				}
				if(q){V=V|h;RD[p1]=P[i];p1++;switching(NS);p1--;V=V&~h;}
				while(cp2<p2){p2--;if(S>0)TMTD[L[p2]]-=Math.min(NS-AP[p2], AP[p2]-S);else  TMTD[L[p2]]-=NS-AP[p2];}
				p3=cp3;
			}
		}
	}
	public static void main(String[] args) throws IOException{
		 BufferedReader br = new  BufferedReader (new InputStreamReader(System.in));
		 PrintWriter pw = new PrintWriter (new BufferedWriter(new OutputStreamWriter(System.out)));
		 StringTokenizer tk;
		 int xd=1;
		 while(true){tk= new StringTokenizer(br.readLine());
		    p=Integer.parseInt(tk.nextToken());
		    if(p==0)break;
			P= new int[p+1];
			for (int i = 0; i < p; i++)P[i]=Integer.parseInt(tk.nextToken());
			P[p]=Integer.MAX_VALUE;
			tk=new StringTokenizer(br.readLine());
			a=Integer.parseInt(tk.nextToken());
			AP= new int[a];L= new int[a];TMT= new int[5];
			for (int i = 0,j,aux; i < a; i++){L[i]=Integer.parseInt(tk.nextToken())-1;TMT[L[i]]=Integer.MAX_VALUE;
			 AP[i]=Integer.parseInt(tk.nextToken());j=i;
			 while(j>0){
				if(AP[j]<AP[j-1]){aux=AP[j];AP[j]=AP[j-1];AP[j-1]=aux;aux=L[j];L[j]=L[j-1];L[j-1]=aux;j--;}
				else j=-1;
			 }
			}TMTD= new int[5];RD= new int[p+1];
			p1=0;p2=0;p3=0;V=0;
	        switching(0);
	        pw.println("Data set "+xd);
	        pw.print("  Order:");
	        for (int i = 0; i < p; i++)pw.print(" "+R[i]);
			pw.println();
	        long S=+TMT[0]+TMT[1]+TMT[2]+TMT[3]+TMT[4];
	        pw.println("  Error: "+S);xd++;
		 }pw.close();
	}
}
/*

4 30 45 45 15
3 1 60 2 90 3 15
6 10 15 13 18 25 33
4 1 30 2 15 2 45 1 60
0
*/