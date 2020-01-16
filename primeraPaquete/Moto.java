package primeraPaquete;

public class Moto {
	// Atributos
	String modelo;
	String compañia;
	String matricula;
	String ult_revision;
	String color;
	int asientos;

	// Métodos Principales source->generate getters and setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String _modelo) {
		this.modelo = _modelo;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String _compañia) {
		this.compañia = _compañia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String _matricula) {
		this.matricula = _matricula;
	}

	public String getUlt_revision() {
		return ult_revision;
	}

	public void setUlt_revision(String _ult_revision) {
		this.ult_revision = _ult_revision;
	}

	public String getColor() {
		return modelo;
	}

	public void setColor(String _color) {
		this.color = _color;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int _asientos) {
		this.asientos = _asientos;
	}

	// Métodos Secundarios
	public Moto() {
		// this.setModelo("TRK 502 X 2018");
		// this.setCompañia("Benelli");
		// this.setMatricula("Sin matricular");
		// this.setUlt_revision("01/01/2018");
		// this.setColor("Negro");
		// this.setAsientos(2);
	}

	public Moto(String _modelo, String _compañia, String _matricula, String _ult_revision, String _color,
			int _asientos) {
		this.modelo = _modelo;
		this.compañia = _compañia;
		this.matricula = _matricula;
		this.ult_revision = _ult_revision;
		this.color = _color;
		this.asientos = _asientos;
	}

	public Moto(Moto _old) {
		this.modelo = _old.getModelo();
		this.compañia = _old.getCompañia();
		this.matricula = _old.getMatricula();
		this.ult_revision = _old.getUlt_revision();
		this.color = _old.getColor();
		this.asientos = _old.getAsientos();
	}

	void mostrarInfo() {
		System.out.println("Mostramos la información de la moto");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Compañia: " + this.getCompañia());
		System.out.println("Matricula: " + this.getMatricula());
		System.out.println("Ultima revision: " + this.getUlt_revision());
		System.out.println("Asientos: " + this.getAsientos());
		System.out.println("Color: " + this.getColor());
	}
}
