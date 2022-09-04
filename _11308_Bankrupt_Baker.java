import java.util.*;
import java.util.Map.Entry;
public class _11308_Bankrupt_Baker {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();leer.nextLine();
        for (int i = 0; i < t; i++){
			String title=leer.nextLine().toUpperCase();
			int m = leer.nextInt();
			int n = leer.nextInt();
			long b=leer.nextLong();
			TreeMap<String, Integer> I= new TreeMap<String, Integer>();
			for (int j = 0; j < m; j++) I.put(leer.next(), leer.nextInt());
			leer.nextLine();
			TreeMap<Long, TreeSet<String>> R= new TreeMap<Long, TreeSet<String>>();
			for (int j = 0; j < n; j++){
				String r=leer.nextLine();
				int k=leer.nextInt();
				long c=0;boolean q =true;
				for (int l = 0; l < k; l++){String In= leer.next();
				long p= leer.nextLong();q=q&&I.containsKey(In);
					if(q)c+=I.get(In)*p;
				}
				if(q&&c<=b){
				TreeSet<String> aux=new TreeSet<String>();
				if(R.containsKey(c))aux=R.get(c);
				aux.add(r);
				R.put(c, aux);
				}leer.nextLine();
			}
			boolean q=true;
			System.out.println(title);
			while(!R.isEmpty()){
				Entry<Long, TreeSet<String>> A= R.pollFirstEntry();
				while(!A.getValue().isEmpty()){
					String y=A.getValue().pollFirst();
					System.out.println(y);
				}q=false;
			}
			if(q)System.out.println("Too expensive!");
			System.out.println();
		}
	}
}

/*
2
My Favourite Cheesecake
8 3 100
sugar 4
water 0
lemonjuice 3
creamcheese 20
vanilla 5
egg 5
cream 10
strawberry 5
Strawberry Whipped Cream
2
cream 5
strawberry 3
Scrumptious Caramel Topping
3
sugar 6
water 3
lemonjuice 1
Secret Cheesecake Base
5
creamcheese 3
sugar 5
vanilla 1
egg 6
cream 1
Million Dollar Cakes
3 1 999999
costlyflour 500
gold 4500
diamond 5000
Display Cake - Do Not Eat!
3
costlyflour 100
gold 100
diamond 100



*/