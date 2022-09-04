import java.util.*;
public class _12398_NumPuzz_I {
	public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int t=1;
      try{
      while(true){
		String cad = leer.nextLine();
		int M[][]=new int[5][5];
		int X[]={0,-1,0,1,0};
		int Y[]={0,0,1,0,-1};
		for (int j = cad.length()-1; j >=0; j--){
			int x=(cad.charAt(j)-97)/3+1;
			int y=(cad.charAt(j)-97)%3+1;
			for (int k = 0; k < 5; k++)
				M[x+X[k]][y+Y[k]]++;
		}
		System.out.println("Case #"+t+":");
		t++;
		for (int j = 1; j <=3; j++){
			for (int k = 1; k <=3; k++){
				if(k>1)System.out.print(" ");
				System.out.print(M[j][k]%10);
			}System.out.println();
		 }
	   }
      }catch(Exception e){}
	}
}
/*
cd

cdifbgah
*/