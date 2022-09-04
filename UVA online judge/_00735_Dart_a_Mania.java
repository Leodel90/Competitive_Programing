import java.io.*;
public class _00735_Dart_a_Mania{
	public static void main(String[] args) throws NumberFormatException, IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
      long m=(long)1<<50,h;
      int t=1;
      for (int i = 0; i <=20; i++){h=(long)1<<i;
		if((m&h)==0){m=m|h;t++;}h=(long)1<<(i*2);
		if((m&h)==0){m=m|h;t++;}h=(long)1<<(i*3);
		if((m&h)==0){m=m|h;t++;}
      }
      int V[]= new int [t];h=1;
      for (int i=0,j=0; i<=60; i++){
    	  if((m&h)==h){V[j]=i;j++;}
    	  h=h<<1;
      }
      while(true){int n = Integer.parseInt(br.readLine());
         if(n<=0)break;
         int p=0,c=0;
         if(n<=180){
         int s=0;
         for (int i = 0; i < t; i++) {
         if(V[i]<=n){
			for (int j = 0; j < t; j++) {s=V[i]+V[j];
			if(s<=n){
				for (int k = 0; k < t; k++){int a=s+V[k];
					if(a==n){p++;
					   if(i<=j&&j<=k)c++;
					}
				}
				}
			}
			}
		 }
         }
    	 if(p>0){pw.println("NUMBER OF COMBINATIONS THAT SCORES "+n+" IS "+c+".");
    	 pw.println("NUMBER OF PERMUTATIONS THAT SCORES "+n+" IS "+p+".");
    	 }else pw.println("THE SCORE OF "+n+" CANNOT BE MADE WITH THREE DARTS.");
    	 pw.println("**********************************************************************");
      }
      pw.println("END OF OUTPUT");
      pw.close();
	}
}

/*¨
162
175
2
68
211
114
180
-100

*/