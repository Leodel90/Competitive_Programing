import java.io.*;
import java.util.LinkedList;
public class _10102_The_path_in_the_colored_field {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
		try{while(true){
			 int m= Integer.parseInt(br.readLine());
			 LinkedList<Integer> L1[]=new LinkedList[2];
			 LinkedList<Integer> L3[]=new LinkedList[2];
			 L1[0]= new LinkedList<Integer>();L1[1]= new LinkedList<Integer>();
			 L3[0]= new LinkedList<Integer>();L3[1]= new LinkedList<Integer>();
			 int c=0;
			 for (int i = 0; i < m; i++) {String t=br.readLine();
			     for (int j = 0; j < m; j++){
					if(t.charAt(j)!='2'){
						if(t.charAt(j)=='1'){L1[0].add(i);L1[1].add(j);}
						else{L3[0].add(i);L3[1].add(j);c++;}
					}
				}
			 }
			 int max=0;
			 while(!L1[0].isEmpty()){
				 int min=m*m,x1=L1[0].remove(),y1=L1[1].remove(),x3,y3;
				 for (int i = 0; i < c; i++){
					x3=L3[0].removeFirst();y3=L3[1].removeFirst();
					min=Math.min(min,Math.abs(x1-x3)+Math.abs(y1-y3));
					L3[0].addLast(x3);L3[1].addLast(y3);
				}
				max= Math.max(max, min);
			 }
			 pw.println(max);
			}
		}catch(Exception e){}
		pw.close();
	}
}
/*
4
1223
2123
2213
3212
2
12
33
*/