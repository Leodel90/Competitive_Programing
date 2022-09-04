import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _12406_Help_Dexter {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter (new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int i = 1,t=Integer.parseInt(br.readLine()),p,q; i <=t; i++){
			StringTokenizer tk= new StringTokenizer(br.readLine());
			p=Integer.parseInt(tk.nextToken());q=Integer.parseInt(tk.nextToken());
			long N[]= new long[2];
			for (long j = 1,min=Math.min(p, q),pp=(long)Math.pow(10, min-1),s,v,c,p2=(long)(1)<<q,p10; j <=2; j++){
				s=2;v=0;c=0;p10=pp;
				LinkedList<Long> Ps= new LinkedList<Long>();
				boolean q1=true,q2=true;
				while(true){
					if(q1){
						if(q2){
							if(p10==1){
								if(s%p2==0)break;else q1=false;
							}
						}
						if(q1){
							Ps.add(s);
							if((v&((long)1<<c))==0)s+=p10*j;
							else s+=p10*(3-j);
							c++;p10/=(long)10;
							q2=true;
						}
					}
					else{
						if(Ps.isEmpty())break;
						c--;p10*=(long)10;s=(long)1<<c;
						if((v&s)==0){v|=s;q1=true;q2=false;}
						else v&=~s;
						s=Ps.removeLast();
					}
				}
				if(q1){p10=pp*10;
					for (long k = min+1; k<=p; k++,p10*=10)s+=j*p10;
					N[(int)j-1]=s;
				}
			}
			pw.print("Case "+i+":");
			if(N[0]!=0){
				if(N[1]!=N[0])pw.println(" "+N[0]+" "+N[1]);
				else pw.println(" "+N[0]);
			}else pw.println(" impossible");
		}
		pw.close();
	}
}
