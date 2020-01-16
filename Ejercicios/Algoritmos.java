package Ejercicios;

import java.util.Scanner;

public class Algoritmos {
	OrdenarYbusqueda oYb = new OrdenarYbusqueda();
	Auxiliares help = new Auxiliares();

	public void main(Scanner input) {
		int array[] = help.array.arrayRandom(200);
		help.array.println(array);
		ej1(help.array.copy(array));
		ej2(help.array.copy(array));
		ej3(help.array.copy(array));
		ej4(help.array.copy(array));
		ej5(help.array.copy(array));
		ej6(help.array.copy(array));
	}

	public void ej1(int array[]) {
		System.out.println("1) Ordenacion seleccion:");
		long tini = System.currentTimeMillis();
		int cont = oYb.seleccion(array);
		long tend = System.currentTimeMillis();
		System.out.println("\tRepeticiones: " + cont + " \tTiempo: " + tend + " - " + tini + " = " + (tend - tini)); // help.array.print(array);
	}

	public void ej2(int array[]) {
		System.out.println("\n2) Ordenacion insercion:");
		long tini = System.currentTimeMillis();
		int cont = oYb.insercion(array);
		long tend = System.currentTimeMillis();
		System.out.println("\tRepeticiones: " + cont + " \tTiempo: " + tend + " - " + tini + " = " + (tend - tini)); // help.array.print(array);
	}

	public void ej3(int array[]) {
		System.out.println("\n3) Ordenacion burbuja:");
		long tini = System.currentTimeMillis();
		int cont = oYb.burbuja(array);
		long tend = System.currentTimeMillis();
		System.out.println("\tRepeticiones: " + cont + " \tTiempo: " + tend + " - " + tini + " = " + (tend - tini)); // help.array.print(array);
	}

	public void ej4(int array[]) {
		{
			System.out.println("\n4.1) Ordenacion quicksort creciente:");
			long tini = System.currentTimeMillis();
			int cont = oYb.quicksortCreciente(array);
			long tend = System.currentTimeMillis();
			System.out.println("\tRepeticiones: " + cont + " \tTiempo: " + tend + " - " + tini + " = " + (tend - tini)); // help.array.print(array);
		}
		{
			System.out.println("\n4.2) Ordenacion quicksort deciente:");
			long tini = System.currentTimeMillis();
			int cont = oYb.quicksortDeciente(array);
			long tend = System.currentTimeMillis();
			System.out.println("\tRepeticiones: " + cont + " \tTiempo: " + tend + " - " + tini + " = " + (tend - tini)); // help.array.print(array);
		}
	}

	public void ej5(int array[]) {
		int num = array[array.length / 2];
		{
			System.out.println("\n5) Busqueda lineal(" + num + ") sin ordenar:");
			long tini = System.currentTimeMillis();
			int cont[] = oYb.lineal(array, num);
			long tend = System.currentTimeMillis();
			System.out.println("\tRepeticiones: " + cont[0] + " \tTiempo: " + tend + " - " + tini + " = "
					+ (tend - tini) + "\tPosicion: " + cont[1]);// help.array.print(array);
		}
		{
			System.out.println("\n5) Busqueda lineal(" + num + ") ordenado:");
			oYb.quicksortCreciente(array);
			long tini = System.currentTimeMillis();
			int cont[] = oYb.lineal(array, num);
			long tend = System.currentTimeMillis();
			System.out.println("\tRepeticiones: " + cont[0] + " \tTiempo: " + tend + " - " + tini + " = "
					+ (tend - tini) + "\tPosicion: " + cont[1]);// help.array.print(array);
		}
	}

	public void ej6(int array[]) {
		int num = array[array.length / 2];
		{
			System.out.println("\n6.1) Busqueda binaria(" + num + ") sin ordenar:");
			long tini = System.currentTimeMillis();
			int cont[] = oYb.binaria(array, num);
			long tend = System.currentTimeMillis();
			System.out.println("\tRepeticiones: " + cont[0] + " \tTiempo: " + tend + " - " + tini + " = "
					+ (tend - tini) + "\tPosicion: " + cont[1]);// help.array.print(array);
		}
		{
			System.out.println("\n6.2) Busqueda binaria(" + num + ") ordenado:");
			oYb.quicksortCreciente(array);
			long tini = System.currentTimeMillis();
			int cont[] = oYb.binaria(array, num);
			long tend = System.currentTimeMillis();
			System.out.println("\tRepeticiones: " + cont[0] + " \tTiempo: " + tend + " - " + tini + " = "
					+ (tend - tini) + "\tPosicion: " + cont[1]);// help.array.print(array);
		}
	}
}

class OrdenarYbusqueda {
	/** Ordenación por selección. */
	public int seleccion(int[] array) {
		int cont = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int aux = array[j];
					array[j] = array[i];
					array[i] = aux;
				}
				cont++;
			}
		}
		return cont;
	}

	/** Ordenación por inserción. */
	public int insercion(int[] array) {
		int cont = 0;
		for (int i = 1, j, aux; i < array.length; i++) {
			for (aux = array[i], j = i - 1; j >= 0 && aux < array[j]; j--) {
				array[j + 1] = array[j];
				cont++;
			}
			array[j + 1] = aux;
		}
		return cont;
	}

	/** Ordenación por burbuja. */
	public int burbuja(int[] array) {
		int cont = 0;
		for (int i = 1; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
				cont++;
			}
		}
		return cont;
	}

	/** Ordenación rápida o Quicksort Creciente. */
	public int quicksortCreciente(int[] array, int inf, int sup) {
		int i = inf, j = sup;
		int cont = 0;
		for (int x = array[(inf + sup) / 2]; i <= j;) {
			for (; array[j] > x; j--)
				;
			for (; array[i] < x; i++)
				;
			if (i <= j) {
				int tam = array[i];
				array[i] = array[j];
				array[j] = tam;
				i++;
				j--;
			}
			cont++;
		}
		if (inf < j) {
			cont += quicksortCreciente(array, inf, j);
		}
		if (i < sup) {
			cont += quicksortCreciente(array, i, sup);
		}
		return cont;
	}

	public int quicksortCreciente(int[] array) {
		return quicksortCreciente(array, 0, array.length - 1);
	}

	/** Ordenación rápida o Quicksort Deciente. */
	public int quicksortDeciente(int[] array, int inf, int sup) {
		int i = inf, j = sup;
		int cont = 0;
		for (int x = array[(inf + sup) / 2]; i <= j;) {
			for (; array[j] < x; j--)
				;
			for (; array[i] > x; i++)
				;
			if (i <= j) {
				int tam = array[i];
				array[i] = array[j];
				array[j] = tam;
				i++;
				j--;
			}
			cont++;
		}
		if (inf < j) {
			cont += quicksortDeciente(array, inf, j);
		}
		if (i < sup) {
			cont += quicksortDeciente(array, i, sup);
		}
		return cont;
	}

	public int quicksortDeciente(int[] array) {
		return quicksortDeciente(array, 0, array.length - 1);
	}

	/** Búsqueda lineal. */
	public int[] lineal(int[] array, int elemento) {
		int pos = -1;
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == elemento) {
				pos = i;
			}
			cont++;
		}
		return new int[] { cont, pos };
	}

	/** Búsqueda binaria. */
	public int[] binaria(int[] array, int elemento) {
		int pos = -1, inf = 0, sup = array.length - 1;
		int cont = 0;
		// quicksortCreciente(array);
		while (inf <= sup && pos == -1) {
			int centro = (sup + inf) / 2;
			if (array[centro] == elemento) {
				pos = centro;
			} else if (elemento < array[centro]) {
				sup = centro - 1;
			} else {
				inf = centro + 1;
			}
			cont++;
		}
		return new int[] { cont, pos };
	}
}
