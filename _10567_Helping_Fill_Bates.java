import java.io.*;
public class _10567_Helping_Fill_Bates {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
		char C[]= br.readLine().toCharArray();
		int CC[]= new int[52];
		for (int i = 0,p; i < C.length; i++){if(C[i]>=97)p=C[i]-71;else p=C[i]-65;CC[p]++;}
		int CO[][]= new int[52][];
		for (int i = 0; i < 52; i++){CO[i]= new int[CC[i]];CC[i]=0;}
		for (int i = 0,p; i < C.length; i++){
			if(C[i]>=97)p=C[i]-71;else p=C[i]-65;
			CO[p][CC[p]]=i;CC[p]++;
		}
		for (int q = Integer.parseInt(br.readLine()); q>0 ; q--){
			char Q[]= br.readLine().toCharArray();
			int R[]= {-1,-1};boolean qq=true;
			for (int i = 0,p=0,pp; i < Q.length && C.length-p>=Q.length-i&&qq; i++){
				if(Q[i]>=97)pp=Q[i]-71;else pp=Q[i]-65;
				int li=0,ls=CO[pp].length-1,m;
				while(li<ls){
					m=(li+ls)>>1;
					if(CO[pp][m]>=p)ls=m;else li=m+1;
				}
				m=(ls+li)>>1;
				qq=CO[pp].length>0&&CO[pp][m]>=p;
				if(qq){
					if(i==0)R[0]=CO[pp][m];
					if(i==Q.length-1)R[1]=CO[pp][m];
					p=CO[pp][m]+1;
				}
			}
			if(qq)pw.println("Matched "+R[0]+" "+R[1]);
			else pw.println("Not matched");
		}
		pw.close();
	}
}
/*
aaaaaaaaaaaaaabbbbbbbbbdddddddddddccccccccccccc
3
aaaaaaaaaaaaaaaaaaa
aaaaaaaaaaabbbbbbbbbbbc
abccc
*/