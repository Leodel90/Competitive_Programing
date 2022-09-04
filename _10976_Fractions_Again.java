import java.io.*;
import java.util.LinkedList;
public class _10976_Fractions_Again {
	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter( new OutputStreamWriter(System.out)));
		LinkedList <String> L[]= new LinkedList[10001];
		try{while(true){
                int k= Integer.parseInt(br.readLine());
				if(L[k]==null){L[k]= new LinkedList<String>();
				String r="1/"+k+" = ";
				int y =k+1;
				       	while (true){
							double x = (double)(y*k)/(double)(y-k);
							if(x>=y){
							if((int)x==x){StringBuilder h= new StringBuilder(r);h.append("1/"+(int)x+" + 1/"+y);
								L[k].add(h.toString());
							}}else break;
							y++;
						}
				}int l =L[k].size();
				pw.println(l);
				for (int i = 0; i < l; i++){
					String h = L[k].removeFirst();L[k].addLast(h);
					pw.println(h);
				}
			}
		}catch(Exception e){}
		pw.close();
	}
}
/*
10000
2
12
3
2
e

*/