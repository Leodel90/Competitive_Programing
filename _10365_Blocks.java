import java.io.*;
public class _10365_Blocks {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int N[]= new int [1001];
		for (int i = 1; i <=1000; i++){
			N[i]=Integer.MAX_VALUE;double x=1,y,z,nn;
			while(x<=i){
				nn=i/x;
				if(x*x>nn)break;
				if((int)nn==nn){
					y=1;
					while(y<=nn){
						z=nn/y;
						if(y>z)break;
						if((int)z==z)
							N[i]=Math.min(N[i],(int)(x*y+x*z+y*z)<<1);
						y++;
					}
				}x++;
			}
		}
		int c = Integer.parseInt(br.readLine());
		while(c>0){c--;
			pw.println(N[Integer.parseInt(br.readLine())]);			
		}
		pw.close();
	}
}
