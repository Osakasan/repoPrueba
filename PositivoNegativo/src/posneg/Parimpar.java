package posneg;
import java.util.Scanner;
public class Parimpar {
	public static void main(String[]a) {
		int contador=0,par=0,impar=0,num;
		Scanner tecl=new Scanner(System.in);
		while(contador<10) {
			System.out.println("Introduzca un número");
			num=tecl.nextInt();
			if(num%2==0) {
				par=par+1;
			}
			else {
				impar=impar+1;
			}
		}
		System.out.println("numeros pares: "+par+"/nNumeros impares: "+impar);
	}
}
