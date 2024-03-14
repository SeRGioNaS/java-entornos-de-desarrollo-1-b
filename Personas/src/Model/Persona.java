package Model;


import java.util.*;

/**
 * 
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona() {
    }

    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad = 0;


    public void Persona(String dni, String nombre, String apellido1, String apellido2, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
    	
        return dni;
    }
    

}