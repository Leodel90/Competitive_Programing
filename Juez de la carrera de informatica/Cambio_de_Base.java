import java.util.*;
public class Cambio_de_Base {
	public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     while(leer.hasNext()){
    	 int N = leer.nextInt();
    	 for (int i = 0; i < N; i++){
			int n = leer.nextInt();
			String a = leer.next();
			int res= Integer.parseInt(a,9);if(n!=res){
				res= Integer.parseInt(a,8);if(n!=res){
					res= Integer.parseInt(a,7);if(n!=res){
						res= Integer.parseInt(a,6);if(n!=res){
							res= Integer.parseInt(a,5);if(n!=res){
								res= Integer.parseInt(a,4);if(n!=res){
									res= Integer.parseInt(a,3);if(n!=res){
										res=2;
									}else res=3;
								}else res=4;
							}else res=5;
						}else res=6;
					}else res=7;
				}else res=8;	
			}else res=9;
		    System.out.println(res);
		}
     }
	}
}
/*
2
125 325
45 231

*/
 