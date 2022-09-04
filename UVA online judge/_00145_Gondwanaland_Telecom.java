import java.text.DecimalFormat;
import java.util.*;
public class _00145_Gondwanaland_Telecom{
	public static void main(String[] args){
      Scanner leer = new Scanner(System.in);
      double T[][]=new double[3][5];
      T[0][0]=0.10;T[0][1]=0.25;T[0][2]=0.53;T[0][3]=0.87;T[0][4]=1.44;
      T[1][0]=0.06;T[1][1]=0.15;T[1][2]=0.33;T[1][3]=0.47;T[1][4]=0.80;
      T[2][0]=0.02;T[2][1]=0.05;T[2][2]=0.13;T[2][3]=0.17;T[2][4]=0.30;
      while(true){
    	  String Z = leer.next();
    	  if(Z.charAt(0)!='#'){
    		  String t= leer.next();
    		  int hi= leer.nextInt();
    		  int mi= leer.nextInt();
    		  int hf= leer.nextInt();
    		  int mf= leer.nextInt();
    		  int p=Z.charAt(0)-65;
    		  int r=0,a=2;
    		  int H[]={8,18,22};
    		  int TM[]=new int[3];
    		  if(hi>=H[0]&&hi<=H[1]){r=1;a=0;}
    		  if(hi>=H[1]&&hi<=H[2]){r=2;a=1;}
    		  int dx=0;
    		  if(hf<hi ||hf==hi&& mf<=mi)dx=24*60;
    		  dx+=(hf-hi)*60;
    		  dx+=mf-mi;
    		  int dy=-mi;
    		  double s=0;
    		  while(dx>0){
    			  	if(H[r]<hi)dy+=24*60;
    			  	dy+=(H[r]-hi)*60;
    			  	int h;
    			  	if(dx<=dy)h=dx;	else h=dy;
    			  	s+=T[a][p]*h;
    			  	TM[a]+=h;
    			  	a=r;hi=H[a];
    			  	r++;if(r==3)r=0;
    			  	dx-=dy;
    			  	dy=0;
    		  }
    		  for (int j = 0; j < 10-t.length(); j++) 
				System.out.print(" ");
			  System.out.print(t);
			  t=TM[0]+"";
			  for (int j = 10; j < 16-t.length(); j++)
				  System.out.print(" ");
			  System.out.print(t);
			  t=TM[1]+"";
			  for (int j = 16; j < 22-t.length(); j++)
				  System.out.print(" ");
			  System.out.print(t);
			  t=TM[2]+"";
			  for (int j = 22; j < 28-t.length(); j++)
				  System.out.print(" ");
			  System.out.print(t+"  "+Z);
			DecimalFormat A = new DecimalFormat("0.00");
		    t=A.format(s);
		    t=t.substring(0,t.length()-3)+"."+t.charAt(t.length()-2)+t.charAt(t.length()-1);
		    for (int j = 31; j < 39-t.length(); j++)
		    	System.out.print(" ");
		    System.out.println(t);
    	  }else break;
      }
	}
}


/*
A 183-5724 17 58 18 04
A 183-5724 23 59 00 00
E 183-5724 00 00 00 00
E 183-5724 17 41 17 41
C 183-5724 23 59 23 58
A 234325 00 02 00 10
*/
