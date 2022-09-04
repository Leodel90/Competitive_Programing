import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class _11572_Unique_Snowflakes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt((br.readLine()));
		for (int xs = 0; xs < t; xs++){
			int n = Integer.parseInt(br.readLine());
		    TreeMap<String,Integer>V2= new TreeMap<String,Integer>();
		    int max=0,s=0,I=1;
		    for (int i = 1; i <=n; i++){
				String x=br.readLine();s++;
				if(V2.containsKey(x)&&V2.get(x)>=I){I=V2.get(x);s=i-I;I++;}
				V2.put(x, i);
				if(s>max)max=s;
			}
		    System.out.println(max);
		}
	}
}

