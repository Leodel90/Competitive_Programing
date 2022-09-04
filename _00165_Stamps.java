import java.io.*;
import java.util.*;
public class _00165_Stamps{
	public static void main(String[] args) throws IOException{
		LinkedList<Integer> HK[][]=new LinkedList[9][9];
		double log2=Math.log(2);
		for (int h = 1,k=8; h < 9; h++,k--){
			LinkedList<Integer>Pls= new LinkedList<Integer>(),Pli= new LinkedList<Integer>();
					LinkedList<long[]>Pv= new LinkedList<long[]>();
			int ls=0,c=0,i=0;long v[]= new long[3],o;
			int K[]= new int[k];v[0]=1;
			boolean q=true,qq=true,asd=false;
			while(true){
				if(q){
					if(qq){if(k==c)q=false;}
					i++;
					q=q&&i<=ls+1;
					if(q){Pli.add(i);Pls.add(ls);Pv.addLast((long[])v.clone());K[c]=i;c++;qq=true;  
						int s=i,a=0,cc=1;boolean r= true,rr=true;
						LinkedList<Integer> Pa= new LinkedList<Integer>();
						while(true){
							if(r){
								if(rr){asd=s==64;
									if(s>=64){
										if(s>=128)v[2]|=((long)1)<<(s-128);
										else v[1]|=((long)1)<<(s-64);
									}
									else v[0]|=((long)1)<<s;
									if(cc==h)r=false;
								}r=r&&a<c;
								if(r){s=s+K[a];cc++;Pa.add(a);rr=true;}
							}else{cc--;if(cc==0)break;
								a=Pa.removeLast();s=s-K[a];rr=false;r=true;a++;
							}
						}
						for (int j = 0,l=0; j < 3; j++,l+=64){
							if(v[j]!=(long)(-1)){
								if(v[j]!=Long.MAX_VALUE){o=(long)(Math.log((v[j]+1)&~v[j])/log2);}
								else o=63;
								ls=(int)o+l-1;
								break;
							}
						}
						if(HK[h][c]==null || HK[h][c].getFirst()<ls){HK[h][c]=(LinkedList<Integer>)Pli.clone();HK[h][c].addFirst(ls);}
					}
				}else{c--;if(c==-1)break;
					i=Pli.removeLast();ls=Pls.removeLast();v=Pv.removeLast();q=true;qq=false;
				}
			}
		}
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
			StringTokenizer tk;
			while(true){
				tk= new StringTokenizer(br.readLine());
				int h=Integer.parseInt(tk.nextToken()),k=Integer.parseInt(tk.nextToken());
				if (h==0) break;
				Iterator<Integer> pp=HK[h][k].iterator();
				h=pp.next();
				while(pp.hasNext()){
					k=pp.next();
					if (k<10)pw.print(" ");
					pw.print(" "+k);
				}
				pw.print(" ->");
				if(h<10)pw.print(" ");
				pw.println(" "+h);
			}pw.close();
		
		}
}
