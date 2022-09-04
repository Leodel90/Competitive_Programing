import java.io.*;
public class _11078_Open_Credit_System {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter( new BufferedWriter(new OutputStreamWriter(System.out)));
        int t = Integer.parseInt(br.readLine());
        for (int xd = 0; xd < t; xd++){
			int n = Integer.parseInt(br.readLine());
			int s1=-450001;
			int j1=Integer.parseInt(br.readLine()),s2=j1,a=j1;
			for (int i = 1; i < n; i++){
				int x = Integer.parseInt(br.readLine());
				if(x>s2)s2=x;
				if(x>a){if(a-x>=s1-j1){s1=a;j1=x;}
				}else{if(s2-x>=s1-j1){s1=s2;j1=x;}
				}
				a=x;
			}
			pw.println(s1-j1);
		}pw.close();
	}
}
/*
3
2
100
20
4
4
3
2
1
4
1
2
3
4


8
4
-1
-2
-3
-4
4
-4
-3
-2
-1
5
-3
-2
1
7
8
10
-3
-2
1
7
8
7
4
1
1
1
15
-3
-2
1
7
8
7
4
1
1
1
2
5
13
14
2
11
1
3
1
4
3
6
5
10
-15
20
1
11
1
3
1
4
3
6
5
10
15
20
1
11
1
3
2
4
1
6
5
10
15
20
19


*/