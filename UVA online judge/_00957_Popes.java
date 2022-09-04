import java.io.*;
public class _00957_Popes {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		PrintWriter pw = new  PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		try{
			while(true){
				int y= Integer.parseInt(br.readLine()),LI=0,LS=0,L=0;
				for (int p = Integer.parseInt(br.readLine()),m=0,li=0,ls,o,P[]= new int[p+1],i=1; i<=p; i++){
					P[i]= Integer.parseInt(br.readLine());o=P[i]-y;ls=i;
					while(li<ls){
						m=(li+ls)>>1;
						if(P[m]<=o&&P[m+1]<=o)li=m+1; else ls=m;
					}
					if(i-li>L){L=i-li;LI=P[li+1];LS=P[i];}
				}
				pw.println(L+" "+LI+" "+LS);
				br.readLine();
			}
		}catch(Exception e){}
		pw.close();
	}

}

/*
5
20
1
2
3
6
8
12
13
13
15
16
17
18
19
20
20
21
25
26
30
31
*/