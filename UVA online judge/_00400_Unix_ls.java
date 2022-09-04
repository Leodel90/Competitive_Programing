import java.util.*;
public class _00400_Unix_ls {
	public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
          try{
        	  while(true){
        		  int n= leer.nextInt();
        		  String C[]= new String[n];
        		  int max=0;
        		  leer.nextLine();
        		  for (int i = 0; i < n; i++){
					C[i]=leer.nextLine();
					if(C[i].length()>max)max=C[i].length();
        		  }
        		  Arrays.sort(C);
        		  System.out.println("------------------------------------------------------------");
        		  int r=(60-max)/(max+2)+1,g=n/r;
        		  if(n%r!=0)g++;
        		  max+=2;
        		  for (int i = 0; i < g; i++){
        			  String R="";int p=i;
					  for (int j = 0; j < r; j++){
						 if(p<n){
							 R=R+C[p];
							 if(j!=r-1){
							 for(int k = 0; k < max-C[p].length(); k++)
							    R=R+" ";
							 }
							 p+=g;
						 }
					  }
					  System.out.println(R);
				  }
        	  }
          }catch(Exception e){}
	}
}
/*
10
tiny
2short4me
very_long_file_name
shorter
size-1
size2
size3
much_longer_name
12345678.123
mid_size_name
12
Weaser
Alfalfa
Stimey
Buckwheat
Porky
Joe
Darla
Cotton
Butch
Froggy
Mrs_Crabapple
P.D.
19
Mr._French
Jody
Buffy
Sissy
Keith
Danny
Lori
Chris
Shirley
Marsha
Jan
Cindy
Carol
Mike
Greg
Peter
Bobby
Alice
Ruben
*/


