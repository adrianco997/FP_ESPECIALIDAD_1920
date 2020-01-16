package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void Psint(Scanner input) {
		Psint Psint = new Psint();
		System.out.println("Ejercicios Psint:");
		Psint.switchblade(input); // Psint.allEjer(input);
	}

	public static void Metodos(Scanner input) {
		Metodos Metodos = new Metodos();
		System.out.println("Ejercicios Metodos:");
		Metodos.switchblade(input); // Metodos.allEjer(input);
	}

	public static void Utils(Scanner input) {
		Utils Utils = new Utils();
		System.out.println("Ejercicios Utils:");
		Utils.switchblade(input);// Utils.allEjer(input);
	}

	public static void Bateria(Scanner input) {
		Baterias Baterias = new Baterias();
		System.out.println("Ejercicios Bateria 1:");
		Baterias.Bateria1.switchblade(input);// Baterias.Bateria1.allEjer(input);
		System.out.println("Ejercicios Bateria 2:");
		Baterias.Bateria2.switchblade(input);// Baterias.Bateria2.allEjer(input);
	}

	public static void Arrays(Scanner input) {
		Arrays Arrays = new Arrays();
		System.out.println("Ejercicios Arrays:");
		Arrays.switchblade(input);// Arrays.allEjer(input);
	}

	public static void Matrices(Scanner input) {
		Matrices Matrices = new Matrices();
		System.out.println("Ejercicios Matrices:");
		Matrices.switchblade(input);// Matrices.allEjer(input);
	}

	public static void Algoritmos(Scanner input) {
		Algoritmos Algoritmos = new Algoritmos();
		System.out.println("Ejercicios Algoritmos:");
		Algoritmos.main(input);// Algoritmos.allEjer(input);
	}
	public static void Clases(Scanner input) {
		Clases Clases = new Clases();
		System.out.println("Ejercicios Clases:");
		Clases.switchblade(input
				//,1
				,2
				,3
				//,4
				//,5
				);// Clases.allEjer(input);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ejercicios:");
		// Psint(input);
		// Metodos(input);
		// Utils(input);
		// Bateria(input);
		// Arrays(input);
		// Matrices(input);
		//Algoritmos(input);
		Clases(input);

		
		input.close();
	}
}
class Ejercicio {
	public static void main0(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce tamaño de array: ");
		int array[] = new int[input.nextInt()];
		System.out.print("Introduce forma de introducir los valores (manual o aleatoria):");
		String modo = input.next();
		for (int i = 0; i < array.length; array[i] = (modo.equalsIgnoreCase("manual")) ? input.nextInt()
				: (modo.equalsIgnoreCase("aleatoria")) ? new Random().nextInt() : 0, i += (array[i] % 2 == 0) ? 1 : 0)
			System.out.print(modo.equalsIgnoreCase("manual") ? "Introducir numero " + (i + 1) + ": " : "");
		for (int i = 0; i < array.length; System.out.print(array[i] + "\t"), i++)
			;
		input.close();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce tamaño de array: ");
		int array[] = new int[input.nextInt()];
		System.out.print("Introduce forma de introducir los valores (manual o aleatoria):");
		String modo = input.next();
		for (int i = 0; i < array.length; i += (array[i] % 2 == 0) ? 1 : 0) {
			if (modo.equalsIgnoreCase("manual")) {
				System.out.print("Introducir numero " + (i + 1) + ": ");
				array[i] = input.nextInt();
			} else if (modo.equalsIgnoreCase("aleatoria")) {
				array[i] = new Random().nextInt();
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}

		input.close();
	}
}