import java.util.*;
public class La_clase_estaba_aburrida{
static int as[]= new int [101];
public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      try{
      while(leer.hasNext()){
    	  int n = leer.nextInt();
    	  for (int xd = 0; xd < n; xd++){
            int a = leer.nextInt();
			if(as[a]==0){
				if(a!=1){
			   double r = Math.sqrt(a);as[a]=2;
			   for (int i = 2; i <=r; i++) {
				if(a%i==0){as[a]++;
			    if(a/i!=i)as[a]++;}
			   }
			}else as[a]=1;
				}
			System.out.println("1/"+as[a]);
		}
      }
      }catch(Exception e){}
	}
}
/*
6
10
25
12
7
5
36

*/
