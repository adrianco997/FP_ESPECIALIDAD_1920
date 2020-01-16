//	En Eclipse , realizaremos un proyecto con una clase y varios métodos. Por ejemplo, la clase
//	persona con atributos tipo: nombre,apellidos, edad,casado y numDNI. Se tendrán que crear
//	todos los getters and setters necesarios, junto a los correspondientes constructores.
//
//	Compilaremos y ejecutaremos la prácticas desde el IDE. Además depuraremos el proyecto
//	ejecutando las líneas paso a paso, añadiremos las variables que consideremos importantes a
//	los watches, y definiremos los siguientes breakpoints:
//
//		# Tipo línea, por ejemplo al pasar por una salida de pantalla.
//		# Tipo clase, al cargar alguna clase.
//		# Tipo campo, al acceder a algún campo de alguna clase.
//		# Tipo método, al acceder a algún método de alguna clase.
//
//	En al menos alguno, en las propiedades de los breakpoints definiremos:
//
//		# Condiciones para que el programa se detenga al alcanzar las variables ciertos valores
//		# Se alcance un número de veces (hints), determinado.
//
//	Haremos capturas de pantalla de dichos procesos.

package Depuración;

import java.util.Scanner;

/** @author adrian.caballero */
public class Main {
	/*******************************************************************************/
	/*******************************************************************************/
	/*
	 * public void scanPersona(Persona persona,Scanner input){String apellidos=new
	 * String(),casado=new String(),nombre=new String(),DNI=new String();int edad;
	 * System.out.println("Introduce los datos de la persona");System.out.print(
	 * "Nombre: ");nombre=input.next();this.setNombre(nombre);System.out.print(
	 * "Apellidos: ");apellidos=input.next();this.setApellidos(apellidos);System.out
	 * .print("Edad: ");edad=input.nextInt();this.setEdad(edad);System.out.print(
	 * "DNI: ");DNI=input.next();this.setNumDNI(DNI);System.out.print(
	 * "¿Esta casada? ");casado=input.next();if(casado.equalsIgnoreCase("si")){this.
	 * setCasado(true);}else if(casado.equalsIgnoreCase("no")){this.setCasado(false)
	 * ;}}
	 */
	/*******************************************************************************/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Persona prsn;
		/*
		 * int edad;String DNI=new String();String casado=new String();String nombre=new
		 * String();String apellidos = new String();
		 * 
		 * nombre="Arturo";apellidos="Perez Miranda";edad=25;casado="no";DNI="12345678";
		 */

		// prsn=new Persona();
		// prsn=new Persona("Arturo","Perez Miranda",25,false,"12345678");
		prsn = new Persona(input);

		/* Se alcance un número de veces (hints), determinado. */// for(int i=0;i<100;i++){System.out.println(i);}

		/*
		 * System.out.println("Dar datos de la persona");System.out.print(
		 * "Introduce nombre: ");nombre=input.next();person.setNombre(nombre);System.
		 * out.print("Introduce apellidos: ");apellidos=input.next();person.
		 * setApellidos(apellidos);System.out.print("Introduce edad: ");edad=input.
		 * nextInt();person.setEdad(edad);System.out.print("¿Esta casado? ");casado=
		 * input.next();if(casado.equalsIgnoreCase("si")){person.setCasado(true);}else
		 * if(casado. equalsIgnoreCase("no")){person.setCasado(false);}System.out.print
		 * ("Introduce DNI: ");DNI=input.next();person.setNumDNI(DNI);
		 */

		System.out.println(prsn.getApellidos() + "," + prsn.getNombre());

		// if(edad<18){System.out.println("Menor de edad.");}
		// else{System.out.println("Mayor de edad.");}
		// System.out.println(((person.getEdad()<18)?"Menor":"Mayor")+" de edad.");

		System.out.println();
		prsn.printInfo();

		input.close();
	}

}

/**
 * public void A(){B();C();this.D();this.E();this.F();G();H();I();J();K();L();}
 * private void B(){}protected void C(){}public final void D(){}private final
 * void E(){}protected final void F(){}public static void G(){}private static
 * void H(){}protected static void I(){}public static final void J(){}private
 * static final void K(){}protected static final void L(){}
 *//* [public/private/protected] [static/final/static final] [type] fun(){} */