import java.io.*;
import java.util.StringTokenizer;
public class Secuencia_Creciente_Maxima {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n= Integer.parseInt(br.readLine());
		int s =0,p=0,ant=0;
		StringTokenizer tk = new StringTokenizer(br.readLine()+" 0");
		for (int i = 1,a,c=0,pp=1; i <=n+1;i++){
			a=Integer.parseInt(tk.nextToken());
			if(a<=ant){
				if(c>s){s=c;p=pp;}
				c=1;pp=i;
			}
			else c++;
			ant=a;
		}
		pw.println(s+" "+p);
		pw.close();
	}
}
/*
7
3 1 4 1 5 9 2
*/
