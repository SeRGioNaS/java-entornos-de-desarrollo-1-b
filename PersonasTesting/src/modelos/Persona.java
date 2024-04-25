package modelos;

public class Persona {
	String nombre;
	String apellidos;
	int edad;

	public Persona() {

	}

	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		if (edad > 130)
			throw new IllegalArgumentException("La edad debe ser menor que 130");
		else if (edad < 0)
			throw new IllegalArgumentException("La edad debe ser mayor que 0");
		else {
			this.edad = edad;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String mostrarEdad() {
		String msj = "";
		
		if(edad < 18)
			msj = "Menor de edad";
		if(edad > 17 && edad < 66)
			msj = "Mayor de edad";
		if(edad > 65)
			msj = "Jubilado";
		return msj;
	}
}
