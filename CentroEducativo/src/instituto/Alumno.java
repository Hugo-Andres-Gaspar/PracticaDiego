package instituto;

public class Alumno extends Persona {
	private int grado;
    private String nivelEducativo;
    private boolean matriculado;

	public Alumno(String nombre, String apellidos, String dNI, int edad, String genero, int grado,
			String nivelEducativo, boolean matriculado) {
		super(nombre, apellidos, dNI, edad, genero);
		this.grado = grado;
		this.nivelEducativo = nivelEducativo;
		this.matriculado = matriculado;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public String getNivelEducativo() {
		return nivelEducativo;
	}

	public void setNivelEducativo(String nivelEducativo) {
		this.nivelEducativo = nivelEducativo;
	}

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
	
	public void imprimirAlumno() {
		System.out.println(toString());
	}

	@Override
	public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y soy un alumno.");		
	}
	
	public void consultarEstadoAlumno() {
		if (matriculado) {
			System.out.println(nombre + " está matriculado en el nivel educativo de " + nivelEducativo + " y está en el grado " + grado + ".");
		} else {
			System.out.println(nombre + " no está matriculado.");
		}
	}
}
