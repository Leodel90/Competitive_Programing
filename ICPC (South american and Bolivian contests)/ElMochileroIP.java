import java.util.*;
public class ElMochileroIP {
static Scanner leer = new Scanner (System.in);
	public static void main(String[] args) {
while(leer.hasNext()){
	int h1,m1,h2,m2;
	h1=leer.nextInt();
	m1=leer.nextInt();
	h2=leer.nextInt();
	m2=leer.nextInt();
	int dm=m2-m1;
	int dh=h2-h1;
	if(dm<0){dm=60+dm;dh--;}
    if(dh<0 || dh==0 && dm==0){dh=24+dh;}
	String c=" y ";
	System.out.println();
	System.out.print("El viaje tarda: ");
	if(dh!=0){if(dh==1)System.out.print(" 1 hora");else System.out.print(dh+" horas");}
	else c="";
    if(dm!=0){if(dm==1)System.out.print(c+"1 minuto" );else System.out.print(c+dm+" minutos");}
     
}

		//-----------------------


/*
15 0 16 0
16 0 17 30
18 23 22 12
12 23 12 45
18 21 10 22
18 0 18 0
23 40 0 12
15 30 17 15
23 59 23 58
0 1 0 0
0 0 23 59
8 45 8 44
8 45 8 46
23 59 23 58
23 58 23 59
22 45 23 59
22 45 03 46
23 59 23 58

 
 */
	}

}
