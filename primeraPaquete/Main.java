
package primeraPaquete;

//import java.util.Scanner;

public class Main {
	// private static Scanner input;

	// @SuppressWarnings("resource")
	/*
	 * public static void main(String[] args) { System.out.println("1)");
	 * System.out.println("2)"); System.out.println("3)"); System.out.println("4)");
	 * System.out.println("5)"); System.out.println("6)"); int a; a = 0; if (a > 0)
	 * System.out.println("true"); else System.out.println("false");
	 * 
	 * 
	 * for (int i = 0; i < 10; i++) { System.out.println(a * i); }
	 * 
	 * 
	 * 
	 * while (a < 100) { if (a % 2 == 0 || a % 2 == 0) System.out.println(a); a++; }
	 * 
	 * int f, b;
	 * 
	 * Scanner input = new Scanner(System.in); f = input.nextInt(); b =
	 * input.nextInt(); System.out.println(f + " " + b); System.console();
	 * input.close(); }
	 */

	public static void persona() {
		Persona obj1 = new Persona();
		System.out.println("\n1) Persona");
		obj1 = new Persona(false, "Pedro", "Mendoza", "01/01/2003", "España", 1.85, 65, "Estudiante", "50000000K");
		obj1.mostrarInfo();
	}

	public static void avion() {
		Avion obj2 = new Avion();
		System.out.println("\n2) Avión");
		obj2 = new Avion("Cessna 172 monomotor", "Privado", "17280494", "05/05/2019", "Blanco", 152);
		obj2.mostrarInfo();
	}

	public static void perro() {
		Perro obj3 = new Perro();
		System.out.println("\n3) Perro");
		obj3 = new Perro(true, 35, 0.5, "01/02/2016", "mixta");
		obj3.mostrarInfo();
	}

	public static void piso() {
		Piso obj4 = new Piso();
		System.out.println("\n4) Piso");
		obj4 = new Piso("Martinez de la Vera,Madrid", "1", "B", 3, 85, 26032);
		obj4.mostrarInfo();
	}

	public static void mesa() {
		Mesa obj5 = new Mesa();
		System.out.println("\n5) Mesa");
		obj5 = new Mesa(1.55, 2, 1.25, "madera");
		obj5.mostrarInfo();
	}

	public static void moto() {
		Moto obj6 = new Moto();
		System.out.println("\n6) Moto");
		obj6 = new Moto("TRK 502 X 2018", "Benelli", "Sin matricular", "01/01/2018", "Negro", 2);
		obj6.mostrarInfo();
	}

	public static void casa() {
		Casa obj7 = new Casa();
		System.out.println("\n7) Casa");
		obj7 = new Casa("Plaza de españa,Madrid", "5", "C", 3, 100, 1001);
		obj7.mostrarInfo();
	}

	public static void silla() {
		Silla obj8 = new Silla();
		System.out.println("\n8) Silla");
		obj8 = new Silla(1.55, 2, 1.25, "madera");
		obj8.mostrarInfo();
	}

	public static void mamifero() {
		Mamifero obj9 = new Mamifero();
		System.out.println("\n9) Mamífero");
		obj9.setFecha_nacimiento("01/01/2003");
		obj9.setEspecie("Homo sapiens sapiens");
		obj9.setSexo_masculino(true);
		obj9.setPeso(70);
		obj9.setAltura(1.90);
		obj9.setTiempo_gestacion_dias(270);
		obj9.mostrarInfo();
	}

	public static void vehiculo() {
		Vehiculo obj10 = new Vehiculo();
		System.out.println("\n10) Vehículo");
		obj10 = new Vehiculo("Moto TRK 502 X 2018", "Benelli", "Sin matricular", "01/01/2018", "Negro", 2);
		obj10.mostrarInfo();
	}

	public static void mueble() {
		Mueble obj11 = new Mueble();
		System.out.println("\n11) Mueble");
		obj11 = new Mueble(1.55, 2, 1.25, "madera");
		obj11.mostrarInfo();
	}

	public static void edificio() {
		Edificio obj12 = new Edificio();
		System.out.println("\n12) Edificio");
		obj12 = new Edificio("Martinez de la Vera,Madrid", "1", "B", 3, 85, 26032);
		obj12.mostrarInfo();
	}

	public static void main(String[] args) {
		persona();
		avion();
		perro();
		piso();
		mesa();
		moto();
		casa();
		silla();
		mamifero();
		vehiculo();
		mueble();
		edificio();
	}

	/*******************************************************************************/
	/* variable=(condición)? valor1 : valor2; */
	/*
	 * int a; Scanner input=new Scanner(System.in); a=Scanner.nextInt();
	 * System.console();
	 */
}
