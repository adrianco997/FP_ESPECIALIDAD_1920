package Ejercicios;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Utils {
	Auxiliares help = new Auxiliares();
	int ejersize = 17;

	/*
	 * 1) Dada una cadena y un carácter, verificar cuántas veces se repite este
	 * carácter en la cadena.
	 */
	public void ej01(Scanner input) {
		String cadena = new String();
		int letras = 0;
		char caracter;
		System.out.println("\n1) Repeticiones carácter en una cadena:");
		System.out.print("Introduce cadena: ");
		cadena = input.nextLine();
		System.out.print("Introduce carácter: ");
		caracter = input.nextLine().charAt(0);
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.substring(i, i + 1).matches(Character.toString(caracter))) {
				letras++;
			}
		}
		System.out.println("Resultado: " + letras);
	}

	/*
	 * 2) Dada una cadena contar la cantidad de: dígitos, letras y espacios en
	 * blanco que contiene.
	 */
	public void ej02(Scanner input) {
		int digitos = 0, letras = 0, espacios = 0;
		String cadena = new String();
		System.out.println("\n2) Contardor de dígitos, letras y espacios en una cadena:");
		System.out.print("Introduce cadena: ");
		cadena = input.nextLine();
		for (int i = cadena.length(); i > 0; i--) {
			if (cadena.substring(i - 1, i).matches("[0-9]")) {
				digitos++;
			}
			if (cadena.substring(i - 1, i).matches("[a-záéíóúñA-ZÁËÍÓÚÑ]")) {
				letras++;
			}
			if (cadena.substring(i - 1, i).matches(" ")) {
				espacios++;
			}
		}
		System.out.println("Dígitos: " + digitos + ", letras: " + letras + ", espacios: " + espacios);
	}

	/*
	 * 3) Dada una cadena invertirla y mostrarla por pantalla.
	 */
	public void ej03(Scanner input) {
		String cadena = new String();
		System.out.println("\n3) Invertir cadena:");
		System.out.print("Introduce cadena: ");
		cadena = input.nextLine();
		System.out.println(help.inverir(cadena));
	}

	/*
	 * 4) Calcular el volumen de una pirámide.
	 */
	public void ej04(Scanner input) {
		double l, h;
		System.out.println("\n4) volumen de una pirámide cuadrada:");
		System.out.print("Introduce el lado de la base: ");
		l = input.nextDouble();
		System.out.print("Introduce el altura de la pirámide: ");
		h = input.nextDouble();
		System.out.println("Volumen de la pirámide: " + help.volumenPiramideCuadrada(l, h));
	}

	/*
	 * 5) Crea un programa que permita al usuario adivinar un número del 1 al 100
	 * (generado al azar) en un máximo de 6 intentos. En intento, deberá avisar si
	 * se ha pasado o se ha quedado corto.
	 */
	public void ej05(Scanner input) {
		int i = 6, num = 0, res;
		System.out.println("\n5) Adivina un número del 1 al 100 en 6 intentos:");
		res = new Random().nextInt(99) + 1;
		/*
		 * res=(int)(Math.random()*100);res=(int)(Math.abs(Math.random()*100));
		 */
		do {
			System.out.print("Introduce número: ");
			num = input.nextInt();
			i--;
			if (num != res) {
				System.out.println("Número incorrecto, " + i + " de 6 intentos restantes.\n" + "El numero es "
						+ ((num < res) ? "mayor." : "menor."));
			} else {
				System.out.println("Número correcto.");
			}
		} while (num != res && i > 0);
		System.out.println("Respuesta correcta: " + res);
	}

	/*
	 * 6) Crea una función que reciba dos cadenas de caracteres y que devuelva la
	 * primera cadena, pero se transformará en mayúsculas la parte que coincide con
	 * la segunda cadena introducida.
	 */
	public void ej06(Scanner input) {
		String cad1 = new String(), cad2 = new String();
		System.out.println("\n6) Compara dos cadenas y pasa a mayúsculas la parte de la primera cadena que\n"
				+ "coincide con la segunda cadena introducida:");
		System.out.print("Introduce primera cadena: ");
		cad1 = input.nextLine();
		System.out.print("Introduce segunda cadena: ");
		cad2 = input.nextLine();
		System.out.println("Resultado: " + cad1.replace(cad2, cad2.toUpperCase()));
	}

	/*
	 * 7) Crea una función que reciba una cadena de caracteres y la devuelva
	 * invertida con efecto espejo, es decir, se concatena a la palabra original su
	 * inversa, compartiendo la última letra. Ejemplo: espejojepse
	 */
	public void ej07(Scanner input) {
		String cadena = new String(), inversa = new String();
		System.out.println("\n7) Invertir con efecto espejo:");
		System.out.print("Introduce cadena: ");
		cadena = input.nextLine();
		inversa = help.inverir(cadena);
		System.out.println(cadena.concat(inversa.substring(1, inversa.length())));
		System.out.println(cadena.substring(0, cadena.length() - 1).concat(inversa));
	}

	/*
	 * 8) Crea un programa que calcule y muestre el coseno de los ángulos que van de
	 * 0 a 90 grados (ambos inclusive), de 5 en 5 grados.
	 */
	public void ej08(Scanner input) {
		System.out.println("\n8) Coseno de 0 a 90 grados (de 5 en 5 grados):");
		for (int i = 0; i <= 90; i += 5) {
			System.out.println("cos(" + i + ") = "
					+ ((double) Math.round(Math.cos((i * Math.PI) / 180) * 100000000d) / 100000000));
		}
	}

	/*
	 * 9) Calcular la raíz cuadrada de x + 4 * y^3
	 */
	public void ej09(Scanner input) {
		double x, y, res;
		System.out.println("\n9) Raíz cuadrada de x + 4 * y^3:");
		System.out.print("Introduce x: ");
		x = input.nextDouble();
		System.out.print("Introduce y: ");
		y = input.nextDouble();
		res = x + 4 * Math.pow(y, 3);
		if (res >= 0) {
			System.out.println("Resultado: " + Math.sqrt(res));
		} else {
			System.out.println("Resultado: raiz de " + res + " no existe.");
		}
	}

	/*
	 * 10) Calcular la raíz cúbica del producto de x e y.
	 */
	public void ej10(Scanner input) {
		double x, y, res;
		System.out.println("\n10) Raíz cúbica del producto de x e y:");
		System.out.print("Introduce x: ");
		x = input.nextDouble();
		System.out.print("Introduce y: ");
		y = input.nextDouble();
		res = Math.pow((double) x * y, (double) 1 / 3);
		System.out.println("Resultado: " + res);
	}

	/*
	 * 11) Crea una función que reciba como parámetro una cadena y devuelva la
	 * cadena eliminando los espacios en blanco que contenga.
	 */
	public void ej11(Scanner input) {
		String cad = new String();
		System.out.println("\n11) Elimina espacios en blanco de una cadena:");
		System.out.print("Introduce cadena: ");
		cad = input.nextLine();
		System.out.println("Resultado: " + cad.replace(" ", ""));
	}

	/*
	 * 12) Escriba un programa donde se considere la medida de cada cateto de un
	 * triángulo rectángulo y que muestre la longitud de la hipotenusa.
	 */
	public void ej12(Scanner input) {
		double cat1, cat2, hip;
		System.out.println("\n12) Hipotenusa de un triángulo rectángulo:");
		System.out.print("Introduce primer cateto: ");
		cat1 = input.nextDouble();
		System.out.print("Introduce segundo cateto: ");
		cat2 = input.nextDouble();
		hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
		System.out.println("Hipotenusa: " + hip);
	}

	/*
	 * 13) Crea una función que reciba como parámetro una cadena de texto con una
	 * frase y dicha función tendrá que devolver dicha cadena pero invirtiendo la
	 * primera y la última palabra.
	 */
	public void ej13(Scanner input) {
		String cadena = new String(), primera = new String(), ultima = new String();
		System.out.println("\n13) Invertir la primera y la última palabra:");
		System.out.print("Introduce cadena: ");
		primera = cadena.trim().split(" ")[0];
		ultima = cadena.trim().split(" ")[cadena.trim().split(" ").length - 1];
		System.out.println(
				"opcion 1: " + cadena.replace(primera, help.inverir(primera)).replace(ultima, help.inverir(ultima)));
		System.out.println("opcion 2: "
				+ cadena.replace(primera, "gkkdÑtatu").replace(ultima, primera).replace("gkkdÑtatu", ultima));
	}

	/*
	 * 14) Construir un programa que, dado el radio de una esfera, calcule y
	 * devuelva el valor de la superficie y el volumen de la esfera correspondiente.
	 */
	public void ej14(Scanner input) {
		double radio, area, volumen;
		System.out.println("\n14) Superficie y volumen de una esfera:");
		System.out.print("Introduce radio: ");
		radio = input.nextDouble();
		System.out.println("Resultado: " + radio);
		area = 4 * Math.PI * Math.pow(radio, 2);
		volumen = (4 / 3) * Math.PI * Math.pow(radio, 3);
		System.out.println("Superficie: " + area + ", volumen: " + volumen);
	}

	/*
	 * 15) Crea una función para calcular la letra del NIF que le corresponde al
	 * número de DNI que le pasan como parámetro.
	 */
	public void ej15(Scanner input) {
		int dni = 0;
		System.out.println("\n15) Calcular la letra del NIF:");
		System.out.print("Introduce DNI (7-8 números): ");
		dni = input.nextInt();
		System.out.println("Resultado: " + help.LetraNIF(dni));
	}

	/*
	 * 16) Crea un programa que muestre en pantalla el resultado de lanzar dos dados
	 * (dos números del 1 al 6).
	 */
	public void ej16(Scanner input) {
		int dado1 = help.numDado(6), dado2 = help.numDado(6);
		System.out.println("\n16) Resultado de 2d6:");
		System.out.println("Resultado: " + (dado1 + dado2) + ", dado 1: " + dado1 + ", dado 2: " + dado2);
	}

	/*
	 * 17) Calcular el sector circular.
	 */
	public void ej17(Scanner input) {
		double radio, grados, area, perimetro, longitud;
		System.out.println("\n17) Calcular el sector circular:");
		System.out.print("Introduce radio: ");
		radio = input.nextDouble();
		System.out.print("Introduce angulo (grados): ");
		grados = input.nextDouble();
		area = help.sectorCircularAreaGra(radio, grados);
		longitud = help.sectorCircularLongGra(radio, grados);
		perimetro = help.sectorCircularPerim(radio, help.sectorCircularLongGra(radio, grados));
		System.out.println("Área: " + area + ", Longitud: " + longitud + ", Perímetro: " + perimetro);
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
	}
}