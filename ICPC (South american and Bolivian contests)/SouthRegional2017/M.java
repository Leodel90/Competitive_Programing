package SouthRegional2017;
import java.io.*;
import java.util.*;
public class M {
	///TLEEEE
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		Comparator<LinkedList<Integer>>  U= new Comparator<LinkedList<Integer>>(){
			public int compare(LinkedList<Integer> A, LinkedList<Integer> B){
				int a1= A.getFirst();
				Iterator<Integer> ita =  A.iterator(),itb=B.iterator();
				while(ita.hasNext() && itb.hasNext()){
					int a=ita.next(),b=itb.next();
					if(a!=b){
						if(a<b)return -1; else return 1;
					}else{
						if(a>a1)return 1;
					}
				}
				if(ita.hasNext())return -1;
				else return 1;
			}
		};
		PriorityQueue<LinkedList<Integer>> PQ= new PriorityQueue<LinkedList<Integer>>(U);
		int np = Integer.parseInt(br.readLine());
		for (int i=0;i<np; i++){
			StringTokenizer tk = new StringTokenizer(br.readLine());tk.nextToken();
			LinkedList<Integer> P= new LinkedList<Integer>();
			while(tk.hasMoreTokens())P.add(Integer.parseInt(tk.nextToken()));
			PQ.add(P);
		}long r=0,d=365,m=1000000007;
		while(!PQ.isEmpty()){
			LinkedList<Integer> P=PQ.poll();
			int p=P.getFirst();boolean q=false;
			while(!P.isEmpty()){
				if(P.getFirst()>p || P.getFirst()==p && q){
					PQ.add(P);break;
				}else{q=P.getFirst()<p||q;r=(((r+P.removeFirst())%m)*d)%m;}
			}
		}
		pw.println(r);
		pw.close();
	}
}
/*
2
4 1 2 3 4
2 5 6
3
1 1
1 2
1 3
3
3 2 5 7
3 3 2 1
4 1 4 6 10
2
3 4 3 2
2 4 3 
2
2 4 3
3 4 3 2 




4
3 100 101 4
3 100 101 3
3 100 101 2
3 100 101 1


720426557

*/