import java.io.*;
import java.util.*;
public class _00571_Jugs{
	
	// problema con accepted!!! complejidad (n) para un problema de (n^2)
	public static void main(String[] args){
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer tk;
		try{
			while(true){tk= new StringTokenizer(br.readLine());
				int a= Integer.parseInt(tk.nextToken()),b= Integer.parseInt(tk.nextToken()),n=Integer.parseInt(tk.nextToken());
				LinkedList<Integer>La= new LinkedList<Integer>(),Lb= new LinkedList<Integer>();
				int Ca=0,Cb=0,d=0,bn=b-n;
				if(n<b){
					while(n%a!=d){  
						La.add(1+(b-d)/a);Ca+=2*La.getLast()+2;d=a-(b-d)%a;
					}
					La.add(n/a);Ca+=La.getLast()*2;d=0;
					while(bn%a!=d){
						Lb.add(1+(b-d)/a);Cb+=Lb.getLast()*2+2;d=a-(b-d)%a;
					}
					Lb.add((bn/a));Cb+=Lb.getLast()*2;
					Iterator<Integer> it;
					if(Cb<Ca){
						it=Lb.iterator();d=1;
						while(it.hasNext()){Cb=it.next();
							pw.println("fill B");
							pw.println("pour B A");
							while(Cb>d){Cb--;
								pw.println("empty A");
								pw.println("pour B A");
							}d=0;
						}
					}
					else{
						it=La.iterator();
						while(true){Ca=it.next();
							while(Ca>0){Ca--;
								pw.println("fill A");
								pw.println("pour A B");
							}
							if(it.hasNext()){
								pw.println("empty B");
								pw.println("pour A B");
							}else break;
						}
					}
				}else pw.println("fill B");
				pw.println("success");
			}
		}catch(Exception e){}pw.close();
	}
}
/*
3 5 4
5 7 3
*/