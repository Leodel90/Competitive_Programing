import java.io.*;
import java.util.LinkedList;
public class _00296_Safebreaker{
	static int C[],G[][],NC1[],NC2[],DC[][],DG[][],min[],SC1[],p,g,cc;
	static boolean M[][],q;
	static String r;
	public static void MasterMind(){
		if(p==4){cc++;
		    q=cc<=1;
		    if(q){for (int i = 0; i < 4; i++)r=r+C[i];}
			return;
		}
		for (int i = 0; i <=9 &&q; i++){
			LinkedList<Integer> LC= new LinkedList<Integer>();
			LinkedList<Integer> LNC= new LinkedList<Integer>();
			boolean qq=true;C[p]=i;
			for (int j = 0; j < g&&qq; j++){
				if(G[j][p]!=i){LNC.add(j);DG[j][G[j][p]]++;DC[j][i]++;
				   if(!M[j][G[j][p]] && DG[j][G[j][p]]<=DC[j][G[j][p]])min[j]++;
				   if(M[j][i])min[j]++;
				   M[j][G[j][p]]=DC[j][G[j][p]]<DG[j][G[j][p]];
				   M[j][i]=DC[j][i]<DG[j][i];
				}else{LC.add(j);SC1[j]++;}
				qq=min[j]<=NC2[j]&&NC2[j]-min[j]<=(4-p-1)<<1&&SC1[j]<=NC1[j]&&NC1[j]-SC1[j]<=4-p-1;
			}
			if(qq){p++;MasterMind();p--;}
			int j;
			while(!LC.isEmpty()){j=LC.remove();SC1[j]--;}
			while(!LNC.isEmpty()){j=LNC.remove();
				if(DC[j][G[j][p]]>=DG[j][G[j][p]])min[j]--;
				if(DG[j][i]>=DC[j][i])min[j]--;
				DG[j][G[j][p]]--;DC[j][i]--;
				M[j][G[j][p]]=DC[j][G[j][p]]<DG[j][G[j][p]];
				M[j][i]=DC[j][i]<DG[j][i];
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
		int n = Integer.parseInt(br.readLine());
		for (int xd = 0; xd < n; xd++){
			g= Integer.parseInt(br.readLine());
			G= new int[g][4];NC1= new int [g];NC2= new int [g];
			DC= new int[g][10];DG= new int[g][10];M= new boolean[g][10];
			min= new int [g];SC1= new int [g];
			for(int i = 0; i < g; i++){r=br.readLine();
			   for (int j = 0; j < 4; j++)G[i][j]=r.charAt(j)-48;
			   NC1[i]=r.charAt(5)-48;
			   NC2[i]=r.charAt(7)-48;
			}
			C= new int [4];r="";cc=0;q=true;p=0;
			MasterMind();
		    if(cc==0)pw.println("impossible");
		    if(cc==1)pw.println(r);
		    if(cc==2)pw.println("indeterminate");
		}pw.close();
	}
}
/*
4
6
9793 0/1
2384 0/2
6264 0/1
3383 1/0
2795 0/0
0218 1/0
1
1234 4/0
1
1234 2/2
2
6428 3/0
1357 3/0
*/