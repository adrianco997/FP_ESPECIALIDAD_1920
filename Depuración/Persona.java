package Depuración;

import java.util.Scanner;

/** @author adrian.caballero */
public class Persona {
	String nombre;
	String apellidos;
	String numDNI;
	Boolean casado;
	int edad;

	/** @return the nombre */
	public String getNombre() {
		return nombre;
	}

	/** @return the apellidos */
	public String getApellidos() {
		return apellidos;
	}

	/** @return the edad */
	public int getEdad() {
		return edad;
	}

	/** @return the casado */
	public Boolean getCasado() {
		return this.casado;
	}

	/** @return the numDNI */
	public String getNumDNI() {
		return numDNI;
	}

	/** @param _nombre the nombre to set */
	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}

	/** @param _apellidos the apellidos to set */
	public void setApellidos(String _apellidos) {
		this.apellidos = _apellidos;
	}

	/** @param _edad the edad to set */
	public void setEdad(int _edad) {
		this.edad = _edad;
	}

	/** @param _casado the casado to set */
	public void setCasado(Boolean _casado) {
		this.casado = _casado;
	}

	/** @param _numDNI the numDNI to set */
	public void setNumDNI(String _numDNI) {
		this.numDNI = _numDNI;
	}

	/** */
	public Persona() {
	}

	/**
	 * @param _nombre
	 * @param _apellidos
	 * @param _edad
	 * @param _casado
	 * @param _numDNI
	 */
	public Persona(String _nombre, String _apellidos, int _edad, Boolean _casado, String _numDNI) {
		/*
		 * this.setNombre(_nombre);this.setApellidos(_apellidos);
		 * this.setCasado(_casado);this.setNumDNI(_numDNI); this.setEdad(_edad);
		 */
		this.nombre = _nombre;
		this.apellidos = _apellidos;
		this.casado = _casado;
		this.numDNI = _numDNI;
		this.edad = _edad;
	}

	/** @param _persona */
	public Persona(Persona _persona) {
		super();
		this.setNombre(_persona.nombre);
		this.setApellidos(_persona.apellidos);
		this.setEdad(_persona.edad);
		this.setCasado(_persona.casado);
		this.setNumDNI(_persona.numDNI);
	}

	/** @param input */
	public Persona(Scanner input) {
		String nombre = new String(), apellidos = new String(), DNI = new String(), casado = new String();
		int edad;
		System.out.println("Introduce los datos de la persona");
		System.out.print("Nombre: ");		nombre = input.next();		this.setNombre(nombre);
		System.out.print("Apellidos: ");	apellidos = input.next();	this.setApellidos(apellidos);
		System.out.print("Edad: ");			edad = input.nextInt();		this.setEdad(edad);
		System.out.print("DNI: ");			DNI = input.next();			this.setNumDNI(DNI);
		System.out.print("¿Esta casada? ");	casado = input.next();
		if (casado.equalsIgnoreCase("si")) {		this.setCasado(true);}
		else if ((casado.equalsIgnoreCase("no"))) {	this.setCasado(false);}
	}

	void printInfo() {
		System.out.println("Mostramos la información de la persona:");
		System.out.println("Nombre: " + this.getNombre() + " " + this.getApellidos());
		System.out.println("Edad: " + this.getEdad());
		System.out.println("DNI: " + this.getNumDNI());
		System.out.println(((this.getCasado()) ? "Esta" : "No esta") + " casado");
	}
}
