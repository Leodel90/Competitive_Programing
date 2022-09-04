import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
public class _10094_Place_the_Guards {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter (new BufferedWriter(new OutputStreamWriter(System.out)));
		try{
			while(true){
				int n= Integer.parseInt(br.readLine()),vi,n2=n/2,l=n2,nm=n,d,nm2=n%2;
				if(n>3){
				if(n2%3!=1){
					vi=2-nm2;l+=nm2;d=-1+nm2;
				}else {vi=n2;nm-=nm2;d=3;}
				LinkedList<Integer> Pf= new LinkedList<Integer>();
				for (int i = 1; i <=l; i++,vi=(vi+1)%nm+1)Pf.add(vi);
				vi+=d;
				for (int i = l+1; i <=n; i++,vi=(vi+1)%nm+1)Pf.add(vi);
				if(n2%3==1&&nm2==1){Pf.removeLast();Pf.add(n);}
				Iterator<Integer> it= Pf.iterator();vi=1;
					pw.print(it.next());
					while(it.hasNext())pw.print(" "+it.next());
					pw.println();
			}else pw.println("Impossible");
				}
		}catch(Exception e){}
		pw.close();
	}
}


