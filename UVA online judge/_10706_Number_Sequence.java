import java.io.*;
public class _10706_Number_Sequence{
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		long F1[]= new long[7],F2[]= new long[7],P10[]= new long[7],p=1;
		for (int i = 1; i < 7; i++){
			F1[i]=F1[i-1]+F2[i-1]*9*p+i*((9*p*(9*p+1))>>1);
			F2[i]=F2[i-1]+(9*p)*i;
			P10[i]=p;p*=10;
		}
		for (int t = Integer.parseInt(br.readLine()),ls,li,m,d,i; t>0;t--){
			i= Integer.parseInt(br.readLine());
			ls=100000;li=1;long f;
			while(true){
				m=(li+ls)>>1;d=(int)Math.log10(m)+1;
				f=F1[d-1]+(m-P10[d]+1)*F2[d-1]+d*(((m-P10[d]+1)*(m-P10[d]+2) )>>1);
				if(li==ls)break;
				if(f<i)li=m+1;else ls=m;
			}
			ls=m;li=1;f=F2[d-1]+d*(m-P10[d]+1)-(f-i);i=(int)f;
			while(true){
				m=(li+ls)>>1;d=(int)Math.log10(m)+1;
				f=F2[d-1]+(m-P10[d]+1)*d;
				if(li==ls)break;
				if(f<i)li=m+1;else ls=m;
			}i=(int)(f-i);
			pw.println((m/(int)P10[i+1])%10);
		}
		pw.close();
	}
}
