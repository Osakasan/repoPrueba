package posneg;
import java.util.Scanner;
public class positivos {
	public static void main(System[]a) {
		int num;
		Scanner tecl=new Scanner(System.in);
		System.out.println("Introduzca un valor");
		num=tecl.nextInt();
		if (num>0) {
			for (int i=1;i<=num;i++) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("El número es cero o negativo");
		}
		System.out.println("Fin de programa");
	}

}
