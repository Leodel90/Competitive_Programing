import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _12583_Memory_Overflow {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader( System.in));
        PrintWriter pw = new PrintWriter (new BufferedWriter ( new OutputStreamWriter(System.out)));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer tk;
        for (int xd = 1; xd <=t; xd++){
			tk= new StringTokenizer(br.readLine());
			int n= Integer.parseInt(tk.nextToken()),k=Integer.parseInt(tk.nextToken()),p;
			String P= tk.nextToken();
			LinkedList<Integer> LK= new LinkedList<Integer>();
			int s=0;
			int D[]= new int[26];
			for (int i = 0; i < P.length(); i++){
				p= P.charAt(i)-65;
				if(i>k)D[LK.remove()]--;
				LK.add(p);
				if(D[p]>0)s++;
				D[p]++;
			}
			pw.println("Case "+xd+": "+s);
		}pw.close();
	}
}
