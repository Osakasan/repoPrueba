package posneg;
import java.util.Scanner;
public class Buscaletra {
	public static void main (String[]a) {
		Scanner tecl=new Scanner(System.in);
		int cont=0,num=0,longitud;
		char letra;
		String palabra;
		System.out.println("Introduce una palabra");
		palabra=tecl.nextLine();
		System.out.println("Introduce una letra");
		letra=tecl.next().charAt(0);
		longitud=palabra.length();
		if (longitud>0) {
			do {
				if(palabra.charAt(num)==letra) {
					cont=cont+1;
				}
				num=num+1;
				longitud=longitud-1;
			}while(longitud>0);
		}
		System.out.println("El número de veces que aparece la letra es "+cont);
	
	}
}
