package primeraPaquete;

public class Edificio {
	// Atributos
	String calle;
	String planta;
	String numero;
	int num_habitaciones;
	int metros_cuadrados;
	int cod_postal;

	// Métodos Principales source->generate getters and setters
	public String getCalle() {
		return calle;
	}

	public void setCalle(String _calle) {
		this.calle = _calle;
	}

	public String getPlanta() {
		return planta;
	}

	public void setPlantas(String _planta) {
		this.planta = _planta;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String _numero) {
		this.numero = _numero;
	}

	public int getNum_habitaciones() {
		return num_habitaciones;
	}

	public void setNum_habitaciones(int _num_habitaciones) {
		this.num_habitaciones = _num_habitaciones;
	}

	public int getMetros_cuadrados() {
		return metros_cuadrados;
	}

	public void setMetros_cuadrados(int _metros_cuadrados) {
		this.metros_cuadrados = _metros_cuadrados;
	}

	public int getCod_postal() {
		return cod_postal;
	}

	public void setCod_postal(int _cod_postal) {
		this.cod_postal = _cod_postal;
	}

	// Métodos Secundarios
	public Edificio() {
		// this.setCalle("Plaza de españa, Madrid");
		// this.setPlanta("5");
		// this.setNumero("C");
		// this.setNum_habitaciones(3);
		// this.setMetros_cuadrados(100);
		// this.setCod_postal(1001);
	}

	public Edificio(String _calle, String _planta, String _numero, int _num_habitaciones, int _metros_cuadrados,
			int _cod_postal) {
		this.calle = _calle;
		this.planta = _planta;
		this.numero = _numero;
		this.num_habitaciones = _num_habitaciones;
		this.metros_cuadrados = _metros_cuadrados;
		this.cod_postal = _cod_postal;
	}

	public Edificio(Edificio _old) {
		this.calle = _old.getCalle();
		this.planta = _old.getPlanta();
		this.numero = _old.getNumero();
		this.num_habitaciones = _old.getNum_habitaciones();
		this.metros_cuadrados = _old.getMetros_cuadrados();
		this.cod_postal = _old.getCod_postal();
	}

	void mostrarInfo() {
		System.out.println("Mostramos la información del edificio");
		System.out.println("Calle: " + this.getCalle());
		System.out.println("Planta: " + this.getPlanta() + this.getNumero());
		System.out.println("Numero de habitaciones: " + getNum_habitaciones());
		System.out.println("Metros cuadrados: " + this.getMetros_cuadrados());
		System.out.println("Codigo postal: " + this.getCod_postal());
	}
}
