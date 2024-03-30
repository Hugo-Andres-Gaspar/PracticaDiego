package instituto;

public class Alumno extends Persona {
	private int grado;
    private String nivelEducativo;
    private boolean matriculado;

    // Constructor de la clase Alumno
    /**
     * 
     * @param nombre
     * @param apellidos
     * @param dNI
     * @param edad
     * @param genero
     * @param grado
     * @param nivelEducativo
     * @param matriculado
     */
	public Alumno(String nombre, String apellidos, String dNI, int edad, String genero, int grado,
			String nivelEducativo, boolean matriculado) {
		// Llamada al constructor de la clase Persona
		super(nombre, apellidos, dNI, edad, genero);
		this.grado = grado;
		this.nivelEducativo = nivelEducativo;
		this.matriculado = matriculado;
	}

	// Metodos de acceso para el grado
	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	// Metodos de acceso para el nivel educativo
	public String getNivelEducativo() {
		return nivelEducativo;
	}

	public void setNivelEducativo(String nivelEducativo) {
		this.nivelEducativo = nivelEducativo;
	}
	
	// Metodos para saber si esta o no matriculado 
	public boolean isMatriculado() {
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

	@Override
	public String toString() {
		return "Alumno [grado=" + grado + ", nivelEducativo=" + nivelEducativo + ", matriculado=" + matriculado
				+ ", toString()=" + super.toString() + "]";
	}
	
	// Metodo que implementa el toString para imprimir los detalles del Alumno
	public void imprimirAlumno() {
		System.out.println(toString());
	}

	@Override
	public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y soy un alumno.");		
	}
	
	// Metodo para consultar el estado del alumno
	public void consultarEstadoAlumno() {
		if (matriculado) {
			System.out.println(nombre + " está matriculado en el nivel educativo de " + nivelEducativo + " y está en el grado " + grado + ".");
		} else {
			System.out.println(nombre + " no está matriculado.");
		}
	}
}
