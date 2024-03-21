package Model;

import java.util.*;

/**
 * 
 */
public class Casa {

    /**
     * Representa una casa del mundo real
     */
    private String direccion;
    private int numHabitaciones;
    private int metrosCuadrados;
    
    /**
     * Constructor que recibe como parametros la direccion, el numero de habitaciones y los metros cuadrados de una casa.
     * 
     * @param direccion					La direccion de la casa
     * @param numHabitaciones			El numero de habitaciones de la casa
     * @param metrosCuadrados			Los metros cuadrados de la casa
     */
    public Casa(String direccion, int numHabitaciones, int metrosCuadrados) {
    	this.direccion = direccion;
    	this.numHabitaciones = numHabitaciones;
    	this.metrosCuadrados = metrosCuadrados;
    }

    
    public String getDireccion() {
        // TODO implement here
        return direccion;
    }

   
    public int getNumHabitaciones() {
        // TODO implement here
        return numHabitaciones;
    }

    
    public int getMetrosCuadrados() {
        // TODO implement here
        return metrosCuadrados;
    }

    
    public void setDireccion(String direccion) {
    	this.direccion = direccion;
    }

    
    public void setNumHabitaciones(int numHabitaciones) {
    	this.numHabitaciones = numHabitaciones;
    }

    
    public void setMetrosCuadrados(int metrosCuadrados) {
    	this.metrosCuadrados = metrosCuadrados;
    }

    public String toString() {
        return "Direccion: "+ direccion + "Habitaciones: " + numHabitaciones + "Metros Cuadrados: " + metrosCuadrados;
    }

}