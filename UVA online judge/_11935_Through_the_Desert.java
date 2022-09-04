import java.io.*;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _11935_Through_the_Desert {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		DecimalFormat df= new DecimalFormat("0.000");
		while(true){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			LinkedList<Integer> D = new LinkedList<Integer>();
			LinkedList<String> E= new LinkedList<String>();
			LinkedList<Integer> lp100km= new LinkedList<Integer>();
			D.add(Integer.parseInt(tk.nextToken()));E.add(tk.nextToken());tk.nextToken();
			lp100km.add(Integer.parseInt(tk.nextToken()));
			if(lp100km.getFirst()==0)break;
			while(true){
				tk = new StringTokenizer(br.readLine());
				D.add(Integer.parseInt(tk.nextToken()));E.add(tk.nextToken());
				if(tk.countTokens()==2){ tk.nextToken();if(E.getLast().equals("Fuel"))lp100km.add(Integer.parseInt(tk.nextToken()));}
				if(E.getLast().equals("Goal"))break;
			}
			double li=0,ls=Integer.MAX_VALUE,ct,t,tc=0;
			String e;
			while(ls-li>0.0001){
				ct=(li+ls)/2;boolean q=true;t=ct;
				int cl=0,da=0,d;
				Iterator<Integer> it1= D.iterator();
				Iterator<String>it2=E.iterator();
				Iterator<Integer> it3= lp100km.iterator();
				while(it1.hasNext()&&q){
					d=it1.next();e=it2.next();
					t=t-(d-da)*tc-cl*(d-da);q=t>=0;
					if(e.equals("Fuel"))tc=it3.next()/100.0;
					if(e.equals("Leak"))cl++;
					if(e.equals("Mechanic"))cl=0;
					if(e.equals("Gas"))t=ct;
					da=d;
				}
				if(q)ls=ct;
				else li=ct;
			}e=df.format((li+ls)/2.0);
			pw.println(e.substring(0,e.length()-4)+"."+e.substring(e.length()-3,e.length()));
		}
		pw.close();
	}
}
/*
0 Fuel consumption 10
100 Goal
0 Fuel consumption 5
100 Fuel consumption 30
200 Goal
0 Fuel consumption 20
10 Leak
25 Leak
25 Fuel consumption 30
50 Gas station
70 Mechanic
100 Leak
120 Goal
0 Fuel consumption 0

*/