import java.io.*;
public class _1541_Dividiendo_Numeros {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int i = Integer.parseInt(br.readLine()); i >0; i--){
			int n  = Integer.parseInt(br.readLine());
			int r=0,c=0;
			if(n%4==0)r=0;
			if(n%4==1){r=9;c=1;}
			if(n%4==2){r=6;c=1;}
			if(n%4==3){r=15;c=2;}
			if(n>=r)pw.println((n-r)/4 +c);
			else pw.println("-1");
		}
		pw.close();
	}
}
