import java.io.*;
import java.util.StringTokenizer;
public class _00118_Mutant_Flatworld_Explorers {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		try{
			StringTokenizer tk = new StringTokenizer(br.readLine());
			boolean Y1[]= new boolean[Integer.parseInt(tk.nextToken())+1],
					Y2[]= new boolean[Y1.length],
					X1[]= new boolean[Integer.parseInt(tk.nextToken())+1],
					X2[]= new boolean[X1.length];
			int X[]={0,1,0,-1},Y[]={1,0,-1,0};String POS="NESW";
			while(true){
				tk = new StringTokenizer (br.readLine());
				int x=Integer.parseInt(tk.nextToken()),y=Integer.parseInt(tk.nextToken()),P=POS.indexOf(tk.nextToken());
				char R[]= br.readLine().toCharArray();
				boolean q=true,qq=false;
				for (int i = 0; i < R.length; i++){
					if(R[i]=='F'){
						q=true;
						if(x+X[P]<0){qq=true;if(X1[y])q=false;X1[y]=true;
						if(y==0)Y1[0]=true;if(y==X1.length-1)Y2[0]=true;}
						
						if(x+X[P]>=Y1.length){qq=true;if(X2[y])q=false;X2[y]=true;
						if(y==0)Y1[Y1.length-1]=true;if(y==X1.length-1)Y2[Y1.length-1]=true;}
						
						if(y+Y[P]<0){qq=true;if(Y1[x])q=false;Y1[x]=true;
						if(x==0)X1[0]=true;if(x==Y1.length-1)X2[0]=true;}
						
						if(y+Y[P]>=X1.length){qq=true;if(Y2[x])q=false;Y2[x]=true;
						if(x==0)X1[X1.length-1]=true;if(x==Y1.length-1)X2[X1.length-1]=true;}
						
						if(q){if(qq)break;x+=X[P];y+=Y[P];}qq=false;
					}else{
						if(R[i]=='L')P=(P+3)%4;else P=(P+1)%4;
					}
				}
				pw.print(x+" "+y+" "+POS.charAt(P));
				if(qq)pw.print(" LOST");
				pw.println();
			}
		}catch(Exception e){}
		pw.close();
	}
}
/*
5 3
1 1 E
RFRFRFRF
3 2 N
FRRFLLFFRRFLL
0 3 W
LLFFFLFLFL


*/