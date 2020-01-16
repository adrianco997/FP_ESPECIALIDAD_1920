package Ejercicios;

import java.util.Scanner;

public class Clases {
	Auxiliares help = new Auxiliares();
	private int ejersize = 5;
	// public void main() {}

	/*
	 * // .1 Ejercicio: Bombilla // Definir una clase Bombilla que nos diga el
	 * estado (encendida/apagada) de una // bombilla. El sistema tiene un
	 * interruptor general que afecta a todas las // bombillas y cada bombilla tiene
	 * su interruptor. Una bombilla estará encendida // si están ambos interruptores
	 * están activados y estará apagada si está alguno // de ellos no lo está. //
	 * Diseñar la clase para poder: // # Activar y desactivar el interruptor general
	 * // # Encender y apagar el interruptor de una bombilla // # Indicar si una
	 * bombilla está encendida // # Indicar si una bombilla está apagada // #
	 * Inicialmente el interruptor general estará apagado y el interruptor de la //
	 * bombilla también. // Hacer un programa principal que defina un array de 20
	 * bombillas que ofrezca // un menú // 1. Activar el interruptor general. // 2.
	 * Desactivar el interruptor general. // 3. Encender una bombilla, se indicará o
	 * preguntará cual. // 4. Apagar una bombilla, se indicará o preguntará cual. //
	 * 5. Estado de todas las bombillas // 6. Fin
	 */
	public void ej01(Scanner input) {
		Interruptor interruptor = new Interruptor();
		Bombilla array[] = new Bombilla[20];
		int opcion = 0;
		System.out.println("\n1) Bombilla:");
		for (int i = 0; i < array.length; i++) {
			array[i] = new Bombilla();
		}
		do {
			System.out.println(
					"\nIntrodice opcion:\n\t1 Activar el interruptor general\n\t2 Desactivar el interruptor general\n\t3 Encender una bombilla, se indicará o preguntará cual.\n\t4 Apagar una bombilla, se indicará o preguntará cual.\n\t5 Estado de todas las bombillas\n\t6 Fin");
			opcion = input.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Activar el interruptor general");
				interruptor.setEstado(true);
				break;
			case 2:
				System.out.println("Desactivar el interruptor general");
				interruptor.setEstado(false);
				break;
			case 3: {
				System.out.print("Encender que: ");
				int i = input.nextInt();
				if (i > 0 && i <= 20) {
					array[i - 1].setEstado(true);
				} else {
					System.out.println("No existe.");
				}
			}
				break;
			case 4: {
				System.out.print("Apagar que bombilla: ");
				int i = input.nextInt();
				if (i > 0 && i <= 20) {
					array[i - 1].setEstado(false);
				} else {
					System.out.println("No existe.");
				}
			}
				break;
			case 5: {
				for (int i = 0; i < array.length; i++) {
					System.out.print(((i < 10) ? " " : "") + (i + 1) + ") "
							+ ((array[i].isEstado() == true && interruptor.isEstado() == true) ? "on" : "off")
							+ (((i + 1) % 10 != 0) ? "\t" : "\n"));
				}
			}
				break;
			case 6:
				System.out.println("Fin");
				break;
			default:
				System.out.println("Error");
				break;
			}
		} while (opcion != 6);
	}

	/*
	 * //0 .2 Ejercicio: Aparato eléctrico // Codificar una clase, a la que
	 * llamaremos AparatoElectrico, que represente los // distintos dispositivos que
	 * pueden conectarse a una instalación eléctrica // doméstica. Cada dispositivo
	 * tiene una potencia de consumo (dada en watios) y // puede encontrarse
	 * encendido o no. La clase dispondrá de métodos para encender // y apagar un
	 * aparato. // En todo momento podremos consultar la potencia que está
	 * consumiéndose en la // instalación (que será la suma de las potencias de los
	 * aparatos encendidos en // ese momento). Esta potencia se incrementará cada
	 * vez que se conecte un // aparato, y se reducirá cuando el aparato se apague.
	 * // Ayuda: La potencia total de la instalación debe declararse como estática.
	 */
	public void ej02(Scanner input) {
		AparatoElectrico AparatoElectrico = new AparatoElectrico();
		System.out.println("\n2) Aparato eléctrico:");
	}

// .3 Ejercicio: Alumno
// Queremos desarrollar una clase para recoger las calificaciones de un alumno en las asignaturas que cursa en un año determinado de un grado o ciclo formativo. Dicha clasedebe constar de las propiedades siguientes:
// # Su identificativo o NIA
// # Su nombre
// # Sus apellidos
// # El número de asignaturas en que está matriculado
// # Las calificaciones en cada asignatura (que será un array de números decimales)
// El constructor de esta clase recibe valores para todas las propiedades, excepto para las calificaciones de las asignaturas. Se deberán construir métodos para esta clase que permitan:
// # Recuperar los datos identificativos del alumno
// # Asignar valores a las calificaciones obtenidas en cada asignatura (pasando al método un array de números decimales)
// # Obtener su nota media.
	public void ej03(Scanner input) {
		System.out.println("\n3):");
	}

// .4 Ejercicio: Potencia eléctrica
// Partiendo del ejercicio anterior, hacer los cambios necesarios para que la instalación disponga de una potencia máxima -que no puede cambiarse y realice las siguientes acciones:
// # Envíe un aviso de alto consumo cuando la potencia total consumida sea igual o superior al 75% de la potencia máxima.
// # Cuando la potencia total consumida sea igual o superior al 100% de la potencia máxima, pero esté por debajo de un margen de tolerancia (el 110% de la potencia máxima), enviará un aviso de exceso del consumo máximo. Además, aunque conectará este aparato, no permitirá el encendido de nuevos dispositivos mientras la potencia total no baje del 100%
// # Si la potencia total consumida supera el umbral de tolerancia, no permitirá la conexión del nuevo aparato (mostrando el correspondiente aviso).
	public void ej04(Scanner input) {
		System.out.println("\n4):");
	}

// .5 Ejercicio: Ampliación de la clase alumno Ampliar la clase anterior de forma que se registre también la carga horaria de cada asignatura (en créditos o en horas). Esta carga horaria deberá indicarse en el constructor de la clase (pasándola como un array).
// A continuación , construir un método que determine si un alumno pasa de curso. Se considerará que pasa de curso si tiene todas las asignaturas aprobadas ( suponiendo que la calificación para aprobar debe ser >= 5.0) o tiene una cantidad de asignaturas pendientes cuya carga horaria no es superior al 30% de la carga horaria total del curso.
// Observación: En este ejercicio, habrá que cambiar el procedimiento de cálculo de la nota media para que sea ponderada en función de la carga lectiva o número de créditos de cada asignatura.
// Si llamamos Calificaciones[] y Créditos[] a los arrays que registran respectivamente las calificaciones y carga en créditos de cada asignatura, entonces la nota media se obtendrácomo:
// SUMA 0<= i < longitud (Créditos) ( Calificaciones[i] * Créditos[i] ) / SUMA 0<= i < longitud (Créditos) (Créditos[i] )
	public void ej05(Scanner input) {
		System.out.println("\n5):");
	}

	/******************************************************************************/
	public void switchblade(Scanner input) {
		int key;
		do {
			System.out.print("Introduzca numero de ejercicio (1-" + ejersize + ") o 0 para salir: ");
			key = input.nextInt();
			if (key > 0 && key <= ejersize) {
				switchblade(input, key);
			} else if (key > 0 || key > ejersize) {
				System.out.println("Numero incorrecto");
			} else {
				System.out.println("Fin de programa.");
			}
		} while (key != 0);
	}

	public void switchblade(Scanner input, int... key) {
		for (int i = 0; i < key.length; i++) {
			switch (key[i]) {
			case (1):
				this.ej01(input);
				break;
			case (2):
				this.ej02(input);
				break;
			case (3):
				this.ej03(input);
				break;
			case (4):
				this.ej04(input);
				break;
			case (5):
				this.ej05(input);
				break;
			/*
			 * case (6): this.ej06(input); break; case (7): this.ej07(input); break; case
			 * (8): this.ej08(input); break; case (9): this.ej09(input); break; case (10):
			 * this.ej10(input); break; case (11): this.ej11(input); break; case (12):
			 * this.ej12(input); break; case (13): this.ej13(input); break; case (14):
			 * this.ej14(input); break; case (15): this.ej15(input); break; case (16):
			 * this.ej16(input); break; case (17): this.ej17(input); break; case (18):
			 * this.ej18(input); break; case (19): this.ej19(input); break; case (20):
			 * this.ej20(input); break; case (21): this.ej21(input); break; case (22):
			 * this.ej22(input); break; case (23): this.ej23(input); break; case (24):
			 * this.ej24(input); break; case (25): this.ej25(input); break;
			 */
			default:
				System.out.println("Número incorrecto");
				break;
			}
		}
	}

	public void allEjer(Scanner input) {
		this.ej01(input);
		this.ej02(input);
		this.ej03(input);
		this.ej04(input);
		this.ej05(input);
		/*
		 * this.ej06(input); this.ej07(input); this.ej08(input); this.ej09(input);
		 * this.ej10(input); this.ej11(input); this.ej12(input); this.ej13(input);
		 * this.ej14(input); this.ej15(input); this.ej16(input); this.ej17(input);
		 * this.ej18(input); this.ej19(input); this.ej20(input); this.ej21(input);
		 * this.ej22(input); this.ej23(input); this.ej24(input); this.ej25(input);
		 */
	}

	public class Bombilla {
		private boolean estado;

		/** @return the estado */
		public boolean isEstado() {
			return estado;
		}

		/** @param estado the estado to set */
		public void setEstado(boolean estado) {
			this.estado = estado;
		}

		Interruptor interruptor = new Interruptor();

		/** @return the interruptor */
		public Interruptor getInterruptor() {
			return interruptor;
		}

		/** @param interruptor the interruptor to set */
		public void setInterruptor(Interruptor interruptor) {
			this.interruptor = interruptor;
		}

		/** @param estado */
		public Bombilla(boolean estado) {
			this.estado = estado;
		}

		public Bombilla(Bombilla _bombilla) {
			this.setEstado(_bombilla.estado);
			this.setInterruptor(_bombilla.interruptor);
		}

		public Bombilla() {
			estado = false;
		}
	}

	public class Interruptor {
		private boolean estado;

		/** @return the estado */
		public boolean isEstado() {
			return estado;
		}

		/** @param estado the estado to set */
		public void setEstado(boolean estado) {
			this.estado = estado;
		}

		/** @param estado */
		public Interruptor(boolean estado) {
			this.estado = estado;
		}

		public Interruptor(Interruptor _interruptor) {
			this.setEstado(_interruptor.estado);
		}

		public Interruptor() {
			estado = false;
		}
	}

	public class AparatoElectrico {
		String nombre;
		int potencia;/* watios */
		boolean encendido;

		/** @return the nombre */
		public String getNombre() {
			return nombre;
		}

		/** @return the potencia */
		public int getPotencia() {
			return potencia;
		}

		/** @return the encendido */
		public boolean isEncendido() {
			return encendido;
		}

		/** @param nombre the nombre to set */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/** @param potencia the potencia to set */
		public void setPotencia(int potencia) {
			this.potencia = potencia;
		}

		/** @param encendido the encendido to set */
		public void setEncendido(boolean encendido) {
			this.encendido = encendido;
		}

		public void encender() {
			this.encendido = true;
		}

		public void apagar() {
			this.encendido = false;
		}

		/**
		 * @param nombre
		 * @param potencia
		 * @param encendido
		 */
		public AparatoElectrico(String nombre, int potencia, boolean encendido) {
			this.nombre = nombre;
			this.potencia = potencia;
			this.encendido = encendido;
		}

		public AparatoElectrico() {
		}
	}
}