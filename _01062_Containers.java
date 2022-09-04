import java.util.*;
public class _01062_Containers {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = 1;
        while(true){
        	String A = leer.nextLine();
        	if(A.equals("end"))break;
        	char C[]= A.toCharArray();
        	int p=0;
        	int P[]= new int [26];
        	for (int i = 0; i < C.length; i++){
        		int m = -1;
        		for (int j = 0; j < p; j++){
					if(P[j]>=C[i]&&(m==-1||P[m]>P[j]))m=j;
				}
        		if(m==-1){P[p]=C[i];p++;}else P[m]=C[i];
			}
            System.out.println("Case "+t+": "+p);t++;
        }       
	}
}

/*
A
CBACBACBACBACBA
CCCCBBBBAAAA
ANZXBCMZVEOTUVXMDNEUFAW
ACMICPC
OHOFM
AAQGHIAEIZ
KHJIGEFDDDDDABAA
ANKLAGRABZBQZ
LMNBXVB
end


*/