import java.io.*;
import java.util.LinkedList;
public class _10063_Knuths_Permutation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
		try{
			boolean xd=false;
			while(true){
				char N[]=br.readLine().toCharArray();
				int n=N.length,i=0,c=0;
				LinkedList<Integer> Pi = new LinkedList<Integer>();
				LinkedList<StringBuilder> Psb= new LinkedList<StringBuilder>();
				boolean q=true,qq=true;
				if(n==0)break;
				if(xd)pw.println();
				else xd=true;
				StringBuilder sb=new StringBuilder();
				String a,b;
				while(true){
					if(q){
						if(qq){i=0;
							if(c==n){
								pw.println(sb);
								i=c+1;
							}
						}qq=false;
						if(i<=c){
							Pi.add(i);Psb.add(sb);
							a=sb.substring(0, i);b=sb.substring(i,sb.length());
							sb= new StringBuilder(a);sb.append(N[c]);sb.append(b);
							qq=true;c++;
						}q=qq;
					}else{
						if(c==0)break;
						c--;i=Pi.removeLast()+1;sb=Psb.removeLast();
						qq=false;q=true;
					}
				}
			}
		}catch(Exception e){}
		pw.close();
	
	}
}
/*
123456789
123456789
123456789
123456789
123456789
abc
bca
dcba
*/