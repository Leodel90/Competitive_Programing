import java.io.*;
import java.util.StringTokenizer;
public class _12498_Ant_s_Shopping_Mall {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer tk;
        for (int xd = 1; xd <=t; xd++){tk= new StringTokenizer(br.readLine());
                  int R= Integer.parseInt(tk.nextToken()),C=Integer.parseInt(tk.nextToken());
                  int MIN[]= new int [C];boolean q=true;
                  for (int i = 0; i < R; i++){char c[]= br.readLine().toCharArray();
                  if(q){
                      int ID[]= new int [C],p=-51;
                      for (int j = 0; j < C; j++){
						if(c[j]==48)p=j;
						ID[j]=j-p;
					  }p=51;
                      for (int j = C-1; j >=0; j--){
						if(c[j]==48)p=j;
						MIN[j]+=Math.min(ID[j],p-j);
					  }
                      q=p!=51;
                      }
				  }
                  pw.print("Case "+xd+": ");
                  int min=-1;
                  if(q){min=Integer.MAX_VALUE;
                    for (int i = 0; i < C; i++)min=Math.min(min, MIN[i]);
                  }
                  pw.println(min);
		}pw.close();
	}
}


/*
3
2 4
1010
0101
3 3
111
111
111
3 5
01111
11110
11011

*/