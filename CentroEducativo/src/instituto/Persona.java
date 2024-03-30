package instituto;

import java.util.Scanner;

public abstract class Persona {
	protected String nombre;
	protected String apellidos;
	protected String DNI;
	protected int edad;
    protected String genero;
    
    // Constructor de la clase Persona
    /**
     * 
     * @param nombre
     * @param apellidos
     * @param dNI
     * @param edad
     * @param genero
     */
	public Persona(String nombre, String apellidos, String dNI, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
		this.edad = edad;
		this.genero = genero;
	}

	// Metodo de acceso para el nombre
	public String getNombre() {
		return nombre;
	}

	// Metodo de acceso para el apellido
	public String getApellidos() {
		return apellidos;
	}

	// Metodo de acceso para el DNI
	public String getDNI() {
		return DNI;
	}

	// Metodos de acceso para la edad
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Metodo de acceso para el genero
	public String getGenero() {
		return genero;
	}
    
	// Metodo abstracto que define la accion presentarse
	// Cada subclase implementa su version de presentarse
	public abstract void presentarse();
    
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", edad=" + edad
				+ ", genero=" + genero + "]";
	}
	
	// Metodo que implementa el toString para imprimir los detalles de la persona
	public void imprimirPersona() {
		System.out.println(toString());
	}
	
	// Metodo para calcular la edad en base a la fecha actual
	// Para hacer este metodo me he apoyado en chatgpt
	public int calcularEdad() {
		// Abro Scanner por teclado
		Scanner teclado = new Scanner(System.in);
		// Pido que ingrese el año, mes y dia de nacimiento
		System.out.print("Ingrese el año de nacimiento: ");
		int anoNacimiento = teclado.nextInt();
		
		System.out.print("Ingrese el mes de nacimiento: ");
		int mesNacimiento = teclado.nextInt();
		
		System.out.print("Ingrese su dia de nacimiento: ");
		int diaNacimiento = teclado.nextInt();
		
		// Cierro Scanner
		teclado.close();
		
		// Obtener el año, mes y día actuales utilizando la clase LocalDate de Java 8
		int anioActual = java.time.LocalDate.now().getYear();
        int mesActual = java.time.LocalDate.now().getMonthValue();
        int diaActual = java.time.LocalDate.now().getDayOfMonth();

        // Iniciacion de variable edad y calculo para ella
        int edad = anioActual - anoNacimiento;
        
        // Ajustar la edad si aún no ha pasado el cumpleaños de este año
        if (mesNacimiento > mesActual || (mesNacimiento == mesActual && diaNacimiento > diaActual)) {
            edad--; // Restar 1 si el cumpleaños aún no ha pasado este año
        }

        // Devolver la edad calculada
        return edad;
	}
	
	// Metodo para comprobar si es mayor de edad
	/**
	 * 
	 * @return
	 */
	public boolean  esMayorEdad() {
		return calcularEdad() >= 18;
	}
}
