package instituto;

public abstract class Trabajador extends Persona{
	protected double salario;
    protected String departamento;
    protected String cargo;
    
	public Trabajador(String nombre, String apellidos, String dNI, int edad, String genero, double salario,
			String departamento, String cargo) {
		super(nombre, apellidos, dNI, edad, genero);
		this.salario = salario;
		this.departamento = departamento;
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public abstract void tabajar();

	@Override
	public String toString() {
		return "Trabajador [salario=" + salario + ", departamento=" + departamento + ", cargo=" + cargo
				+ ", toString()=" + super.toString() + "]";
	}
	
    public void imprimirTrabajador() {
    	System.out.println(toString());
    }
}
