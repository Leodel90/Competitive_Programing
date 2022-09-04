import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class _11849_CD {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
        	StringTokenizer T= new StringTokenizer(br.readLine());
        	int n = Integer.parseInt(T.nextToken());
        	int m = Integer.parseInt(T.nextToken());
        	if(n+m==0)break;
        	TreeSet<Long> CD= new TreeSet<Long>();
        	for (int i = 0; i < n; i++)CD.add(Long.parseLong(br.readLine()));
        	int r=0;
        	long a=Long.MAX_VALUE;
        	for (int i = 0; i < m; i++){
				long x = Long.parseLong(br.readLine());
				if(a!=x){if(CD.contains(x))r++;
				a=x;
				}
			}
        	System.out.println(r);
		}
	}
}
