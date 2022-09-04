import java.util.*;
import java.util.Map.Entry;
public class _11321_Sort_Sort_And_Sort {
	static int m;
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
        	int n = leer.nextInt();m=leer.nextInt();
        	if(n+m==0)break;
        	Comparator<Integer>U= new Comparator<Integer>(){
				public int compare(Integer a, Integer b){
					int m1=Math.abs(a%2);
					int m2=Math.abs(b%2);
					if(a%m<b%m||a%m==b%m&&(m1==1&&m2==0||m1==1&&m2==1&&a>b||m1==0&&m2==0&&a<b))return -1;
					else return 1;
				}
			};
			TreeMap<Integer, Integer> T= new TreeMap<Integer, Integer>(U);
         	for (int i = 0; i < n; i++){
         		int x = leer.nextInt();
         		if(T.containsKey(x))T.put(x, T.get(x)+1);
         		else T.put(x, 1);
         	}
         	System.out.println(n+" "+m);
         	while(!T.isEmpty()){
         		Entry<Integer, Integer> A = T.pollFirstEntry();
         		int h=A.getValue();
         		while(h>0){System.out.println(A.getKey());h--;}
         	}
        }
        System.out.println("0 0");
	}
	
}

