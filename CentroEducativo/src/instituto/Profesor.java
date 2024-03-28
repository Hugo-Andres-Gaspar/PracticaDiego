package instituto;

public class Profesor extends Trabajador{
	private String materiaDada;
    private String especialidad;
    private int horasSemanales;

	public Profesor(String nombre, String apellidos, String dNI, int edad, String genero, double salario,
			String departamento, String cargo, String materiaDada, String especialidad, int horasSemanales) {
		super(nombre, apellidos, dNI, edad, genero, salario, departamento, cargo);
		this.materiaDada = materiaDada;
		this.especialidad = especialidad;
		this.horasSemanales = horasSemanales;
	}

	public String getMateriaDada() {
		return materiaDada;
	}

	public void setMateriaDada(String materiaDada) {
		this.materiaDada = materiaDada;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

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
	
	public void imprimirProfesor() {
		System.out.println(toString());
	}

	@Override
	public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y soy profesor.");		
	}

	@Override
	public void tabajar() {
		System.out.println("Enseño la materia de " + materiaDada + ".");
	}
	
}
