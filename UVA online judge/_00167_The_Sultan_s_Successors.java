import java.io.*;	          	
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00167_The_Sultan_s_Successors {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int k = Integer.parseInt(br.readLine());
        for (int xd = 0; xd < k; xd++){
			int  M[][]= new int[8][8];
			LinkedList<Integer> C = new LinkedList<Integer>();
			for (int i = 0; i < 8; i++) {StringTokenizer tk = new StringTokenizer(br.readLine());C.add(i);
				for (int j = 0; j < 8; j++)M[i][j]=Integer.parseInt(tk.nextToken());
			}
			int DD=0,DI=0,MAX=0,S=0,i=0,j=7,c;
			LinkedList<Integer> PM= new LinkedList<Integer>();
			LinkedList<Integer> PC= new LinkedList<Integer>();
			LinkedList<Integer> PJ= new LinkedList<Integer>();
			while(true){
			    while(j>=0){
					c=C.removeFirst();
					if((DD&(1<<(c-i+7)))==0&&(DI&(1<<(c+i)))==0){PJ.addLast(j);PM.addLast(S);PC.addLast(c);S=S+M[i][c];
					DD=DD|(1<<(c-i+7));DI=DI|(1<<(c+i));i++;j=7-i;
					if(i==8)MAX=Math.max(MAX,S); break;
					}else {C.add(c);j--;}
				}
				if(j==-1){i--;if(i==-1)break;S=PM.removeLast();c=PC.removeLast();C.addLast(c);j=PJ.removeLast()-1;
			          DD=DD&~(1<<(c-i+7));DI=DI&~(1<<(c+i));
				}
			}
			if(MAX<10)pw.print(" ");
			if(MAX<100)pw.print(" ");
			pw.println("  "+MAX);
		}pw.close();
	}
}


/*
1
1 2 3 4 5 6 7 8
9 10 11 12 13 14 15 16
17 18 19 20 21 22 23 24
25 26 27 28 29 30 31 32
33 34 35 36 37 38 39 40
41 42 43 44 45 46 47 48
49 50 51 52 53 54 55 56
57 58 59 60 61 62 63 64
*/