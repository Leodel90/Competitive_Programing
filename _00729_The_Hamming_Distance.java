import java.io.*;
import java.util.*;
public class _00729_The_Hamming_Distance {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer tk;
		for (int xd = 0; xd < t; xd++){
			br.readLine();
			tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken()),h = Integer.parseInt(tk.nextToken());
			LinkedList<Integer> Pi = new LinkedList<Integer>();
			LinkedList<Character> Pc = new LinkedList<Character>();
			boolean q = true,qq=true;
			int i=0,c0=0,c1=0;
			if(xd>0)pw.println();
			while(true){
				if(q){
					if(qq){
						if(c0+c1==n){
							Iterator<Character> k = Pc.iterator();
							while(k.hasNext())pw.print(k.next());
							pw.println();
							i=2;
						}
					}
					qq=false;
					if(i<2){
						if(i==0){
							if(c0<n-h){Pi.add(i);
							c0++;Pc.add('0');qq=true;}
							else i=1;
						}
						if(i==1 && c1<h){Pi.add(i);
							c1++;i=0;Pc.add('1');qq=true;
						}
					}
					q=qq;
				}else{
					if(c0+c1==0)break;
					i=Pi.removeLast();Pc.removeLast();
					if(i==0)c0--; else c1--;
					i++;q=true;qq=false;
				}
			}
		}pw.close();

	}
}
/*
3

4 2

4 2

1 1
*/