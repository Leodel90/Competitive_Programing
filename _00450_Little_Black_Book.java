import java.util.*;
public class _00450_Little_Black_Book{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        leer.nextLine();
        LinkedList<String> K= new LinkedList<String>();
        for (int i = 0; i < n; i++){
        	String D= leer.nextLine();
        	try{
			   while(true){
				  String C= leer.nextLine();
				  if(C.length()==0)break;
					 K.add(D+","+C+",");
			   }
			}catch(Exception e) {}
		}
        int l=K.size();
        String D[][]=new String[l][8];
        for (int i = 0; i < l; i++){
			String C=K.remove();
			int k=0;
			for (int j = 0; j < 8; j++) {
			D[i][j]="";
			while(C.charAt(k)!=','){
				D[i][j]+=C.charAt(k);k++;
			}k++;
			}
			int h = i;
			while(h>0){
				boolean q=true;int g=0;
				while(true){
					if(g<D[h][3].length()&&g<D[h-1][3].length()){
						if(D[h][3].charAt(g)!=D[h-1][3].charAt(g)){	q=D[h][3].charAt(g)<D[h-1][3].charAt(g);break;}
						else g++;
					}else {q=D[h][3].length()<D[h-1][3].length();break;}
				}
				if(q){
					for (int m = 0; m < 8; m++){C=D[h][m];D[h][m]=D[h-1][m];D[h-1][m]=C;}h--;
				}else break;
			}
		}
        for (int i = 0; i < l; i++) {
			System.out.println("----------------------------------------");
			System.out.println(D[i][1]+" "+D[i][2]+" "+D[i][3]);
			System.out.println(D[i][4]);
			System.out.println("Department: "+D[i][0]);
			System.out.println("Home Phone: "+D[i][5]);
			System.out.println("Work Phone: "+D[i][6]);
			System.out.println("Campus Box: "+D[i][7]);
		}
	}
}

/*
2
English Department
Dr.,Tom,Davis,Anystreet USA,555-2832,555-2423,823
Mrs.,Jessica,Lembeck,Center Street,555-2543,555-8584,928

Computer Science
Mr.,Jhon,Euler,East Pleasure,555-1432,555-2343,126

*/