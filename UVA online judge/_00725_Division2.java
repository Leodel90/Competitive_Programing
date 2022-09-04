import java.io.*;
import java.util.LinkedList;
public class _00725_Division2 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        	LinkedList<Integer> PI= new LinkedList<Integer>();
        	LinkedList<Integer> D[]= new LinkedList[80];
        	LinkedList<Integer> N[]= new LinkedList[80];
        	for (int i = 2; i < 80; i++){D[i]=new LinkedList<Integer>();N[i]=new LinkedList<Integer>();}
        	int np=0,den=0,pp,c=0,num,cnum,m,n,l,cnp;
        	double y,z;
        	boolean q;
        	for (int i = 0; i <=9; i++){pp=1<<i;
        	 if((np&pp)==0){np=np|pp;den=den*10+i;PI.add(i);i=-1;c++;
        	   if(c==5){
        		   y=10000.0/(double)den;
        		   z=Math.min(y*10,79);
        		   if((int)y<y)y++;
        		   y=Math.max(y,2);
        		   if(y>z)break;
        		   for (int j = (int)y; j <=z; j++){
				             num=den*j;cnum=num;q=true;
				             cnp=np;
				             while(cnum>0&&q){
				            	 m=cnum%10;
				            	 q=(cnp&(1<<m))==0;
				            	 if(q)cnp=cnp|(1<<m);
				            	 cnum=cnum/10;
				             }if(q){D[j].add(den);N[j].add(num);}
			       }den=den/10;i=PI.removeLast();np=np&~pp;c--;
        	   }
        	 }while(i==9&&c>0){c--;i=PI.removeLast();np=np&~(1<<i);den=den/10;}
			}
        	q=false;
        	while(true){
        		n =Integer.parseInt(br.readLine());
        		if (n==0)break;
        		if(q)pw.println();
        		else q=true;
        		l=D[n].size();
        		if(l>0){while(l>0){den=D[n].remove();num=N[n].remove();D[n].add(den);N[n].add(num);l--;
        				if(den<10000)pw.println(num+" / 0"+den+" = "+n);
        				else pw.println(num+" / "+den+" = "+n);
        			}
        		}else pw.println("There are no solutions for "+n+".");
        	}
        	pw.close();
	}
}

/*
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
0
*/