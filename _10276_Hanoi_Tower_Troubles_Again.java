import java.io.*;
public class _10276_Hanoi_Tower_Troubles_Again {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int N[] = new int[50];N[0]=1;
		for (int i = 1,p=1; i <50; i++,p=3-p){
			N[i]=N[i-1]+i+p;
		}
		int t= Integer.parseInt(br.readLine());
		for (int xd = 0; xd < t; xd++) {
			pw.println(N[Integer.parseInt(br.readLine())-1]);
		}
		pw.close();
	}
}
/*
12
1
2
3
4
5
6
7
8
9
10
25
50

*/