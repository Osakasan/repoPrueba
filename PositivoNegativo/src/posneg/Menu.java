package posneg;
import java.util.Scanner;
public class Menu {
	public static void main(String[]a) {
		int menu;
		char salir='n';
		do {
		Scanner tecl=new Scanner(System.in);
		System.out.println("Escoja una opción:\n1.- Sumar\n2.- Restar\n3.- Multiplicar\n4.- Dividir\n5.- Salir");
		menu=tecl.nextInt();
		switch(menu) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			System.out.println("¿Seguro que quieres salir s/n");
			salir=tecl.next().charAt(0);
		}
		}while (salir!='s'&&salir!='S');
		System.out.println("Fin de programa");
	}
}
