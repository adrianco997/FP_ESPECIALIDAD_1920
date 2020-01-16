package Ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Baterias {
	Bateria1 Bateria1 = new Bateria1();
	Bateria2 Bateria2 = new Bateria2();
}
//public 
class Bateria1 {
	Auxiliares help = new Auxiliares();
	int ejersize = 30;

	/*
	 * 1. Realizar un programa que sume 10 números leídos por teclado.
	 */
	public void ej01(Scanner input) {
		double suma = 0;
		System.out.println("\n1) Suma 10 números:");
		suma = help.inputSumador(input, 10);
		System.out.println("Resultado: " + suma);
	}

	/*
	 * 2. Modificar el ejercicio anterior para sumar una cantidad N de números
	 * dados.
	 */
	public void ej02(Scanner input) {
		double suma = 0, n;
		System.out.println("\n1) Suma N números:");
		System.out.print("Introduce N: ");
		n = input.nextDouble();
		suma = help.inputSumador(input, n);
		System.out.println("Resultado: " + suma);
	}

	/*
	 * 3. Realiza un programa que, dado un año, diga si es bisiesto. Un año es
	 * bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100, que solo son
	 * bisiestos cuando son múltiplos además de 400.
	 */
	public void ej03(Scanner input) {
		int entrada;
		System.out.println("\n3) Año es bisiesto:");
		System.out.print("Introducir cadena: ");
		entrada = input.nextInt();
		System.out.println("El año " + ((help.esBisiesto(entrada)) ? "" : "no ") + "es bisiesto");
	}

	/*
	 * 4. Tras haber realizado el ejercicio anterior, llévalo a una función para
	 * poder utilizarlo en este ejercicio. Hacer un programa que dado un día D, un
	 * mes M y un año A, calcule cual es el día siguiente. Se debe tener en cuenta
	 * que en los años bisiestos Febrero tiene 29 días y en los no bisiestos 28.
	 */
	public void ej04(Scanner input) {
		int d, m, a;
		System.out.println("\n4) Dada una fecha da el dia siguiente:");
		System.out.print("Introducir día: ");
		d = input.nextInt();
		System.out.print("Introducir mes: ");
		m = input.nextInt();
		System.out.print("Introducir año: ");
		a = input.nextInt();
		if (d >= 1 && d <= 31 && m >= 1 && m <= 12) {
			d++;
			if ((d - 1 == 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12))
					|| (d - 1 == 30 && (m == 4 || m == 6 || m == 9 || m == 11))
					|| (d - 1 == 28 && (m == 2 && help.esBisiesto(a) == false))
					|| (d - 1 == 29 && (m == 2 && help.esBisiesto(a) == true))) {
				d = 1;
				m++;
			}
			if (d == 1 && m == 13) {
				m = 1;
				a++;
			}
			if (m == 1) {
				System.out.println(d + " de enero del " + a);
			} else if (m == 2) {
				System.out.println(d + " de febrero del " + a);
			} else if (m == 3) {
				System.out.println(d + " de marzo del " + a);
			} else if (m == 4) {
				System.out.println(d + " de abril del " + a);
			} else if (m == 5) {
				System.out.println(d + " de mayo del " + a);
			} else if (m == 6) {
				System.out.println(d + " de junio del " + a);
			} else if (m == 7) {
				System.out.println(d + " de julio del " + a);
			} else if (m == 8) {
				System.out.println(d + " de agosto del " + a);
			} else if (m == 9) {
				System.out.println(d + " de septiembre del " + a);
			} else if (m == 10) {
				System.out.println(d + " de octubre del " + a);
			} else if (m == 11) {
				System.out.println(d + " de novienbre del " + a);
			} else if (m == 12) {
				System.out.println(d + " de diciembre del " + a);
			} else {
				System.out.println("ERROR");
			}
		} else {
			System.out.println("ERROR");
		}
	}

	/*
	 * 5. Haz un programa que mediante una interfaz (podamos seleccionar el tipo de
	 * conversión antes de realizarla) nos permita convertir:
	 * 
	 * a) Dada una cantidad determinada de galones a litros y escriba el resultado.
	 * 1 galón = 3.7854.
	 * 
	 * b) Dada una cantidad de pies, realice la conversión a: pulgadas (1 pie = 12
	 * pulgadas y 1 pulgada = a 2,54 cm), yardas (1 yarda = 0.94 metros), cm y
	 * metros.
	 */
	public void ej05(Scanner input) {
		String tipo = new String();
		double entrada;
		System.out.println("\n5) Conversión de galones a litros o pies a pulgadas, yardas, cm y metros:");
		System.out.print("Introducir tipo de conversión (galones o pies): ");
		tipo = input.next();
		if (tipo.trim().equalsIgnoreCase("galones")) {
			System.out.print("Introducir cantidad: ");
			entrada = input.nextDouble();
			System.out.println(entrada + " galones son " + help.galon_litro(entrada) + " litros.");
		} else if (tipo.trim().equalsIgnoreCase("pies")) {
			System.out.print("Introducir cantidad: ");
			entrada = input.nextDouble();
			System.out.println(
					entrada + " pies son " + help.pies_pulgadas(entrada) + " pulgadas, " + help.pies_yardas(entrada)
							+ " yardas, " + help.pies_cm(entrada) + " cm, " + help.pies_metros(entrada) + " metros.");
		} else {
			System.out.println("ERROR");
		}
	}

	/*
	 * 6. Modifica el apartado a) para que realice una todas las conversiones de 1
	 * hasta 100 galones, cada 10 galones, imprimirá una línea en blanco.
	 */
	public void ej06(Scanner input) {
		System.out.println("\n6) Conversion de galones a litros del 1 al 100:");
		for (int i = 0; i <= 100; i += 10) {
			System.out.print(i + " gal = " + help.galon_litro(i) + " L, ");
		}
		System.out.println();
	}

	/*
	 * 7. Realiza un programa que calcule la sucesión de Fibonacci: a n =a n -1+a n
	 * -2 para n>2, donde a 1 =1 y a 2 =1. El programa deberá permitirnos calcular N
	 * términos dados de la sucesión.
	 */
	public void ej07(Scanner input) {
		int n1 = 1, n2 = 1, aux, entrada = 0;
		System.out.println("\n7) Sucesión de Fibonacci:");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		for (int i = 0; i < entrada; i++) {
			System.out.println(n1);
			aux = n1 + n2;
			n1 = n2;
			n2 = aux;
		}
	}

	/*
	 * 8. Haz un programa que calcule los 100 primeros números pares.
	 */
	public void ej08(Scanner input) {
		System.out.println("\n8) 100 primeros números pares:");
		for (int i = 1, n = 0; n < 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ",\t");
				n++;
				if (n % 10 == 0) {
					System.out.println();
				}
			}
		}
	}

	/*
	 * 9. Haz un programa que calcule los 100 primeros números impares.
	 */
	public void ej09(Scanner input) {
		System.out.println("\n9) 100 primeros números inpares:");
		for (int i = 1, n = 0; n < 100; i++) {
			if (i % 2 == 1) {
				System.out.print(i + ",\t");
				n++;
				if (n % 10 == 0) {
					System.out.println();
				}
			}
		}
	}

	/*
	 * 10. Haz un programa que calcule la suma de los números pares comprendidos
	 * entre 10 y 50.
	 */
	public void ej10(Scanner input) {
		System.out.println("\n10) Suma de los números pares comprendidos entre 10 y 50:");
		int suma = 0;
		for (int i = 10; i < 50; i++) {
			if (i % 2 == 0) {
				suma += i;
			}
		}
		System.out.println("Resultado: " + suma);
	}

	/*
	 * 11. Realizar un programa que nos permita calcular el máximo común divisor o
	 * el mínimo común múltiplo de dos números dados.
	 */
	public void ej11(Scanner input) {
		int n1, n2;
		System.out.println("\n11) Máximo común divisor y mínimo común múltiplo de dos números:");
		System.out.print("Introducir primer numero: ");
		n1 = input.nextInt();
		System.out.print("Introducir segundo numero: ");
		n2 = input.nextInt();
		System.out.println("El mcd de " + n1 + " y " + n2 + " es " + help.mcd(n1, n2));
		System.out.println("El mcm de " + n1 + " y " + n2 + " es " + help.mcm(n1, n2));
	}

	/*
	 * 12. Haz un programa que indique si un número entero N es primo o no.
	 */
	public void ej12(Scanner input) {
		int entrada;
		System.out.println("\n12) N es primo o no:");
		System.out.print("Introducir N: ");
		entrada = input.nextInt();
		System.out.println(entrada + ((help.esPrimo(entrada) == true) ? " es " : " no es ") + "primo.");
	}

	/*
	 * 13. Hacer un programa que permita escribir los primeros 100 números primos.
	 */
	public void ej13(Scanner input) {
		System.out.println("\n13) 100 primeros números primos:");
		System.out.print("Son primos: ");
		for (int i = 0; i <= 100; i++) {
			if (help.esPrimo(i) == true) {
				System.out.print(i + "; ");
			}
		}
		System.out.println();
	}

	/*
	 * 14. Modifica el ejercicio anterior para poder optimizar al máximo los
	 * cálculos, es decir, reducir al máximo el número de comprobaciones. Es
	 * obligatorio llevarse este ejercicio a una función.
	 */
	public void ej14(Scanner input) {
		System.out.println("\n14) 100 primeros números primos:");
		System.out.print("Son primos: ");
		for (int i = 0; i <= 100; i++) {
			if (help.esPrimo(i) == true) {
				System.out.print(i + "; ");
			}
		}
		System.out.println();
	}

	/*
	 * 15. Haz un programa que calcule el total de una factura, partiendo de una
	 * lista de parejas importe, IVA pertenecientes a la misma factura. La lista
	 * finaliza cuando el importe sea 0. El IVA puede ser el 4%, el 10% o el 21%, en
	 * cualquier otro caso se rechazan importe e IVA y se deben introducir de nuevo.
	 * Finalmente, hay que realizar un descuento en función de la suma de los
	 * importes. Dicho descuento es del 0% si es menor que 1000, del 5% si es menor
	 * que 10000 (y mayor o igual que 1000) y del 10% si es mayor o igual que 10000.
	 * El descuento se debe aplicar al importe final. El programa debe imprimir el
	 * importe total sin descuento y el importe final al aplicar el descuento que
	 * corresponda al importe total.
	 */
	public void ej15(Scanner input) {
		double importe, iva, factura = 0, facturafinal;
		System.out.println("\n15) Calcular factura con importe e iva (importe=0 para terminar): ");
		do {
			do {
				System.out.print("Introducir importe: ");
				importe = input.nextDouble();
				if (importe < 0) {
					System.out.print("Valor erroneo. ");
				}
			} while (importe < 0);
			if (importe != 0) {
				do {
					System.out.print("Introducir IVA (4%, el 10% o el 21%): ");
					iva = input.nextDouble();
					if (iva != 4 && iva != 10 && iva != 21) {
						System.out.print("Valor erroneo. ");
					}
				} while (iva != 4 && iva != 10 && iva != 21);
				factura += importe * (1 - iva / 100);
			}
		} while (importe != 0);
		facturafinal = factura * ((factura < 1000) ? 1.00 : ((factura < 10000) ? 0.95 : 0.90));
		System.out.println("Factura sin descuento: " + factura + ", factura final: " + facturafinal);
	}

	/*
	 * 16. Haz un programa que lea un capital y calcule e imprima en cuantos meses
	 * se triplica si se coloca a un interés del 6% mensual
	 */
	public void ej16(Scanner input) {
		double saldo;
		System.out.println("\n16) En cuantos meses se triplica un capital para un interés mensual del 6%:");
		System.out.print("Introduce capital: ");
		saldo = input.nextDouble();
		help.inversionMes(saldo, 6, 3);
	}

	/*
	 * 17. Haz un programa que lea una cantidad de inversión mensual y calcule en
	 * cuantos meses duplicará los beneficios, teniendo en cuenta que la
	 * rentabilidad media es de un 3% de dicha cantidad.
	 */
	public void ej17(Scanner input) {
		double saldo;
		System.out.println("\n17) En cuantos meses se duplicará un capital para un interés mensual del 3%:");
		System.out.print("Introduce capital: ");
		saldo = input.nextDouble();
		help.inversionMes(saldo, 3, 2);
	}

	/*
	 * 18. Modifica el ejercicio para que, además, nos permita realizar los cálculos
	 * para el peor caso 1% y el mejor caso un 5% de rentabilidad.
	 */
	public void ej18(Scanner input) {
		double saldo;
		System.out.println("\n18) En cuantos meses se duplicará un capital para un interés mensual del 1% y 5%:");
		System.out.print("Introduce capital: ");
		saldo = input.nextDouble();
		help.inversionMes(saldo, 1, 2);
		help.inversionMes(saldo, 5, 2);
	}

	/*
	 * 19. Hacer un programa en el que se pida por teclado un número mayor que 2 (el
	 * programa controlará que cumpla esto), y lo imprima de todas las formas
	 * posibles como producto de dos factores (no se tiene en cuenta la
	 * multiplicación por 1). Por ejemplo: Con el número 36, tendría que
	 * visualizarse: 18*2, 12*3, 9*4, 6*6, 3*12, 4*9, 2*18.
	 */
	public void ej19(Scanner input) {
		int entrada;
		System.out.println("\n19) Formas posibles como producto de dos factores:");
		do {
			System.out.print("Introducir número mayor que 2: ");
			entrada = input.nextInt();
			if (entrada <= 2) {
				System.out.print("Valor erroneo. ");
			}
		} while (entrada <= 2);
		for (int i = 2; i < entrada; i++) {
			if (entrada % i == 0) {
				System.out.print((entrada / i) + "*" + i + ", ");
			}
		}
		System.out.println();
	}

	/*
	 * 18. Hacer un programa para sumar los N primeros términos de una progresión
	 * geométrica de primer término A y razón R (dados por teclado). Se debe
	 * realizar la suma sin emplear la fórmula que existe para ello. Muestra también
	 * los términos de la serie. Ejemplo de ejecución:
	 * 
	 * Introducir número de términos: 6.
	 * 
	 * Introducir el primer término: 5.
	 * 
	 * Introducir la razón: 3.
	 * 
	 * Salida: 5 15 45 135 405 1215. La suma de los términos de la serie es 1820
	 */
	public void ej20(Scanner input) {
		int numero, primer, razon;
		System.out.println("\n20) Progresión geométrica:");
		System.out.print("Introducir número de términos: ");
		numero = input.nextInt();
		System.out.print("Introducir el primer término: ");
		primer = input.nextInt();
		System.out.print("Introducir la razón: ");
		razon = input.nextInt();
		help.printSumaGeometrica(numero, primer, razon);
	}

	/*
	 * 21. Haz un programa que dado un número N nos diga si es o no perfecto. Se
	 * dice que un número N es perfecto si la suma de sus divisores, excluido el
	 * propio número es N. Por ejemplo, 28 es perfecto, pues sus divisores son: 1,
	 * 2, 4, 7 y 14 y su suma es 1+2+4+7+14=28.
	 */
	public void ej21(Scanner input) {
		int entrada;
		System.out.println("\n21) Número es o no perfecto:");
		System.out.print("Introducir número: ");
		entrada = input.nextInt();
		help.perfecto(entrada);
	}

	/*
	 * 22. Modifica el programa anterior, para siga pidiendo números, para comprobar
	 * si son perfectos, mientras el número introducido sea distinto de cero.
	 */
	public void ej22(Scanner input) {
		int entrada;
		System.out.println("\n22) Número distinto de cero es o no perfecto:");
		do {
			System.out.print("Introducir número: ");
			entrada = input.nextInt();
			if (entrada == 0) {
				System.out.print("Número distinto de cero. ");
			}
		} while (entrada == 0);
		help.perfecto(entrada);
	}

	/*
	 * 23. Haz un programa que pida 2 números por teclado y calcule su producto
	 * mediante sumas sucesivas. Imprimir su resultado.
	 */
	public void ej23(Scanner input) {
		int num1, num2, res;
		System.out.println("\n23) Producto mediante sumas sucesivas:");
		System.out.print("Introducir primer numero: ");
		num1 = input.nextInt();
		System.out.print("Introducir segundo numero: ");
		num2 = input.nextInt();
		res = help.productoSucesivas(num1, num2);
		System.out.println("Resultado: " + res);
	}

	/*
	 * 24. Hacer un programa que pida 2 números por teclado y calcule su división
	 * mediante restas sucesivas. Imprimir su resultado. Divide siempre el más
	 * grande entre el más pequeño.
	 * 
	 * Ejemplo: 1324 entre 312.
	 * 
	 * 1324 - 312 = 1012 contamos una vez y seguimos porque 1012 >= 312
	 * 
	 * 1012 - 312 = 700 contamos 2 veces y continuamos porque 700 >= 312
	 * 
	 * 700 - 312 = 388 contamos 3 veces y continuamos porque 388 >= 312
	 * 
	 * 88 - 312 = 76 contamos 4 veces y paramos porque 76 < 312
	 * 
	 * Luego la división es 4 y el resto 76.
	 */
	public void ej24(Scanner input) {
		int num1, num2;
		System.out.println("\n24) división mediante restas sucesivas:");
		System.out.print("Introducir primer numero: ");
		num1 = input.nextInt();
		System.out.print("Introducir segundo numero: ");
		num2 = input.nextInt();
		help.divisionSucesivas(num1, num2);
	}

	/*
	 * 25 Haz un programa que lea un número entero N y calcule el resultado de la
	 * siguiente serie: 1+1/2+1/3+1/4+1/5+...+1/N.
	 */
	public void ej25(Scanner input) {
		int entrada;
		System.out.println("\n25) Serie armónica = 1+1/2+1/3+1/4+1/5+...+1/N:");
		System.out.print("Introducir número: ");
		entrada = input.nextInt();
		System.out.println("Resultado: " + help.serieArmonica((double) entrada));
	}

	/*
	 * 26. Haz un programa que lea un número entero N y calcule el resultado de la
	 * siguiente serie: 1-1/2+1/3-1/4+1/5-...+1/N.
	 */
	public void ej26(Scanner input) {
		int entrada;
		System.out.println("\n26) Serie armónica alternada = 1-1/2+1/3-1/4+1/5-...+1/N:");
		System.out.print("Introducir número: ");
		entrada = input.nextInt();
		System.out.println("Resultado: " + help.serieArmonicaAlternada((double) entrada));
	}

	/*
	 * 27. Escribir un programa que imprima cada uno de los términos de la serie 2,
	 * 5, 7, 10, 12, 15, 17, ..., 1800. Además, calcule e imprima la suma de los
	 * términos.
	 */
	public void ej27(Scanner input) {
		System.out.println("\n27) Serie 2, 5, 7, 10, 12, 15, 17, ..., 1800:");
		for (int i = 2, j = 1; i <= 1800; i += (j % 2 == 1) ? 3 : 2, j++) {
			System.out.print(i + ((j % 10 == 0) ? "\n" : ",\t"));
		}
		System.out.println();
	}

	/*
	 * 28. Hacer un programa que lea por teclado un numero N e imprima un triángulo
	 * rectángulo, de N filas. EJ: N=5, se pintará lo siguiente: #, # #, # # #, # #
	 * # #, # # # # #
	 */
	public void ej28(Scanner input) {
		int entrada;
		System.out.println("\n28) Triángulo rectángulo");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		System.out.println(help.triangulo(entrada));
	}

	/*
	 * 29. Modifica el ejercicio anterior para que en vez de mostrar #, muestre
	 * números naturales correlativos; ejemplo: 1, 1 2, 1 2 3
	 */
	public void ej29(Scanner input) {
		int entrada;
		System.out.println("\n29) Triángulo rectángulo númeral:");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		System.out.println(help.trianguloNumeral(entrada));
	}

	/*
	 * 30. Haz un programa para imprimir una tabla de tres columnas y N filas con
	 * los cuadrados y los cubos de los N primeros números. Pide N al usuario.
	 */
	public void ej30(Scanner input) {
		int num;
		System.out.println("\n30) Cuadrados y los cubos de los N primeros números:");
		System.out.print("Introducir N: ");
		num = input.nextInt();
		System.out.println("Resultado: " + num);
		for (int i = 1; i <= num; i++) {
			System.out.println("numero: " + i + "\tCuadrado: " + Math.pow(i, 2) + "\tCubo: " + Math.pow(i, 3));
		}
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
	}
}

//package Ejercicios;

//import java.util.Scanner;
//import java.util.Random;

//public 
class Bateria2 {
	Auxiliares help = new Auxiliares();
	int ejersize = 25;

	/*
	 * 1) Haz un programa en Java para jugar contra el ordenador a adivinar un
	 * número, generado aleatoriamente (Math.random(), entre 1 y 200. El usuario
	 * debe introducir un número por teclado y el programa le dirá mediante los
	 * símbolos '<' o '>', si el número introducido es menor o mayor que el generado
	 * por el ordenador. Finalmente, se mostrará un mensaje informando de cuantos
	 * intentos se han necesitado para adivinar el número y si no se adivina se
	 * mostrará un mensaje diciendo que ha perdido. El número máximo de intentos se
	 * pedirá por teclado.
	 */
	public void ej01(Scanner input) {
		int intentos = 1, intusados = 0, num = 0, res;
		System.out.println("\n1) Adivina un número del 1 al 200 en X intentos:");
		res = new Random().nextInt(99) + 1;
		System.out.print("Introduce número de intentos: ");
		intentos = input.nextInt();
		for (int i = intentos; i > 0 && num != res; i--, intusados++) {
			System.out.print("Introduce número: ");
			num = input.nextInt();
			if (num != res) {
				System.out.println(((num < res) ? ">" : "<"));
			}
		}
		if (intusados == intentos) {
			System.out.println("Numero no adivinado.");
		} else {
			System.out.println(intusados + " Respuesta correcta: " + res);
		}
	}

	/*
	 * 2) Haz un programa en Java que muestre si dos números son o no amigos. Los
	 * números se pedirán por teclado. Dos números son amigos si la suma de los
	 * divisores del primero es el número y viceversa, excluimos en la suma el
	 * propio número.
	 */
	public void ej02(Scanner input) {
		int num1, num2;
		System.out.println("\n2) Números son o no amigos:");
		// System.out.print("Introducir primer número: "); num1 = input.nextInt();
		// System.out.print("Introducir segundo número: "); num2 = input.nextInt();
		num1 = 220;
		num2 = 284;
		System.out.println("Resultado: " + help.numerosAmigos(num1, num2));
	}

	/*
	 * 3) Haz un programa que muestre un contador con 3 dígitos. Mostrará los
	 * números del 0-0-0 al 9-9-9, cada vez que aparezca un 3 lo sustituiremos por
	 * una E.
	 */
	public void ej03(Scanner input) {
		System.out.println("\n3) números del 0-0-0 al 9-9-9, 3 lo sustituido por \"E\":");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					System.out.print((i + "-" + j + "-" + k + ", ").replace("3", "E"));
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	/*
	 * 4) Modificar el programa anterior para que la cantidad de dígitos del
	 * contador venga dada por el usuario.
	 */
	public void ej04(Scanner input) {
		int num;
		System.out.println("\n4) números del 0-0-0 al X-X-X, 3 lo sustituido por \"E\":");
		System.out.print("Introducir X: ");
		num = input.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				for (int k = 0; k < num; k++) {
					System.out.print((i + "-" + j + "-" + k + ", ").replace("3", "E"));
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	/*
	 * 5) Para obtener el número del tarot de una persona, hay que sumar los números
	 * de su fecha de nacimiento y reducirlo a un solo dígito. Ejemplo de Julio de
	 * 1980 sería igual a: 1+7+1980 = 1988 → 1+9+9+8 = 27 → 2+7=9, por lo tanto, el
	 * número del tarot sería el 9. Realiza un programa que pida una fecha de
	 * nacimiento por teclado (elige el formato que creas adecuado) y escriba el
	 * número del tarot, prueba con la edad de tus compañeros.
	 */
	public void ej05(Scanner input) {
		int d, m, a;
		System.out.println("\n5) Número del tarot:");
		System.out.print("Introducir dia nacimiento: ");
		d = input.nextInt();
		System.out.print("Introducir mes nacimiento: ");
		m = input.nextInt();
		System.out.print("Introducir año nacimiento: ");
		a = input.nextInt();
		System.out.println("Resultado: " + help.numTarot(d, m, a));
	}

	/*
	 * 6) Realiza un programa que pida números hasta que se introduzca cero o un
	 * número negativo, tras esto, se deberá mostrar la cantidad de números
	 * introducidos.
	 */
	public void ej06(Scanner input) {
		double i = 0, entrada = 0;
		System.out.println("\n6) cantidad de números introducidos, para si X <= 0:");
		do {
			System.out.print("Introducir numero: ");
			entrada = input.nextDouble();
			if (entrada > 0) {
				i++;
			}
		} while (entrada > 0);
		System.out.println("Repeticiones: " + i);
	}

	/*
	 * 7) Una empresa que se dedica a la venta de desinfectantes necesita un
	 * programa para gestionar las facturas. En cada factura figura: el código del
	 * artículo, la cantidad vendida en litros y el precio por litro. Se pide de 5
	 * facturas introducidas: Facturación total, cantidad en litros vendidos del
	 * artículo con código 1. cuantas facturas se emitieron de más de 600€.
	 */
	public void ej07(Scanner input) {
		String fac1 = new String(), fac2 = new String(), fac3 = new String(), fac4 = new String(), fac5 = new String();
		double lArtCod_1 = 0, facs_600 = 0, facsTotal = -1;
		System.out.println("\n8) Venta de desinfectantes:");
		System.out.println("Factura 1: ");
		fac1 = help.facturas(input);
		System.out.println("Factura 2: ");
		fac2 = help.facturas(input);
		System.out.println("Factura 3: ");
		fac3 = help.facturas(input);
		System.out.println("Factura 4: ");
		fac4 = help.facturas(input);
		System.out.println("Factura 5: ");
		fac5 = help.facturas(input);
		facsTotal = (double) help.toDouble(fac1.split(";")[3]) + (double) help.toDouble(fac2.split(";")[3])
				+ (double) help.toDouble(fac3.split(";")[3]) + (double) help.toDouble(fac4.split(";")[3])
				+ (double) help.toDouble(fac5.split(";")[3]);
		if (fac1.split(";")[0].equals("1.0")) {
			lArtCod_1 += help.toDouble(fac1.split(";")[1]);
		}
		if (fac2.split(";")[0].equals("1.0")) {
			lArtCod_1 += help.toDouble(fac2.split(";")[1]);
		}
		if (fac3.split(";")[0].equals("1.0")) {
			lArtCod_1 += help.toDouble(fac3.split(";")[1]);
		}
		if (fac4.split(";")[0].equals("1.0")) {
			lArtCod_1 += help.toDouble(fac4.split(";")[1]);
		}
		if (fac5.split(";")[0].equals("1.0")) {
			lArtCod_1 += help.toDouble(fac5.split(";")[1]);
		}
		if (help.toDouble(fac1.split(";")[3]) >= 600) {
			facs_600++;
		}
		if (help.toDouble(fac2.split(";")[3]) >= 600) {
			facs_600++;
		}
		if (help.toDouble(fac3.split(";")[3]) >= 600) {
			facs_600++;
		}
		if (help.toDouble(fac4.split(";")[3]) >= 600) {
			facs_600++;
		}
		if (help.toDouble(fac5.split(";")[3]) >= 600) {
			facs_600++;
		}
		System.out.println("Facturación total: " + facsTotal);
		System.out.println("Litros vendidos artículos con código 1: " + lArtCod_1);
		System.out.println("Facturas se emitieron de más de 600€: " + facs_600);
		System.out.println("Info usada:" + "\n Factura1: " + fac1 + "\n Factura2: " + fac2 + "\n Factura3: " + fac3
				+ "\n Factura4: " + fac4 + "\n Factura5: " + fac5);
	}

	/*
	 * 8) Modificar el programa anterior para la empresa solo tenga tres productos,
	 * con los siguientes precios: 1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.
	 */
	public void ej08(Scanner input) {
		String fac1 = new String(), fac2 = new String(), fac3 = new String(), fac4 = new String(), fac5 = new String();
		double lArtCod_1 = 0, facs_600 = 0, facsTotal = -1;
		System.out.println("\n8) Venta de desinfectantes:");
		System.out.println("Factura 1: ");
		fac1 = help.facturas2(input);
		System.out.println("Factura 2: ");
		fac2 = help.facturas2(input);
		System.out.println("Factura 3: ");
		fac3 = help.facturas2(input);
		System.out.println("Factura 4: ");
		fac4 = help.facturas2(input);
		System.out.println("Factura 5: ");
		fac5 = help.facturas2(input);
		facsTotal = (double) help.toDouble(fac1.split(";")[3]) + (double) help.toDouble(fac2.split(";")[3])
				+ (double) help.toDouble(fac3.split(";")[3]) + (double) help.toDouble(fac4.split(";")[3])
				+ (double) help.toDouble(fac5.split(";")[3]);
		if (fac1.split(";")[0].equals("1.0")) {
			lArtCod_1 += help.toDouble(fac1.split(";")[1]);
		}
		if (fac2.split(";")[0].equals("1.0")) {
			lArtCod_1 += help.toDouble(fac2.split(";")[1]);
		}
		if (fac3.split(";")[0].equals("1.0")) {
			lArtCod_1 += help.toDouble(fac3.split(";")[1]);
		}
		if (fac4.split(";")[0].equals("1.0")) {
			lArtCod_1 += help.toDouble(fac4.split(";")[1]);
		}
		if (fac5.split(";")[0].equals("1.0")) {
			lArtCod_1 += help.toDouble(fac5.split(";")[1]);
		}
		if (help.toDouble(fac1.split(";")[3]) >= 600) {
			facs_600++;
		}
		if (help.toDouble(fac2.split(";")[3]) >= 600) {
			facs_600++;
		}
		if (help.toDouble(fac3.split(";")[3]) >= 600) {
			facs_600++;
		}
		if (help.toDouble(fac4.split(";")[3]) >= 600) {
			facs_600++;
		}
		if (help.toDouble(fac5.split(";")[3]) >= 600) {
			facs_600++;
		}
		System.out.println("Facturación total: " + facsTotal);
		System.out.println("Litros vendidos artículos con código 1: " + lArtCod_1);
		System.out.println("Facturas se emitieron de más de 600€: " + facs_600);
		System.out.println("Info usada:" + "\n Factura1: " + fac1 + "\n Factura2: " + fac2 + "\n Factura3: " + fac3
				+ "\n Factura4: " + fac4 + "\n Factura5: " + fac5);
	}

	/*
	 * 9) Realiza un programa que pida números hasta que se introduzca cero o un
	 * número negativo, y diga cuál es el mayor número introducido y cuantas veces
	 * se repite.
	 */
	public void ej09(Scanner input) {
		int entrada, max = 0, reps = 0;
		String cadena = new String();
		System.out.println("\n9) Mayor número introducido y cuantas veces se repite: ");
		do {
			System.out.print("Introduzca numero (X <= 0): ");
			entrada = input.nextInt();
			if (entrada > 0) {
				cadena = cadena.concat(entrada + ",");
			}
		} while (entrada > 0);
		cadena = cadena.substring(0, cadena.length() - 1);
		System.out.println("Resultado: " + cadena);
		for (int i = 0; i < cadena.split(",").length; i++) {
			max = Math.max(max, Integer.parseInt(cadena.split(",")[i]));
		}
		for (int i = 0; i < cadena.split(",").length; i++) {
			if (cadena.split(",")[i].equals(Integer.toString(max))) {
				reps++;
			}
		}
		System.out.println("Max: " + max + ", repeticiones: " + reps);
	}

	/*
	 * 10) Haz un programa que pida un número n, y diga cuantos y cuales números
	 * primos hay entre 1 y n.
	 */
	public void ej10(Scanner input) {
		int entrada;
		System.out.println("\n10) Entre 1 y numero son primos o no");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		for (int i = 2; i <= entrada; i++) {
			if (help.esPrimo(i) == true) {
				System.out.print(((help.esPrimo(i) == true) ? i + " es primo.\n" : ""));
			}
		}
	}

	/*
	 * 11) Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
	 * separados por espacios.
	 */
	public void ej11(Scanner input) {
		System.out.println("\n11) 20 números enteros aleatorios entre 0 y 10");
		for (int i = 1; i <= 20; i++) {
			System.out.print(new Random().nextInt(19) + 1 + " ");
		}
		System.out.println();
	}

	/*
	 * 12) Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
	 * separados por espacios. Muestra también el máximo, el mínimo y la media de
	 * esos números.
	 */
	public void ej12(Scanner input) {
		int entrada, res = 0, max = 0, min = 0;
		System.out.println("\n12) Maximo, el minimo y la media de 50 números enteros aleatorios entre 100 y 199");
		for (int i = 1; i <= 50; i++) {
			entrada = new Random().nextInt(99) + 100;
			System.out.print(entrada + ((i % 10 == 0) ? "\n" : ",\t"));
			res = res + entrada;
			min = Math.min(min, entrada);
			max = Math.max(max, entrada);
		}
		System.out.println("Maximo: " + max + ", Minimo: " + min + ", Media: " + (double) res / 50);
	}

	/*
	 * 13) Realiza un programa que pinte la letra U por pantalla hecha con
	 * asteriscos. El programa pedirá la altura. Ejemplo:
	 * "*       *\n"+"*       *\n"+"*       *\n"+"*       *\n"+ "  * * *  "
	 */
	public void ej13(Scanner input) {
		String base = new String(), altura = new String();
		int entrada, i;
		System.out.println("\n13) Pinta la letra U con asteriscos:");
		System.out.print("Introducir altura (> 2): ");
		entrada = input.nextInt();
		if (entrada > 2) {
			for (i = 2, base = base.concat(" ").concat(" "), altura = altura.concat("* "); i < entrada; i++) {
				altura = altura.concat(" ").concat(" ");
				base = base.concat("* ");
			}
			for (i = 1, base = base.concat(" ").concat(" "), altura = altura.concat("* "); i < entrada; i++) {
				System.out.println(altura);
			}
			System.out.println(base);
		} else {
			System.out.println("Tamaño insuficiente.");
		}
	}

	/*
	 * 14) Haz un programa que pida un número, entre 0 y 10, y escriba un triángulo
	 * invertido con dichos números. Por ejemplo, si n=10:
	 * 
	 * "0,1,2,3,4,5,6,7,8,9\n"+"1,2,3,4,5,6,7,8,9\n"+"2,3,4,5,6,7,8,9\n"+
	 * "3,4,5,6,7,8,9\n"+"4,5,6,7,8,9\n"+"5,6,7,8,9;\n"+"6,7,8,9\n"+
	 * "7,8,9\n"+"8,9;\n"+"9"
	 */
	public void ej14(Scanner input) {
		int entrada;
		System.out.println("\n14) Triángulo rectángulo númeral:");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		System.out.println(help.trianguloNumeral0(entrada));
	}

	/*
	 * 15) Realiza un programa que devuelva la cantidad de vocales, consonantes y
	 * espacios en una cadena dada. Supondremos que no las vocales no estarán
	 * acentuadas.
	 */
	public void ej15(Scanner input) {
		String cadena = new String();
		int vocs, cons, esps;
		System.out.println("\n15) Cantidad de vocales, consonantes y espacios en una cadena dada:");
		System.out.print("Introduce cadena: ");
		cadena = input.nextLine();
		vocs = help.repeticiones(cadena, "[aiouAEIOU]");
		cons = help.repeticiones(cadena, "(?:(?![aiouAEIOU])[a-zA-Z])");
		esps = help.repeticiones(cadena, " ");
		System.out.println("Vocales: " + vocs + ", consonantes: " + cons + ", espacios: " + esps);
	}

	/*
	 * 16) Pedir un número entero y decir si es capicúa, es decir, por ejemplo: 1001
	 * es capicúa.
	 */
	public void ej16(Scanner input) {
		int entrada;
		System.out.println("\n16) Número entero es capicúa:");
		System.out.print("Introducir número: ");
		entrada = input.nextInt();
		System.out.println(entrada
				+ ((help.inverir(Integer.toString(entrada)).contentEquals(Integer.toString(entrada))) ? "" : " no")
				+ " es capicúa.");
	}

	/*
	 * 17) Realiza un programa que muestre al azar el nombre de una carta de la
	 * baraja francesa (cuatro palos: picas, corazones, diamantes y tréboles. Cada
	 * palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4
	 * literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A que sería el 1).
	 */
	public void ej17(Scanner input) {
		System.out.println("\n17) Una carta de la baraja francesa al azar:");
		System.out.println(help.barajaFrancesa());
	}

	/*
	 * 18) Modificar el ejercicio anterior para que trabaje con la baraja española.
	 * Esta consta de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
	 */
	public void ej18(Scanner input) {
		System.out.println("\n18) Una carta de la baraja española al azar:");
		System.out.println(help.barajaEspañola());
	}

	/*
	 * 19) Dadas dos fechas, mostrar el número de días que hay de diferencia. Para
	 * una mayor comodidad, supondremos que todos los meses tienen 30 días.
	 */
	public void ej19(Scanner input) {
		String f1 = new String(), f2 = new String();
		System.out.println("\n19) Número de días de diferencia entre dos fechas (formato: dd/MM/yyyy):");
		System.out.print("Introducir primera fecha: ");
		f1 = input.next();
		System.out.print("Introducir segunda fecha: ");
		f2 = input.next();
		// f1 = "01/01/2000";f2 = "29/11/2019";
		System.out.println("Fecha 1 = " + f1 + "\nFecha 2 = " + f2);
		System.out.println("Respuesta: " + help.difFechas(f1, f2) + " dias.");
	}

	/*
	 * 20) Realizar un programa que muestre el producto de los N primeros números
	 * impares.
	 */
	public void ej20(Scanner input) {
		long entrada, res = 1;
		String cad = new String();
		System.out.println("\n20) producto de los N primeros números:");
		System.out.print("Introducir cadena: ");
		entrada = input.nextLong();
		for (int i = 1, j = 1; j <= entrada; i++) {
			if (i % 2 == 1) {
				cad += i + " * ";
				res *= i;
				j++;
			}
		}
		cad = cad.substring(0, cad.length() - 2);
		System.out.println(cad);
		System.out.println("Resultado: " + res);
	}

	/*
	 * 21) Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.
	 */
	public void ej21(Scanner input) {
		System.out.println("\n21) tablas de multiplicar del 1 al 10:");
		for (int i = 0; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + ((j % 10 == 0) ? "\n" : "\t"));
			}
		}
		System.out.println();
	}

	/*
	 * 22) Dada una cadena, devolver la mitad de esta.
	 */
	public void ej22(Scanner input) {
		String entrada = new String();
		System.out.println("\n22) Partir cadena por la mitad:");
		System.out.print("Introducir cadena: ");
		entrada = input.next();
		System.out.println("Primera mitad: " + entrada.substring(0, entrada.length() / 2));
		System.out.println("Segunda mitad: " + entrada.substring(entrada.length() / 2, entrada.length()));
	}

	/*
	 * 23) Modificar el programa anterior para que nos permita elegir si queremos
	 * obtener la mitad izquierda o derecha.
	 */
	public void ej23(Scanner input) {
		String entrada = new String();
		String mitad = new String();
		System.out.println("\n23) Partir cadena por la mitad 2:");
		System.out.print("Introducir cadena: ");
		entrada = input.next();
		System.out.print("¿Primera o Segunda mitad? ");
		mitad = input.next();
		if (mitad.equalsIgnoreCase("Primera")) {
			System.out.println("Primera mitad: " + entrada.substring(0, entrada.length() / 2));
		} else if (mitad.equalsIgnoreCase("Segunda")) {
			System.out.println("Segunda mitad: " + entrada.substring(entrada.length() / 2, entrada.length()));
		} else {
			System.out.println("ERROR");
		}
		System.out.println("\"" + entrada.substring(0, entrada.length() / 2) + "\", \""
				+ entrada.substring(entrada.length() / 2, entrada.length()) + "\"");
	}

	/*
	 * 24) Dada una cadena, reemplaza todas las letras a por una e y devuelve
	 * cuantas has letras has reemplazado.
	 */
	public void ej24(Scanner input) {
		String entrada = new String();
		int num = 0;
		System.out
				.println("\n24) Dada una cadena, reemplaza las letras a por una e y devuelve el numero de reemplazos:");
		System.out.print("Introducir cadena: ");
		entrada = input.nextLine();
		for (int i = 0; i < entrada.length(); i++) {
			if (entrada.substring(i, i + 1).matches("[aA]")) {
				num++;
			}
		}
		entrada = entrada.replace("a", "e").replace("A", "e");
		System.out.println("Letras reemplazadas: " + num);
		System.out.println("Resultado: " + entrada);
	}

	/*
	 * 25) Realiza una calculadora que nos pida dos operandos enteros y un signo
	 * matemático. Tras realizar la operación indicada, nos deberá mostrar el
	 * resultado. Las operaciones soportadas son: +, -, *, /, ^ (potencia, primer
	 * operando base y segundo exponente) y %.
	 */
	public void ej25(Scanner input) {
		double num1, num2, res = 0;
		String operacion = new String();
		System.out.println("\n25) Calcular de dos números (suma(+), resta(+), \n"
				+ "multiplicacion(*), division(/), modulo(%), potencia(^)):");
		System.out.print("Introducir primer numero: ");
		num1 = input.nextDouble();
		System.out.print("Introducir tipo de operacion: ");
		operacion = input.next();
		System.out.print("Introducir segundo numero: ");
		num2 = input.nextDouble();
		if (operacion.equals("+") || operacion.equalsIgnoreCase("suma")) {
			res = help.sumador(num1, num2);
		} else if (operacion.equals("-") || operacion.equalsIgnoreCase("resta")) {
			res = help.restador(num1, num2);
		} else if (operacion.equals("*") || operacion.equalsIgnoreCase("multiplicacion")) {
			res = help.multiplicacion(num1, num2);
		} else if (operacion.equals("/") || operacion.equalsIgnoreCase("division")) {
			res = help.division(num1, num2);
		} else if (operacion.equals("%") || operacion.equalsIgnoreCase("modulo")) {
			res = help.modulo(num1, num2);
		} else if (operacion.equals("^") || operacion.equalsIgnoreCase("potencia")) {
			res = help.potencia(num1, num2);
		} else {
			System.out.println("ERROR");
		}
		System.out.println("Resultado: " + res);
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
	}
}