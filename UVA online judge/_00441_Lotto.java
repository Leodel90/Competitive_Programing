import java.io.*;
import java.util.StringTokenizer;
public class _00441_Lotto {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
		boolean q =false;
		while(true){StringTokenizer tk = new StringTokenizer(br.readLine());
		   int k= Integer.parseInt(tk.nextToken());
		   if(k==0)break;
		   if(q)pw.println();
		   else q=true;
		   int S[]= new int[k];
		   String P[]= new String[5];
		   for (int i = 0; i < k; i++)S[i]=Integer.parseInt(tk.nextToken());
		   for (int i1 = 0; i1 <=k-6; i1++){P[0]=S[i1]+" ";
		    for (int i2 = i1+1; i2 <=k-5; i2++){P[1]=P[0]+S[i2]+" ";
		     for (int i3 = i2+1; i3 <=k-4; i3++){P[2]=P[1]+S[i3]+" ";
		      for (int i4 = i3+1; i4 <=k-3; i4++){P[3]=P[2]+S[i4]+" ";
		       for (int i5 =i4+1 ; i5 <=k-2; i5++){P[4]=P[3]+S[i5]+" ";
		        for (int i6 = i5+1; i6 <=k-1; i6++)pw.println(P[4]+S[i6]);
		       }
		      }
		   }
		}
      }
     }pw.close();
	}
}
/*
7 1 2 3 4 5 6 7
8 1 2 3 5 8 13 21 34
0
*/