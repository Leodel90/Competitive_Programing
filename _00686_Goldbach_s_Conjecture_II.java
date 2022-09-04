import java.io.*;
import java.util.*;
public class _00686_Goldbach_s_Conjecture_II {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		boolean v[]= new boolean[(1<<15)+1];
		LinkedList<Integer> primes = new LinkedList<>();
		short evens[]= new short[v.length];
		for (int i = 2; i < v.length; i++){
			if(!v[i]){primes.add(i);
				for (int j = i; j < v.length; j+=i)v[j]=true;
				Iterator<Integer> it =primes.iterator();it.next();
				while(it.hasNext()){
					int p=it.next();
					if(i+p<evens.length)evens[i+p]++;else break;
				}
			}
		}evens[4]++;
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n==0)break;
			pw.println(evens[n]);
		}
	pw.close();
	}
}
/*
6
10
12
0
*/