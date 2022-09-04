import java.io.*;
public class _10502_Counting_Rectangles {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        	while(true){
        		int n = Integer.parseInt(br.readLine()),m;
        		if(n==0)break;
        		m=Integer.parseInt(br.readLine());
        		int C[]= new int [m];
        		long R=0;
        		for (int i = 0; i < n; i++){String cad=br.readLine();
        			int LS=0;
        			int S[]= new int [m];
        			int D[]= new int [100];
        			int MIN[]= new int [100];
        			boolean q=true;
					for (int j = 0; j < m; j++){
						if(cad.charAt(j)=='1'){if(q){D[0]=j;q=false;}C[j]++;
						int media,li=0,ls=LS;
						if(MIN[LS]>=C[j]){
						 while(li<ls){
							 media=(li+ls)/2;
							 if(MIN[media]<C[j])li=media+1;
							 else ls=media;
					 	 }
						 }else {LS++;ls=LS;li=LS;D[LS]=j;}
						 media=(li+ls)/2;
						 MIN[media]=C[j];
						 S[j]=(j-D[media]+1)*C[j];
						 if(D[media]>0)S[j]+=S[D[media]-1];
						 LS=media;
						 R+=S[j];
						}else {C[j]=0;S= new int [m];D= new int[100];MIN= new int[100];LS=0;q=true;}
					}
				}
        		pw.println(R);
        	}pw.close();
	}
}
/*
2
2
11
01
4
3
110
101
111
011
3
3
111
111
111
2
2
11
11
3
3
111
111
101
0
*/