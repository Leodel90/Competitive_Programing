import java.io.*;
import java.util.*;
public class _00347_Run_Run_Runaround_Numbers {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter( new BufferedWriter( new OutputStreamWriter(System.out)));
		int RN[]= new int [448];
		int p=0,nr=0,pr=0,c=0,l=0;
		int P[]= new int [8];P[0]=1;
		LinkedList<Integer>  PP= new LinkedList<Integer>();
		LinkedList<Integer>  PI= new LinkedList<Integer>();
		for (int t = 2; t <=7; t++){p++;P[p]=P[p-1]*10;int i=1,d=t*9;
              while(true){
            	if((nr&(1<<i))==0){pr=pr|(1<<p);int np=(p-i+d)%t;
				if((pr&(1<<np))==0){c++;PP.addLast(p);PI.addLast(i);
				nr=nr|(1<<i);RN[l]=RN[l]+i*P[p];
				p=np;i=0;
				}
				else{if(c==t-1&&np==c&&p!=c){if(l<447)RN[l+1]=RN[l]; RN[l]=RN[l]+i*P[p]; l++;
				}
				}}
				while(i>=9&&c>0){c--;pr=pr&~(1<<p);
  				i=PI.removeLast();p=PP.removeLast();
  				if(l<447)RN[l]=RN[l]-i*P[p];
  				nr=nr&~(1<<i);
  				}if(c==0&&i>=9){pr=0; break;}
				i++;
			}
		}
		int y = 1;
		Arrays.sort(RN);
		while(true){
			int r= Integer.parseInt(br.readLine());
			if(r==0)break;
			int li=0,ls=l-1,m=0;
			while(li<=ls){
				m = (li+ls)>>1;
			    if(RN[m]!=r&&ls>li){
			    	if(RN[m]<r)li=m+1;else ls=m;
			    }else break;
			}
			pw.println("Case "+y+": "+RN[m]);y++;
		}
		pw.close();
	}
}

/*
12
123
1234
81111
82222
83333
911111
7654321
0



*/
