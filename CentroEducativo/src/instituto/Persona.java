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
}
