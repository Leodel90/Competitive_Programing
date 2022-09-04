import java.io.*;
import java.util.StringTokenizer;
public class _00507_Jill_Rides_Again {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int xd =1,t= Integer.parseInt(new StringTokenizer(br.readLine()).nextToken()); xd<=t ; xd++){
			int n= Integer.parseInt(new StringTokenizer(br.readLine()).nextToken()),li=1,d=0,s=0,max=0,md=0,mli=0;
			for (int i = 1,nn; i<n; i++){
				nn=Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
				s+=nn;d++;
				if(nn>0){
					if(s<nn){d=1;s=nn;li=i;}
					if(s>max||s==max&&d>md){max=s;md=d;mli=li;}
				}
			}md+=mli;
			if(max==0)pw.println("Route "+xd+" has no nice parts");
			else pw.println("The nicest part of route "+xd+" is between stops "+mli+" and "+md);
		}
		pw.close();
	}
}
/*
  3  
3
  -1
  6
10
  4
  -5
  4
  -3
  4
  4
-4
4
-5
4
-2
-3
-4


*/