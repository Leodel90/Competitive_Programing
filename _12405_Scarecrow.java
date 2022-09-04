import java.io.*;
public class _12405_Scarecrow{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		PrintWriter pw= new  PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int t = Integer.parseInt(br.readLine()),xd=1; xd<=t;xd++){
			int n= Integer.parseInt(br.readLine());
			char T[]= ("#"+br.readLine()+"##").toCharArray();
			int a=0,s=0;
			for (int i = 1; i<T.length-1; i++){
				if(T[i]=='#'){
					if(T[i-1]=='.'){s+=a/3;if(a%3!=0)s++;
						if(T[i+1]=='.'&&a%3==1)a=-1; else a=0;
					}
				}else a++;
			}pw.println("Case "+xd+": "+s);
		}
		pw.close();
	}
}
/*
3
3
.#.
11
...##....##
2
##
19
....#....#....#....
18
....#........#....
1
#
*/