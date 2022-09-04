	import java.util.*;
	public class _00725_Division{
		static boolean V[] = new boolean [100000];
		static boolean K[] = new boolean [10];
		static int L[]= new int[30240],k,g,p,c;
		public static void per(){
			if(c==5){L[g]=p;g++;
			V[p]=true;return; 
			}
			for (int i = 0; i < 10; i++){
				if(!K[i]){K[i]=true;c++;
					p=p*10+i;per();c--;
					p=p/10;K[i]=false;
				}
			}
		}
		public static void main(String[] args){
			Scanner leer = new Scanner(System.in);
	        c=0;p=0;g=0;
	        per();
	        LinkedList<Integer> N[]= new LinkedList[80];
	        LinkedList<Integer> D[]= new LinkedList[80];
	        boolean w = false;
	        while(true){
	        	int n = leer.nextInt();
	        	if(n==0)break;
	        	if(N[n]==null){N[n]= new LinkedList<Integer>();
	        	D[n]= new LinkedList<Integer>();int l = 98765/n,i=0;
		        while(L[i]<=l){int h=L[i]*n;
					if(h<100000&&V[h]){int x = L[i];
					K= new boolean[10];
						for (int j = 0; j < 5; j++){K[x%10]=true;x=x/10;}x=h;
						boolean q=true;
						for (int j = 0; j < 5&&q; j++) {q=!K[x%10];x=x/10;}
						if(q){N[n].add(h);D[n].add(L[i]);}
					}
					i++;
				}
	        	}
	        	if(w)System.out.println();
	        	else w=true;
	        	if(!N[n].isEmpty()){int h=N[n].size();
	        	for (int i = 0; i < h; i++){
	        		int num=N[n].remove(),den=D[n].remove();
	        		if(den<10000)System.out.println(num+" / 0"+den+" = "+n);
	        		else System.out.println(num+" / "+den+" = "+n);
	        		N[n].add(num);D[n].add(den);
				}
	        	}else System.out.println("There are no solutions for "+n+".");
	        }
		}
	}
