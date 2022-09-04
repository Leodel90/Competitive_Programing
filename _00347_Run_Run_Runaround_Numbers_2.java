import java.io.*;
import java.util.*;
public class _00347_Run_Run_Runaround_Numbers_2{
	public static void main(String[] args) throws NumberFormatException, IOException{
		int RN[]= new int[1722313];
		int rn=0,nr;
		LinkedList<Integer> PN =new LinkedList<Integer>();
		int P[]=new int [7];P[0]=1;
		for (int t = 2; t <=7; t++){
			int N[]= new int[t],p=0,i=1;P[t-1]=P[t-2]*10;nr=0;
			while(true){
				if((nr&(1<<i))==0){N[p]=i;p++;
				   if(p==t){int c=1,j=0,pr=1,n=0;
					 while(true){int np=(j+N[j])%t;n=n+N[j]*P[t-j-1];
						 if((pr&(1<<np))==0){pr=pr|(1<<np);c++;
						 j=np;
						 }else {if(c==t&&np==0){RN[rn]=n;rn++;}
						 break;
						 }
					 }p--;
				   }else{PN.add(i);nr=nr|(1<<i);i=0;}
				}
				while(i==9&&p>0){i=PN.removeLast();
				nr=nr&~(1<<i);p--;
				}if(p==0&&i==9)break;
				i++;
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter( new BufferedWriter(new OutputStreamWriter(System.out)));
		int y=1;
		while(true){
			int r = Integer.parseInt(br.readLine());
			if(r==0)break;
			int li=0,ls=rn-1,m=0;
			while(li<=ls){m=(ls+li)>>1;
			    if(RN[m]!=r&&li<ls){
			    	if(RN[m]<r)li=m+1;else ls=m;
			    }else break;
			}
			pw.println("Case "+y+": "+RN[m]);
			y++;
		}
		pw.close();
	}
}
