package Ejercicios;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Auxiliares {
	Matriz matriz = new Matriz();
	Array array = new Array();
	OrdenYbusqueda ordenYbusqueda = new OrdenYbusqueda();
	/* Integer.parseInt() */
	/* Double.parseDouble() */

	public int toInt(String cad) {
		return (int) Integer.parseInt(cad);
	}

	public double toDouble(String cad) {
		return (double) Double.parseDouble(cad);
	}

	public double redondear100(double num) {
		return (double) Math.round(num * 100d) / 100;
	}

	/******************************************************************************/
	public /* static */ double sumador(double... nums) {
		double res = 0;
		for (int i = 0; i < nums.length; res += nums[i], i++)
			;
		return res;
	}

	public /* static */ int sumador(int... nums) {
		int res = 0;
		for (int i = 0; i < nums.length; res += nums[i], i++) {
		}
		return res;
	}

	public/* static */double restador(double... nums) {
		double res = 0;
		for (int i = 0; i < nums.length; res -= nums[i], i++)
			;
		return res;
	}

	public/* static */int restador(int... nums) {
		int res = 0;
		for (int i = 0; i < nums.length; res -= nums[i], i++)
			;
		return res;
	}

	public double multiplicacion(double num1, double num2) {
		return num1 * num2;
	}

	public int multiplicacion(int num1, int num2) {
		return num1 * num2;
	}

	public double division(double num1, double num2) {
		return num1 / num2;
	}

	public int division(int num1, int num2) {
		return num1 / num2;
	}

	public double modulo(double num1, double num2) {
		return num1 % num2;
	}

	public int modulo(int num1, int num2) {
		return num1 % num2;
	}

	public double potencia(double num1, double num2) {
		return Math.pow(num1, num2);
	}

	public int potencia(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}

	public boolean esPrimo(int num) {
		int resto = 0;
		for (int i = 1; i <= num && resto <= 2; resto += (num % i == 0) ? 1 : 0, i++)
			;
		return (resto == 2) ? true : false;
	}

	public int factorial(int num) {
		int res = 1;
		for (int i = num; i > 0; res *= i, i--)
			;
		return res;
	}

	public int posicion(int num, int dig) {
		int res, n;
		for (res = -1, n = 1; num > 0 && res == -1; res = (num % 10 == dig) ? n : res, num = (num - num % 10) / 10, n++)
			;
		return res;
	}

	public String inverir(String cad) {
		String res = new String();
		for (int i = cad.length(); i > 0; res = res.concat(cad.substring(cad.length() - 1)), cad = cad.substring(0,
				cad.length() - 1), i--)
			;
		return res;
	}

	public String StringtoBaseInt(int num, int base) {
		String res = new String();
		if (base == 2 || base == 8) {
			for (int i = num; i > 0; res = res.concat(Integer.toString(i % base)), i = (i - i % base) / base)
				;
		} else if (base == 16) {
			for (int i = num, aux = i % base; i > 0; aux = i % base, i = (i - i % base) / base) {
				if (aux < 10) {
					res = res.concat(Integer.toString(aux));
				} else {
					switch (aux) {
					case (10):
						res = res.concat("A");
						break;
					case (11):
						res = res.concat("B");
						break;
					case (12):
						res = res.concat("C");
						break;
					case (13):
						res = res.concat("D");
						break;
					case (14):
						res = res.concat("E");
						break;
					case (15):
						res = res.concat("F");
						break;
					default:
						break;
					}
				}
			}
		}
		return inverir(res);
	}

	/******************************************************************************/
	public int numDado(int caras) {
		return new Random().nextInt(caras - 1) + 1;
	}

	public char LetraNIF(int dni) {
		return "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni % 23);
	}

	public double sectorCircularAreaGra(double radio, double grados) {
		return (Math.pow(radio, 2) * Math.PI * grados) / 360;
	}

	public double sectorCircularAreaRad(double radio, double radianes) {
		return (Math.pow(radio, 2) * radianes) / 2;
	}

	public double sectorCircularAreaArc(double radio, double arco) {
		return (radio * arco) / 2;
	}

	public double gradosToRadianes(double grados) {
		return (grados * Math.PI) / 180;
	}

	public double radianesToGrados(double radianes) {
		return (radianes * 180) / Math.PI;
	}

	public double sectorCircularLongGra(double radio, double grados) {
		return (2 * radio * Math.PI * grados) / 360;
	}

	public double sectorCircularLongRad(double radio, double radianes) {
		return radio * radianes;
	}

	public double sectorCircularPerim(double radio, double longitud) {
		return 2 * radio + longitud;
	}

	public double volumenPiramideCuadrada(double l, double h) {
		return (l * l * h) / 3;
	}

	/******************************************************************************/
	public double inputSumador(Scanner input, double n) {
		double suma = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Introduce " + (i + 1) + " numero: ");
			suma += input.nextDouble();
		}
		return suma;
	}

	public boolean esBisiesto(int date) {
		return (date % 4 == 0 && (date % 100 != 0 || date % 400 == 0)) ? true : false;
	}

	public double galon_litro(double valor) {
		return Math.round(valor * 3.7854 * 100d) / 100;
	}

	public double pies_pulgadas(double valor) {
		return Math.round(valor * 12 * 100d) / 100;
	}

	public double pies_yardas(double valor) {
		return Math.round(valor * 12 * 2.54 * 0.01 / 0.98 * 100d) / 100;
	}

	public double pies_cm(double valor) {
		return Math.round(valor * 12 * 2.54 * 100d) / 100;
	}

	public double pies_metros(double valor) {
		return Math.round(valor * 12 * 2.54 * 0.01 * 100d) / 100;
	}

	public int mcd(int n1, int n2) {
		int mcd = 0, a = Math.max(n1, n2), b = Math.min(n1, n2);
		do {
			mcd = b;
			b = a % b;
			a = mcd;
		} while (b != 0);
		return mcd;
	}

	public int mcm(int n1, int n2) {
		int mcm = 0, a = Math.max(n1, n2), b = Math.min(n1, n2);
		mcm = (a / mcd(a, b)) * b;
		return mcm;
	}

	public double interesMes(double saldo, double tasaAnual) {
		return (saldo * tasaAnual / 12) / 100;
	}

	public void inversionMes(double saldo_ini, double interes, int incremento) {
		double saldo, saldo_fin = saldo_ini * incremento;
		int meses;
		for (meses = 1, saldo = saldo_ini; saldo < saldo_fin; meses++) {
			saldo += interesMes(saldo, interes);
		}
		System.out.println("Tarda " + (int) meses + " meses en producir: " + saldo + " al " + interes + "%");
	}

	public void printSumaGeometrica(int numero, int primer, int razon) {
		int suma = 0;
		System.out.print("\nSalida:");
		for (int i = 1, nesimo; i <= numero; i++) {
			suma += nesimo = primer * (int) Math.pow(razon, i - 1);
			suma += nesimo;
			System.out.print(" " + nesimo);
		}
		System.out.println(". La suma de los términos de la serie es " + suma);
	}

	public void perfecto(int entrada) {
		String divisores = new String(), cadSuma = new String();
		int suma = 0;
		for (int i = 1; i < entrada; i++) {
			if (entrada % i == 0) {
				suma += i;
				divisores += i + ", ";
				cadSuma += i + "+";
			}
		}
		divisores = divisores.substring(0, divisores.length() - 2);
		cadSuma = cadSuma.substring(0, cadSuma.length() - 1);
		System.out.println(entrada + " " + ((suma == entrada) ? "es" : "no es") + " perfecto.");
		System.out.println("Divisores: " + divisores + ". Suma: " + cadSuma + "=" + suma);
	}

	public int productoSucesivas(int num1, int num2) {
		int res = 0;
		for (int i = 0; i < num2; res += num1, i++)
			;
		return res;
	}

	public void divisionSucesivas(int num1, int num2) {
		int i, a = Math.max(num1, num2), b = Math.min(num1, num2), resto;
		System.out.println(a + " entre " + b + ".");
		for (i = 0, resto = a; resto >= b; i++) {
			resto = a - b;
			System.out.println(a + " - " + b + " = " + resto + " contamos " + (i + 1) + " veces y "
					+ ((resto >= b) ? "continuamos porque " + resto + " >= " + b
							: "paramos porque " + resto + " < " + b));
			a = resto;
		}
		System.out.println("Luego la división es " + i + " y el resto " + resto + ".");
	}

	public double serieArmonica(double int_n) {
		double resultado = 0;
		for (double i = 1; i <= int_n; resultado += 1 / i, i++)
			;
		return resultado;
	}

	public double serieArmonicaAlternada(double int_n) {
		double res = 0;
		for (double i = 1; i <= int_n; res = (i % 2 == 1) ? res + 1 / i : res - 1 / i, i++)
			;
		return res;
	}

	public String triangulo(int entrada) {
		String string = new String();
		if (entrada > 0) {
			for (int j = 0; j < entrada; string = string.concat("\n"), j++) {
				for (int i = 1; i <= j + 1; string = string.concat("*"), i++)
					;
			}
			return string;
		} else {
			return "-1";
		}
	}

	public String trianguloNumeral(int entrada) {
		String string = new String();
		if (entrada > 0) {
			for (int j = 0; j < entrada; j++) {
				for (int i = 1; i <= j + 1; i++) {
					string = string.concat(Integer.toString(i));
				}
				string = string.concat("\n");
			}
			return string;
		} else {
			return "-1";
		}
	}

	/******************************************************************************/
	public boolean numerosAmigos(int num1, int num2) {
		int suma1 = 0, suma2 = 0;
		for (int i = 1, j = 1; i < num1 && j < num2; i++, j++) {
			if (num1 % i == 0) {
				suma1 += i;
			}
			if (num2 % j == 0) {
				suma2 += j;
			}
		}
		System.out.println(num1 + " " + ((suma1 == num2) ? "es" : "no es") + " amigo de " + num2 + ".");
		System.out.println(num2 + " " + ((suma2 == num1) ? "es" : "no es") + " amigo de " + num1 + ".");
		return ((suma1 == num2 && suma2 == num1) ? true : false);
	}

	public int numTarot(int d, int m, int a) {
		int sum, res;
		for (sum = d + m + a, res = 0; sum > 0; res += sum % 10, sum /= 10)
			;
		for (sum = res, res = 0; sum > 0; res += sum % 10, sum /= 10)
			;
		return res;
	}

	public String trianguloNumeral0(int entrada) {
		String string = new String();
		if (entrada > 0) {
			for (int j = 0; j < entrada; j++) {
				for (int i = 0; i <= j; i++) {
					string = string.concat(Integer.toString(i) + ", ");
				}
				string = string.substring(0, string.length() - 2);
				string = string.concat("\n");
			}
			return string;
		} else {
			return "-1";
		}
	}

	public int repeticiones(String cadena, String regex) {
		int res = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.substring(i, i + 1).matches(regex)) {
				res++;
			}
		}
		return res;
	}

	public String barajaFrancesa() {
		int C = new Random().nextInt(13 - 1) + 1, P = new Random().nextInt(4 - 1) + 1;
		String palos = new String(), cartas = new String();
		switch (C) {
		case (1):
			cartas = "A";
			break;
		case (2):
			cartas = "2";
			break;
		case (3):
			cartas = "3";
			break;
		case (4):
			cartas = "4";
			break;
		case (5):
			cartas = "5";
			break;
		case (6):
			cartas = "6";
			break;
		case (7):
			cartas = "7";
			break;
		case (8):
			cartas = "8";
			break;
		case (9):
			cartas = "9";
			break;
		case (10):
			cartas = "10";
			break;
		case (11):
			cartas = "J";
			break;
		case (12):
			cartas = "Q";
			break;
		case (13):
			cartas = "R";
			break;
		default:
			cartas = "error";
			break;
		}
		switch (P) {
		case (1):
			palos = "picas";
			break;
		case (2):
			palos = "corazones";
			break;
		case (3):
			palos = "diamantes";
			break;
		case (4):
			palos = "tréboles";
			break;
		default:
			palos = "error";
			break;
		}
		return (cartas + " de " + palos + ".");
	}

	public String barajaEspañola() {
		int C = new Random().nextInt(10 - 1) + 1, P = new Random().nextInt(4 - 1) + 1;
		String palos = new String(), cartas = new String();
		switch (C) {
		case (1):
			cartas = "As";
			break;
		case (2):
			cartas = "2";
			break;
		case (3):
			cartas = "3";
			break;
		case (4):
			cartas = "4";
			break;
		case (5):
			cartas = "5";
			break;
		case (6):
			cartas = "6";
			break;
		case (7):
			cartas = "7";
			break;
		case (8):
			cartas = "sota";
			break;
		case (9):
			cartas = "caballo";
			break;
		case (10):
			cartas = "rey";
			break;
		default:
			cartas = "error";
			break;
		}
		switch (P) {
		case (1):
			palos = "oros";
			break;
		case (2):
			palos = "copas";
			break;
		case (3):
			palos = "espadas";
			break;
		case (4):
			palos = "bastos";
			break;
		default:
			palos = "error";
			break;
		}
		return (cartas + " de " + palos + ".");
	}

	public int difFechas(String f1, String f2) {
		int dias = -1;
		try {
			Date D1 = new SimpleDateFormat("dd/MM/yyyy").parse(f1), D2 = new SimpleDateFormat("dd/MM/yyyy").parse(f2);
			if (D1.before(D2)) {
				dias = (int) ((D2.getTime() - D1.getTime()) / 86400000);
			} else if (D2.before(D1)) {
				dias = (int) ((D1.getTime() - D2.getTime()) / 86400000);
			} else {
				dias = (int) ((D1.getTime() - D2.getTime()) / 86400000);
			}
		} catch (ParseException e) {
			System.out.println("Se Produjo un Error!!!  " + e.getMessage());
		}
		return dias;
	}

	public String facturas(Scanner input) {
		double codigo, litros, precioxlitro, facturacion;
		System.out.println("Código del artículo: ");
		codigo = input.nextDouble();
		System.out.println("Cantidad vendida en litros: ");
		litros = input.nextDouble();
		System.out.println("Precio por litro: ");
		precioxlitro = input.nextDouble();
		facturacion = redondear100(litros * precioxlitro);
		System.out.println();
		return new String().concat(codigo + ";" + litros + ";" + precioxlitro + ";" + facturacion);
	}

	public String facturas2(Scanner input) {
		double codigo, litros, precioxlitro, facturacion;
		System.out.println("Código del artículo: ");
		codigo = input.nextDouble();
		System.out.println("Cantidad vendida en litros: ");
		litros = input.nextDouble();
		do {
			System.out.println("Precio por litro(0,6 / 3 / 1,25): ");
			precioxlitro = input.nextDouble();
		} while (precioxlitro != 0.6 && precioxlitro != 3 && precioxlitro != 1.25);
		facturacion = redondear100(litros * precioxlitro);
		System.out.println();
		return new String().concat(codigo + ";" + litros + ";" + precioxlitro + ";" + facturacion);
	}

	/******************************************************************************/
	public class Array {
		public void print(int[] array) {
			for (int i = 0; i < array.length; System.out
					.print(array[i] + (((i + 1) % array.length != 0) ? ", " : "\n")), i++)
				;
		}

		public void println(int[] array) {
			for (int i = 0; i < array.length; System.out.print(array[i] + (((i + 1) % 10 != 0) ? "\t" : "\n")), i++)
				;
			System.out.println();
		}

		public void println(double[] array) {
			for (int i = 0; i < array.length; System.out.print(array[i] + (((i + 1) % 10 != 0) ? "\t" : "\n")), i++)
				;
			System.out.println();
		}

		public void println(char[] array) {
			for (int i = 0; i < array.length; System.out.print(array[i] + (((i + 1) % 10 != 0) ? "\t" : "\n")), i++)
				;
			System.out.println();
		}

		public int[] join(int[]... arrays) {
			int length = 0, aux = 0;
			for (int[] array : arrays) {
				length += array.length;
			}
			int[] res = new int[length];
			for (int[] array : arrays) {
				for (int data : array) {
					res[aux] = data;
					aux++;
				}
			}
			return res;
		}

		public double[] join(double[]... arrays) {
			int length = 0, aux = 0;
			for (double[] array : arrays) {
				length += array.length;
			}
			double[] res = new double[length];
			for (double[] array : arrays) {
				for (double data : array) {
					res[aux] = data;
					aux++;
				}
				aux += array.length;
			}
			return res;
		}

		public void ordenar(int[] array) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						int aux = array[i];
						array[i] = array[j];
						array[j] = aux;
					}
				}
			}
		}

		public void ordenar(double[] array) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						double aux = array[i];
						array[i] = array[j];
						array[j] = aux;
					}
				}
			}
		}

		public int sum(int[] array) {
			int result = array[0];
			for (int i = 1; i < array.length; i++) {
				result += array[i];
			}
			return result;
		}

		public double sum(double[] array) {
			double result = array[0];
			for (int i = 1; i < array.length; i++) {
				result += array[i];
			}
			return result;
		}

		public int rest(int[] array) {
			int result = array[0];
			for (int i = 1; i < array.length; i++) {
				result -= array[i];
			}
			return result;
		}

		public double rest(double[] array) {
			double result = array[0];
			for (int i = 1; i < array.length; i++) {
				result -= array[i];
			}
			return result;
		}

		public int multi(int[] array) {
			int result = array[0];
			for (int i = 1; i < array.length; i++) {
				result *= array[i];
			}
			return result;
		}

		public double multi(double[] array) {
			double result = array[0];
			for (int i = 1; i < array.length; i++) {
				result *= array[i];
			}
			return result;
		}

		public int div(int[] array) {
			int result = array[0];
			for (int i = 1; i < array.length; i++) {
				if (array[i] != 0) {
					result /= array[i];
				}
			}
			return result;
		}

		public double div(double[] array) {
			double result = array[0];
			for (int i = 1; i < array.length; i++) {
				if (array[i] != 0) {
					result /= array[i];
				}
			}
			return result;
		}

		public int media(int[] array) {
			int result = array[0];
			for (int i = 1; i < array.length; i++) {
				result += array[i];
			}
			return result / array.length;
		}

		public double media(double[] array) {
			double result = array[0];
			for (int i = 1; i < array.length; i++) {
				result += array[i];
			}
			return result / array.length;
		}

		public boolean buscar(int[] array, int num) {
			for (int aux : array) {
				if (aux == num) {
					return true;
				}
			}
			return false;
		}

		public boolean buscar(double[] array, double num) {
			for (double aux : array) {
				if (aux == num) {
					return true;
				}
			}
			return false;
		}

		public int[] max(int[] array) {
			int max = array[0], maxN = 0;
			for (int i = 0; i < array.length; i++) {
				max = Math.max(max, array[i]);
			}
			for (int i = 0; i < array.length; i++) {
				if (max == array[i]) {
					maxN++;
				}
			}
			return new int[] { max, maxN };
		}

		public double[] max(double[] array) {
			double max = array[0], maxN = 0;
			for (int i = 0; i < array.length; i++) {
				max = Math.max(max, array[i]);
			}
			for (int i = 0; i < array.length; i++) {
				if (max == array[i]) {
					maxN++;
				}
			}
			return new double[] { max, maxN };
		}

		public int[] min(int[] array) {
			int min = array[0], minN = 0;
			for (int i = 0; i < array.length; i++) {
				min = Math.min(min, array[i]);
			}
			for (int i = 0; i < array.length; i++) {
				if (min == array[i]) {
					minN++;
				}
			}
			return new int[] { min, minN };
		}

		public double[] min(double[] array) {
			double min = array[0], minN = 0;
			for (int i = 0; i < array.length; i++) {
				min = Math.min(min, array[i]);
			}
			for (int i = 0; i < array.length; i++) {
				if (min == array[i]) {
					minN++;
				}
			}
			return new double[] { min, minN };
		}

		public int[] copy(int[] array) {
			int nw[] = new int[array.length];
			for (int i = 0; i < nw.length; nw[i] = array[i], i++)
				;
			return nw;
		}

		public int[] arrayRandom(int num) {
			int array[] = new int[num];
			Random random = new Random();
			for (int i = 0; i < array.length; i++) {
				array[i] = random.nextInt(array.length);
			}
			return array;
		}
	}

	/******************************************************************************/
	public class OrdenYbusqueda {
		/** Ordenación por selección. Creciente */
		public void seleccion(int[] array) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[j] < array[i]) {
						int aux = array[j];
						array[j] = array[i];
						array[i] = aux;
					}
				}
			}
		}

		/** Ordenación por inserción. Creciente */
		public void insercion(int[] array) {
			for (int i = 1, j, aux; i < array.length; i++) {
				for (aux = array[i], j = i - 1; j >= 0 && aux < array[j]; j--) {
					array[j + 1] = array[j];
				}
				array[j + 1] = aux;
			}
		}

		/** Ordenación por burbuja. Creciente */
		public void burbuja(int[] array) {
			for (int i = 1; i < array.length - 1; i++) {
				for (int j = 0; j < array.length - i - 1; j++) {
					if (array[j] > array[j + 1]) {
						int aux = array[j];
						array[j] = array[j + 1];
						array[j + 1] = aux;
					}
				}
			}
		}

		/** Ordenación rápida o Quicksort Creciente. */
		public void quicksortCreciente(int[] array, int inf, int sup) {
			int i = inf, j = sup;
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
			}
			if (inf < j) {
				quicksortCreciente(array, inf, j);
			}
			if (i < sup) {
				quicksortCreciente(array, i, sup);
			}
		}

		/** Ordenación rápida o Quicksort Creciente. */
		public void quicksortCreciente(int[] array) {
			quicksortCreciente(array, 0, array.length - 1);
		}

		/** Ordenación rápida o Quicksort Deciente. */
		public void quicksortDeciente(int[] array, int inf, int sup) {
			int i = inf, j = sup;
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
			}
			if (inf < j) {
				quicksortDeciente(array, inf, j);
			}
			if (i < sup) {
				quicksortDeciente(array, i, sup);
			}
		}

		/** Ordenación rápida o Quicksort Deciente. */
		public void quicksortDeciente(int[] array) {
			quicksortDeciente(array, 0, array.length - 1);
		}

		/** Búsqueda lineal. */
		public int lineal(int[] array, int elemento) {
			int pos = -1;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == elemento) {
					pos = i;
				}
			}
			return pos;
		}

		/** Búsqueda binaria. (necesita estar ordenado creciente) */
		public int binaria(int[] array, int elemento) {
			int pos = -1, inf = 0, sup = array.length - 1;
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
			}
			return pos;
		}
	}

	/******************************************************************************/
	public class Matriz {
		public void println(int[][] matriz) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + "\t");
				}
				System.out.println();
			}
		}

		public void println(String[][] matriz) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + "\t");
				}
				System.out.println();
			}
		}

		public int[] buscar(int[][] matriz, int num) {
			int x = -1, y = -1;
			for (int i = 0; i < matriz.length && x == -1 && y == -1; i++) {
				for (int j = 0; j < matriz[i].length && x == -1 && y == -1; j++) {
					if (matriz[i][j] == num) {
						x = i;
						y = j;
					}
				}
			}
			return new int[] { x, y };
		}

		public int[][] traspuesta(int matriz[][]) {
			int newMatriz[][] = new int[matriz.length][matriz[0].length];
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (newMatriz[i] != null) {
						newMatriz[i][j] = matriz[j][i];
					}
				}
			}
			return newMatriz;
		}

		public int[][] suma(int matriz1[][], int matriz2[][]) {
			int matriz3[][] = new int[matriz1.length][matriz2[0].length];
			if (matriz1[0].length != matriz2[0].length) {
				System.out.println("No se pueden sumar las matrices");
			} else {
				for (int i = 0; i < matriz1.length; i++) {
					for (int j = 0; j < matriz2[i].length; j++) {
						matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
					}
				}
			}
			return matriz3;
		}

		public int[][] resta(int matriz1[][], int matriz2[][]) {
			int matriz3[][] = new int[matriz1.length][matriz2[0].length];
			if (matriz1[0].length != matriz2[0].length) {
				System.out.println("No se pueden restar las matrices");
			} else {
				for (int i = 0; i < matriz1.length; i++) {
					for (int j = 0; j < matriz2[i].length; j++) {
						matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
					}
				}
			}
			return matriz3;
		}

		public int[][] multi(int matriz1[][], int matriz2[][]) {
			int matriz3[][] = new int[matriz1.length][matriz2[0].length];
			if (matriz1[0].length != matriz2[0].length) {
				System.out.println("No se pueden multiplicar las matrices");
			} else {
				for (int i = 0; i < matriz1.length; i++) {
					for (int j = 0; j < matriz2[0].length; j++) {
						for (int k = 0; k < matriz1[0].length; k++) {
							matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
						}
					}
				}
			}
			return matriz3;
		}

		public int[] max(int[][] matriz) {
			int max = matriz[0][0], maxN = 0;
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					max = Math.max(max, matriz[i][j]);
				}
			}
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (max == matriz[i][j]) {
						maxN++;
					}
				}
			}
			return new int[] { max, maxN };
		}

		public int[] min(int[][] matriz) {
			int min = matriz[0][0], minN = 0;
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					min = Math.min(min, matriz[i][j]);
				}
			}
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (min == matriz[i][j]) {
						minN++;
					}
				}
			}
			return new int[] { min, minN };
		}
	}
}