package Model;


/**
 * Representa un circulo
 */
public class Circulo extends Figura {

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
	 * @return
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
	 * @return
	 */
	public String toString() {
		return "El radio del circulo es " + radio;
	}

	/**
	 * Metodo sobreescrito que devuelve el perimetro del circulo
	 */
	
	public double perimetro() {
		double perimetro = (2 * radio * Math.PI);
		return perimetro;
	}

	/**
	 * Metodo sobreescrito que devuelve el area del circulo
	 */
	public double area() {
		double area = (2 * Math.PI * radio * radio);
		return area;
	}

}