import java.util.*;
public class _00608_Counterfeit_Dollar{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		for (int i = 0; i < n; i++){
			boolean P[]= new boolean [12];
			boolean E[]= new boolean [12];
			int S[]= new int [12];
			boolean q=false;
			for (int j = 0; j < 3; j++){
				String n1= leer.next();
				String n2= leer.next();
				String b= leer.next();
				if(b.charAt(0)!='e'){
					int p=-1;if(b.charAt(0)=='u')p=1;
					if(q){
						boolean V[]= new boolean[12];
						int G[]= new int [12];
						for (int k = 0; k < n1.length(); k++){V[n1.charAt(k)-65]=true;
						G[n1.charAt(k)-65]=p;
						}
						for (int k = 0; k < n2.length(); k++){V[n2.charAt(k)-65]=true;
						G[n2.charAt(k)-65]=-p;
						}
					   	for (int k = 0; k < 12; k++){
					   		E[k]=E[k]||V[k]&&!P[k]||!V[k]&&P[k]||V[k]&&P[k]&&S[k]!=G[k];
						}
					}else{
						q=true;
						for (int k = 0; k < n1.length(); k++)
						S[n1.charAt(k)-65]=p;
						for (int k = 0; k < n2.length(); k++)
						S[n2.charAt(k)-65]=-p;
					}
				}else{
				   	for (int k = 0; k < n1.length(); k++) 
					E[n1.charAt(k)-65]=true;
				   	for (int k = 0; k < n2.length(); k++) 
					E[n2.charAt(k)-65]=true;
				}
				for (int k = 0; k < n1.length(); k++) 
					P[n1.charAt(k)-65]=true;
				for (int k = 0; k < n2.length(); k++) 
					P[n2.charAt(k)-65]=true;
			}
			for (int j = 0; j < 12; j++){
				if(P[j]&&!E[j]){
					if(S[j]==-1)System.out.println((char)(j+65)+" is the counterfeit coin and it is light.");
					else System.out.println((char)(j+65)+" is the counterfeit coin and it is heavy.");
					break;
				}
			}
		}
	}
}

/*
5
ABCD EFGH even
ABCI EFJK up
ABIJ EFGH even
ABCDEF GHIJKL up
B A even
A D down 
B A even
A D down
ABCDEF GHIJKL up
GH KL down
BAC EFG even
ABCDKF GHIJEL down
ABCDKF GHIJEL down
GH KL down
BAC EFG even
*/