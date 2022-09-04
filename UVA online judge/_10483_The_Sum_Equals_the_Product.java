import java.io.*;
import java.util.*;
public class _10483_The_Sum_Equals_the_Product {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		double li= Double.parseDouble(tk.nextToken()),ls=Double.parseDouble(tk.nextToken());
		LinkedList<Double> L[]= new LinkedList[(int)ls*100-(int)li*100+1];
		for (int i = 0; i < L.length; i++)L[i]= new LinkedList<Double>();
		if(li==0){L[0].add(0.0);L[0].add(0.0);L[0].add(0.0);}
		double aux;
		int A=1,B,C,aux2;
		for (double a=A/100.0; A <=173; A++,a=A/100.0){
			B=A;if(a<=1){B=(int)(10000.0/A)+1;}
			C=(A+B)*100;aux2=(A*B-10000);
			for (double b = B/100.0,c; true; B++, b=B/100.0,C=(A+B)*100,aux2=(A*B-10000)){
				c=((C*100)/aux2)/100.0;
				if(b<=c){
					if((C*100)%aux2==0){C=(C*100)/aux2;c=C/100.0;
						aux=(A+B+C);aux2=(int)(aux-li*100);aux=aux/100.0;
						if(li<=aux && aux<=ls){L[aux2].add(a);L[aux2].add(b);L[aux2].add(c);
						}
					}
				}else break;
			}
		}
		String R[]=new String[4];
		aux2=(int)(li*100);
		for (int i = 0; i < L.length; i++,aux2++){
			while(!L[i].isEmpty()){
				R[3]=aux2/100.0+"";
				if(R[3].charAt(R[3].length()-2)=='.')R[3]+='0';
				for (int j = 0; j < 3; j++){
					R[j]=L[i].removeFirst()+"";
					if(R[j].charAt(R[j].length()-2)=='.')R[j]+='0';
				} 
				pw.println(R[3]+" = "+R[0]+" + "+R[1]+" + "+R[2]+" = "+R[0]+" * "+R[1]+" * "+R[2]);
				
			}
		}
		pw.close();
	}
}
/*
(A+B)/(A*b-100)
0.01 256.00
5.70 6.10
5.70 5.70
1.00 1.00
256.00 256.00
5.00 6.50
5.70 6.00
*/