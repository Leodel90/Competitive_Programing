import java.io.*;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;
public class _10382_Watering_Grass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		try{
			while(true){
				TreeMap<Double, Double> C= new TreeMap<Double, Double>();
				StringTokenizer tk= new StringTokenizer(br.readLine());
				long n=Integer.parseInt(tk.nextToken()),l=Integer.parseInt(tk.nextToken()),w= Integer.parseInt(tk.nextToken());
				double fli=1;
				for (int i = 0; i < n; i++){
					tk = new StringTokenizer(br.readLine());
					long x=Integer.parseInt(tk.nextToken()),r= Integer.parseInt(tk.nextToken());
					if(r+r>=w){
						double dx=Math.sqrt(r*r-Math.pow(w/2.0,2)),li=x-dx;
						if(fli!=1)li=fli;
						if(!(x+dx<0||l<x-dx) && (!C.containsKey(li) || C.get(li)<x+dx)){C.put(x-dx,x+dx);
							if(x-dx<=0){if(fli!=1)C.remove(fli);fli=x-dx;}
						}
					}
				}int c=0;double m=Integer.MIN_VALUE,nm=0;C.put(l+1.0, l+1.0);
				while(!C.isEmpty()&&c>=0&&m<l){
					Entry<Double,Double> e= C.pollFirstEntry();double li=e.getKey(),ls=e.getValue();
					if(li<=nm){nm=Math.max(nm,ls);
						if(m<C.firstKey()){m=nm;c++;}
					}else{c=-1;break;}
				}
				pw.println(c);
			}
		}catch(Exception e){}
		pw.close();
	}
}

/*
8 20 2
5 3
4 1
1 2
7 2
10 2
13 3
16 2
19 4
3 10 1
3 5
9 3
6 1
3 10 1
5 3
1 1
9 1

*/