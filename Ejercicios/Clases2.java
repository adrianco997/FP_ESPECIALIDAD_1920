package Ejercicios;

// Clases: modificadores
// Los modificadores de "cabecera de la clase" son: [public] [final | abstract]
// # public: 	Se pueden crear objetos de esa clase desde cualquier otra parte del programa.
// # abstract: 	No se pueden crear objetos de esa clase, solo de otras que hereden de ella.
// # final: 	Indica que no podrás crear clases que hereden de ella.
//

// Los modificadores de "cuerpo de la clase" son:
// # Modificadores de acceso
// # Modificadores de contenido
// # Otros tipos.
//
// En el cuerpo de una clase, podemos encontrar:
// # Atributos: Especifican los datos que podrá contener una clase.
// # Métodos: 	Implementan las acciones que podrán realizar los objetos.

// Los atributos pueden contener modificadores de acceso: default, public, private, protected
// # default: 	Podrá ser accededido desde todas las clases que estén dentro del mismo (package) que esta clase.
// # public: 	Cualquier clase tiene acceso a ese atributo.
// # private: 	Solo se puede acceder desde dentro de la clase y mediante métodos desde fuera de la clase. 
// # protected: Acceder al atributo desde cualquier subclase de la clase en la que se encuentre declarado el atributo y desde las clases del mismo paquete.
//
// Los atributos pueden contener modificadores de contenido: [static] [final]
// # static: 	Toda la clase compartirá el atributo con igual valor.
// # final: 	Indica que el atributo es una costante. Nombrardo con mayúsculas.
//
// Por ultimo, existen otro tipo de modificadores: transient, volatile
// # transient: Indica que ese atributo no es de tránsito, es decir, su valor no será serializado. Por serializar se entiende al proceso de traducir un conjunto de bytes, información en un fichero, a un objeto.
// # volatile: 	Indica que el valor de la variable puede ser modificado desde diferentes hilos.

//
//
//
//

// Clases: módulos.
// # Los modificadores de acceso, son los mismos y con el mismo significado que los ya vistos en los atributos.
// # Sin embargo, los modificadores de contenido, no tienen el mismo significado:
// ## static: 		Se implementa de la misma forma para todos los objetos de la clase, es decir, pueden ser llamados sin necesidad de tener un objeto de la clase instanciado. Ejemplo: Math.abs(), Character.isDigit(),...
// ## final: 		Método que no permite ser sobreescrito por las clases descencientes, relativo a la herencia.
// ## native: 		Es utilizado para señalar que un método ha sido implementado en código native (lenguaje compilado a máquina).
// ## abstract: 	No require implementación, esta será realizada por sus clases descendientes. Está relacionado con las clases abstractas.
// ## synchronized: Relativo a la concurrencia (llamado multiples veces a la vez), el entorno de ejecución obligará a que, cuando un proceso esté ejecutando ese método, el resto de procesos que tengan que llamar a ese mismo método tengan que esperar a que el proceso termine.

public class Clases2 {
	public static void main(String[] args) {
		System.out.println("aaaaaaaaa");
	}
}

/* public */ class Punto {
	private int abscisa, ordenada;
	public static int cantidadPuntos;
	public final double PI = 3.1416f;

	public Punto() {
		abscisa = 0;
		ordenada = 0;
	}// Punto(){cantidadPuntos++;}

	int getAbscisa() {
		return abscisa;
	}

	void setAbscisa(int x) {
		abscisa = x;
	}

	int getOrdenada() {
		return ordenada;
	}

	void setOrdenada(int y) {
		ordenada = y;
	}
}

class Rectangulo {
	private static int numRectangulos;
	private String nombre;
	public static String nombreFigura = "Rectángulo"; // Nombre clase
	public static double PI = 3.1416;
	public double x1, y1, x2, y2;

//public static int getNumRectangulos()  {return numRectangulos;}
	public static int obtenerNumRectangulos() {
		return numRectangulos;
	}

//public String getNombre()              {return nombre;}
	public String obtenerNombre() {
		return nombre;
	}

	public static String getNombrefigura() {
		return nombreFigura;
	}

	public static double getPi() {
		return PI;
	}

	public double getX1() {
		return x1;
	}

	public double getY1() {
		return y1;
	}

	public double getX2() {
		return x2;
	}

	public double getY2() {
		return y2;
	}

//public static void setNumRectangulos(int numRectangulos) {Rectangulo.numRectangulos = numRectangulos;}
//public void setNombre(String nombre)                     {this.nombre = nombre;}
	public void establecerNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void setNombrefigura(String nombrefigura) {
		nombreFigura = nombrefigura;
	}

	public static void setPi(double pi) {
		PI = pi;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	public double calcularSuperficie() {
		return (double) (x2 - x1) * (y2 - y1);
	}

	public double calcularPerimetro() {
		return (double) 2 * (x2 - x1) + 2 * (y2 - y1);
	}

	public void desplazar(double X, double Y) {
		x1 = x1 + X;
		x2 = x2 + X;
		y1 = y1 + Y;
		y2 = y2 + Y;
	}
}
