import java.util.*;
public class _00466_Mirror_Mirror {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		try{int h=1;
		while(true){
			int n = leer.nextInt();
			boolean O[][]= new boolean[n][n];
			boolean N[][]= new boolean[n][n];
			for (int i = 0; i < n; i++) {
				String c =leer.next();
				for (int j = 0; j < n; j++) 
					O[i][j]=c.charAt(j)=='X';
				c =leer.next();
				for (int j = 0; j < n; j++) 
					N[i][j]=c.charAt(j)=='X';
			}
			String r="";
			int Ainter[]= {0,-1,0,1};
			int Binter[]= {1,0,-1,0};
			int Ca[]={0,n-1,n-1,0};
			int Cb[]={0,0,n-1,n-1};
			int Aexter[]={1,0,-1,0};
			int Bexter[]={0,1,0,-1};
			boolean q=false;
			int R[]={90,180,270};
			String r1=" was preserved",g=" was ";
		    for (int t = 0; t < 2; t++){int k=0;
				for (int x = 0; x < 4&&!q; x++){q=true;
					int a=Ca[x],b=Cb[x];
					if(x>0){r1=g+"rotated "+R[k]+" degrees";k++;}
					for (int i = 0; i < n&&q; i++){if(x%2==0)b=Cb[x];else a=Ca[x];
						for (int j = 0; j < n&&q; j++){
							q=O[a][b]==N[i][j];
						    a+=Ainter[x];b+=Binter[x];	
						}a+=Aexter[x];b+=Bexter[x];
					}
				}
				if(!q){
					for (int i = 0; i < n>>1; i++){
						for (int j = 0; j < n; j++){
							if(O[i][j]!=O[n-1-i][j]){O[n-1-i][j]=O[i][j];O[i][j]=!O[i][j];}
						}g=" and ";r=" was reflected vertically";
					}
				}else {r+=r1;break;}
				r1="";
			}
		    if(!q)r=" was improperly transformed";
		    System.out.println("Pattern "+h+r+".");h++;
		}
		}catch(Exception e){}
	}
}
/*
5
X...X ....X
.X... ...X.
...X. .X...
..X.X ..X..
....X XX..X
6
....XX X....X
...X.. X.X...
XX..X. .X..X.
..X... ...X.X
...X.. ..X...
..X..X ..X...
2
X. X.
.X .X
4
..X. ...X
XX.. ....
.... XX..
...X ..X.
5
X.... .X...
.X... ..X..
.X... ..X..
...X. ....X
....X X....
4
.X.. ..X.
.X.X X...
.... ..XX
..X. ....
2
.. XX
XX ..

*/