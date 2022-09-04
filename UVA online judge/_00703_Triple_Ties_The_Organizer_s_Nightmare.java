import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00703_Triple_Ties_The_Organizer_s_Nightmare{
	public static void main(String[] args){
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        try{StringTokenizer tk;
        	while(true){int n = Integer.parseInt(br.readLine()),t=0;
        	boolean M[][]= new boolean [n][n];
        	for (int i = 0; i < n; i++){
				tk= new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++){
					M[i][j]=tk.nextToken().equals("1");
				}
			}
        	LinkedList<Integer> AS[]= new LinkedList[3];
        	LinkedList<Integer> DE[]= new LinkedList[3];
        	for (int i = 0; i < 3; i++){AS[i]=new LinkedList<Integer>();DE[i]=new LinkedList<Integer>();}
        	for (int i = 0; i < n; i++){
				for (int j = 0; j < i; j++){
					if(M[i][j]){
					for (int k = 0; k < j; k++){
						if(M[j][k]&&M[k][i]){DE[0].add(i+1);DE[1].add(j+1);DE[2].add(k+1);t++;}}
					}
				}
				for (int j = i+1; j < n; j++){
					if(!M[j][i]){
					 for (int k = j+1; k < n; k++){
					 	if(M[i][j]&&M[j][k]&&M[k][i]||!M[i][j]&&!M[j][k]&&!M[k][j]&&!M[k][i]&&!M[i][k]){
					 		AS[0].add(i+1);AS[1].add(j+1);AS[2].add(k+1);t++;}
					 }
					}
				}
			}
        	pw.println(t);
        	while(!AS[0].isEmpty()&&!DE[0].isEmpty()){
        		for (int i = 0; i < 3; i++){
					if(AS[i].getFirst()!=DE[i].getFirst()){
						if(AS[i].getFirst()<DE[i].getFirst()) pw.println(AS[0].remove()+" "+AS[1].remove()+" "+AS[2].remove());
						else pw.println(DE[0].remove()+" "+DE[1].remove()+" "+DE[2].remove());
					    break;
					}
				}
        	}
        	if(AS[0].isEmpty()){
        		while(!DE[0].isEmpty()) pw.println(DE[0].remove()+" "+DE[1].remove()+" "+DE[2].remove());
        	}else{
        		while(!AS[0].isEmpty()) pw.println(AS[0].remove()+" "+AS[1].remove()+" "+AS[2].remove());
        	}
        	}
        }catch(Exception e){}
        pw.close();
	}
}

/*
3
0 0 1
1 0 0
0 1 0
3
0 1 0
0 0 0
0 0 0
3
0 0 0
0 0 0
0 0 0
*/
