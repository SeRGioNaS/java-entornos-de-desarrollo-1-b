package Model;

import java.util.*;

/**
 * Representa un rectangulo
 */
public class Rectangulo {

	private int base;
	private int altura;

	/**
	 * Constructor que recibe como parametros la base y la altura de un rectangulo
	 * 
	 * @param base   La longitud de la base del rectangulo
	 * @param altura La longitud de la altura del rectangulo
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
	 * @return La base del rectangulo
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @return La altura del rectangulo
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @return La base del rectangulo
	 */
	public void setBase(int base) {
		// TODO implement here
	}

	/**
	 * @return La altura del rectangulo
	 */
	public void setAltura(int altura) {
		// TODO implement here
	}

	/**
	 * @return Una cadena con la base y la altura del rectangulo
	 */
	public String toString() {
		return "La base es " + base + " y la altura es " + altura;
	}

	/**
	 * Metodo que devuelve el area del rectangulo
	 */
	public int area() {
		int area = base * altura;
		return area;
	}

	/**
	 * Metodo que devuelve el perimetro del rectangulo
	 */
	public int perimetro() {
		int perimetro = (2 * base) + (2 * altura);
		return perimetro;
	}

}