package instituto;

public abstract class Trabajador extends Persona{
	protected double salario;
    protected String departamento;
    protected String cargo;
    
    // Constructor de la clase Trabajador
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
     */
	public Trabajador(String nombre, String apellidos, String dNI, int edad, String genero, double salario,
			String departamento, String cargo) {
		// Llamada al constructor de la clase persona
		super(nombre, apellidos, dNI, edad, genero);
		this.salario = salario;
		this.departamento = departamento;
		this.cargo = cargo;
	}
	
	// Metdos de acceso para el salario
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Metdos de acceso para el departamento
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	// Metdos de acceso para el cargo
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	// Metodo abstracto que define la accion de trabajar
	// Cada subclase implementa su version de trabajar
	public abstract void trabajar();

	@Override
	public String toString() {
		return "Trabajador [salario=" + salario + ", departamento=" + departamento + ", cargo=" + cargo
				+ ", toString()=" + super.toString() + "]";
	}
	
	// Metodo que implementa el toString para imprimir los detalles del trabajador
    public void imprimirTrabajador() {
    	System.out.println(toString());
    }
    
    // Metodo para calcular el salario anual
    /**
     * 
     * @return
     */
    public double calcularSalarioAnual() {
    	return salario * 12;
    }
}
