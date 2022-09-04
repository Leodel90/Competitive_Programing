package SouthRegional2017;
import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class E {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		char C[]=tk.nextToken().toCharArray();
		int n= Integer.parseInt(tk.nextToken());
		LinkedList<Integer> M= new LinkedList<Integer>();
		int MM[]= new int[n],MD[]=new int[n], MP[]= new int[n];M.add(0);
		MD[0]=10;MP[0]=-1;
		int p10=1,mt=0;
		for (int i = C.length-1; i >0; i--){
			if(C[i]=='?'){
				for (int j = 1,nm,mm,nm2; j < 10; j++){
					nm=((j%n)*p10)%n;
					Iterator<Integer> it = M.iterator();
					LinkedList<Integer> NL= new LinkedList<Integer>();
					while(it.hasNext()){nm2=it.next();mm=(nm+nm2)%n;
						if(MD[mm]==0 && MP[nm2]!=i){
							MD[mm]=j;MP[mm]=i;MM[mm]=nm2;NL.add(mm);
						}
						NL.add(nm2);
					}M=NL;
				}
			}else mt=(mt+( ((C[i]-48)%n)*p10)%n )%n;
			p10=(p10*(10%n))%n;
		}
		boolean q=true;
		if(C[0]=='?'){q=false;
			for (int i = 1,nm; i < 10&&!q; i++){
				nm=(((i%n)*p10)%n+mt)%n;
				if(MD[(n-nm)%n]>0){C[0]=(char)(i+48);q=true;}
			}
		}
		mt=(mt+(((C[0]-48)%n)*p10)%n )%n;mt=(n-mt)%n;
		if(MD[mt]>0&&q){
			for (int i = 0; i < C.length; i++){
				if(C[i]=='?'){
					if(i==MP[mt]){pw.print(MD[mt]);
						mt=MM[mt];
					}else pw.print(0);
				}else pw.print(C[i]);
			}pw.println();
		}else pw.println("*");
		pw.close();
		
	}
}
/*


*/