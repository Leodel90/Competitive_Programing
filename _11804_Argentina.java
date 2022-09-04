import java.io.*;
import java.util.StringTokenizer;
public class _11804_Argentina {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int t= Integer.parseInt(br.readLine());
		for (int xd = 1;  xd<=t; xd++){
			String N[]= new String[10];
			for (int i = 0,H[][]= new int[10][2],j; i < 10; i++){
				StringTokenizer tk = new StringTokenizer(br.readLine());
				N[i]=tk.nextToken();H[i][0]=Integer.parseInt(tk.nextToken());H[i][1]=Integer.parseInt(tk.nextToken());
				j=i;
				while(j>0){
					if(H[j][0]>H[j-1][0] || H[j][0]==H[j-1][0]&&(H[j][1]<H[j-1][1] || H[j][1]==H[j-1][1]&& N[j].compareTo(N[j-1])<0)){
						String aux=N[j];N[j]=N[j-1];N[j-1]=aux;
						int aux2=H[j][0];H[j][0]=H[j-1][0];H[j-1][0]=aux2;
						aux2=H[j][1];H[j][1]=H[j-1][1];H[j-1][1]=aux2;j--;
					}else break;
				}
			}
				for (int j = 1,k; j < 10; j++){
					k=j;
					while(k>(j/5)*5){
						if(N[k].compareTo(N[k-1])<0){
							String aux= N[k];N[k]=N[k-1];N[k-1]=aux;k--;
						}else break;
					}
				}
				pw.println("Case "+xd+":");
				pw.println("("+N[0]+", "+N[1]+", "+N[2]+", "+N[3]+", "+N[4]+")");
				pw.println("("+N[5]+", "+N[6]+", "+N[7]+", "+N[8]+", "+N[9]+")");
		}
		pw.close();
	}
}
/*
1
sameezahur 20 21
sohelh 18 9
jaan 17 86
sidky 16 36
shamim 16 18
shadowcoder 12 9
muntasir 13 4
brokenarrow 16 16
emotionalblind 16 12
tanaeem 20 97

*/