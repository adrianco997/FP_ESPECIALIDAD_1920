package primeraPaquete;

public class Perro {
	// Atributos
	boolean sexo_masculino;
	int peso;
	double altura;
	String fecha_nacimiento;
	String raza;

	// Métodos Principales source->generate getters and setters
	public boolean isSexo_masculino() {
		return sexo_masculino;
	}

	public void setSexo_masculino(boolean sexo_masculino) {
		this.sexo_masculino = sexo_masculino;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	// Métodos Secundarios
	public Perro() {
		// this.sexo_masculino = false;
		// this.peso = 50;
		// this.altura = 0.40;
		// this.fecha_nacimiento = "01/02/2005";
		// this.raza = "perro salchicha";
	}

	public Perro(boolean sexo_masculino, int peso, double altura, String fecha_nacimiento, String raza) {
		this.sexo_masculino = sexo_masculino;
		this.peso = peso;
		this.altura = altura;
		this.fecha_nacimiento = fecha_nacimiento;
		this.raza = raza;
	}

	public Perro(Perro _old) {
		this.sexo_masculino = _old.isSexo_masculino();
		this.peso = _old.getPeso();
		this.altura = _old.getAltura();
		this.fecha_nacimiento = _old.getFecha_nacimiento();
		this.raza = _old.getRaza();
	}

	void mostrarInfo() {
		System.out.println("Mostramos la información del perro");
		System.out.println("Altura: " + getAltura());
		System.out.println("Peso: " + getPeso());
		System.out.println("Fecha nacimiento: " + getFecha_nacimiento());
		System.out.println("Su raza es: " + getRaza());
		if (isSexo_masculino()) {
			System.out.println("Su género masculino");
		} else {
			System.out.println("Su género femenino");
		}
	}
}
