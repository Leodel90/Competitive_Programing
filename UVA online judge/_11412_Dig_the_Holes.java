import java.io.*;
import java.util.*;
public class _11412_Dig_the_Holes{
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int L[]={'B'-65,'G'-65,'Y'-65,'O'-65,'V'-65,'R'-65},H[][]= new int [360][4],HV[]= new int[360];
		LinkedList<Integer> Pi= new LinkedList<Integer>();
		int p=0,a=0,v=0,pp=0;
		boolean q=true,qq=true;
		while(true){
			if(q){
				if(qq){
					if(pp==4){a=6;HV[p]=v;p++;
					if(p<360)H[p]=H[p-1].clone();}
				}
				qq=false;
				for (int i = a; i < 6&&!qq; i++){
					if( (v&(1<<L[i]))==0 ){
						H[p][pp]=L[i];qq=true;Pi.add(i);a=0;v|=1<<L[i];pp++;
					}
				}q=qq;
			}else{
				if(Pi.isEmpty())break;
				q=true;qq=false;
				a=Pi.removeLast();
				v=~(~v|(1<<L[a]));pp--;
				a++;
			}
		}
		int t = Integer.parseInt(br.readLine());
		while(t>0){t--;br.readLine();q=true;
			char G[][]= new char[2][4];
			int N[][]= new int[2][2];
			for (int i = 0; i < 2; i++){
				StringTokenizer tk= new StringTokenizer(br.readLine());
				G[i]=tk.nextToken().toCharArray();
				N[i][0]=Integer.parseInt(tk.nextToken());N[i][1]=Integer.parseInt(tk.nextToken());
				q=q&&N[i][0]+N[i][1]>=2 &&N[i][0]+N[i][1]<=4 && (N[i][0]!=3 || N[i][1]!=1);
			}
			if(q){q=!q;
			for (int i = 0; i < p && !q; i++){q=true;
				for (int j = 0,c1=0,c2=0; j<2 && q;j++,c1=0,c2=0){
					for (int k = 0; k < 4; k++){
						if(H[i][k]!=G[j][k]-65){
							if( (HV[i]&(1<<(G[j][k]-65)))!=0)c2++;
						}else c1++;
					}
					q=c1==N[j][0]&&c2==N[j][1];
				}
			}}
			if(q)pw.println("Possible");
			else pw.println("Cheat");
		}pw.close();
	}
}
/*
8

OYBG 3 1
BGVO 0 1

VRBG 2 2
RVGO 4 0

OVBG 0 2
OVYG 2 0

BVGY 1 0
GVYB 2 2

YGOR 4 0
RGOB 4 0

RBVY 2 1
ORVY 4 0

GYBV 2 1
YORV 0 2

RGBY 3 0
RGBO 4 0
*/