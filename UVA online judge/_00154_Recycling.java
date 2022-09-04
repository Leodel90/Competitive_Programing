import java.io.*;
import java.util.*;
public class _00154_Recycling {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		TreeSet<String> R[]= new TreeSet[100];
		int M[]= new int [100],p=0;
		StringTokenizer tk;
        while(true){String h=br.readLine();
        	if(h.charAt(0)=='#')break;
        	if(h.charAt(0)!='e'){tk= new StringTokenizer(h,",");
        		R[p]=new TreeSet<String>();
        		for (int i = 0; i < 5; i++){String r=tk.nextToken();R[p].add(r);
				 for (int j = 0; j < p; j++){if(!R[j].contains(r)){M[p]++;M[j]++;}}
				}p++;
        	}else{int pm=0;
        		for (int i = 0; i < p; i++){
					if(M[i]<M[pm])pm=i;
				}
        		pw.println(pm+1);
        		M= new int[100];
        		p=0;
        	}
        }
        pw.close();
	}
}

/*
r/P,o/G,y/S,g/A,b/N
r/G,o/P,y/S,g/A,b/N
r/P,y/S,o/G,g/N,b/A
r/P,o/S,y/A,g/G,b/N
e
r/G,o/P,y/S,g/A,b/N
r/P,y/S,o/G,g/N,b/A
r/P,o/S,y/A,g/G,b/N
r/P,o/G,y/S,g/A,b/N
ecclesiastical
#
*/