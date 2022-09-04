import java.util.*;
public class _00232_Crossword_Answers{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int xd=1;
		while(leer.hasNext()){
			int r=leer.nextInt();
			if(r>0){
				int c=leer.nextInt();
				char C[][]= new char[r][c];
				int N[][]= new int [r][c];int d=1;
				for (int i = 0; i < r; i++){
					String cad = leer.next();
					for (int j = 0; j < c; j++){
						C[i][j]=cad.charAt(j);
						if(C[i][j]!='*'&(i==0||j==0||(i>0&&C[i-1][j]=='*')||(j>0&&C[i][j-1]=='*'))){N[i][j]=d;d++;}
					}
				}
				if(xd>1)System.out.println();
				System.out.println("puzzle #"+xd+":");xd++;
				System.out.println("Across");
				for (int i = 0; i < r; i++){
					String p="";
					for (int j = 0; j < c; j++){
                           if(C[i][j]!='*'){
                        	   if(p.length()==0){if(N[i][j]>9)p=" "+N[i][j]+".";else p="  "+N[i][j]+".";}
                        	   p=p+C[i][j];
                           }else{
                        	   if(p.length()>0)System.out.println(p);p="";
                           }
					}if(p.length()>0)System.out.println(p);
				}
				System.out.println("Down");
				TreeSet<String> D= new TreeSet<String>();
				for (int i = 0; i < c; i++){
					String p="";
					for (int j = 0; j < r; j++){
						if(C[j][i]!='*'){
							if(p.length()==0){if(N[j][i]>9)p=" "+N[j][i]+".";else p="  "+N[j][i]+".";}
							p=p+C[j][i];
						}else{if(p.length()>0)D.add(p);p="";}
					}if(p.length()>0)D.add(p);
				}
				while(!D.isEmpty())
					System.out.println(D.pollFirst());
			}else break;
		}
	}
}
