import java.io.*;
public class _10742_The_New_Rule_in_Euphomia{
	public static void main(String[] args) throws NumberFormatException, IOException{
			boolean V [] = new boolean[1000001];
			int CP[]= new int[1000001],P[]= new int[78499],p=0;
			for (int i = 2; i < V.length; i++){
				CP[i]=CP[p];
				if(!V[i]){CP[i]++;p=i;P[CP[i]]=i;
					for (int j = i+i; j < V.length; j+=i)V[j]=true;
				}
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
			int c=1;
			while(true){
				int n = Integer.parseInt(br.readLine());
				if(n==0)break;
				long s=0,d,t=CP[n],a=0;p=(int)t;
				while(t>0){
					d=CP[n-P[p]]-a;
					s+= t*d-((d*(d+1))>>1);
					t=t-1-d;p--;a+=d;
				}
				pw.println("Case "+c+": "+s);c++;
			}pw.close();
	}
}
/*
10
996542
24
129
0


*/