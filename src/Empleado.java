
public class Empleado {
	private String alias;
	private String apellidos;
	private String nombre;
	private String direccion;
	private String poblacion;
	private String telefono;
	private String movil;
	private String email;
	private String observaciones;
	private String sexo;
	private String fechaNac;
	private String estadoCivil;
	private int hijos;
	private boolean desempleado;
	private String profesion;
	private String nivelAcademico;
	private String lenguaUsual;
	private double ingresosMensuales;
	private double ahorros;
	private double peso;
	private double altura;
	private String cabello;
	private String ojos;
	private boolean fumador;
	private String salud;
	private String aficion1;
	private String aficion2;
	private String caracteristica1;
	private String caracteristica2;
	private String valora1;
	private String valora2;
	private String fobias;
	private String sexualidad;
	private boolean disponible;
	
	public Empleado(String alias, String apellidos, String nombre, String direccion, String poblacion, String telefono,
			String movil, String email, String observaciones, String sexo, String fechaNac, String estadoCivil,
			int hijos, boolean desempleado, String profesion, String nivelAcademico, String lenguaUsual,
			double ingresosMensuales, double ahorros, double peso, double altura, String cabello, String ojos,
			boolean fumador, String salud, String aficion1, String aficion2, String caracteristica1,
			String caracteristica2, String valora1, String valora2, String fobias, String sexualidad,
			boolean disponible) {
		super();
		this.alias = alias;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.telefono = telefono;
		this.movil = movil;
		this.email = email;
		this.observaciones = observaciones;
		this.sexo = sexo;
		this.fechaNac = fechaNac;
		this.estadoCivil = estadoCivil;
		this.hijos = hijos;
		this.desempleado = desempleado;
		this.profesion = profesion;
		this.nivelAcademico = nivelAcademico;
		this.lenguaUsual = lenguaUsual;
		this.ingresosMensuales = ingresosMensuales;
		this.ahorros = ahorros;
		this.peso = peso;
		this.altura = altura;
		this.cabello = cabello;
		this.ojos = ojos;
		this.fumador = fumador;
		this.salud = salud;
		this.aficion1 = aficion1;
		this.aficion2 = aficion2;
		this.caracteristica1 = caracteristica1;
		this.caracteristica2 = caracteristica2;
		this.valora1 = valora1;
		this.valora2 = valora2;
		this.fobias = fobias;
		this.sexualidad = sexualidad;
		this.disponible = disponible;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public boolean isDesempleado() {
		return desempleado;
	}

	public void setDesempleado(boolean desempleado) {
		this.desempleado = desempleado;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getNivelAcademico() {
		return nivelAcademico;
	}

	public void setNivelAcademico(String nivelAcademico) {
		this.nivelAcademico = nivelAcademico;
	}

	public String getLenguaUsual() {
		return lenguaUsual;
	}

	public void setLenguaUsual(String lenguaUsual) {
		this.lenguaUsual = lenguaUsual;
	}

	public double getIngresosMensuales() {
		return ingresosMensuales;
	}

	public void setIngresosMensuales(double ingresosMensuales) {
		this.ingresosMensuales = ingresosMensuales;
	}

	public double getAhorros() {
		return ahorros;
	}

	public void setAhorros(double ahorros) {
		this.ahorros = ahorros;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getCabello() {
		return cabello;
	}

	public void setCabello(String cabello) {
		this.cabello = cabello;
	}

	public String getOjos() {
		return ojos;
	}

	public void setOjos(String ojos) {
		this.ojos = ojos;
	}

	public boolean isFumador() {
		return fumador;
	}

	public void setFumador(boolean fumador) {
		this.fumador = fumador;
	}

	public String getSalud() {
		return salud;
	}

	public void setSalud(String salud) {
		this.salud = salud;
	}

	public String getAficion1() {
		return aficion1;
	}

	public void setAficion1(String aficion1) {
		this.aficion1 = aficion1;
	}

	public String getAficion2() {
		return aficion2;
	}

	public void setAficion2(String aficion2) {
		this.aficion2 = aficion2;
	}

	public String getCaracteristica1() {
		return caracteristica1;
	}

	public void setCaracteristica1(String caracteristica1) {
		this.caracteristica1 = caracteristica1;
	}

	public String getCaracteristica2() {
		return caracteristica2;
	}

	public void setCaracteristica2(String caracteristica2) {
		this.caracteristica2 = caracteristica2;
	}

	public String getValora1() {
		return valora1;
	}

	public void setValora1(String valora1) {
		this.valora1 = valora1;
	}

	public String getValora2() {
		return valora2;
	}

	public void setValora2(String valora2) {
		this.valora2 = valora2;
	}

	public String getFobias() {
		return fobias;
	}

	public void setFobias(String fobias) {
		this.fobias = fobias;
	}

	public String getSexualidad() {
		return sexualidad;
	}

	public void setSexualidad(String sexualidad) {
		this.sexualidad = sexualidad;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Alias: " + alias + " Apellidos: " + apellidos + " Nombre: " + nombre + " Dirección: "
				+ direccion + " Población: " + poblacion + " Teléfono: " + telefono + " Móvil: " + movil + " E-Mail: "
				+ email + " Observaciones: " + observaciones + " Sexo: " + sexo + " Fecha de Nacimiento: " + fechaNac
				+ " Estado Civil: " + estadoCivil + " Hijos: " + hijos + " Desempleado: " + desempleado + " Profesión: "
				+ profesion + " Nivel Académico: " + nivelAcademico + " Lengua Usual: " + lenguaUsual
				+ " Ingresos Mensuales: " + ingresosMensuales + " Ahorros: " + ahorros + " Peso: " + peso + " Altura: "
				+ altura + " Cabello: " + cabello + " Ojos: " + ojos + " Fumador: " + fumador + " Salud: " + salud
				+ " Afición nº1: " + aficion1 + " Afición nº2: " + aficion2 + " Característica nº1: " + caracteristica1
				+ " Característica nº1: " + caracteristica2 + " Valoración nº1: " + valora1 + " Valoración nº2: " + valora2 + " Fobias: "
				+ fobias + " Sexualidad: " + sexualidad + " Disponible: " + disponible;
	}

}
