package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Matrices {
	Auxiliares help = new Auxiliares();
	int ejersize = 13;

	/*
	 * 1. Crea un array bidimensional con un tamaño de 5x5, asígnale valores
	 * numéricos aleatorios y muéstralos por pantalla.
	 */
	public void ej01(Scanner input) {
		int matriz[][] = new int[5][5];
		Random random = new Random();
		System.out.println("\n1) 5x5 aleatorio: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt();
			}
		}
		help.matriz.println(matriz);
	}

	/*
	 * 2. Mostrar los primeros 100 (ejemplo: 2 filas y 50 columnas, 50 filas 2
	 * columnas, ...) números de izquierda a derecha usando un array de dos
	 * dimensiones.
	 */
	public void ej02(Scanner input) {
		int matriz1[][] = new int[50][2], matriz2[][] = new int[2][50];
		System.out.println("\n2) 50x2 y 2x50 primeros números:");
		for (int i = 0, k = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; k++, j++) {
				matriz1[i][j] = k + 1;
			}
		}
		for (int i = 0, k = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; k++, j++) {
				matriz2[i][j] = k + 1;
			}
		}
		help.matriz.println(matriz1);
		System.out.println();
		help.matriz.println(matriz2);
	}

	/*
	 * 3. Mostrar los primeros 100 (ídem al ejercicio anterior) números de izquierda
	 * a derecha usando un array de dos dimensiones, la última fila a mostrará la
	 * suma de sus respectivas columnas.
	 */
	public void ej03(Scanner input) {
		int matriz[][] = new int[10][11];
		System.out.println("\n3) Matriz 1-100, última fila a muestra suma de columna:");
		for (int i = 0, k = 0, suma = 0; i < matriz.length; suma = 0, i++) {
			for (int j = 0; j < matriz[i].length - 1; k++, j++) {
				matriz[i][j] = k + 1;
				suma += k + 1;
			}
			matriz[i][matriz[i].length - 1] = suma;
		}
		help.matriz.println(matriz);
	}

	/*
	 * 4. Rellenar un array de dos dimensiones con números pares, lo pinte y después
	 * que pida una posición X, Y y mostrar el número correspondiente.
	 */
	public void ej04(Scanner input) {
		int matriz[][] = new int[10][10], x, y;
		System.out.println("\n4) Matriz de pares y buscar posición:");
		for (int i = 0, k = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; k++, j++) {
				matriz[i][j] = 2 * (k + 1);
			}
		}
		help.matriz.println(matriz);
		System.out.print("Introduce posicion X: ");
		x = input.nextInt();
		System.out.print("Introduce posicion Y: ");
		y = input.nextInt();
		System.out.println("matriz[" + x + "][" + y + "]: " + matriz[x][y]);
	}

	/*
	 * 5. Crea un array bidimensional en la que en la primera fila tengamos los
	 * nombres, en la segunda fila los primeros apellidos y en la tercera los
	 * segundos apellidos.
	 */
	public void ej05(Scanner input) {
		String matriz[][] = { { "Nombre: \t", new String() }, { "Primer apellido: ", new String() },
				{ "Segundo apellido: ", new String() } };
		System.out.println("\n5) Matriz de nombre y apellidos");
		System.out.print("Introduce nombre: ");
		matriz[0][1] = input.next();
		System.out.print("Introduce primer apellido: ");
		matriz[1][1] = input.next();
		System.out.print("Introduce segundos apellido: ");
		matriz[2][1] = input.next();
		help.matriz.println(matriz);
	}

	/*
	 * 6. Escribir un programa que cree una matriz (array bidimensional) entera de
	 * tamaño 4x5 (valores aleatorios de 0 a 9) y un valor entero (también
	 * aleatorio), y muestre en pantalla la posición de la primera coincidencia del
	 * valor en la matriz.
	 */
	public void ej06(Scanner input) {
		int matriz[][] = new int[4][5], posicion[] = new int[2], rand;
		Random random = new Random();
		System.out.println("\n6) 4x5 aleatorio (0-9) y posición de un aleatrio");
		System.out.println("\n1) 5x5 aleatorio: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(9);
			}
		}
		help.matriz.println(matriz);
		rand = random.nextInt(9);
		posicion = help.matriz.buscar(matriz, rand);
		System.out.println("matriz[" + posicion[0] + "][" + posicion[1] + "]: " + rand);
	}

	/*
	 * 7. Rellenar una matriz (array bidimensional) de 3x3 y muestre su traspuesta
	 * (la traspuesta se consigue intercambiando filas por columnas y viceversa).
	 */
	public void ej07(Scanner input) {
		int matriz[][] = new int[3][3];
		System.out.println("\n7) 3x3 y transpuesta");
		for (int i = 0, k = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[i].length; matriz[i][j] = k + 1, k++, j++)
				;
		help.matriz.println(matriz);
		System.out.println();
		help.matriz.println(help.matriz.traspuesta(matriz));
	}

	/*
	 * 8. Escribir un programa que cree una matriz (array bidimensional) entera de
	 * tamaño (valores aleatorios de 1 a 100) y obtenga y escriba en pantalla el
	 * valor máximo y mínimo de toda la matriz.
	 */
	public void ej08(Scanner input) {
		int matriz[][] = new int[6][8], min[] = new int[2], max[] = new int[2];
		Random random = new Random();
		System.out.println("\n8) 6x8 aleatorio (1-100)");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(100 + 1);
			}
		}
		help.matriz.println(matriz);
		max = help.matriz.max(matriz);
		min = help.matriz.min(matriz);
		System.out.println("El mayor de la array es: " + max[0] + ", repeticiones: " + max[1]);
		System.out.println("El menor de la array es: " + min[0] + ", repeticiones: " + min[1]);
	}

	/*
	 * 9. Realizar un programa que pida dos matrices y las sume (siempre que sea
	 * posible) o avise de que no se pueden sumar.
	 */
	public void ej09(Scanner input) {
		int matriz1[][], matriz2[][], x1, y1, x2, y2;
		System.out.println("\n9) pida dos matrices y las sume siempre que se pueda");
		System.out.print("Introduce tamaño X1: ");
		x1 = input.nextInt();
		System.out.print("Introduce tamaño Y1: ");
		y1 = input.nextInt();
		matriz1 = new int[x1][y1];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.print("Introduce numero para primera matriz[" + i + "][" + j + "]: ");
				matriz1[i][j] = input.nextInt();
			}
		}
		System.out.print("Introduce tamaño X2: ");
		x2 = input.nextInt();
		System.out.print("Introduce tamaño Y2: ");
		y2 = input.nextInt();
		matriz2 = new int[x2][y2];
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.print("Introduce numero para segunda matriz[" + i + "][" + j + "]: ");
				matriz2[i][j] = input.nextInt();
			}
		}
		help.matriz.println(matriz1);
		System.out.println(" +");
		help.matriz.println(matriz2);
		System.out.println(" =");
		help.matriz.println(help.matriz.suma(matriz1, matriz2));
	}

	/*
	 * 10. Crear dos matrices de dimensión 4x4 de enteros (valores aleatorios de 0 a
	 * 9) y obtener una tercera matriz correspondiente a la suma de las dos.
	 */
	public void ej10(Scanner input) {
		Random random = new Random();
		int matriz1[][] = new int[4][4], matriz2[][] = new int[4][4], matriz3[][] = new int[4][4];
		System.out.println("\n10) dos matrices 4x4 aleatorios (0-9) y suma");
		for (int i = 0; i < matriz1.length || i < matriz2.length || i < matriz3.length; i++) {
			for (int j = 0; j < matriz1[i].length || j < matriz2[i].length || j < matriz3[i].length; j++) {
				matriz1[i][j] = random.nextInt(9);
				matriz2[i][j] = random.nextInt(9);
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		help.matriz.println(matriz1);
		System.out.println("\t    +");
		help.matriz.println(matriz2);
		System.out.println("\t    =");
		matriz3 = help.matriz.suma(matriz1, matriz2);
		help.matriz.println(matriz3);
	}

	/*
	 * 11. Realizar un programa que pida dos matrices y las reste (siempre que sea
	 * posible) o avise de que no se pueden restar.
	 */
	public void ej11(Scanner input) {
		int matriz1[][], matriz2[][], x1, y1, x2, y2;
		System.out.println("\n11) pida dos matrices y las restar siempre que se pueda");
		System.out.print("Introduce tamaño X1: ");
		x1 = input.nextInt();
		System.out.print("Introduce tamaño Y1: ");
		y1 = input.nextInt();
		matriz1 = new int[x1][y1];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.print("Introduce numero para primera matriz[" + i + "][" + j + "]: ");
				matriz1[i][j] = input.nextInt();
			}
		}
		System.out.print("Introduce tamaño X2: ");
		x2 = input.nextInt();
		System.out.print("Introduce tamaño Y2: ");
		y2 = input.nextInt();
		matriz2 = new int[x2][y2];
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.print("Introduce numero para segunda matriz[" + i + "][" + j + "]: ");
				matriz2[i][j] = input.nextInt();
			}
		}
		help.matriz.println(matriz1);
		System.out.println(" +");
		help.matriz.println(matriz2);
		System.out.println(" =");
		help.matriz.println(help.matriz.resta(matriz1, matriz2));
	}

	/*
	 * 12. Realizar un programa que pida dos matrices (utilizar para ello una
	 * función de lectura de matrices) y las multiplique (comprobando que esta
	 * operación se puede realizar).
	 */
	public void ej12(Scanner input) {
		int matriz1[][], matriz2[][], x1, y1, x2, y2;
		System.out.println("\n12) pida dos matrices y las multiplicar siempre que se pueda");
		System.out.print("Introduce anchura de la matriz 1: ");
		x1 = input.nextInt();
		System.out.print("Introduce altura de la matriz 1: ");
		y1 = input.nextInt();
		matriz1 = new int[x1][y1];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.print("Introduce numero para primera matriz[" + i + "][" + j + "]: ");
				matriz1[i][j] = input.nextInt();
			}
		}
		System.out.print("Introduce anchura de la matriz 2: ");
		x2 = input.nextInt();
		System.out.print("Introduce altura de la matriz 2: ");
		y2 = input.nextInt();
		matriz2 = new int[x2][y2];
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.print("Introduce numero para segunda matriz[" + i + "][" + j + "]: ");
				matriz2[i][j] = input.nextInt();
			}
		}
		help.matriz.println(matriz1);
		System.out.println(" " + " " + " " + " +");
		help.matriz.println(matriz2);
		System.out.println(" " + " " + " " + " =");
		help.matriz.println(help.matriz.multi(matriz1, matriz2));
	}

	/*
	 * 13. Escribir un programa que lea una matriz de 4x5 de números enteros
	 * (valores aleatorios de 0 a 9), calcule la suma de cada fila y de cada columna
	 * y muestre por pantalla la nueva tabla, incluyendo las sumas de las filas como
	 * una sexta columna y de las columnas como una quinta fila. No se crea una
	 * nueva matriz más grande, solo se imprime.
	 */
	public void ej13(Scanner input) {
		int matriz[][] = new int[4][5];
		Random random = new Random();
		System.out.println("\n13) Matriz 4x5 aleatorios(0-9), suma de filas y columnas");
		for (int i = 0, j; i < matriz.length; i++)
			for (j = 0; j < matriz[i].length; matriz[i][j] = random.nextInt(9), j++)
				;
		for (int i = 0, j, filas; i < matriz.length; System.out.println("= " + filas), i++)
			for (j = 0, filas = 0; j < matriz[i].length; filas += matriz[i][j], j++)
				System.out.print(matriz[i][j] + "\t");
		for (int i = 0, j, columnas; i < matriz[0].length; System.out.print("= " + columnas + "\t"), i++)
			for (j = 0, columnas = 0; j < matriz.length; columnas += matriz[j][i], j++)
				;
		System.out.println();
	}

	/******************************************************************************/
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
			case (6):
				this.ej06(input);
				break;
			case (7):
				this.ej07(input);
				break;
			case (8):
				this.ej08(input);
				break;
			case (9):
				this.ej09(input);
				break;
			case (10):
				this.ej10(input);
				break;
			case (11):
				this.ej11(input);
				break;
			case (12):
				this.ej12(input);
				break;
			case (13):
				this.ej13(input);
				break;
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
		this.ej06(input);
		this.ej07(input);
		this.ej08(input);
		this.ej09(input);
		this.ej10(input);
		this.ej11(input);
		this.ej12(input);
		this.ej13(input);
	}
}
