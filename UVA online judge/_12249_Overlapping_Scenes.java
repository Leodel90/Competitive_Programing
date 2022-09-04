import java.io.*;
import java.util.LinkedList;
public class _12249_Overlapping_Scenes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
		int t = Integer.parseInt(br.readLine());
		for (int xd = 1; xd <=t; xd++){
			int n = Integer.parseInt(br.readLine()),min=0;
			char S[][]= new char[n][10];
			for (int i = 0; i < n; i++){S[i]=br.readLine().toCharArray();min+=S[i].length;}
			LinkedList< Integer> Pi= new LinkedList<Integer>(),Pl1= new LinkedList<Integer>(),
					Pl = new LinkedList<Integer>();
			int i=0,l1=0,v=0,c=0,l=0;
			boolean q=true,qq=true,rr=true;
			char R[]= new char[min];
			while(true){
				if(q){
					if(qq){q=c<n;
						if(!q){min=l;
						}
					}qq=false;
					while(i<n && q){
						if((v&(1<<i))==0){
							if(rr){
								l1=Math.max(0,S[i].length-min+l+1);
							}rr=false;
							while(l1<=l && l1<=S[i].length){
								rr=true;
								for (int j = 0,k=l-l1; j < l1 &&rr; j++,k++)rr=R[k]==S[i][j];
								if(rr){v|=(1<<i);
									Pi.add(i);Pl1.add(l1);Pl.add(l);
									for (int j = l1; j < S[i].length; j++,l++)R[l]=S[i][j];
									i=-1;qq=true;c++;q=false;
									break;
								}else l1++;
							}
							rr=true;
						}i++;
					}q=qq;
				}else{
					if(c==0)break;
					i=Pi.removeLast();
					v=v&~(1<<i);c--;l=Pl.removeLast();
					l1=Pl1.removeLast()+1;q=true;qq=false;rr=false;
				}
			}
			pw.println("Case "+xd+": "+min);
		}
		pw.close();
	}
}

/*
6
3
ABCD
DEFGH
CDEF
2
AAAAA
AAAAAAA
6
CAB
AB
A
A
AB
CAB
3
AB
CAB
A
3
CAB
CABB
CAB
4
T
SDFGHF
FT
DFG

*/