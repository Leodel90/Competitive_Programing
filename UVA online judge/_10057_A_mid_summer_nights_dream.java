import java.util.*;
public class _10057_A_mid_summer_nights_dream {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		try{
			while(true){
				int n= leer.nextInt(),min=700000,max=-700000;
			    int P[]= new int [65537];
			    int N[]= new int [65537];
			    long sp=0,sn=0,sr,sl,cp=0,cn=0,r,l,s=1;
			    for (int i = 0; i < n; i++){
					int x = leer.nextInt();
					if(x>=0){P[x]++;cp++;sp+=x;s=s+x;}
					else{N[-x]++;cn++;sn+=x;s=s-x;}
					if(x<min)min=x;
					if(x>max)max=x;
					
				}
			    int A=0,CA=0,PA=0;
			    if(min<0){int h=-Math.min(-1, max);
			    r=cn+cp;l=0;sr=sn;sl=0;
			    for (int i = -min; i >=h; i--){
					long m=sp+sr+r*i-i*l-sl,c=N[i];c=c*i;
					if(m<=s){
						if(m<s){A=-i;CA=N[i];PA=1;s=m;
						}else{PA++; CA+=N[i];}
					}
					sl=sl-c;
					sr=sr+c;
					r=r-N[i];l=l+N[i];
				}
			    }
			    if(max>=0){r=cp;l=cn;sr=sp;sl=0;
			    	for (int i = Math.max(0, min); i <=max; i++){
						long m=sr-r*i+l*i-sn-sl,c=P[i];c=c*i;
						if(m<=s){
							if(m<s){A=i;CA=P[i];PA=1;s=m;}
							else {PA++;CA+=P[i];}
						}
						sr=sr-c;sl=sl+c;
						r=r-P[i];l=l+P[i];
					}
			    
			    }
			    System.out.println(A+" "+CA+" "+PA);
			}
		}catch(Exception e){}
	}
}

/*
2
10
10
4
1
2
2
4
*/