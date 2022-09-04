import java.io.*;
import java.util.StringTokenizer;
public class _00102_Ecological_Bin_Packing {
	public static void main(String[] args) {
     BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
     PrintWriter pr = new PrintWriter( new BufferedWriter( new  OutputStreamWriter(System.out)));
     try{while(true){
    	   	   StringTokenizer t= new StringTokenizer(br.readLine());
    	   	   int H[]= new int[9],s=0,min=0;
    	   	   while(t.hasMoreElements()){H[s]=Integer.parseInt(t.nextToken());min+=H[s];s++;}
    	   	   int b=0,g=1,c=2;
    	   	   int M[][]= new int [3][3];
    	   	   for (int i = 0; i < 3; i++){
				M[(b/3+2)%3][0]=H[b]+H[(b+3)%9];b=(b+3)%9;
				M[(c/3+2)%3][1]=H[c]+H[(c+3)%9];c=(c+3)%9;
				M[(g/3+2)%3][2]=H[g]+H[(g+3)%9];g=(g+3)%9;
			   }
    	   	   char R[]= {'-','-','-'};
    	   	   String h="";
    	   	   for (int i = 0; i < 3; i++){s=M[i][0];R[i]='B';
				for (int j = 0; j < 3; j++){if(R[j]=='-'){
					s+=M[j][1];R[j]='C';
					for (int k = 0; k < 3; k++){
						if(R[k]=='-'){s+=M[k][2];R[k]='G';
						if(min>s){min=s;h=""+R[0]+R[1]+R[2];}
						s-=M[k][2];R[k]='-';
						}
					}R[j]='-';s-=M[j][1];
				}
				}
				R[i]='-';
			}
    	   	 pr.println(h+" "+min);  
    	 }
     }catch(Exception e){}
	pr.close();
}
}

/*
1 2 3 4 5 6 7 8 9
5 10 5 20 10 5 10 20 10
9 8 7 6 5 4 3 2 1

*/