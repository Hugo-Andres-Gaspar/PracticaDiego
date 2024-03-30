package instituto;

public class Profesor extends Trabajador{
	private String materiaDada;
    private String especialidad;
    private int horasSemanales;

    // Constructor de la clase Profesor
    /**
     * 
     * @param nombre
     * @param apellidos
     * @param dNI
     * @param edad
     * @param genero
     * @param salario
     * @param departamento
     * @param cargo
     * @param materiaDada
     * @param especialidad
     * @param horasSemanales
     */
	public Profesor(String nombre, String apellidos, String dNI, int edad, String genero, double salario,
			String departamento, String cargo, String materiaDada, String especialidad, int horasSemanales) {
		// Llamada al constructor de la clase Trabajador
		super(nombre, apellidos, dNI, edad, genero, salario, departamento, cargo);
		this.materiaDada = materiaDada;
		this.especialidad = especialidad;
		this.horasSemanales = horasSemanales;
	}

	// Metodos de acceso para la materia dada
	public String getMateriaDada() {
		return materiaDada;
	}

	public void setMateriaDada(String materiaDada) {
		this.materiaDada = materiaDada;
	}

	// Metodos de acceso para la especialidad
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	// Metodos de acceso para las horas semanales
	public int getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}

	@Override
	public String toString() {
		return "Profesor [materiaDada=" + materiaDada + ", especialidad=" + especialidad + ", horasSemanales="
				+ horasSemanales + ", toString()=" + super.toString() + "]";
	}
	
	// Metodo que implementa el toString para imprimir los detalles del Profesor
	public void imprimirProfesor() {
		System.out.println(toString());
	}

	@Override
	public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y soy profesor.");		
	}

	@Override
	public void trabajar() {
		System.out.println("Enseño la materia de " + materiaDada + ".");
	}
	
}
