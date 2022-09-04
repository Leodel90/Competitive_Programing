import java.util.*;
public class _00401_Palindromes {
	public static void main(String[] args) {
	   Scanner leer = new Scanner(System.in);
	   char T[]= {'A','-','-','-','3','-','-','H','I','L','-','J','M','-','O','-','-','-','2','T','U','V','W','X','Y','5','1','S','E','-','Z','-','-','8','-'};
	   try{
	   while(true){
		   String cad = leer.nextLine();
		   boolean q =true,k=true;int l=cad.length();
		   for (int i = 0; i < (l>>1)+(l&1); i++){q=q&&cad.charAt(i)==cad.charAt(l-i-1);
		   int x=cad.charAt(i);   
		   if(x>=65)x=x-65;else x=x-23;
		   int y=cad.charAt(l-i-1);   
		   if(y>=65)y=y-65;else y=y-23;
		   k=k&&cad.charAt(i)==T[y] && cad.charAt(l-i-1)==T[x];
		   }
		   if(q||k){
			   if(!q||!k){
				   if(q)System.out.println(cad+" -- is a regular palindrome.");
				   else System.out.println(cad+" -- is a mirrored string.");
			   }else System.out.println(cad+" -- is a mirrored palindrome.");
		   }else System.out.println(cad+" -- is not a palindrome.");
		   System.out.println();
	   }}catch(Exception e){}
	}
}

/*
NOTAPALINDROME
ISAPALINILAPASI
A3MEA
ATOYOTA
*/