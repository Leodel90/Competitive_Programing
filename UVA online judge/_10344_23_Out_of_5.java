import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _10344_23_Out_of_5{
	public static void main(String[] args) throws IOException{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
			StringTokenizer tk;
			while(true){
				int T[]= new int [5];
				tk = new StringTokenizer(br.readLine());
				boolean q=false,qq,R=false,r,rr;
				for (int i = 0; i < 5; i++){ T[i]=Integer.parseInt(tk.nextToken());q=q|T[i]!=0;}
				if(!q)break;
				LinkedList<Integer>Pi= new LinkedList<Integer>();
				int p=0,P[]= new int[5],v=0,a=0,aa,pj,x;qq=true;
				while(!R){
					if(q){
						if(qq){
							if(p==5){
								LinkedList<Integer> Pa= new LinkedList<>();
								r=true;rr=true;aa=0;pj=1;x=P[0];
								while(!R){
									if(r){
										if(rr){
											if(pj==5){R=x==23;r=false;}
										}rr=false;
										if(r&&aa<3){
											if(aa==0)x=x+P[pj];
											if(aa==1)x=x-P[pj];
											if(aa==2)x=x*P[pj];
											Pa.add(aa);aa=0;pj++;rr=true;
										}r=rr;
									}else{
										if(pj==1)break;
										aa=Pa.removeLast();pj--;
										if(aa==0)x=x-P[pj];
										if(aa==1)x=x+P[pj];
										if(aa==2)x=x/P[pj];
										r=true;rr=false;aa++;
									}
								}q=false;
							}
						}
						qq=false;
						for (int i = a; i < 5&&q; i++){
							if((v&(1<<i))==0){v|=1<<i;P[p]=T[i];Pi.add(i);a=0;p++;qq=true;break;}
						}q=qq;
					}else{if(p==0)break;
					a=Pi.removeLast();p--;
					v=v&~(1<<a);a++;
					q=true;qq=false;
					}
				}
				if(R)pw.println("Possible");
				else pw.println("Impossible");
			}pw.close();
	}
}

/*

*/