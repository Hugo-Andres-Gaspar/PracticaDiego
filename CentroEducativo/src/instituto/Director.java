package instituto;

public class Director extends Trabajador{
	private int anosExperiencia;
    private String tituloUniversitario;

	public Director(String nombre, String apellidos, String dNI, int edad, String genero, double salario,
			String departamento, String cargo, int anosExperiencia, String tituloUniversitario) {
		super(nombre, apellidos, dNI, edad, genero, salario, departamento, cargo);
		this.anosExperiencia = anosExperiencia;
		this.tituloUniversitario = tituloUniversitario;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}


	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}


	public String getTituloUniversitario() {
		return tituloUniversitario;
	}


	public void setTituloUniversitario(String tituloUniversitario) {
		this.tituloUniversitario = tituloUniversitario;
	}
	
	@Override
	public String toString() {
		return "Director [anosExperiencia=" + anosExperiencia + ", tituloUniversitario=" + tituloUniversitario
				+ ", toString()=" + super.toString() + "]";
	}
	
	public void imprimirDirector() {
		System.out.println(toString());
	}

	@Override
	public void presentarse() {
		System.out.println("Hola me llamo " + nombre + ".");
	}
	
	@Override
	public void trabajar() {
		System.out.println("Estoy gestionando el departamento " + departamento + ".");
	}
	
	public void darOrdenes(Profesor profesor, String orden) {
		System.out.println("El director " + nombre + " le dice al profesor " + profesor.getNombre() + ": " + orden);
	}
	
}
