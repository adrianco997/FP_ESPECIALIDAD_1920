package Ejercicios;

import java.util.Scanner;

public class Metodos {
	Auxiliares help = new Auxiliares();
	int ejersize = 12;

	/*
	 * 1) Crea una función que reciba dos números reales y devuelva su suma.
	 */
	public void ej01(Scanner input) {
		double num1, num2;
		System.out.println("\n1) Suma de dos reales:");
		System.out.print("Introduce primer numero: ");
		num1 = input.nextDouble();
		System.out.print("Introduce segundo numero: ");
		num2 = input.nextDouble();
		System.out.println("Suma = " + help.sumador(num1, num2) + "");
	}

	/*
	 * 2) Crea una aplicación que nos pida un número y, mediante un procedimiento,
	 * nos indique si es este es primo o no.
	 */
	public void ej02(Scanner input) {
		int entrada;
		System.out.println("\n2) Numero es primo?:");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		System.out.println(entrada + ((help.esPrimo(entrada)) ? " es" : " no es") + " primo.");
	}

	/*
	 * 3) Crea una función que nos calcule el factorial de un número.
	 */
	public void ej03(Scanner input) {
		int entrada;
		String cad = new String();
		System.out.println("\n3) Factorial de un número:");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		for (int i = entrada; i > 0; i--) {
			cad = cad.concat(i + "*");
		}
		cad = cad.substring(0, cad.length() - 1);
		System.out.println("Resultado: " + cad + " = " + help.factorial(entrada));
	}

	/*
	 * 4) Crea una procedimiento que indique la posición de la primera ocurrencia de
	 * un dígito dentro de un número. Si no se encuentra, devuelve -1.
	 */
	public void ej04(Scanner input) {
		int entrada, digito;
		System.out.println("\n4) Posición de la primera ocurrencia de un dígito dentro de un número:");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		System.out.print("Introducir dígito: ");
		digito = input.nextInt();
		System.out.println("La primera ocurrencia de " + digito + ", en " + entrada + " esta en la posición: "
				+ help.posicion(entrada, digito));
	}

	/*
	 * 5) Crea una función que le de la vuelta a un número.
	 */
	public void ej05(Scanner input) {
		int num;
		System.out.println("\n5) Dar la vuelta a un número:");
		System.out.print("Introducir numero: ");
		num = input.nextInt();
		System.out.println("Resultado = " + help.inverir(Integer.toString(num)));
	}

	/*
	 * 6) Crea una función que dado un número decimal, devuelva su equivalente en
	 * binario.
	 */
	public void ej06(Scanner input) {
		int entrada;
		System.out.println("\n6) Decimal a binario");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		System.out.println("Numero binario: " + help.StringtoBaseInt(entrada, 2));
		System.out.println("Integer.toBinaryString: " + Integer.toBinaryString(entrada));
	}

	/*
	 * 7) Crea una función que dado un número decimal, devuelva su equivalente en
	 * octal.
	 */
	public void ej07(Scanner input) {
		int entrada;
		System.out.println("\n7) Decimal a octal");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		System.out.println("Numero  octal: " + help.StringtoBaseInt(entrada, 8));
		System.out.println("Integer.toOctalString: " + Integer.toOctalString(entrada));
	}

	/*
	 * 8) Crea una función que dado un número decimal, devuelva su equivalente en
	 * hexadecimal.
	 */
	public void ej08(Scanner input) {
		int entrada;
		System.out.println("\n8) Decimal a hexadecimal");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		System.out.println("Numero hexadecimal: " + help.StringtoBaseInt(entrada, 16));
		System.out.println("Integer.toHexString: " + Integer.toHexString(entrada));
	}

	/*
	 * 9) Crea un procedimiento que nos dado un número N, nos devuelva los primos
	 * anteriores a este.
	 */
	public void ej09(Scanner input) {
		int entrada, resto = 0;
		System.out.println("\n9) Primos entre 1 y un numero");
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
		System.out.println(entrada + " es " + ((resto == 2) ? "" : "no") + " primo.\n");
	}

	/*
	 * 10) Crea un procedimiento que lea un número N y calcule el factorial de los
	 * números desde 0 hasta N.
	 */
	public void ej10(Scanner input) {
		System.out.println("\n10) factorial de 0 hasta un número:");
		System.out.print("Introducir numero: ");
		for (int i = 0, entrada = input.nextInt(); i <= entrada; i++) {
			System.out.println(i + "! = " + help.factorial(i));
		}
	}

	/*
	 * 11) Crea una aplicación que nos permita calcular las operaciones básicas
	 * entre dos números mediante un método.
	 */
	public void ej11(Scanner input) {
		double num1, num2, res = 0;
		String operacion = new String();
		System.out.println("\n11) Calcular de dos números (suma(+), resta(+), \n"
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

	/*
	 * 12) Crea una aplicación que nos permita convertir un número en base decimal a
	 * binario, octal o hexadecimal. Esto lo realizará mediante un método al que le
	 * pasaremos el número como parámetro, devolverá un String con el número
	 * convertido al formato específico, es decir, posteriormente habrá que indicar
	 * el formato requerido.
	 */
	public void ej12(Scanner input) {
		int entrada, base = 10;
		String tipo = new String();
		System.out.println("\n12) Decimal a binario(2), octal(8) o hexadecimal(16):");
		System.out.print("Introducir numero: ");
		entrada = input.nextInt();
		System.out.print("Introducir base: ");
		tipo = input.next();
		if (tipo.equals("2") || tipo.equalsIgnoreCase("binario") || tipo.equals("8") || tipo.equalsIgnoreCase("octal")
				|| tipo.equals("16") || tipo.equalsIgnoreCase("hexadecimal")) {
			if (tipo.equals("2") || tipo.equalsIgnoreCase("binario")) {
				tipo = "binario";
				base = 2;
			} else if (tipo.equals("8") || tipo.equalsIgnoreCase("octal")) {
				tipo = "octal";
				base = 8;
			} else if (tipo.equals("16") || tipo.equalsIgnoreCase("hexadecimal")) {
				tipo = "hexadecimal";
				base = 16;
			}
			System.out.println("Numero en base " + tipo + ": " + help.StringtoBaseInt(entrada, base));
		} else {
			System.out.println("Error en numero o base.");
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
	}
}