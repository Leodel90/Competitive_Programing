import java.io.*;
import java.util.*;
public class _00380_Call_Forwarding {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        pw.println("CALL FORWARDING OUTPUT");
        int N= Integer.parseInt(br.readLine());
        LinkedList<Integer> F[]= new LinkedList[9999];
        LinkedList<Integer> TI[]= new LinkedList[9999];
        LinkedList<Integer> TF[]= new LinkedList[9999];
        StringTokenizer tk;
        for (int xd = 1; xd <= N; xd++){
			for (int i = 1; i <=9998; i++){F[i]=new LinkedList<Integer>();TI[i]=new LinkedList<Integer>();TF[i]=new LinkedList<Integer>();}
		    int ori,dur,des,t;
			while(true){tk= new StringTokenizer(br.readLine());
				ori= Integer.parseInt(tk.nextToken());
				if(ori==0)break;
				t=Integer.parseInt(tk.nextToken());
				dur=Integer.parseInt(tk.nextToken());
				des=Integer.parseInt(tk.nextToken());
				F[ori].add(des);
				TI[ori].add(t);
				TF[ori].add(t+dur);
			}
			pw.println("SYSTEM "+xd);
			String cadt,cadori,caddes;
			while(true){tk= new StringTokenizer(br.readLine());
			    cadt =tk.nextToken();
				t=Integer.parseInt(cadt);
				if(t==9000)break;
				cadori=tk.nextToken();
				ori=Integer.parseInt(cadori);des=ori;
				boolean V[]= new boolean[9999],q=true;
				while(!V[des]&&q){V[des]=true;q=!F[des].isEmpty();
					while(q){
						if(t<TI[des].getFirst()||t>TF[des].getFirst()){q=t>TF[des].getFirst();
						  if(q){F[des].removeFirst();TI[des].removeFirst();TF[des].removeFirst();}
						}else {des=F[des].getFirst();break;}
						q=q&&!F[des].isEmpty();
					}
				}if(q)des=9999;
				caddes=des+"";
				if(des<10)caddes="0"+caddes;
				if(des<100)caddes="0"+caddes;
				if(des<1000)caddes="0"+caddes;
				pw.println("AT "+cadt+" CALL TO "+cadori+" RINGS "+caddes);
			}
		}pw.println("END OF OUTPUT");
        pw.close();
	}
}

/*
2
1111 0100 0200 2222
1111 0301 0500 4444
2222 0200 0200 3333
3333 0250 1000 1111
7777 1000 2000 7777
0000
0050 1111
0150 1111
0200 1111
0225 2222
0270 1111
0320 1111
0320 3333
0900 3000
1250 3333
1250 7777
9000
0000
3000 1111
9000
*/