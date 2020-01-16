package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
	Auxiliares help = new Auxiliares();
	int ejersize = 24;

	/*
	 * 1. Indica el valor de cada una de las posiciones de las siguientes
	 * estructuras: El valor de x y de A[i]; El valor de B[i]; El valor de y de
	 * C[i];
	 * 
	 * int B[]=new int[5],C[]=new int[4],y;double A[]=new double[3],x;for(int i=0;i<
	 * A.length;i++)A[i]=i*3;x=A[0]+A[1]+A[2];int[5];B[4]=1;B[B[4]]=2;B[B[B[4]]]=0;B
	 * [B[B[B[4]]]]=3;B[B[B[B[B[4]]]]]=4;for(int i=C.length-1;i>=0;i--)C[i]=i/2;y=C[
	 * 0]+C[1]+C[2]+C[3];
	 */
	public void ej01(Scanner input) {
		int B[] = new int[5], C[] = new int[4], y;
		double A[] = new double[3], x;
		System.out.println("\n1) Valor de cada posicion de las siguientes estructuras:");
		for (int i = 0; i < A.length; i++) {
			A[i] = i * 3;
		}
		x = (A[0] + A[1] + A[2]);
		B[4] = 1;// B[4]=1
		B[B[4]] = 2;// B[1]=2
		B[B[B[4]]] = 0;// B[2]=0
		B[B[B[B[4]]]] = 3;// B[0]=3
		B[B[B[B[B[4]]]]] = 4;// B[3]=4
		for (int i = C.length - 1; i >= 0; i--) {
			C[i] = i / 2;
		}
		y = C[0] + C[1] + C[2] + C[3];
		System.out.println("A = {" + A[0] + ", " + A[1] + ", " + A[2] + "}\nx = " + x);
		System.out.println("B = {" + B[0] + ", " + B[1] + ", " + B[2] + ", " + B[3] + ", " + B[4] + "}");
		System.out.println("C = {" + C[0] + ", " + C[1] + ", " + C[2] + ", " + C[3] + "}\ny = " + y);
	}

	/*
	 * 2. Rellenar un array con los 100 primeros numeros enteros y los muestre en
	 * pantalla en orden ascendente.
	 */
	public void ej02(Scanner input) {
		int array[] = new int[100];
		System.out.println("\n2) 100 primeros numeros enteros en orden ascendente:");
		for (int i = 0; i < array.length; array[i] = i + 1, i++)
			;
		help.array.println(array);
	}

	/*
	 * 3. Rellenar un array con los 100 primeros numeros enteros y los muestre en
	 * pantalla en orden descendente.
	 */
	public void ej03(Scanner input) {
		int array[] = new int[100];
		System.out.println("\n3) 100 primeros numeros enteros en orden descendente:");
		for (int i = 0; i < array.length; array[i] = 100 - i, i++)
			;
		help.array.println(array);
	}

	/*
	 * 4. Rellenar un array con los numeros pares comprendidos entre 1 y 100 y los
	 * muestre en pantalla en orden ascendente.
	 */
	public void ej04(Scanner input) {
		int array[] = new int[100];
		System.out.println("\n4) Pares comprendidos entre 1 y 100 en orden ascendente:");
		for (int i = 0; i < array.length; array[i] = 2 * (i + 1), i++)
			;
		help.array.println(array);
	}

	/*
	 * 5. Rellenar un array con los numeros impares comprendidos entre 1 y 100 y los
	 * muestre en pantalla en orden ascendente.
	 */
	public void ej05(Scanner input) {
		int array[] = new int[100];
		System.out.println("\n5) Impares comprendidos entre 1 y 100 en orden ascendente:");
		for (int i = 0; i < array.length; array[i] = 2 * (i + 1) - 1, i++)
			;
		help.array.println(array);
	}

	/*
	 * 6. Rellenar un array con los numeros primos comprendidos entre 1 y 100 y los
	 * muestre en pantalla en orden ascendente.
	 */
	public void ej06(Scanner input) {
		int array[] = new int[100];
		System.out.println("\n6) Primos comprendidos entre 1 y 100 en orden ascendente:");
		for (int i = 0, j = 0, resto = 0; j < array.length; resto = 0, i++) {
			for (int k = 1; k <= i && resto <= 2; k++) {
				if (i % k == 0) {
					resto++;
				}
			}
			if (resto == 2) {
				array[j] = i;
				j++;
			}
		}
		help.array.println(array);
	}

	/*
	 * 7. Rellena un array de enteros con 200 elementos y muestre por pantalla el
	 * mayor de ellos. Utliza Random de Math o clase Random
	 */
	public void ej07(Scanner input) {
		int array[] = new int[200], max[] = new int[2];
		Random random = new Random();
		System.out.println("\n7) 200 Random y el mayor de ellos:");
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(array.length);
		}
		help.array.println(array);
		max = help.array.max(array);
		System.out.println("El mayor del array es: " + max[0] + ", repeticiones: " + max[1]);
	}

	/*
	 * 8. Dado un array de enteros calcule el sumatorio de sus elementos.
	 */
	public void ej08(Scanner input) {
		int array[] = new int[100], suma;
		Random random = new Random();
		System.out.println("\n8) Dado un array de enteros calcule el sumatorio de sus elementos:");
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(array.length);
		}
		suma = help.array.sum(array);
		help.array.println(array);
		System.out.println("Suma: " + suma);
	}

	/*
	 * 9. ¿Sabrias recorrer un array de forma circular? Es decir, ¿cuando llegue al
	 * ultimo elemento que pase al primero?
	 */
	public void ej09(Scanner input) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, vueltas;
		System.out.println("\n9) Recorrer un array de forma circular:");
		System.out.print("Introduce numero de vueltas: ");
		vueltas = input.nextInt();
		for (int i = 0, j = i; i < array.length * vueltas; i++, j = i) {
			if (i >= array.length) {
				for (j = i; j >= array.length && j > 0; j -= array.length)
					;
			}
			System.out.print(array[j] + (((j + 1) % 10 != 0) ? "\t" : "\n"));
		}
	}

	/*
	 * 10. Rellena un array de enteros con 200 elementos y muestre por pantalla los
	 * pares. ¿Sabria que codigo debe escribir para mostrar el primer elemento del
	 * array que sea par y salir del bucle que lo recorre?
	 */
	public void ej10(Scanner input) {
		int array[] = new int[200];
		System.out.println("\n10) Array de 200 enteros, mostrar pares:");
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		for (int i = 0, j = 2 * (i + 1); j < array.length; j = 2 * (i + 1), i++) {
			System.out.print(array[j] + (((i + 1) % 10 != 0) ? "\t" : "\n"));
		}
		System.out.println();
	}

	/*
	 * 11. Leer 10 numeros por teclado, los almacene en un array y muestre la suma,
	 * resta, multiplicacion y division de todos.
	 */
	public void ej11(Scanner input) {
		double array[] = new double[10], sum, res, mul, div;
		System.out.println("\n11) Almacenar un array de 10 y muestra su suma, resta, multiplicacion y division:");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introducir numero " + (i + 1) + ": ");
			array[i] = input.nextDouble();
		}
		sum = help.array.sum(array);
		res = help.array.rest(array);
		mul = help.array.multi(array);
		div = help.array.div(array);
		System.out.println("suma=" + sum + ", resta =" + res + ", multiplicacion =" + mul + ", division =" + div);
	}

	/*
	 * 12. Leer 10 numeros por teclado, los almacene en un array y los ordene de
	 * forma ascendente.
	 */
	public void ej12(Scanner input) {
		int array[] = new int[10];
		System.out.println("\n12) Almacenar un array de 10 numeros y ordena de forma ascendente:");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introducir numero " + (i + 1) + ": ");
			array[i] = input.nextInt();
		}
		help.array.ordenar(array);
		help.array.println(array);
	}

	/*
	 * 13. Leer 10 numeros por teclado, 5 para un array y 5 para otro array
	 * distinto. Mostrar los 10 numeros en pantalla mediante un solo array.
	 */
	public void ej13(Scanner input) {
		int array1[] = new int[5], array2[] = new int[5], array3[];
		System.out.println("\n13) Almacenar dos arrays de 5 numeros y unirlos:");
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Introducir numero 1." + (i + 1) + ": ");
			array1[i] = input.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print("Introducir numero 2." + (i + 1) + ": ");
			array2[i] = input.nextInt();
		}
		array3 = help.array.join(array1, array2);
		help.array.println(array3);
	}

	/*
	 * 14. Leer 5 numeros por teclado, los copie a otro array multiplicados por 2 y
	 * muestre el segundo array.
	 */
	public void ej14(Scanner input) {
		int array1[] = new int[5], array2[] = new int[5];
		System.out.println("\n14) Almacenar un array de 5 numeros, copia multiplicando por 2:");
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Introducir numero " + (i + 1) + ": ");
			array1[i] = input.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i] * 2;
		}
		help.array.println(array2);
	}

	/*
	 * 15. Leer 5 numeros por teclado, los copie a otro array multiplicados por 2 y
	 * los muestre todos ordenados usando un tercer array.
	 */
	public void ej15(Scanner input) {
		int array1[] = new int[5], array2[] = new int[5];
		System.out.println("\n15) Almacenar un array de 5 numeros, copia multiplicando por 2 y ordena:");
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Introducir numero " + (i + 1) + ": ");
			array1[i] = input.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i] * 2;
		}
		help.array.ordenar(array2);
		help.array.println(array2);
	}

	/*
	 * 16. Rellenar un array con los 100 primeros numeros pares y muestre su suma.
	 */
	public void ej16(Scanner input) {
		int array[] = new int[100], suma;
		System.out.println("\n16) 100 primeros pares y su suma:");
		for (int i = 0; i < array.length; i++) {
			array[i] = 2 * (i);
		}
		suma = help.array.sum(array);
		help.array.println(array);
		System.out.println("Suma =" + suma);
	}

	/*
	 * 17. Leer 10 numeros por teclado, los almacene en un array y muestre la media.
	 */
	public void ej17(Scanner input) {
		int array[] = new int[10], media;
		System.out.println("\n17) Almacenar un array de 10 numeros y hacer media:");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introducir numero " + (i + 1) + ": ");
			array[i] = input.nextInt();
		}
		media = help.array.media(array);
		System.out.println("Media: " + media);
	}

	/*
	 * 18. Almacenar en un array una cantidad de numeros dados (tanto positivos como
	 * negativos) y mostrarlos ordenados.
	 */
	public void ej18(Scanner input) {
		int array[];
		System.out.println("\n18) Ordenar un array:");
		System.out.print("Introduce tamaño de array: ");
		array = new int[input.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introducir numero " + (i + 1) + ": ");
			array[i] = input.nextInt();
		}
		help.array.ordenar(array);
		help.array.println(array);
	}

	/*
	 * 19. Almacenar en un array 10 numeros enteros que se leen por teclado. A
	 * continuacion, se recorre el array y calcula cuantos numeros son positivos,
	 * cuantos negativos y cuantos ceros.
	 */
	public void ej19(Scanner input) {
		int array[] = new int[10], positivos = 0, negativos = 0, ceros = 0;
		System.out.println("\n19) Almacena un array de 10 enteros, calcula cuantos son positivos, negativos y ceros:");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introducir numero " + (i + 1) + ": ");
			array[i] = input.nextInt();
			if (array[i] > 0) {
				positivos++;
			} else if (array[i] < 0) {
				negativos++;
			} else {
				ceros++;
			}
		}
		System.out.println("Positivos: " + positivos + ", negativos: " + negativos + ", ceros: " + ceros);
	}

	/*
	 * 20. Dado un array 10 numeros enteros que se leen por teclado. A continuacion,
	 * se recorre el array y calcula cuantos numeros son positivos, cuantos
	 * negativos y cuuntos ceros.
	 */
	public void ej20(Scanner input) {
		System.out.println("\n20) El 19 repetido:");
		ej19(input);
	}

	/*
	 * 21. Rellenar un array con 20 numeros y luego busque un numero concreto.
	 */
	public void ej21(Scanner input) {
		int array[] = new int[20], num;
		System.out.println("\n21) Almacena un array de 20 y buscar :");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introducir numero " + (i + 1) + ": ");
			array[i] = input.nextInt();
		}
		System.out.print("Introducir numero a buscar: ");
		num = input.nextInt();
		System.out.print("El numero " + num + ((help.array.buscar(array, num)) ? "" : " no") + " esta en el array");
		;
	}

	/*
	 * 22. Construir un programa que permita encontrar el numero mayor y el numero
	 * menor de una serie de numeros ingresados por teclado, como primera entrada se
	 * le dara el tamaño del array y, luego los datos, tambien se debe indicar
	 * cuantas veces se repiten tanto el mayor como el menor.
	 */
	public void ej22(Scanner input) {
		int array[], max[], min[];
		System.out.println("\n22) Almacena un array y encuentra maximo, minimo y cuantas veces se repiten:");
		System.out.print("Introduce tamaño de array: ");
		array = new int[input.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introducir numero " + (i + 1) + ": ");
			array[i] = input.nextInt();
		}
		max = help.array.max(array);
		min = help.array.min(array);
		System.out.print("Maximo: " + max[0] + ", repeticiones: " + max[1] + "\nMinimo: " + min[0] + ", repeticiones: "
				+ min[1]);
	}

	/*
	 * 23. Crea un array que lea la altura de N personas, primero pediremos N, y
	 * calcularemos la altura media, despues de tener todos los datos. Tendremos que
	 * indicar cuantas personas tienen una altura superior a la media y cuantas
	 * tienen una altura inferior a la media.
	 */
	public void ej23(Scanner input) {
		int array[], media, sobre = 0, bajo = 0;
		System.out.println("\n23) Array de altura de N personas, media y personas sobre y bajo la media:");
		System.out.print("Introduce tamaño de array: ");
		array = new int[input.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introducir numero " + (i + 1) + ": ");
			array[i] = input.nextInt();
		}
		media = help.array.media(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] > media) {
				sobre++;
			} else if (array[i] < media) {
				bajo++;
			}
		}
		System.out.println("Media: " + media + ", personas sobre la media: " + sobre + ", bajo la media: " + bajo);
	}

	/*
	 * 24. Crea un programa, en el que nos pida ingresar una palabra, para mostrarla
	 * letra por letra y la suma de sus caracteres. Hacerlo con un array, String o
	 * char.
	 */
	public void ej24(Scanner input) {
		String aux = new String();
		char array[];
		int suma = 0;
		System.out.println("\n24) Almacena palabra y suma sus caracteres:");
		System.out.print("Introducir palabra: ");
		aux = input.next("\\w*");
		input.nextLine();
		array = new char[aux.length()];
		for (int i = 0; i < aux.length(); i++) {
			array[i] = aux.charAt(i);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "=" + (int) array[i] + "\t");
			suma += array[i];
		}
		System.out.println("\nSuma: " + suma);
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
			case (14):
				this.ej14(input);
				break;
			case (15):
				this.ej15(input);
				break;
			case (16):
				this.ej16(input);
				break;
			case (17):
				this.ej17(input);
				break;
			case (18):
				this.ej18(input);
				break;
			case (19):
				this.ej19(input);
				break;
			case (20):
				this.ej20(input);
				break;
			case (21):
				this.ej21(input);
				break;
			case (22):
				this.ej22(input);
				break;
			case (23):
				this.ej23(input);
				break;
			case (24):
				this.ej24(input);
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
		this.ej14(input);
		this.ej15(input);
		this.ej16(input);
		this.ej17(input);
		this.ej18(input);
		this.ej19(input);
		this.ej20(input);
		this.ej21(input);
		this.ej22(input);
		this.ej23(input);
		this.ej24(input);
	}
}
