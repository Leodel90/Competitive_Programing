import java.util.*;
public class Numeros_Romanos {
	static String N [];
	public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    N= new String [3501];
    N[1]="i";N[5]="v";N[10]="x";N[50]="l";N[100]="c";N[500]="d";N[1000]="m";
    int nro[]={1,5,10,50,100,500,1000}; 
    while(leer.hasNext()){
    	int n = leer.nextInt();
        if(n>0){
        	String cad = n+"",res="";
        	if(N[n]==null){
            for (int i = cad.length()-1,k=1,j=1;i>=0;i--,k=k+2,j=j*10) {
            	int a=cad.charAt(i);
            	if(a!=48){
            		a=a-48;int x,g=a*j;
            		if(N[g]==null){N[g]="";
						int h=k-1;
						if(a==9 || a==4){x=k;
						 if(a==9)x++;
						N[g]=N[nro[h]]+N[nro[x]];
						}else
						{ if(a>5){N[g]=N[nro[k]];x=a-5;}else x=a;
							for (int l = 0; l < x; l++) {
								N[g]+=N[nro[h]];
							}
						}
					}res=N[g]+res;
				}
            }
            N[n]=res;
            }
        	System.out.println(n+" => "+N[n]);
        }
    }
	}
}
/*
3
8
172
4
1990
5
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
12
13
14
15
16
17
18
19
20
50
49
48
65
63
48
100
101
1432

*/
