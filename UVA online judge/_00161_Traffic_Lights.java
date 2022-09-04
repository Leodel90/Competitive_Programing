import java.util.*;
public class _00161_Traffic_Lights {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		LinkedList<Integer> S = new LinkedList<Integer>();
		while(true){
			int n = leer.nextInt();
			if(n==0){
				if(!S.isEmpty()){
					int T[] = new int[S.size()];
					int R[]= new int [S.size()];
					int min=0;
					for (int i = 0; i < T.length; i++){
						T[i]=S.remove();R[i]++;
						if(T[i]<T[min])min=i;
					}
					R[min]+=(T[min]<<1);
					boolean q=false;int max=0;
				    int s=0;
					while(!q){	
					   q=true;
					   for (int i = 0; i < R.length; i++){
					   if(R[i]+T[i]-5<R[min]+T[min]-5||R[i]+T[i]-5==R[min]+T[min]-5&&T[i]<T[min])min=i;
					   if(R[i]>R[max]||R[i]==R[max]&&T[i]>T[max])max=i;}
					   if(R[max]<=18001){
					   for (int i = 0; i < R.length&&q; i++){
							for (int j = i+1; j < R.length&&q; j++)
								q=R[i]<=R[j]&&R[j]<=R[i]+T[i]-6 ||
								R[i]<=R[j]+T[j]-6&&R[j]+T[j]-6<=R[i]+T[i]-6||
								R[j]<=R[i]&&R[i]<=R[j]+T[j]-6 ||
								  R[j]<=R[i]+T[i]-6&&R[i]+T[i]-6<=R[j]+T[j]-6
								;
							
					   }s=R[max];
					   R[min]+=(T[min]<<1);
					   }else {s=18002;break;}
					}
						if(s<=18001){s--;
						int h= s/3600;s=s%3600;
						int m=s/60;s=s%60;
						System.out.print("0"+h+":");
						if(m<10)System.out.print("0"+m+":");
						else System.out.print(m+":");
						if(s<10)System.out.println("0"+s);
						else System.out.println(s);
					}else System.out.println("Signals fail to synchronise in 5 hours");
				}else{leer.nextInt(); leer.nextInt(); break;}
			}else S.add(n);
			
		}
	}
}


/*
19 20 0 
30 
25 35 0 
30 58 62 32 31 32 22 64 89 90 
10 27 10 29 56 35 28 
45 56 58 
29 28 54 78 58 96 32 10 28 35 
36 98 75 32 54 85 96 
32 42 45 
10 27 77 88 28 62 52 35 53 90 
50 51 52 53 56 55 56 57 58 59 
60 61 62 63 64 65 66 67 68 69 
70 71 72 73 74 75 76 77 
78 79 
80 81 82 83 84 85 86 87 88 89 
90 31 32 33 34 35 36 37 38 41 
0 
10 10 0 
11 10 12 13 14 0 
10 11 12 13 14 15 16 17 18 19 20 0 
10 26 0 
42 87 88 90 0 
53 54 55 68 20 
0 
50 51 52 53 54 55 56 25 
18 0 
56 90 10 25 32 64 58 52 0 
0 0 0

*/