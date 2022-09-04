import java.io.*;
public class _00253_Cube_painting{
    public static void main(String[] args){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
         int C[][]= new int [24][6],p=0;
         int A[]=new int[2];
         for (int i = 0,j=5;i<3; i++,j--){A[0]=(i+1)%3;A[1]=(A[0]+1)%3;
			 for (int k = 0,aux; k < 4; k++,p=p+2){C[p][0]=i;C[p][5]=j;C[p+1][0]=j;C[p+1][5]=i;
				for (int m=1; m<=2; m++){
					C[p][m]=A[m-1];C[p][5-m]=5-A[m-1];
					C[p+1][m]=A[2-m];C[p+1][5-m]=5-A[2-m];
				}
				aux=A[0];A[0]=A[1];A[1]=5-aux;
			 }
		 }
        try{char L[];
           while(true){L=br.readLine().toCharArray();
           boolean r=false;
             for (int i = 0; i < 24&&!r; i++){r=true;
                   for (int j = 0,k=6; j < 6&&r; j++,k++){
					 r=r&&L[C[i][j]]==L[k];
				   }
		     }
             if(r)pw.println("TRUE");
             else pw.println("FALSE");
           }
        }catch(Exception e){}
        pw.close();
	}
}
/*
rbgggrrggbgr
rrrbbbrrbbbr
rbgrbgrrrrrg
rbggbrrgbbgr
rbggbrgbrrbg
rbggbrrbgrgb
rbgrgbrbggbr
rbgrgbrbggbr
rggbgrrbgggr
*/