import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class _01193_Radar_Installation{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter( new OutputStreamWriter(System.out)));
		int xd=1;
		while(true){if(xd>1)br.readLine();
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(tk.nextToken()),d=Integer.parseInt(tk.nextToken());
			if(n==0)break;
			TreeMap<Integer, Integer> I= new TreeMap<Integer,Integer>();
			boolean q=true;
			for (int j = 0,x,y; j < n; j++){tk = new StringTokenizer(br.readLine());
				x=Integer.parseInt(tk.nextToken());y=Integer.parseInt(tk.nextToken());
				if(!I.containsKey(x)||I.get(x)<y)I.put(x,y);
				q=q&&y<=d;
			}
			int c=0;
			if(q){double xc= Integer.MIN_VALUE+10000;
				while(!I.isEmpty()){
					Entry <Integer,Integer> e = I.pollFirstEntry();int x=e.getKey(),y=e.getValue();
					double dis=Math.pow(xc-x,2)+Math.pow(y,2);
					if(dis>(long)d*d){
						if(x>xc)c++;
						xc=Math.sqrt((long)d*d - Math.pow(y,2))+x;
					}
				}
			}else c=-1;
			pw.println("Case "+xd+": "+c);xd++;
		}
		pw.close();
	}
}
/*
3 2
1 2
-3 1
2 1

1 2
0 2

0 0

*/