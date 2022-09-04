import java.util.*; 
public class _10194_Football_aka_Soccer {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        leer.nextLine();
        for (int xd = 0; xd < n; xd++){
        	String T = leer.nextLine();
        	int t = leer.nextInt();
        	leer.nextLine();
        	String Teams[] = new String[t];
        	for (int i = 0; i < t; i++)
				Teams[i]= leer.nextLine();
        	int g = leer.nextInt();
        	leer.nextLine();
        	int P[]= new int[t];
        	int E[][]= new int[3][t];
        	int gs[]= new int [t];
        	int ga[]= new int [t];
        	int R[]= new int [t];
        	for (int i = 0; i < g; i++){
				String C= leer.nextLine();
				int t1=0,t2=0;
				String aux="";
				int j=0;
				while(C.charAt(j)!='#'){
					aux+=C.charAt(j);j++;
				}j++;
				for (int k = 0; k < t; k++){
					if(aux.equals(Teams[k])){t1=k;break;}
				}
				aux="";int g1=0,g2=0;
				while(C.charAt(j)!='@'){
					g1=g1*10+(C.charAt(j)-48);j++;
				}j++;
				while(C.charAt(j)!='#'){
					g2=g2*10+(C.charAt(j)-48);j++;
				}j++;
				while(j<C.length()){
					aux+=C.charAt(j);j++;
				}
				for (int k = 0; k < t; k++){
					if(aux.equals(Teams[k])){t2=k;break;}
				}
			    if(g1!=g2){
			    	if(g1>g2){P[t1]+=3;E[0][t1]++;E[2][t2]++;}else {P[t2]+=3;E[0][t2]++;E[2][t1]++;}
			    }else{P[t1]++;P[t2]++;E[1][t1]++;E[1][t2]++;}
			    gs[t1]+=g1;gs[t2]+=g2;
			    ga[t1]+=g2;ga[t2]+=g1;
			}
        
        	for (int i = 0; i < t; i++){
				R[i]=i;
				int h=i;
				while(h>0){
					boolean q = P[R[h]]==P[R[h-1]];
					if(q){
						q=E[0][R[h]]==E[0][R[h-1]];
						if(q){int g1=gs[R[h]]-ga[R[h]],g2=gs[R[h-1]]-ga[R[h-1]];
						      q=g1==g2;
						      if(q){q=gs[R[h]]==gs[R[h-1]];
						    	  if(q){
						    		  g1=E[0][R[h]]+E[1][R[h]]+E[2][R[h]];g2=E[0][R[h-1]]+E[1][R[h-1]]+E[2][R[h-1]];
						    		  q=g1==g2;
						    		  if(q){
						    			  int k=0;
                                          String t1=Teams[R[h]].toUpperCase(),t2 = Teams[R[h-1]].toUpperCase();
						    			  while(true){
						    				  if(k<t1.length()&&k<t2.length()){
						    					  if(t1.charAt(k)!=t2.charAt(k)){
						    						  q=t1.charAt(k)<t2.charAt(k);break;
						    					  }
						    				  }else {q=t1.length()<t2.length();break;}
						    				  k++;
						    			  }
						    		  }else q=g1<g2;
						    	  }else q=gs[R[h]]>gs[R[h-1]];
						      }else q=g1>g2;
						}else q=E[0][R[h]]>E[0][R[h-1]];
					}else q=P[R[h]]>P[R[h-1]];
					if(q){int aux = R[h];R[h]=R[h-1];R[h-1]=aux;h--;}else break;
				}
			}
        	if(xd>0)System.out.println();
        	System.out.println(T);
        	for (int i = 0; i < t; i++){
        		int gp=E[0][R[i]]+E[1][R[i]]+E[2][R[i]],gd=gs[R[i]]-ga[R[i]];
				System.out.println(i+1+") "+Teams[R[i]]+" "+P[R[i]]+"p, "+gp+"g ("+E[0][R[i]]+"-"+E[1][R[i]]+"-"+E[2][R[i]]+"), "+gd+"gd ("+gs[R[i]]+"-"+ga[R[i]]+")" );
			}
		}
	}
}
/*
2
World Cup 1998 - Group A
4
Brazil
Norway
Morocco
Scotland
6
Brazil#2@1#Scotland
Norway#2@2#Morocco
Scotland#1@1#Norway
Brazil#3@0#Morocco
Morocco#3@0#Scotland
Brazil#1@2#Norway
Some strange tournament
5
Team A
Team B
Team C
Team D
Team E
5
Team A#1@1#Team B
Team A#2@2#Team C
Team A#0@0#Team D
Team E#2@1#Team C
Team E#1@2#Team D
*/