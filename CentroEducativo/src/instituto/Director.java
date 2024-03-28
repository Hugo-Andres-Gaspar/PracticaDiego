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
	public void presentarse() {
		System.out.println("Hola me llamo " + nombre + ".");
	}
	
	@Override
	public void tabajar() {
		System.out.println("Estoy gestionando el departamento " + departamento + ".");
	}
	
	
	
}
