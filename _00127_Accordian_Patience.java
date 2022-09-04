import java.util.*;
public class _00127_Accordian_Patience {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
        while(true){
        	LinkedList<String>M[]= new LinkedList[52];
        	M[0]=new LinkedList<String>();
        	M[0].add(leer.next());
        	if(M[0].getLast().charAt(0)=='#')break;
        	int T3[]= new int [52];T3[0]=-3;
        	int T1[]= new int [52];T1[0]=-1;
        	int S[]= new int [52];S[0]=1;
        	for (int i = 1; i < 52; i++){
				M[i]= new LinkedList<String>();
				M[i].add(leer.next());
				T3[i]=i-3;T1[i]=i-1;S[i]=i+1;
			}
        	int p=1;
        	while(true){boolean x=T1[p]>=0&&(M[T1[p]].getLast().charAt(0)==M[p].getLast().charAt(0)||M[T1[p]].getLast().charAt(1)==M[p].getLast().charAt(1));
        			boolean y=T3[p]>=0&&(M[T3[p]].getLast().charAt(0)==M[p].getLast().charAt(0)||M[T3[p]].getLast().charAt(1)==M[p].getLast().charAt(1));;
        			
        		    if(y||x){
        		    	if(M[p].size()==1){
        		    	S[T1[p]]=S[p];
	                     if(S[p]<52){int t=T3[S[p]];
	                    	 T3[S[p]]=T3[p];
	                    	 T1[S[p]]=T1[p];
	                    	 if(S[S[p]]<52){
	                    		 T3[S[S[p]]]=t;
	                    		 if(S[S[S[p]]]<52)T3[S[S[S[p]]]]=T1[p];
	                    	 }
	                     }
	                     }
	                     if(y){M[T3[p]].add(M[p].removeLast());p=T3[p];}else{M[T1[p]].add(M[p].removeLast());p=T1[p];} 
        		    }else p=S[p];
        		    if(p>=52||M[p].isEmpty())break;
        	}
            int c=0;String h="";
        	for (int i = 0; i < 52; i++){
        		if(!M[i].isEmpty()){c++;h+=" "+M[i].size();}
			}
        	if(c>1)System.out.println(c+" piles remaining:"+h);
        	else System.out.println("1 pile remaining:"+h);
        }
	}
}
/*
QD AD 8H 5S 3H 5H TC 4D JH KS 6H 8S JS AC AS 8D 2H QS TS 3S AH 4H TH TD 3C 6S 8C 7D 4C 4S 7S 9H 7C 5D 2S KD 2D QH JD 6D 9D JC 2C KH 3D QC 6C 9S KC 7H 9C 5C

*/
