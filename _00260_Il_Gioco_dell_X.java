import java.io.*;
import java.util.LinkedList;
public class _00260_Il_Gioco_dell_X {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int X[]={-1,-1,0,0,1,1},Y[]={-1,0,-1,1,0,1},xd=1;
			while(true){
				int n= Integer.parseInt(br.readLine());
				if(n==0)break;
				boolean BW[][]=new boolean[n+2][n+2];
				for (int i = 1; i <=n; i++){
					char C[]=br.readLine().toCharArray();
					for (int j = 1; j <=n; j++)BW[i][j]=C[j-1]=='b';
				}boolean r=true;
				for (int i = 1; i <=n&&r; i++){
					if(BW[1][i]){
						int x=1,y=i,p=0;
						LinkedList<Integer> PP= new LinkedList<Integer>();
						boolean q=true,qq=true;
						while(true){
							if(q){
								if(qq){BW[x][y]=false;
									if(x==n){r=false;break;}
								}qq=false;
								for (int j=p;j<6&&!qq; j++){
									if(BW[x+X[j]][y+Y[j]]){
										PP.add(j);p=0;x+=X[j];y+=Y[j];qq=true;
									}
								}q=qq;
							}else{
								if(PP.isEmpty())break;
								p=PP.removeLast();
								x-=X[p];y-=Y[p];p++;qq=false;q=true;
							}
						}
					}
				}
				if(r)pw.println(xd+" W");
				else pw.println(xd+" B");xd++;
			}
		pw.close();
	}
}
/*
4
bbwb
wwbw
bbwb
bwww
4
bbwb
wwbw
bwwb
wwbb
0

*/