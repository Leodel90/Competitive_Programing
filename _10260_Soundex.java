import java.util.*;
public class _10260_Soundex {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		try{
			int M[]={0,1,2,3,0,1,2,0,0,2,2,4,5,5,0,1,2,6,2,3,0,1,0,2,0,2};
			while(true){
				String cad = leer.nextLine();
				String c="";int ant=-1;
				for (int i = 0; i < cad.length(); i++){
					if(M[cad.charAt(i)-65]!=0&&M[cad.charAt(i)-65]!=ant)c=c+M[cad.charAt(i)-65];
					ant=M[cad.charAt(i)-65];
				}
				System.out.println(c);
			}
		}catch(Exception e){
		}
	}
}
