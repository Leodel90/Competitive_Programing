import java.util.*;
public class _11956_Brainfuck{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		leer.nextLine();
		for (int i = 1; i <=t; i++){
		String cad = leer.next();	
		int k[]= new int[100];
		int p =0;
		for (int j = 0; j < cad.length(); j++){
               switch (cad.charAt(j)) {
			case '>':
				p++;if(p==100)p=0;
				break;
            case '<':
				p--;if(p==-1)p=99;
				break;
            case '+':
				k[p]++;if(k[p]==256)k[p]=0;
				break;
				case '-':
					k[p]--;if(k[p]==-1)k[p]=255;
					break;
			default:
				break;
			}
		}
		System.out.print("Case "+i+":");
		for (int j = 0; j < 100; j++){
			int al=k[j]/16;
			int ar=k[j]%16;
			if(al>=10)al=65+al-10;
			else al=48+al;
			if(ar>=10)ar=65+ar-10;
			else ar=48+ar;
			System.out.print(" "+(char)al+(char)ar);
		}
		System.out.println();
		}
	}
}
/*
1
..++<><<+++>>++++++++++++++++++++++++++>>>+++<+...++<><<+++>>++++++++++++++++++++++++++>>>+++<+...++<><<+++>>++++++++++++++++++++++++++>>>+++<+.

*/