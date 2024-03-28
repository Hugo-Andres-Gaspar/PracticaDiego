package instituto;

import java.util.Scanner;

public abstract class Persona {
	protected String nombre;
	protected String apellidos;
	protected String DNI;
	protected int edad;
    protected String genero;
    
	public Persona(String nombre, String apellidos, String dNI, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
		this.edad = edad;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public int getEdad() {
		return edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
    
	public abstract void presentarse();
    
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", edad=" + edad
				+ ", genero=" + genero + "]";
	}
	
	public void imprimirPersona() {
		System.out.println(toString());
	}
	
	// Metodo para calcular la edad en base a la fecha actual
	// Para hacer este metodo me he apoyado en chatgpt
	public int calcularEdad() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el año de nacimiento: ");
		int anoNacimiento = teclado.nextInt();
		
		System.out.print("Ingrese el mes de nacimiento: ");
		int mesNacimiento = teclado.nextInt();
		
		System.out.print("Ingrese su dia de nacimiento: ");
		int diaNacimiento = teclado.nextInt();
		
		teclado.close();
		
		int anioActual = java.time.LocalDate.now().getYear();
        int mesActual = java.time.LocalDate.now().getMonthValue();
        int diaActual = java.time.LocalDate.now().getDayOfMonth();

        int edad = anioActual - anoNacimiento;
        
        if (mesNacimiento > mesActual || (mesNacimiento == mesActual && diaNacimiento > diaActual)) {
            edad--;
        }

        return edad;
	}
	
	// Metodo para comprobar si es mayor de edad
	public boolean  esMayorEdad() {
		return calcularEdad() >= 18;
	}
}
