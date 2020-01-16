package Ejercicios;

import java.util.Scanner;

public class Psint {
	Auxiliares help = new Auxiliares();
	int ejersize = 33;

	/*
	 * 1. Pide los datos (base y altura) de dos triangulos y determina cual de ellos
	 * tiene mayor area (llamalos primero y segundo).
	 */
	public void ej01(Scanner input) {
		double a1, a2, b1, b2, h1, h2;
		System.out.println("\n1) Comparar dos triangulos:");
		System.out.print("Introduce medidas triangulo 1:");
		System.out.println("Base 1: ");
		b1 = input.nextDouble();
		System.out.println("Altura 1: ");
		h1 = input.nextDouble();
		a1 = b1 * h1 / 2;
		System.out.print("Introduce medidas triangulo 2:");
		System.out.println("Base 2: ");
		b2 = input.nextDouble();
		System.out.println("Altura 2: ");
		h2 = input.nextDouble();
		a2 = b2 * h2 / 2;
		if (a1 == a2) {
			System.out.println("Ambos triangulo iguales.");
		} else if (a1 > a2) {
			System.out.println("Primer triangulo mayor.");
		} else {
			System.out.println("Segundo triangulo mayor.");
		}
	}

	/*
	 * 2. A un trabajador le pagan segun sus horas trabajadas y la tarifa esta a un
	 * valor por hora. Si la cantidad de horas trabajadas es mayor a 40 horas, la
	 * tarifa por hora se incrementa en un 50% para las horas extras. Calcular el
	 * salario del trabajador dadas las horas trabajadas y la tarifa.
	 */
	public void ej02(Scanner input) {
		double salario, horas, tarifa;
		System.out.println("\n2) Introduce horas: ");
		horas = input.nextDouble();
		System.out.print("Introduce tarifa: ");
		tarifa = input.nextDouble();
		salario = (horas >= 40) ? tarifa * (40 + 3 / 2 * (horas - 40)) : horas * tarifa;
		System.out.println("Salario: " + salario);
	}

	/*
	 * 3. Dadas dos variables numericas A y B, que el usuario debe teclear, se pide
	 * realizar un algoritmo que intercambie los valores de ambas variables y
	 * muestre cuanto valen al final las dos variables
	 */
	public void ej03(Scanner input) {
		int a, b, aux;
		System.out.println("\n3) Volteo de variables");
		System.out.print("Introduce a: ");
		a = input.nextInt();
		System.out.print("Introduce b: ");
		b = input.nextInt();
		System.out.println("a=" + a + " y b=" + b);
		aux = a;
		a = b;
		b = aux;
		System.out.println("a=" + a + " y b=" + b);
	}

	/*
	 * 4. Algoritmo que lea tres numeros distintos y nos diga cual de ellos es el
	 * mayor
	 */
	public void ej04(Scanner input) {
		double a, b, c;
		System.out.println("\n4) Cual de ellos es el mayor?");
		System.out.print("Introduce a: ");
		a = input.nextDouble();
		System.out.print("Introduce b: ");
		b = input.nextDouble();
		System.out.print("Introduce c: ");
		c = input.nextDouble();
		if (a > b) {
			if (b > c) {
				System.out.println(a + "(a) >= " + b + "(b) >= " + c + "(c)"); /* 321 */
			} else if (c > a) {
				System.out.println(c + "(c) >= " + a + "(a) >= " + b + "(b)"); /* 213 */
			} else {
				System.out.println(a + "(a) >= " + c + "(c) >= " + b + "(b)"); /* 312 */
			}
		} else if (c > b) {
			System.out.println(c + "(c) >= " + b + "(b) >= " + a + "(a)"); /* 123 */
		} else if (c > a) {
			System.out.println(b + "(b) >= " + c + "(c) >= " + a + "(a)"); /* 132 */
		} else {
			System.out.println(b + "(b) >= " + a + "(a) >= " + c + "(c)"); /* 231 */
		}
	}

	/*
	 * 5. Diseña un algoritmo que pida por teclado tres numeros; si el primero es
	 * negativo, debe imprimir el producto de los tres y si no lo es, imprimira la
	 * suma.
	 */
	public void ej05(Scanner input) {
		double a, b, c;
		System.out.println(
				"5) Introduce Introduce tres numeros,\n" + "1ro negativo -> producto de los tres, si no -> suma");
		System.out.print("Introduce primer numero: ");
		a = input.nextDouble();
		System.out.print("Introduce segundo numero: ");
		b = input.nextDouble();
		System.out.print("Introduce tercer numero: ");
		c = input.nextDouble();
		System.out.println("Resultado: " + ((a < 0) ? a * b * c : a + b + c));
	}

	/*
	 * 6. Realiza un algoritmo que lea un numero por teclado. En caso de que ese
	 * numero sea 0 o menor que 0, se saldra del programa imprimiendo antes un
	 * mensaje de error. Si es mayor que 0, se debera calcular su cuadrado y la raiz
	 * cuadrada del mismo, visualizando el numero que ha tecleado el usuario y su
	 * resultado ("Del numero X, su potencia es X y su raiz X").
	 */
	public void ej06(Scanner input) {
		double num;
		System.out.println("\n6) Introduce un numero: ");
		num = input.nextDouble();
		System.out.println("Numero: " + num
				+ ((num > 0) ? "; Potencia: " + (double) Math.pow(num, 2) + "; Raiz: " + (double) Math.sqrt(num)
						: " > 0: ERROR"));
	}

	/*
	 * 7. Un colegio desea saber que porcentaje de niños y que porcentaje de niñas
	 * hay en el curso actual. Diseñar un algoritmo para este proposito. Puedes
	 * pedir los datos que creas necesarios para realizar este calculo.
	 */
	public void ej07(Scanner input) {
		int niños, niñas;
		System.out.println("\n7) Introduce niños y niñas:");
		System.out.print("Introduce niños: ");
		niños = input.nextInt();
		System.out.print("Introduce niñas: ");
		niñas = input.nextInt();
		if ((niños > 0) && (niñas > 0)) {
			System.out.println("Porcentaje de niños: " + 100 * niños / (niños + niñas) + "%, de niñas: "
					+ 100 * niñas / (niños + niñas) + "%");
		} else {
			System.out.println("ERROR de entrada");
		}
	}

	/*
	 * 8. Una tienda ofrece un descuento del 15% sobre el total de la compra durante
	 * el mes de octubre. Dado un mes y un importe, calcular cual es la cantidad que
	 * se debe cobrar al cliente.
	 */
	public void ej08(Scanner input) {
		String mes = new String();
		double importe;
		System.out.println("\n8) Descuento del 15% en octubre:");
		System.out.print("Introduce mes: ");
		mes = input.next();
		System.out.print("Introduce importe: ");
		importe = input.nextDouble();
		System.out.println("Importe final: " + ((mes.equalsIgnoreCase("octubre")) ? importe * 0.85 : importe));
	}

	/*
	 * 9. Desarrollar un algoritmo que nos calcule el cuadrado de los 9 primeros
	 * numeros naturales
	 */
	public void ej09(Scanner input) {
		int a;
		System.out.println("\n9) Cuadrado de los 9 sigientes numeros naturales:");
		System.out.print("Introduce numero: ");
		a = input.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.println((a + i) + "^2 = " + (int) Math.pow(a + i, 2));
		}
		System.out.println();
	}

	/*
	 * 10. Se ha establecido un programa para estimular a los alumnos, el cual
	 * consiste en lo siguiente: si el promedio global obtenido por un alumno en el
	 * ultimo periodo es mayor o igual que 4, se le hara un descuento del 30% sobre
	 * la matricula y no se le cobrara IVA; si el promedio obtenido es menor que 4
	 * debera pagar la matricula completa, la cual debe incluir el 10% de IVA. Hacer
	 * un algoritmo que calcule el valor a pagar si se conocen las notas finales de
	 * las 6 materias que cursaron.
	 */
	public void ej10(Scanner input) {
		double notas = 0, media;
		System.out.println("\n10) Dar 6 notas:");
		for (int i = 0; i < 6; i++) {
			System.out.print("Introduce nota " + (i + 1) + ": ");
			notas += input.nextDouble();
		}
		media = notas / 6;
		System.out.println("Matricula: 5000 euros + media: " + media);
		System.out.println("Proxima matricula: " + ((media >= 4) ? 5000 * 0.70 : 5000 * 1.10) + " euros");
	}

	/*
	 * 11. Los empleados de una fabrica trabajan en dos turnos, Diurno y Nocturno.
	 * Se desea calcular el jornal diario de acuerdo a con las siguientes reglas: La
	 * tarifa de las horas diurnas es de 10 euros. La tarifa de las horas nocturnas
	 * es de 13, 5 euros. En caso de ser festivo, la tarifa se incrementa en un 10%
	 * en caso de turno diurno y en un 15% para el nocturno. Escribe una funcion en
	 * pseudocodigo llamada jornal(...) que tome como parametros el no de horas, el
	 * turno y el tipo de dia ("Festivo", "Laborable") y nos devuelva el sueldo a
	 * cobrar. Escribe tambien un algoritmo principal que pida el nombre del
	 * trabajador, el dia de la semana, turno y no de horas trabajadas, nos escriba
	 * el sueldo a cobrar usando la funcion anterior. Ten en cuenta, que en la
	 * funcion nos pide el tipo de dia pero en el algoritmo le pedimos al dia es
	 * decir, que debemos saber si el dia que introduce el usuario es festivo o no.
	 */
	public void ej11(Scanner input) {
		String turno = new String(), dia = new String();
		double horas, res;
		System.out.println("\n11) Jornal");
		System.out.println("Numero de horas: ");
		horas = input.nextDouble();
		System.out.println("Tipo de turno (diurno, nocturno): ");
		turno = input.next();
		System.out.println("Tipo de dia (festivo, laborable): ");
		dia = input.next();
		if ((turno.equalsIgnoreCase("diurno") || turno.equalsIgnoreCase("nocturno"))
				&& (dia.equalsIgnoreCase("festivo") || dia.equalsIgnoreCase("laborable"))) {
			if (dia.equalsIgnoreCase("festivo")) {
				res = ((turno.equalsIgnoreCase("diurno")) ? 10 * 1.10 : 13.5 * 1.15);
			} else {
				res = ((turno.equalsIgnoreCase("diurno")) ? 10 : 13.5);
			}
			System.out.println("Jornal = " + res * horas);
		} else {
			System.out.println("ERROR de entrada");
		}
	}

	/*
	 * 12. Realizar un algoritmo que dado un numero entero, visualice en pantalla si
	 * es par o impar. En el caso de ser 0, debe visualizar
	 * "el numero no es par ni impar" (para que un numero sea par, se debe dividir
	 * entre dos y que su resto sea 0).
	 */
	public void ej12(Scanner input) {
		int num;
		System.out.println("\n12) Par/impar: ");
		System.out.print("Introduce un numero: ");
		num = input.nextInt();
		if (num != 0) {
			System.out.println("El numero es " + ((num % 2 == 0) ? "par" : "impar"));
		} else {
			System.out.println("El numero no es par ni impar");
		}
	}

	/*
	 * 13. Crea un programa que pida al usuario dos numeros y muestre su division si
	 * el segundo no es cero, o un mensaje de aviso en caso contrario.
	 */
	public void ej13(Scanner input) {
		double num1, num2;
		System.out.println("\n13) Division");
		System.out.print("Introduce primer numero: ");
		num1 = input.nextDouble();
		System.out.print("Introduce segundo numero: ");
		num2 = input.nextDouble();
		if (num2 != 0) {
			System.out.println("Division = " + num1 / num2);
		} else {
			System.out.println("ERROR");
		}
	}

	/*
	 * 14. Haz un programa que pida al usuario dos numeros y diga cuantos de ellos
	 * son positivos.
	 */public void ej14(Scanner input) {
		double num1, num2;
		System.out.println("\n14) Positivo/negativo");
		System.out.print("Introduce primer numero: ");
		num1 = input.nextDouble();
		System.out.print("Introduce segundo numero: ");
		num2 = input.nextDouble();
		System.out.println(num1 + " es " + ((num1 > 0) ? "positivo" : "negativo"));
		System.out.println(num2 + " es " + ((num2 > 0) ? "positivo" : "negativo"));
	}

	/*
	 * 15. Algoritmo que nos diga si una persona puede acceder a cursar un ciclo
	 * formativo de grado superior o no. Para acceder a un grado superior, si se
	 * tiene un titulo de bachiller, en caso de no tenerlo, se puede acceder si
	 * hemos superado una prueba de acceso.
	 */
	public void ej15(Scanner input) {
		String bachiller = new String(), prueba = new String();
		System.out.println("\n15) Cursar un ciclo formativo");
		System.out.println("Tiene un titulo de bachiller? (si/no): ");
		bachiller = input.next();
		if (bachiller.equalsIgnoreCase("no")) {
			System.out.println("A superado la prueba de acceso? (si/no): ");
			prueba = input.next();
			System.out.println("Puede" + ((prueba.equalsIgnoreCase("si")) ? "Puede" : "No puede")
					+ " acceder a cursar un ciclo formativo");
		} else {
			System.out.println("Puede acceder a cursar un ciclo formativo");
		}
	}

	/*
	 * 16. Leer tres numeros que denoten una fecha (dia, mes, año). Comprobar que es
	 * una fecha valida. Si no es valida escribir un mensaje de error. Si es valida
	 * escribir la fecha cambiando el numero del mes por su nombre. Ej. si se
	 * introduce 1 2 2006, se debera imprimir "1 de febrero de 2006". El año debe
	 * ser mayor que 0.
	 */
	public void ej16(Scanner input) {
		int dia, mes, año;
		System.out.println("\n16) Fecha");
		System.out.print("Introduce dia: ");
		dia = input.nextInt();
		System.out.print("Introduce mes (numero): ");
		mes = input.nextInt();
		System.out.print("Introduce año: ");
		año = input.nextInt();
		if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12) {
			if (mes == 1 && dia <= 31) {
				System.out.println(dia + " de enero de " + año);
			} else if (mes == 2 && (dia <= 28 || (dia <= 29 && año % 4 == 0))) {
				System.out.println(dia + " de febrero de " + año);
			} else if (mes == 3 && dia <= 31) {
				System.out.println(dia + " de marzo de " + año);
			} else if (mes == 4 && dia <= 30) {
				System.out.println(dia + " de abril de " + año);
			} else if (mes == 5 && dia <= 31) {
				System.out.println(dia + " de mayo de " + año);
			} else if (mes == 6 && dia <= 30) {
				System.out.println(dia + " de junio de " + año);
			} else if (mes == 7 && dia <= 31) {
				System.out.println(dia + " de julio de " + año);
			} else if (mes == 8 && dia <= 31) {
				System.out.println(dia + " de agosto de " + año);
			} else if (mes == 9 && dia <= 30) {
				System.out.println(dia + " de septiembre de " + año);
			} else if (mes == 10 && dia <= 31) {
				System.out.println(dia + " de octubre de " + año);
			} else if (mes == 11 && dia <= 30) {
				System.out.println(dia + " de novienbre de " + año);
			} else if (mes == 12 && dia <= 31) {
				System.out.println(dia + " de diciembre de " + año);
			} else {
				System.out.println("ERROR");
			}
		} else {
			System.out.println("ERROR");
		}
	}

	/*
	 * 17. Calcular las calificaciones de un grupo de alumnos. La nota final de cada
	 * alumno se calcula segun el siguiente criterio: la parte practica vale el 10%;
	 * la parte de problemas vale el 50% y la parte teorica el 40%. El algoritmo
	 * leera el nombre del alumno, las tres notas, escribira el resultado y volvera
	 * a pedir los datos del siguiente alumno hasta que el nombre sea una cadena
	 * vacia. Las notas deben estar entre 0 y 10, si no lo estan, no imprimira las
	 * notas, mostrara un mensaje de error
	 */
	public void ej17(Scanner input) {
		double practica, problemas, teorica;
		String nombre = new String();
		System.out.println("\n17) Calificaciones");
		System.out.print("Introducir nombre: ");
		nombre = input.next();
		System.out.print("Introducir nota de practica: ");
		practica = input.nextDouble();
		System.out.print("Introducir nota de problemas: ");
		problemas = input.nextDouble();
		System.out.print("Introducir nota de teorica: ");
		teorica = input.nextDouble();
		if (!nombre.isEmpty() && practica >= 0 && practica <= 10 && problemas >= 0 && problemas <= 10 && teorica >= 0
				&& teorica <= 10) {
			System.out.println(
					"La nota final de " + nombre + " es " + (int) (0.1 * practica + 0.5 * problemas + 0.4 * teorica));
		} else {
			System.out.println("ERROR");
		}
	}

	/*
	 * 18. Desarrollar un algoritmo que nos calcule el cuadrado de los 9 primeros
	 * numeros naturales a partir de un numero dado, es decir, calcular el cuadrado
	 * de los siguientes numeros naturales.
	 */
	public void ej18(Scanner input) {
		int a;
		System.out.println("\n18) 9 siguientes numeros naturales a partir de un numero dado");
		System.out.print("Introducir numero: ");
		a = input.nextInt();
		for (int i = 0; i < 9; i++, a++) {
			System.out.println((int) Math.pow(a, 2));
		}
		System.out.println();
	}

	/*
	 * 19. Desarrollar un algoritmo que nos calcule la suma de los N primeros
	 * numeros pares. Es decir, si insertamos un 5, nos haga la suma de
	 * 6+8+10+12+14.
	 */
	public void ej19(Scanner input) {
		int i = 0, j = 1, entrada, res = 0;
		String suma = new String();
		System.out.println("\n19) Suma de N siguientes pares");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		j = entrada;
		while (i < entrada) {
			if (j % 2 == 0) {
				suma = (suma.isEmpty()) ? suma.concat(" " + j) : suma.concat(" + " + j);
				res += j;
				j += 2;
				i++;
			} else {
				j++;
			}
		}
		System.out.println("Suma:" + suma + " = " + res);
	}

	/*
	 * 20. Calcular la tabla de multiplicar (de 0 a 10) de un numero dado.
	 */
	public void ej20(Scanner input) {
		int entrada;
		System.out.println("\n20) Tabla de multiplicar");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println(entrada + '*' + i + " = " + entrada * i);
		}
		System.out.println();
	}

	/*
	 * 21. Dada una secuencia de numeros, hasta encontrarnos con un numero negativo,
	 * por ejemplo: 5, 3, 0, 2, 4, 4, 0, 0, 2, 3, 6, 0, ......, -1; Realizar el
	 * algoritmo que calcule la media aritmetica.
	 */
	public void ej21(Scanner input) {
		double i = 0, entrada = 0, res = 0;
		System.out.println("\n21) La media aritmetica de una secuencia");
		while (entrada >= 0) {
			System.out.print("Introducir numero: ");
			entrada = input.nextDouble();
			if (entrada >= 0) {
				res += entrada;
				i++;
			}
		}
		System.out.println("Media aritmetica " + ((i != 0) ? res / i : res));
	}

	/*
	 * 22. Teniendo en cuenta que la clave es "eureka", escribir un algoritmo que
	 * nos pida una clave. Solo tenemos 3 intentos para acertar, si fallamos los 3
	 * intentos nos mostrara un mensaje indicandonos que hemos agotado esos 3
	 * intentos. Si acertamos la clave, saldremos directamente del programa.
	 */
	public void ej22(Scanner input) {
		int i = 3;
		String clave = new String();
		System.out.println("\n22) eureka");
		while (i > 0) {
			System.out.print("Introducir clave: ");
			clave = input.next();
			if (clave.equalsIgnoreCase("eureka")) {
				i = 0;
			} else {
				System.out.println(i - 1 + " intentos de 3 disponibles");
			}
			i--;
		}
		System.out.println();
	}

	/*
	 * 23. Algoritmo que lea numeros enteros hasta teclear 0, y nos muestre el
	 * maximo, el minimo y la media de todos ellos. Piensa como debemos inicializar
	 * las variables.
	 */
	public void ej23(Scanner input) {
		double i = 0, entrada = 1, res = 0, max = 0, min = 0;
		System.out.println("\n23) Maximo, el minimo y la media");
		System.out.print("Introducir numero: ");
		entrada = input.nextDouble();
		min = entrada;
		max = entrada;
		while (entrada != 0) {
			if (entrada != 0) {
				res = res + entrada;
				if (entrada <= min) {
					min = entrada;
				}
				if (entrada >= max) {
					max = entrada;
				}
				i++;
			}
			System.out.print("Introducir numero: ");
			entrada = input.nextDouble();
		}
		System.out.println("Maximo " + max + ", minimo " + min);
		System.out.println("Media aritmetica " + ((i != 0) ? res / i : res));
	}

	/*
	 * 24. Algoritmo que visualice la cuenta de los numeros que son multiplos de 2 o
	 * de 3 que hay entre 1 y 100.
	 */
	public void ej24(Scanner input) {
		int i = 0;
		System.out.println("\n24) multiplos 2 o de 3");
		while (i <= 100) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i + " es multiplo de 2 y 3.");
			}
			if (i % 2 == 0) {
				System.out.println(i + " es multiplo de 2.");
			}
			if (i % 3 == 0) {
				System.out.println(i + " es multiplo de 3.");
			}
			i++;
		}
		System.out.println();
	}

	/*
	 * 25. Escribe una funcion en pseudocodigo que devuelva el termino N (siendo N
	 * un numero entero positivo) de la serie de Fibonacci, esta sigue la siguiente
	 * serie: 1, 1, 2, 3, 5, 8, 13, 21... y asi sucesivamente. Date cuenta, que,
	 * para obtener un numero, suma los dos numeros anteriores. Por ejemplo, si
	 * introducimos un 3, la funcion nos devuelve el 2.
	 */
	public void ej25(Scanner input) {
		int i = 1, a = 1, b = 1, c, entrada = 0;
		System.out.println("\n25) Fibonacci");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		while (i < entrada - 0) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
			i++;
		}
		System.out.println("Numero = " + a);
	}

	/*
	 * 26. Escribe una funcion en pseudocodigo que devuelva el factorial de un
	 * numero N (siendo N un numero entero positivo). Haz despues un algoritmo
	 * principal que pida por teclado dos numeros y escriba en pantalla los
	 * factoriales de cada numero comprendido entre los dos anteriores. El factorial
	 * de 5 es el resultado de 5*4*3*2*1
	 */
	public void ej26(Scanner input) {
		int i, res = 1;
		System.out.println("\n26) Factorial");
		System.out.print("Introducir numero: ");
		i = input.nextInt();
		while (i - 1 > 0) {
			res *= i;
			i--;
		}
		System.out.println("Resultado = " + res);
	}

	/*
	 * 27. Escribe una funcion en pseudocodigo que devuelva si un numero dado es
	 * primo o no. Para que un numero sea primo solo es divisible entre 1 y si mismo
	 * (por ejemplo, 13, 17, 19...). Utilizando la funcion, escribe un programa que
	 * escriba todos los numeros primos entre 1 y un numero leido desde el teclado.
	 * Piensa que debe devolver la funcion.
	 */
	public void ej27(Scanner input) {
		int entrada, resto = 0;
		System.out.println("\n27) Entre 1 y numero son primos o no");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		for (int i = 0; i <= entrada; i++, resto = 0) {
			for (int j = 0; j <= i; j++) {
				if (i % j == 0) {
					resto++;
				}
			}
			if (resto == 2) {
				System.out.println(i + " es primo.");
			}
		}
		resto = 0;
		for (int i = 1; i <= entrada; i++) {
			if (entrada % i == 0) {
				resto++;
			}
		}
		System.out.println(entrada + ((resto == 2) ? " es " : " no es ") + "primo.");
	}

	/*
	 * 28. Escribe una funcion en pseudocodigo que dado un numero decimal (en base
	 * 10), entre 0 y 15, devuelva el valor equivalente en sistema de numeracion
	 * binario (en este caso, un numero binario de 4 digitos). Os aconsejo que los
	 * digitos binarios sean una cadena, para que se puedan concatenar entre si. Por
	 * ejemplo, si introducimos un 7, nos devuelva 0111. Si se introduce un numero
	 * menos que 0 o mayor que 16, no mostrara un mensaje de error.
	 */
	public void ej28(Scanner input) {
		int entrada, aux = 1, res = 0;
		System.out.println("\n28) Decimal a binario (0-16)");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		if (entrada > 0 && entrada <= 16) {
			while ((entrada > 0)) {
				res += (entrada % 2) * aux;
				aux *= 10;
				entrada = (entrada - entrada % 2) / 2;
			}
			System.out.println("Numero Binario: " + res);
		} else {
			System.out.println("ERROR");
		}
		/*
		 * String result=new String();for(int i=entrada;i>0;i=(i-i%2)/2){result=result.
		 * concat(Integer.toString(i%2));}System.out.println((entrada>0&&entrada<=16)?
		 * "NumeroBinario: "+result:"ERROR");
		 */
	}

	/*
	 * 29. Algoritmo que dado un numero entero (este numero no podra ser menor o
	 * igual que 0), determine el numero de cifras que tiene. Por ejemplo, si
	 * introduzco un 253, me devuelva un 3.
	 */
	public void ej29(Scanner input) {
		int i = 0, entrada;
		System.out.println("\n29) Numero de cifras");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		while (entrada > 0) {
			entrada /= 10;
			i++;
		}
		System.out.println(entrada + " tiene cifras " + i);
	}

	/*
	 * 30. Algoritmo que lea un numero entero (lado) y a partir de el cree un
	 * cuadrado de asteriscos con ese tamaño. Los asteriscos solo se veran en el
	 * borde del cuadrado, no en el interior.
	 */
	public void ej30(Scanner input) {
		int i = 0, n;
		String base = new String(), altura = new String();
		System.out.println("\n30) Cuadrado de asteriscos");
		System.out.print("Introducir numero: ");
		n = input.nextInt();
		base = base.concat("* ");
		altura = altura.concat("* ");
		while (i < n - 2) {
			base = base.concat("* ");
			altura = altura.concat(' ' + " ");
			i++;
		}
		base = base.concat("*");
		altura = altura.concat("*");
		i = 0;
		System.out.println(base);
		while (i < n - 2) {
			System.out.println(altura);
			i++;
		}
		System.out.println(base);
	}

	/*
	 * 31. Escribe una funcion en pseudocodigo que dibuje una piramide invertida en
	 * pantalla como la de la figura. La altura se pasara como parametro. Si se pasa
	 * una altura=0 o negativa, la funcion devolvera -1; en caso contrario devolvera
	 * 0 (exito). Ejemplo para altura = 5 ######### _####### __##### ___### ____#
	 */
	public void ej31(Scanner input) {
		int i, j = 0, entrada, aux;
		String string = new String();
		System.out.println("\n31) Piramide invertida");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		if (entrada > 0) {
			aux = entrada;
			while (j < entrada) {
				i = 0;
				while (i < 2 * aux - 1) {
					string = string.concat("*");
					i++;
				}
				string = string.concat("\n");
				i = 0;
				while (i <= j) {
					string = string.concat(" ");
					i++;
				}
				aux--;
				j++;
			}
			System.out.println(string);
			System.out.println("0 (exito)");
		} else {
			System.out.println("-1");
		}
	}

	/*
	 * 32. Dados una serie de numeros naturales N = { 0, 1, 2, 3, ... } deberas
	 * determinar si son pares o impares. Recibiras una serie de numeros mayores que
	 * 0 (cuando lo recibamos, dejaremos de recibir numeros) y deberas mostrar por
	 * la consola "Es par" cuando el numero recibido sea par o por el contrario si
	 * es impar deberas mostrar "Es impar".
	 */
	public void ej32(Scanner input) {
		int entrada = 1;
		System.out.println("\n32) Serie de par/impar");
		while (entrada > 0) {
			System.out.print("Introducir numero: ");
			entrada = input.nextInt();
			if (entrada != 0) {
				System.out.println(entrada + "es " + ((entrada % 2 == 0) ? "par" : "impar"));
			}
		}
	}

	/*
	 * 33. Deberas sumar por separado los numeros pares e impares para calcular el
	 * valor total en cada caso y mostrar el resultado por la consola. Para ello
	 * mostraremos primero el resultado de la suma de los numeros pares y seguido de
	 * un espacio mostraremos el resultado de la suma de los numeros impares.
	 * Dejaremos de recibir numeros una vez nos encontremos con el cero.
	 */
	public void ej33(Scanner input) {
		int spar = 0, simpar = 0, entrada = 1;
		System.out.println("\n33) Sumas de par/impar");
		while (entrada != 0) {
			System.out.print("Introducir numero: ");
			entrada = input.nextInt();
			if (entrada % 2 == 0) {
				spar += entrada;
			} else {
				simpar += entrada;
			}
		}
		System.out.println("Resultado suma par " + spar + ", suma impar: " + simpar);
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
			case (25):
				this.ej25(input);
				break;
			case (26):
				this.ej26(input);
				break;
			case (27):
				this.ej27(input);
				break;
			case (28):
				this.ej28(input);
				break;
			case (29):
				this.ej29(input);
				break;
			case (30):
				this.ej30(input);
				break;
			case (31):
				this.ej31(input);
				break;
			case (32):
				this.ej32(input);
				break;
			case (33):
				this.ej33(input);
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
		this.ej25(input);
		this.ej26(input);
		this.ej27(input);
		this.ej28(input);
		this.ej29(input);
		this.ej30(input);
		this.ej31(input);
		this.ej32(input);
		this.ej33(input);
	}
}