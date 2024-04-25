package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelos.Persona;


class test {

	@Test
	void edadinferior() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> new Persona("emilio", "psoista", -1));
		
		String esperado = "La edad debe ser mayor que 0";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void menorEdad() {
		
		String esperado = "Menor de edad";
		String obtenido =  new Persona("emilio", "psoista", 17).mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void mayorEdad() {
		
		String esperado = "Mayor de edad";
		String obtenido =  new Persona("emilio", "psoista", 18).mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void mayorEdad2() {
		
		String esperado = "Mayor de edad";
		String obtenido =  new Persona("emilio", "psoista", 65).mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void jubilado() {
		
		String esperado = "Jubilado";
		String obtenido =  new Persona("emilio", "psoista", 66).mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void jubilado2() {
		
		String esperado = "Jubilado";
		String obtenido =  new Persona("emilio", "psoista", 130).mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void edadSuperior() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> new Persona("emilio", "psoista", 131));
		
		String esperado = "La edad debe ser menor que 130";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado, obtenido);
	}

}
