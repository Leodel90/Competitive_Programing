import java.util.*;
public class _10880_Colin_and_Ryan{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        for (int xd = 1; xd <=n; xd++){
	           long c = leer.nextLong();
	           long r = leer.nextLong();
	           long qg=c-r;
	           String res = "Case #"+xd+":";
	           if(qg>0){
	        	   if(qg>r){
	        	   String L="",R="";
	        	   int h=1;
	               while(true){
	                	double k=qg;k/=h;
	                	if(k<h)break;
	                	if((int)k==k){
	                		if(h>r)L+=" "+h;
	                		if(k>r&&k!=h)R=" "+(int)k+R;
	                	}
	                	h++;
	               }
	                res+=L+R;
	               }
	           }else res+=" 0";
	           System.out.println(res);
         }
	}
}
