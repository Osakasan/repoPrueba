package ajedrez;

public class Posicion {
	private int fila;
	private char columna;
	
	public Posicion(int fila,char columna) {
		if (fila<1||fila>8)
			throw new IllegalArgumentException("La fila no es correcta");
		if (fila<'a'||fila>'h')
			throw new IllegalArgumentException("La fila no es correcta");
		this.fila=fila;
		this.columna=columna;
	}
	public Posicion(Posicion posicion) {
		
	}
	
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		if (fila>=1 || fila<=8)
			this.fila=fila;
		else
			throw new IllegalArgumentException("Fila incorrecta");	
	}
	public char getColumna() {
		return columna;
	}
	public void setColumna(char columna) {
		if (fila>='a'||fila<='h') 
			this.columna = columna;
		else
			throw new IllegalArgumentException("Columna incorrecta");
			
	}
	public String toString() {
		return "Posicion "+fila+columna;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Posicion) {
			Posicion posicion=(Posicion)obj;
		if (fila==posicion.fila&&columna==posicion.columna)
			return true;
		}
		return false;

	}
}
