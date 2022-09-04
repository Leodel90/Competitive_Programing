import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _11085_Back_to_the_8_Queens {
	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
		int M[][]=new int[92][8];
		LinkedList<Integer> Pi = new LinkedList<Integer>();
		boolean q=true,qq=true;
		int p=0,i=0,vc=0,vd1=0,vd2=0,c=0;
		while(true){
			if(q){
				if(qq){
					if(p==8){
							Iterator<Integer> it= Pi.iterator();
							for (int j = 0; j < 8; j++) M[c][it.next()]=j;
							c++;q=false;
						}
					}qq=false;
					while(i<8&&q){
						if((vc&(1<<i))==0&&(vd1&(1<<(i-p+7)))==0&&(vd2&(1<<(i+p)))==0){
							vc|=(1<<i);vd1|=(1<<(i-p+7));vd2|=(1<<(i+p));
							Pi.add(i);i=0;p++;qq=true;break;
						}i++;
					}q=qq;
			}else{
				if(p==0)break;
				p--;i=Pi.removeLast();
				vc&=~(1<<i);vd1&=~(1<<(i-p+7));vd2&=~(1<<(i+p));
				i++;q=true;qq=false;
			}
		}
		try{
			p=1;
			while(true){
				StringTokenizer tk= new StringTokenizer(br.readLine());
				int T[]=new int[8];
				for (int j = 0; j < 8; j++)T[j]=Integer.parseInt(tk.nextToken())-1;
				int min=Integer.MAX_VALUE;
				for (int j = 0,m=0; j < 92; j++,m=0){
					for (int k = 0; k < 8; k++){if(M[j][k]!=T[k])m++;}
					min=Math.min(min,m);
				}
				pw.println("Case "+p+": "+min);p++;
			}
		}catch(Exception e){}
		pw.close();
	}
}
/*
1 2 3 4 5 6 7 8
1 1 1 1 1 1 1 1
1 7 5 8 2 4 6 3
*/