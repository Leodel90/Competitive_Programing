import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00208_Firetruck{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer tk;
		try{
			int y=1;
			while(true){
				int f=Integer.parseInt(br.readLine());
				int SC[][]= new int [21][20];
				while(true){tk= new StringTokenizer(br.readLine());
					int n=Integer.parseInt(tk.nextToken()),m=Integer.parseInt(tk.nextToken());
					if(n==0)break;
					SC[n][0]++;SC[m][0]++;
					SC[n][SC[n][0]]=m;SC[m][SC[m][0]]=n;
				}
				for (int i=1; i<=20;i++){
					int h[]= new int [SC[i][0]];
				    for (int j = 0; j <h.length; j++)h[j]=SC[i][j+1];
					Arrays.sort(h);
					SC[i]=h;
				}
				LinkedList<Integer> PSC= new LinkedList<Integer>(),PI= new LinkedList<Integer>();
				int v=0,sc=1,p=0,cr=0;
				boolean q=true,qq=true;
				pw.println("CASE "+y+":");
				while(true){
					if(q){v=v|(1<<sc);
						if(qq){
							if(sc==f){
								for (int i=0,o; i<PSC.size(); i++){o=PSC.removeFirst();PSC.addLast(o);pw.print(o+" ");}
								pw.println(f);cr++;
								q=false;
							}
							}qq=false;
							for(int i=p;i<SC[sc].length&&q;i++){
								if((v&(1<<SC[sc][i]))==0){
									PSC.add(sc);PI.add(i+1);p=0;sc=SC[sc][i];qq=true;break;
								}
							}
						q=qq;
					}else{v=v&~(1<<sc);
					if(PSC.isEmpty())break;
					qq=false;sc=PSC.removeLast();p=PI.removeLast();q=true;
					}
				}
				pw.println("There are "+cr+" routes from the firestation to streetcorner "+f+".");
			y++;
			}
		}catch(Exception e){}
		pw.close();
	}
}

/*
6
1 2
1 3
3 4
3 5
4 6
5 6
2 3
2 4
0 0
4
2 3
3 4
5 1
1 6
7 8
8 9
2 5
5 7
3 1
1 8
4 6
6 9
0 0

// uDebug solo permite hasta "5 9"

20
1 2
1 3
1 4
1 5
1 6
1 7
1 8
1 9
1 10
1 11
1 12
1 13
1 14
1 15
1 16
1 17
1 18
1 19
1 20
2 3
2 4
2 5
2 6
2 7
2 8
2 9
2 10
2 11
2 12
2 13
2 14
2 15
2 16
2 17
2 18
2 19
2 20
3 4
3 5
3 6
3 7
3 8
3 9
3 10
3 11
3 12
3 13
3 14
3 15
3 16
3 17
3 18
3 19
3 20
4 5
4 6
4 7
4 8
4 9
4 10
4 11
4 12
4 13
4 14
4 15
4 16
4 17
4 18
4 19
4 20
5 6
5 7
5 8
5 9
0 0
20
1 2
1 3
1 4
1 5
1 6
1 7
1 8
1 9
1 10
1 11
1 12
1 13
1 14
1 15
1 16
1 17
1 18
1 19
1 20
2 3
2 4
2 5
2 6
2 7
2 8
2 9
2 10
2 11
2 12
2 13
2 14
2 15
2 16
2 17
2 18
2 19
2 20
3 4
3 5
3 6
3 7
3 8
3 9
3 10
3 11
3 12
3 13
3 14
3 15
3 16
3 17
3 18
3 19
3 20
4 5
4 6
4 7
4 8
4 9
4 10
4 11
4 12
4 13
4 14
4 15
4 16
4 17
4 18
4 19
4 20
5 6
5 7
5 8
5 9
0 0
20
1 2
1 3
1 4
1 5
1 6
1 7
1 8
1 9
1 10
1 11
1 12
1 13
1 14
1 15
1 16
1 17
1 18
1 19
1 20
2 3
2 4
2 5
2 6
2 7
2 8
2 9
2 10
2 11
2 12
2 13
2 14
2 15
2 16
2 17
2 18
2 19
2 20
3 4
3 5
3 6
3 7
3 8
3 9
3 10
3 11
3 12
3 13
3 14
3 15
3 16
3 17
3 18
3 19
3 20
4 5
4 6
4 7
4 8
4 9
4 10
4 11
4 12
4 13
4 14
4 15
4 16
4 17
4 18
4 19
4 20
5 6
5 7
5 8
5 9
0 0



5 10
5 11
5 12
5 13
5 14
5 15
5 16
5 17
5 18
5 19
5 20
6 7
6 8
6 9
6 10
6 11
6 12
6 13
6 14
6 15
6 16
6 17
6 18
6 19
6 20
7 8
7 9
7 10
7 11
7 12
7 13
7 14
7 15
7 16
7 17
7 18
7 19
7 20
8 9
8 10
8 11
8 12
8 13
8 14
8 15
8 16
8 17
8 18
8 19
8 20
9 10
9 11
9 12
9 13
9 14
9 15
9 16
9 17
9 18
9 19
9 20
10 11
10 12
10 13
10 14
10 15
10 16
10 17
10 18
10 19
10 20
11 12
11 13
11 14
11 15
11 16
11 17
11 18
11 19
11 20
12 13
12 14
12 15
12 16
12 17
12 18
12 19
12 20
13 14
13 15
13 16
13 17
13 18
13 19
13 20
14 15
14 16
14 17
14 18
14 19
14 20
15 16
15 17
0 0

15 18
15 19
15 20
16 17
16 18
16 19
16 20
17 18
17 19
17 20
18 19
18 20
19 20
0 0
*/