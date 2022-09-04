import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _10475_Help_the_Leaders {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int n = Integer.parseInt(br.readLine()),xd=1; xd <=n; xd++){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int t=Integer.parseInt(tk.nextToken()),p=Integer.parseInt(tk.nextToken()),s=Integer.parseInt(tk.nextToken());
			String T[]= new String[t];
			for (int i = 0,ii=0; i < t; i++,ii=i){
				T[i]=br.readLine().toUpperCase();
				while(ii>0){
					if(T[ii].length()>T[ii-1].length() || T[ii].length()==T[ii-1].length() && T[ii].compareTo(T[ii-1])<0){
						String aux= T[ii-1];
						T[ii-1]=T[ii];
						T[ii]=aux;ii--;
					}else break;
				}
			}
			int P[]= new int [t];
			for (int i = 0,pp[]= new int[2]; i < p; i++){
				tk = new StringTokenizer(br.readLine());
				for (int j = 0; j < 2; j++){String aux=tk.nextToken().toUpperCase();
					for (int k = 0; k < t; k++){
						if(T[k].equals(aux)){pp[j]=k;break;}
					}
				}P[Math.min(pp[0],pp[1])]|=1<<Math.max(pp[0], pp[1]);
			}
			boolean q=true,qq=true;
			LinkedList<Integer>Pi= new LinkedList<Integer>(),Pv= new LinkedList<Integer>();
			int c=0,i=0,v=0;
			pw.println("Set "+xd+":");
			while(true){
				if(q){
					if(qq){
						if(c==s){
							Iterator<Integer> it = Pi.iterator();
							pw.print(T[it.next()]);
							while(it.hasNext())pw.print(" "+T[it.next()]);
							pw.println();q=false;
						}
					}qq=false;
						while(i+s-c-1<t&&q){
							if((v&(1<<i))==0){Pv.add(v);v|=P[i];Pi.add(i);q=false;c++;qq=true;}i++;
						}q=qq;
				}else{
					if(c==0)break;
					i=Pi.removeLast()+1;
					v=Pv.removeLast();c--;
					q=true;qq=false;
				}
			}
			pw.println();
		}
		pw.close();
	}
}
/*
2
8 3 2
WAR
TERROR
PEACE
NUCLEAR-BOMB
HUMAN-RIGHT
FOOD
OIL-CRISIS
EQUAL-RIGHT
WAR OIL-CRISIS
EQUAL-RIGHT NUCLEAR-BOMB
OIL-CRISIS WAR
8 0 1
WAR
TERROR
PEACE
NUCLEAR-BOMB
HUMAN-RIGHT
FOOD
OIL-CRISIS
EQUAL-RIGHT

1
5 3 3
a
b
c
d
e
a e
d b
c e
*/