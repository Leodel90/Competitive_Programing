import java.io.*;
import java.util.LinkedList;
public class _00471_Magic_Numbers {
	public static void main(String[] args) throws NumberFormatException, IOException{
	       BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));
	       PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	       int y = Integer.parseInt(br.readLine());
	       String  ee;
	       for (int xd = 0; xd < y; xd++){
	    	   ee="";
	       while(ee.length()==0)ee=br.readLine();
	       if(xd>0)pw.println("");
	       long n = Long.parseLong(ee),den,num,c,lim=100000000;lim=lim*100;
	       int nr=0,r,ud;
	       boolean q=true,o;
	       LinkedList<Integer> PI= new LinkedList<Integer>();
	       for (int i = 1; i <10&&q; i++){int p=0,j=1;den=0;
			  while(true){
				  if((nr&(1<<j))==0){nr=nr|(1<<j);
					    p++;den=den*10+j;
					    PI.add(j);j=-1;
					    if(p==i){num=den*n;
					    if(num>=lim){q=false;break;}
					    o=true;c=num;r=0;
					    while(c>0&&o){ud=(int)(c%10);c=c/10;
					    o=(r&(1<<ud))==0;
					    if(o)r=r|(1<<ud);
					    }
					    if(o){pw.println(num+" / "+den+" = "+n);
					    }
					    j=PI.removeLast();
					    p--;den=den/10;nr=nr&~(1<<j);
					    }
				  }
				  while(j==9&&p>0){j=PI.removeLast();p--;nr=nr&~(1<<j);den=den/10;}
				  if(j==9&&p==0)break;
				  j++;
			  }
		   }
	       }
	       	       pw.close();
	}
}

