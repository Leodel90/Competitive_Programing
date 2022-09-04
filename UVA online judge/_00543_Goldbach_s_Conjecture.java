import java.io.*;
import java.util.*;
public class _00543_Goldbach_s_Conjecture {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		boolean v[] =new boolean[1000001];
		int evenN[]= new int [1000001];
		LinkedList<Integer> primes= new LinkedList<>();
		for(int i=2;i<v.length;i++){	
			if(!v[i]){primes.add(i);
				for (int j = i+i; j < v.length; j+=i) v[j]=true;
			}
		}
		for (int i = 6; i < v.length; i+=2){
			Iterator<Integer> it= primes.iterator();it.next();
			while(it.hasNext()){
				int p = it.next();
				if(!v[i-p]){evenN[i]=p;break;}
			}
		}
		while(true){	
			int n =Integer.parseInt(br.readLine());
			if(n==0)break;
			pw.println(n+" = "+evenN[n]+" + "+(n-evenN[n]));
		}
		pw.close();
	}
}
/*
8
20
42
999998
999996
0
*/