import java.io.*;
import java.util.LinkedList;
public class _11108_Tautology {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter (new BufferedWriter(new OutputStreamWriter(System.out)));
		while(true){
			char WFF[]=br.readLine().toCharArray();
			if(WFF[0]=='0')break;
			boolean P[]= new boolean[5],q=true;
			for (int i1 = 0; i1 < 2&&q; P[0]=!P[0],i1++){
				for (int i2 = 0; i2 < 2&&q; P[1]=!P[1],i2++){
					for (int i3 = 0; i3 < 2&&q; P[2]=!P[2],i3++){
						for (int i4 = 0; i4 < 2&&q; P[3]=!P[3],i4++){
							for (int i5 = 0; i5 < 2&&q; P[4]=!P[4],i5++){
								LinkedList<Boolean> pila= new LinkedList<Boolean>();
								for (int i = WFF.length-1; i>=0; i--){
									if(WFF[i]<97){q=pila.removeLast();
										if(WFF[i]=='K')q=pila.removeLast()&&q;
										if(WFF[i]=='A')q=pila.removeLast()||q;
										if(WFF[i]=='N')q=!q;
										if(WFF[i]=='C')q=pila.removeLast()||!q;
										if(WFF[i]=='E')q=pila.removeLast()==q;
										pila.add(q);
									}else pila.addLast(P[WFF[i]-112]);
									
								}
								q=pila.remove();
							}
						}
					}
				}
			}
			if(q)pw.println("tautology");
			else pw.println("not");
		}
		pw.close();
	}
}
/*
ApNp
ApNq
Cpp
Nt
CApNpApNq
0
*/