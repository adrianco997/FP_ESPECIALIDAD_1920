package primeraPaquete;

public class Persona {
	// Atributos
	/* boolean,int,double,String,void */
	boolean sexo_masculino;
	String nombre;
	String apellido;
	String fecha_nacimiento;
	String nacionalidad;
	double altura;
	int peso;
	String profesion;
	String dni;

	// Métodos Principales source->generate getters and setters
	public boolean isSexo_masculino() {
		return sexo_masculino;
	}

	public void setSexo_masculino(boolean _sexo_masculino) {
		this.sexo_masculino = _sexo_masculino;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String _apellido) {
		this.apellido = _apellido;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String _fecha_nacimiento) {
		this.fecha_nacimiento = _fecha_nacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String _nacionalidad) {
		this.nacionalidad = _nacionalidad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double _altura) {
		this.altura = _altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int _peso) {
		this.peso = _peso;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String _profesion) {
		this.profesion = _profesion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String _dni) {
		this.dni = _dni;
	}

	// Métodos Secundarios
	public Persona() {
	}

	public Persona(boolean _sexo_masculino, String _nombre, String _apellido, String _fecha_nacimiento,
			String _nacionalidad, double _altura, int _peso, String _profesion, String _dni) {
		this.sexo_masculino = _sexo_masculino;
		this.nombre = _nombre;
		this.fecha_nacimiento = _fecha_nacimiento;
		this.nacionalidad = _nacionalidad;
		this.altura = _altura;
		this.peso = _peso;
		this.profesion = _profesion;
		this.dni = _dni;
	}

	public Persona(Persona _old) {
		this.sexo_masculino = _old.isSexo_masculino();
		this.nombre = _old.getNombre();
		this.fecha_nacimiento = _old.getFecha_nacimiento();
		this.nacionalidad = _old.getNacionalidad();
		this.altura = _old.getAltura();
		this.peso = _old.getPeso();
		this.profesion = _old.getProfesion();
		this.dni = _old.getDni();
	}

	void mostrarInfo() {
		System.out.println("Mostramos la información de la persona");
		System.out.println("Nombre: " + getNombre() + " " + getApellido());
		System.out.println("Fecha de nacimiento: " + getFecha_nacimiento());
		System.out.println("Nacionalidad: " + getNacionalidad());
		System.out.println("Altura: " + getAltura());
		System.out.println("Peso: " + getPeso());
		System.out.println("Profesion: " + getProfesion());
		System.out.println("DNI: " + getDni());
		if (isSexo_masculino()) {
			System.out.println("Genero masculino");
		} else {
			System.out.println("Genero femenino");
		}
	}
}
