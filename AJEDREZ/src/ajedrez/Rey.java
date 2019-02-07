package ajedrez;
import java.util.Scanner;
import javax.naming.OperationNotSupportedException;
public class Rey {
	private Color color;
	private Posicion posicion;
	
	public Rey() {
		this.color=Color.BLANCO;
		this.posicion=new Posicion(1,'e');
	}
	public Rey(Color color) {
		if (color==Color.BLANCO)
			posicion=new Posicion(1,'e');
		else
			posicion=new Posicion(8,'e');	
	}
	public Rey(Color color,char columna) {
		Scanner tecl=new Scanner(System.in);
		this.color=color;
		columna=tecl.next().charAt(0);
		if (columna!='e')
			throw new IllegalArgumentException("La columna sólo puede ser e");	
	}
	
	public Color getColor() {
		return color;
	}
	//eliminable
	private void setColor(Color color) {
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	//eliminable
	private void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	public void mover  (Direccion direccion) throws OperationNotSupportedException {
		switch(direccion) {
		case ARRIBA:
			if (this.posicion.getFila()>=1 && this.posicion.getFila()<8) {
				this.posicion.setFila(this.posicion.getFila()+1);
			}
			else {
				throw new OperationNotSupportedException("No puede moverse hacia arriba");
			}
			break;
		case ARRIBDRCHA:
			if (this.posicion.getFila()>=1 && this.posicion.getFila()<8 && this.posicion.getColumna()>='a' && this.posicion.getColumna()<='h') {
				this.posicion.setFila(this.posicion.getFila()+1);
				this.posicion.setColumna((char) (this.posicion.getColumna()+1));
			}
			else {
				throw new OperationNotSupportedException("No puede moverse en esta direccion");
			}
			break;
		case ARRIBIZQDA:
			if (this.posicion.getFila()>=1 && this.posicion.getFila()<8 && this.posicion.getColumna()>='a' && this.posicion.getColumna()<='h') {
				this.posicion.setFila(this.posicion.getFila()+1);
				this.posicion.setColumna((char) (this.posicion.getColumna()-1));
			}
			else {
				throw new OperationNotSupportedException("No puede moverse en esta direccion");
			}
			break;
		case ABAJO:
			if (this.posicion.getFila()>=1 && this.posicion.getFila()<8) {
				this.posicion.setFila(this.posicion.getFila()-1);
			}
			else {
				throw new OperationNotSupportedException("No puede moverse hacia arriba");
			}
			break;
		case ABADRCHA:
			if (this.posicion.getFila()>=1 && this.posicion.getFila()<8 && this.posicion.getColumna()>='a' && this.posicion.getColumna()<='h') {
				this.posicion.setFila(this.posicion.getFila()-1);
				this.posicion.setColumna((char) (this.posicion.getColumna()+1));
			}
			else {
				throw new OperationNotSupportedException("No puede moverse en esta direccion");
			}
			break;
		case ABAIZQDA:
			if (this.posicion.getFila()>=1 && this.posicion.getFila()<8 && this.posicion.getColumna()>='a' && this.posicion.getColumna()<='h') {
				this.posicion.setFila(this.posicion.getFila()-1);
				this.posicion.setColumna((char) (this.posicion.getColumna()+1));
			}
			else {
				throw new OperationNotSupportedException("No puede moverse en esta direccion");
			}
			break;
		case IZQUIERDA:
			if (this.posicion.getColumna()>='a' && this.posicion.getColumna()<='h') {
				this.posicion.setColumna((char) (this.posicion.getColumna()-1));
			}
			else {
				throw new OperationNotSupportedException("No puede moverse más hacia la izquierda");
			}
			break;
		case DERECHA:
			if (this.posicion.getColumna()>='a' && this.posicion.getColumna()<='h') {
				this.posicion.setColumna((char) (this.posicion.getColumna()+1));
			}
			else {
				throw new OperationNotSupportedException("No puede moverse más hacia la derecha");
			}
			break;
		}
	}
	@Override
	public boolean equals(Object obj) {
		Rey rey;
		if (obj instanceof Rey) {
			rey=(Rey)obj;
			if(color==rey.color&&posicion.equals(rey.posicion))
				return true;
		}
		return false;
	}

}
