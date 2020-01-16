package primeraPaquete;

public class Mueble {
	// Atributos
	double anchura;
	double largura;
	double altura;
	String material;

	// Métodos Principales source->generate getters and setters
	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double _anchura) {
		this.anchura = _anchura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double _largura) {
		this.largura = _largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double _altura) {
		this.altura = _altura;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String _material) {
		this.material = _material;
	}

	// Métodos Secundarios
	public Mueble() {
		// this.setAnchura(1.55);
		// this.setLargura(2);
		// this.setAltura(1.25);
		// this.setMaterial("madera");
	}

	public Mueble(double _anchura, double _largura, double _altura, String _material) {
		this.anchura = _anchura;
		this.largura = _largura;
		this.altura = _altura;
		this.material = _material;
	}

	public Mueble(Mueble _old) {
		super();
		this.anchura = _old.getAnchura();
		this.largura = _old.getLargura();
		this.altura = _old.getAltura();
		this.material = _old.getMaterial();
	}

	void mostrarInfo() {
		System.out.println("Mostramos la información del mueble");
		System.out.println("Anchura: " + this.getAnchura());
		System.out.println("Largura: " + this.getLargura());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Material: " + this.getMaterial());
	}

}
