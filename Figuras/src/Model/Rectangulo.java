package Model;

/**
 * Representa un rectangulo
 */
public class Rectangulo extends Figura {

	private int base;
	private int altura;

	/**
	 * Constructor que recibe como parametros la base y la altura de un rectangulo
	 * 
	 * @param 
	 * @param 
	 */
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	/**
	 * Constructor vacio que crea un rectangulo de 1x1
	 */
	public Rectangulo() {
		base = 1;
		altura = 1;
	}
	/**
	 * @return
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @return
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @return
	 */
	public void setBase(int base) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public void setAltura(int altura) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public String toString() {
		return "La base es " + base + " y la altura es " + altura;
	}

	/**
	 * Metodo sobreescrito que devuelve el area del rectangulo
	 */
	public double area() {
		int area = base * altura;
		return area;
	}

	/**
	 * Metodo sobreescrito que devuelve el perimetro del rectangulo
	 */
	public double perimetro() {
		double perimetro = (2 * base) + (2 * altura);
		return perimetro;
	}

}