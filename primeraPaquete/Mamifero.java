package primeraPaquete;

public class Mamifero {
	// Atributos
	boolean sexo_masculino;
	int peso;
	double altura;
	String fecha_nacimiento;
	String especie;
	int tiempo_gestacion_dias;

	// Métodos Principales source->generate getters and setters
	public boolean isSexo_masculino() {
		return sexo_masculino;
	}

	public void setSexo_masculino(boolean _sexo_masculino) {
		this.sexo_masculino = _sexo_masculino;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int _peso) {
		this.peso = _peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double _altura) {
		this.altura = _altura;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String _fecha_nacimiento) {
		this.fecha_nacimiento = _fecha_nacimiento;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String _especie) {
		this.especie = _especie;
	}

	public int getTiempo_gestacion_dias() {
		return tiempo_gestacion_dias;
	}

	public void setTiempo_gestacion_dias(int _tiempo_gestacion_dias) {
		this.tiempo_gestacion_dias = _tiempo_gestacion_dias;
	}

	// Métodos Secundarios
	public Mamifero() {
		// this.setSexo_masculino(true);
		// this.setPeso(10);
		// this.setAltura(1.0);
		// this.setFecha_nacimiento("01/01/2000");
		// this.setEspecie("perro");
		// this.setTiempo_gestacion_dias(270);
	}

	public Mamifero(boolean _sexo_masculino, int _peso, double _altura, String _fecha_nacimiento, String _especie,
			int _tiempo_gestacion_dias) {
		this.sexo_masculino = _sexo_masculino;
		this.peso = _peso;
		this.altura = _altura;
		this.fecha_nacimiento = _fecha_nacimiento;
		this.especie = _especie;
		this.tiempo_gestacion_dias = _tiempo_gestacion_dias;
	}

	public Mamifero(Mamifero _old) {
		this.sexo_masculino = _old.isSexo_masculino();
		this.peso = _old.getPeso();
		this.altura = _old.getAltura();
		this.fecha_nacimiento = _old.getFecha_nacimiento();
		this.especie = _old.getEspecie();
		this.tiempo_gestacion_dias = _old.getTiempo_gestacion_dias();
	}

	void mostrarInfo() {
		System.out.println("Mostramos la información del animal");
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Fecha nacimiento: " + this.getFecha_nacimiento());
		System.out.println("Su especie es: " + this.getEspecie());
		System.out.println("Su tiempo de gestación es de: " + this.getTiempo_gestacion_dias() + " dias.");
		if (this.isSexo_masculino()) {
			System.out.println("Su género masculino");
		} else {
			System.out.println("Su género femenino");
		}
	}

}
