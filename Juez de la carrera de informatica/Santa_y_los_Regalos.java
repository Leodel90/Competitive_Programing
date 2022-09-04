import java.text.DecimalFormat;
import java.util.*;
public class Santa_y_los_Regalos {
public static void main(String[] args) {
Scanner leer = new Scanner (System.in);
DecimalFormat x= new DecimalFormat("0.000");
while(leer.hasNext()){
int r = leer.nextInt();
double peso = 0;
for (int i = 0; i < r; i++) {
	int hab= leer.nextInt();
	for (int j = 0; j < hab; j++) {
	  int a= leer.nextInt();
	  int b = leer.nextInt();
	  if(a==1){
	  for (int k = 0; k < b; k++) {
		leer.next();
		peso=leer.nextDouble()+peso;
	  }
	  }else{peso =peso+0.5;leer.nextLine();
		  for (int k = 0; k < b; k++) {
		   leer.nextLine();
	      }
	  }
	}
}
String cad=x.format(peso);
int i = cad.length()-1;
while (cad.charAt(i)=='0'){
	i--;
}
if(cad.charAt(i)==',')i--;
System.out.println(cad.substring(0,i+1));
}
}
}
/*
2
3
0 1
rifleDeCaza 3,9
1 2
carrito 0,1
muchasGalletas 1
1 4
telescopioCientifico 3
gato 2
assasinsCreedUnity 0,1
libroUnMundoFeliz 0,01
2
0 3
bombaMolotov 0,5
instruccionesParaHacerAntrax 0,001
avion 453592,37
0 1
muchosCohetillos 1

2
1
1 1
dfgh 1
1
1 1
dfh 27

*/
 