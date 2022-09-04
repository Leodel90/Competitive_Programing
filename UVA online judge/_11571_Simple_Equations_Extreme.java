import java.util.*;
public class _11571_Simple_Equations_Extreme {
	//Uno de los ejercicios mas dificiles que eh resuelto...
	public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
    int n = leer.nextInt();
    for (int i = 0; i < n; i++){
		long A = leer.nextLong(),B=leer.nextLong(),C=leer.nextLong();
		long X[]= new long[3];
		long A2,R;
		boolean ra=(A&1)==1,rc=(C&1)==1,q=false;
		if(ra)A2=((A-1)>>1)*(A-1)+A;
		else A2=(A>>1)*A;
		R=C-A2+(C>>1);
		if(ra&&rc)R++;
		if(R>0&&ra==rc){double r=Math.sqrt(R);		
		   double t=(A+r)/3.0;
		   long ls=(long)t+1;
		   t=(A-r)/3.0;
      	   long li=(long)t-1;
			   long ac=A2-(C>>1),by=0;
			   if(ra&&rc)ac--;
			   long lia,lsa;
			   while(!q&&li<=ls){
				   X[1]=(li+ls)/2;
				   lsa=ls;lia=li;
				   if(X[1]!=0){
				    R=(X[1]-A)*X[1]+ac;by=B/X[1];
				    if(B%X[1]!=0||R!=by){
					   long bp,rp;
					   if(X[1]<0){bp=-by;rp=-R;}else{bp=by;rp=R;}
					   if(rp>bp)li=X[1];
					   else ls=X[1];
				    }else {q=true;break;}
				   }else ls=X[1];
				   if(lsa==lia)break;
				   if(lsa==ls&&li==lia){if(li==X[1])li=ls; else ls=li;}
			   }
			   if(q){
			   long ay=A-X[1],u=0,ayr=0;
			   if((A&1)!=(X[1]&1)){u=-1;ayr=(ay>>1);}
			   X[0]=(ay-((long)Math.sqrt((ay>>1)*(ay>>1)+ayr-by)<<1)+u)>>1;
			   X[2]=A-X[0]-X[1];
			   q=X[0]!=X[1]&&X[1]!=X[2]&&X[2]!=X[0]&&X[0]*X[1]*X[2]==B&&X[0]*X[0]+X[1]*X[1]+X[2]*X[2]==C;
			   }
		}
		if(q){Arrays.sort(X);System.out.println(X[0]+" "+X[1]+" "+X[2]);}
		else System.out.println("No solution.");
	}
	}
}

/*
14
3464101614 2999999996297300442  5999999992594600886   
1          2999999998029351248  5999999996058702501
3464101615 2999999998029351248  5999999996058702501
3464101615 2999999998029351249  5999999996058702499
3000000 1000000000000000000 3000000000000
101010000 1000000000000000000 10001000100000000        
9 27 27
6000000000000000000 6000000000000000000 6000000000000000000
6000000 6000000000000000000 14000000000000      
20 7020 2338
1 8 21
6 6 14
12 64 58
12 64 48

*/