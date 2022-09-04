import java.text.DecimalFormat;
import java.util.*;
public class _10554_Calories_from_fat{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int P[]= {9,4,4,4,7};
		double h=0,p=100,fp=-1,s=0,S=0,TC=0;
		while(true){
			String cad = leer.nextLine();
			if(cad.charAt(0)!='-'){
			  h=0;p=100;fp=-1;s=0;
			  for (int i = 0,c=0; i < cad.length(); i++) {
				if(cad.charAt(i)!=' '){
				  if(cad.charAt(i)>57||cad.charAt(i)<48){
				    if(cad.charAt(i)!='%'){
				       if(cad.charAt(i)=='g')
				    	   h=h*P[c];
				       s+=h;
				      if(c==0)S+=h;
				    }else {p=p-h;
				      if(c==0)fp=h;
				    }
				    c++;
				    h=0;
				}else h=h*10+(cad.charAt(i)-48);
				}
			  }
			  double k=s+(s*(100-p)/p); 
			  TC+=k;
			  if(fp>-1)
				  S+=k*fp/100;
			}else{
				
				if(TC==0)break;
				S=100*S/TC;
				DecimalFormat A = new DecimalFormat("0");
				System.out.println(A.format(S)+"%");
				TC=0;S=0;
			}
		}
	}
}
