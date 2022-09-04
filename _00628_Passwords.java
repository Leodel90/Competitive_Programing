import java.io.*;
import java.util.*;
public class _00628_Passwords {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		try{
			while(true){int n = Integer.parseInt(br.readLine());
				String N[]= new String [n];
				for (int i = 0; i < n; i++)N[i]= br.readLine();
				int m = Integer.parseInt(br.readLine());
				for (int i = 0; i < m; i++){
					char R[]= br.readLine().toCharArray();
					LinkedList<StringBuilder> Psb= new LinkedList<StringBuilder>();
					LinkedList<Integer> Pj= new LinkedList<Integer>();
					boolean q=true,qq=true;
					int j=0,p=0,l=0;StringBuilder sb= new StringBuilder(""),asb;
					pw.println("--");
					while(true){
						if(q){
							if(qq){
								if(p==R.length){pw.println(sb);q=false;}
							}
							if(q){String y=null;
								if(R[p]=='0'){if(j<10)y=j+"";else q=false;}
								else{if(j<n)y=N[j];else q=false;}
								if(q){j++;
									Pj.add(j);Psb.add(sb);asb=new StringBuilder(sb);asb.append(y);sb=asb;j=0;qq=true;p++;
								}
							}
						}else{if(p==0)break;p--;
							sb=Psb.removeLast();j=Pj.removeLast();
							q=true;qq=false;
						}
					}
				}
			}
		}catch(Exception e){}
		pw.close();
		
	}
}
/*
2
root
2super
1
#0
1
admin
1
#0#

*/