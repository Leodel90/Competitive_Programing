import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00140_Bandwidth {
	public static void main(String[] args) throws IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
     StringTokenizer tk1,tk2;
     while(true){String h= br.readLine();
       if(h.charAt(0)=='#')break;
       tk1 = new StringTokenizer(h,";");
       int D[]= new int [26];
       LinkedList<LinkedList<Integer>> L= new LinkedList<LinkedList<Integer>>();
       int y=0,l;
       while(tk1.hasMoreTokens()){
    	   tk2= new StringTokenizer(tk1.nextToken(),":");
    	   h=tk2.nextToken();
    	   l=h.charAt(0)-65;
    	   if(D[l]==0){D[l]=1;y++;}LinkedList<Integer> LL= new LinkedList<Integer>();
    	   LL.add(l);h=tk2.nextToken();
    	   for (int i = 0,j; i<h.length();i++){j=h.charAt(i)-65;
    		   if(D[j]==0){D[j]=1;y++;}LL.add(j);
    	   }L.add(LL);
       }
       int P[]= new int[y];
       boolean G[][]= new boolean[y][y];
       int R[]= new int[y];
       for (int i = 0,j=0; i < 26; i++){if(D[i]==1){P[j]=i;D[i]=j;j++;}}
       while(!L.isEmpty()){LinkedList<Integer> LL=L.remove();l=LL.remove();
            while(!LL.isEmpty()){int k=LL.remove();G[D[l]][D[k]]=true;G[D[k]][D[l]]=true;}
       }
       LinkedList<Integer>LI= new LinkedList<Integer>();
       LinkedList<Integer>M= new LinkedList<Integer>();
       int MINB= Integer.MAX_VALUE,p=0,MAX=Integer.MIN_VALUE,N=0;
       String res="";
    	   for (int i = 0; i < y; i++){l=1<<i;
			  if((N&l)==0){R[p]=P[i];N=N|l;
			     M.add(MAX);for (int j = 0; j < p; j++){if(G[D[R[j]]][D[P[i]]]){MAX=Math.max(MAX,p-j);break;}}
			     p++;LI.add(i);i=-1;
				 if(p==y){if(MINB>MAX){res="";MINB=MAX;for (int j = 0; j < y; j++)res=res+(char)(R[j]+65)+" ";}
				 i=LI.removeLast();p--;MAX=M.removeLast();N=N&~(l);
				 }
			  }
			  while(i==y-1&&p>0){i=LI.removeLast();N=N&~(1<<i);MAX=M.removeLast();p--;
			  }
	       }
    	   pw.println(res+"-> "+MINB);
     }pw.close();
	}
}
/*
A:FB;B:GC;D:GC;F:AGH;E:HD
#

*/