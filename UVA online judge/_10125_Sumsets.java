import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
public class _10125_Sumsets{
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		while(true){
			int s = Integer.parseInt(br.readLine());
			if(s==0)break;
			int V[]= new int[s];
			TreeMap<Integer,LinkedList<Integer>>sum_dob= new TreeMap<Integer,LinkedList<Integer>>();
			for (int i = 0; i < s; i++){V[i]=Integer.parseInt(br.readLine());
			   for (int j = 0; j < i; j++){int sum=V[j]+V[i];
				   LinkedList<Integer> T= new LinkedList<Integer>();
				   if(sum_dob.containsKey(sum))T=sum_dob.get(sum);
				   T.add(i);T.add(j);sum_dob.put(sum,T);
			   }
			}
			int max=-1;
			for (int i = 0; i < s; i++){
				if(max==-1||V[i]>V[max]){
					for (int j = 0,dif; j < s; j++){
						if(i!=j){dif=V[i]-V[j];
							if(sum_dob.containsKey(dif)){
								LinkedList<Integer>T=sum_dob.get(dif);
								Iterator k=T.iterator();
								boolean q1,q2;
								while(k.hasNext()){
									dif=(int)k.next();
									q1=dif!=i&&dif!=j;
									dif=(int)k.next();
									q2=dif!=i&&dif!=j;
									if(q1&&q2){max=i;break;}
								}
							}
						}
					}
				}
			}
			if(max<0)pw.println("no solution");
			else pw.println(V[max]);
		}pw.close();
	}
}

/*
5
2
3
5
7
12
5
2
16
64
256
1024
4
-4
-1
0
-5
0
*/
