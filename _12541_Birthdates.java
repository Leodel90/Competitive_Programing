import java.util.*;
public class _12541_Birthdates {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int n= leer.nextInt();
        String Yn="",On="";
        int yd=0,ym=0,yy=-1,od=0,om=0,oy=10000;
        for (int i = 0; i < n; i++) {
			String nom=leer.next();
			int DD=leer.nextInt();
			int MM=leer.nextInt();
			int YY=leer.nextInt();
			if(YY>yy||YY==yy&&(MM>ym||MM==ym&&DD>yd)){
			    Yn=nom;yy=YY;ym=MM;yd=DD;	
			}
			if(YY<oy||YY==oy&&(MM<om||MM==om&&DD<od)){
				On=nom;oy=YY;om=MM;od=DD;	
			}	
		}
        System.out.println(Yn);
        System.out.println(On);
	}
}
/*
5
Mickey 1 10 1991
Alice 30 12 1990
Tom 15 8 1993
Jerry 18 9 1990
Garfield 20 9 1990
*/