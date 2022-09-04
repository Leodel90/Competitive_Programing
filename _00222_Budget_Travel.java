import java.io.*;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00222_Budget_Travel{
	public static void main(String[] args) throws NumberFormatException, IOException{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
      PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
      StringTokenizer tk;
      int xd=1;
      DecimalFormat df= new DecimalFormat("0.00");
      while(true){
    	  double D = Double.parseDouble(br.readLine());
    	  if (D<0)break;
    	  tk = new StringTokenizer(br.readLine());
    	  double CT= Double.parseDouble(tk.nextToken()),mpg=Double.parseDouble(tk.nextToken()),C=Double.parseDouble(tk.nextToken())*100;
          int ngs= Integer.parseInt(tk.nextToken());
          double GT[]= new double[ngs+1];
          double P[]= new double[ngs],min=Double.MAX_VALUE,c;
          for (int i = 0; i < ngs; i++){tk= new StringTokenizer(br.readLine());
			GT[i]=Double.parseDouble(tk.nextToken());
			P[i]=Double.parseDouble(tk.nextToken());
		  }double capT=CT-GT[0]/mpg;
          GT[ngs]=D;
          LinkedList<Double> PC= new LinkedList<Double>();
          LinkedList<Double> PT= new LinkedList<Double>();
          LinkedList<Boolean> PB= new LinkedList<Boolean>();
          boolean q=true;int p=0;
          while(true){
        	  if(q){q=C<min;
        		  if(q){q=p<ngs;
        			if(q){PC.add(C);PT.add(capT);
        		       if(capT*mpg<GT[p+1]-GT[p]){c=(CT-capT)*P[p];
                       if(c-(long)c>0.5)c++;
              		   C=C+(long)c+200;
        		    	 capT=CT-(GT[p+1]-GT[p])/mpg;PB.add(false);
        		       }else {PB.add(capT<=CT/2.0);capT=capT-(GT[p+1]-GT[p])/mpg;}
        		    p++;}else min=C;
        		  }
        	  }else{p--;if(p==0)break;C=PC.removeLast();capT=PT.removeLast();q=PB.removeLast();
        	  if(q){PC.add(C);PT.add(capT);PB.add(false);
        	      c=(CT-capT)*P[p];
		    	  if(c-(long)c>0.5)c++;
		    	  C=C+(long)c+200;
		    	  capT=CT-(GT[p+1]-GT[p])/mpg;p++;
        	  }
        	  }
          }min=min/100.0;
          String r=df.format(min);
          r=r.substring(0,r.length()-3)+"."+r.charAt(r.length()-2)+r.charAt(r.length()-1);
          pw.println("Data Set #"+xd);xd++;
          pw.println("minimum cost = $"+r);
      }
      pw.close();
	}
}


/*
475.6
11.9 27.4 14.98 6
102.0 99.9
220.0 132.9
256.3 147.9
275.0 102.9
277.6 112.9
381.8 100.9
516.3
15.7 22.1 20.87 3
125.4 125.9
297.9 112.9
345.2 99.9
-1
*/