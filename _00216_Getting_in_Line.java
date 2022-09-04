import java.io.*;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00216_Getting_in_Line {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		DecimalFormat df= new DecimalFormat("0.00");
		int xd=1;
		while(true){
			int n= Integer.parseInt(br.readLine());
			if(n==0)break;
			int X[]=new int[n+1],Y[]=new int[n+1];
			double D[][]= new double[n+1][n+1];
			for (int i = 1; i <=n; i++){
				StringTokenizer tk = new StringTokenizer(br.readLine());
				X[i]=Integer.parseInt(tk.nextToken());Y[i]=Integer.parseInt(tk.nextToken());
				for (int j = 1; j < n; j++){
					D[i][j]=Math.sqrt(Math.pow(X[i]-X[j],2)+Math.pow(Y[i]-Y[j],2)); D[j][i]=D[i][j];
				}
			}
			LinkedList<Integer> CS= new LinkedList<Integer>(),SA[]=new LinkedList[1<<n];
			CS.add(0);
			LinkedList<Double> S[]= new LinkedList[1<<n];
			S[0]=new LinkedList<Double>();S[0].add(0.0);SA[0]=new LinkedList<Integer>();SA[0].add(0);
			boolean V[]= new boolean[1<<n];
			while(!CS.isEmpty()){
					for (int j = 1,sub=CS.removeFirst(),nsub; j <=n; j++){
						if((sub&(1<<(j-1)))==0){
							Iterator<Integer> it1=SA[sub].iterator();
							Iterator<Double> it2=S[sub].iterator();
							double min=Double.MAX_VALUE;nsub=sub|(1<<(j-1));
							while(it1.hasNext())min=Math.min(min,it2.next()+D[it1.next()][j]);
							if(S[nsub]==null){S[nsub]=new LinkedList<Double>();SA[nsub]= new LinkedList<Integer>();}
							S[nsub].add(min);SA[nsub].add(j);
							if(!V[nsub])CS.add(nsub);V[nsub]=true;
						//	System.out.println(nsub+" "+j);
						}
					}
			}int a=0,sub=(1<<n)-1;
			for (int i = 0,ma,aa; i < n; i++){
				Iterator<Integer> it1=SA[sub].iterator();
				Iterator<Double> it2=S[sub].iterator();ma=0;
				double min=Double.MAX_VALUE,m;
				while(it1.hasNext()){
					m=it2.next();aa=it1.next();
					if(D[aa][a]+m<min){min=D[aa][a]+m;ma=aa;}
				}sub&=~((~sub)+(1<<(ma-1)));
				//System.out.println(min);
				CS.add(ma);a=ma;
			}a=CS.removeFirst();
			pw.println("**********************************************************");
			pw.println("Network #"+xd);xd++;
			double s=0;
			while(!CS.isEmpty()){
				String r=df.format(D[a][CS.getFirst()]+16);
				r=r.substring(0,r.length()-3)+"."+r.charAt(r.length()-2)+r.charAt(r.length()-1);
				pw.println("Cable requirement to connect ("+X[a]+","+Y[a]+") to ("+X[CS.getFirst()]+","+Y[CS.getFirst()]+") is "+r+" feet.");
				s+=D[a][CS.getFirst()]+16;a=CS.removeFirst();
			}
			String r=df.format(s);
			r=r.substring(0,r.length()-3)+"."+r.charAt(r.length()-2)+r.charAt(r.length()-1);
			pw.println("Number of feet of cable required is "+r+".");
		}
		pw.close();
	}
}

/*
6
5 19
55 28
38 101
28 62
111 84
43 116
5
11 27
84 99
142 81
88 30
95 38
3
132 73
49 86
72 111
5
12 16
8 16
8 11
13 8
24 10
0
*/
