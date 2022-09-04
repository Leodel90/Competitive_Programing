import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00301_Transportation{
	public static void main(String[] args) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
      StringTokenizer tk;
      while(true){tk= new StringTokenizer(br.readLine());
    	  int n = Integer.parseInt(tk.nextToken()),m=Integer.parseInt(tk.nextToken()),ns=Integer.parseInt(tk.nextToken());
    	  if(n==0&&m==0&&ns==0)break;
    	  int O[][]= new int[ns][4];ns=0;
    	  for (int i = 0; i <O.length; i++){tk= new StringTokenizer(br.readLine());
			O[ns][0]=Integer.parseInt(tk.nextToken());O[ns][1]=Integer.parseInt(tk.nextToken());O[ns][2]=Integer.parseInt(tk.nextToken());
			O[ns][3]=(O[ns][1]-O[ns][0])*O[ns][2];
			if(O[ns][2]<=n)ns++;
		}
    	  int S[]= new int [m],p=0,C=0,max=0;;
    	  boolean q=true,qq;
    	  LinkedList<Boolean> PV= new LinkedList<Boolean>();
    	  while(true){
    		  if(q){q=p<ns;
    			   if(q){PV.add(S[O[p][0]]+O[p][2]<=n);
    			     if(PV.getLast()){S[O[p][0]]+=O[p][2];if(O[p][1]<m)S[O[p][1]]-=O[p][2];C=C+O[p][3];
    			     }p++;
    			  }else{qq=true;
    			     for (int i = 1,ant=S[0]; i < m&&qq; i++){ant=ant+S[i];qq=ant<=n;}
    			     if(qq&&C>max)max=C;
    			  }
    		  }else {p--; if(p<0)break; q=PV.removeLast();
    			  if(q){S[O[p][0]]-=O[p][2];if(O[p][1]<m)S[O[p][1]]+=O[p][2];C=C-O[p][3];PV.add(false);p++;}
    		  }
    	  }
    	  pw.println(max);
      }pw.close();
    }
}
