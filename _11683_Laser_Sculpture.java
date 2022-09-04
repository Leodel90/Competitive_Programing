import java.util.*;
public class _11683_Laser_Sculpture{
	public static void main(String[] args){
	   Scanner leer = new Scanner(System.in);
	   while(leer.hasNext()){
		   int a = leer.nextInt();
		   int c = leer.nextInt();
		   if(a>0 || c>0){
			   int min=a,ant=a;
			   boolean s=true;
			   long res =0;
			   for(int i=0; i<c; i++){
				   int l=leer.nextInt();
				   if(s){
				   	if(ant<l)s=false;
				   	else min=l;
				   }else{
					   if(ant>l){res+=ant-min;min=l;s=true;}
				   }
				   ant=l;
			   }
			   res+=a-min;
			   System.out.println(res);
		   }else break;
	   }
	}
}
