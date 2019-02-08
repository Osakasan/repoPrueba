package posneg;
import java.util.Scanner;
public class PositNeg {
	
	public static void main(String[]a) {
		Scanner tecl=new Scanner(System.in);
		double x;
		System.out.println("Introduzca un número");
		x=tecl.nextDouble();
		if (x>0)
			System.out.println("El número es positivo");
		else
			System.out.println("El número es negativo");
		System.out.println("Fin del programa");
	}

}
