package posneg;
import java.util.Scanner;
public class MayorMenor {
	public static void main(String[]a) {
	Scanner tecl=new Scanner(System.in);
	int x,y,z,max=0;
	System.out.println("Introduzca 3 valores distintos");
	x=tecl.nextInt();
	y=tecl.nextInt();
	z=tecl.nextInt();
	
	if (x>y&&x>z) {
		max=x;
	}
	else
		if(z>y) {
			max=z;
		}
		else {
			max=y;
		}
	System.out.println("El mayor es "+max);
	}
}
