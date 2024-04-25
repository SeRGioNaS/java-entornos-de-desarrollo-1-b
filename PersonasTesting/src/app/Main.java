package app;

import modelos.Persona;

public class Main {

	public static void main(String[] args) {

		
		
		Persona p2 = new Persona("emilio", "psoista", 0);
		System.out.println(p2.mostrarEdad());
		
		Persona p3 = new Persona("emilio", "psoista", 17);
		System.out.println(p3.mostrarEdad());
		
		Persona p4 = new Persona("emilio", "psoista", 18);
		System.out.println(p4.mostrarEdad());
		
		Persona p5 = new Persona("emilio", "psoista", 65);
		System.out.println(p5.mostrarEdad());
		
		Persona p8 = new Persona("emilio", "psoista", 66);
		System.out.println(p8.mostrarEdad());
		
		Persona p6 = new Persona("emilio", "psoista", 130);
		System.out.println(p6.mostrarEdad());
		
		Persona p7 = new Persona("emilio", "psoista", 131);
		System.out.println(p7.mostrarEdad());
	}

}
