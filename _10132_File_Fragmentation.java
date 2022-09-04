import java.util.*;
public class _10132_File_Fragmentation {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        leer.nextLine();
        leer.nextLine();
        for (int i = 0; i < t; i++){
			LinkedList<String> T = new LinkedList<String>();
			int p=0;
			try{
				while(true){
					String h= leer.nextLine();
					if(h.length()==0)break;
					p+=h.length();
					T.add(h);
				}
			}catch(Exception e){}
			p=(p*2)/T.size();
			String P[]= new String[T.size()];
			int h =0;
			TreeMap<String, Integer> R= new TreeMap<String, Integer>();
			while(!T.isEmpty()){
				P[h]=T.remove();
				for (int j = 0; j < h; j++){
					if(p-P[h].length()==P[j].length()){
						String a=P[h]+P[j],b=P[j]+P[h];
						if(R.containsKey(a))R.put(a, R.get(a)+1);else R.put(a, 1);
						if(!a.equals(b)){if(R.containsKey(b))R.put(b, R.get(b)+1);else R.put(b, 1);}
					}
				}h++;
			}String r ="";
			h=h>>1;
			while(!R.isEmpty()){
				r=R.firstKey();
				if(R.pollFirstEntry().getValue()==h)break;
			}
			if(i>0)System.out.println();
			System.out.println(r);
		}
	}
}
/*
2

011
0111
01110
111
0111
10111

011
0111
01110
111
0111
10111
*/