package Model;

import java.util.*;

/**
 * Representa un circulo
 */
public class Circulo {

	/**
	 * 
	 */
	private int radio;

	/**
	 * Constructor que crea un circulo vacio de radio 1
	 */
	public Circulo() {
		radio = 1;
	}

	/**
	 * Constructor que recibe como parametro el radio del circulo
	 * 
	 * @param radio
	 */
	public Circulo(int radio) {
		this.radio = radio;
	}

	/**
	 * @return El radio del circulo
	 */
	public int getRadio() {
		return radio;
	}

	/**
	 * @param
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}

	/**
	 * @return Devuelve una cadena con el radio del circulo
	 */
	public String toString() {
		return "El radio del circulo es " + radio;
	}

	/**
	 * Metodo que devuelve el perimetro del circulo
	 */
	public double perimetro() {
		double perimetro = (2 * radio * Math.PI);
		return perimetro;
	}

	/**
	 * Metodo que devuelve el area del circulo
	 */
	public double area() {
		double area = (2 * Math.PI * radio * radio);
		return area;
	}

}