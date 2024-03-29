package instituto;

import java.util.ArrayList;

public class ProgramaInstituto {

	public static void main(String[] args) {
		// Crear arrayList de personas
		ArrayList<Persona> personas = new ArrayList<>();
		
		// Agregar trabajadores
		Director director = new Director("Juan", "García", "12345678A", 45, "Masculino", 50000.0, "Dirección", "Director", 20, "Licenciado en Educación");
		Profesor profesor = new Profesor("Ana", "Martínez", "98765432B", 35, "Femenino", 30000.0, "Educación", "Profesor", "Matemáticas", "Licenciada en Matemáticas", 40);
		personas.add(director);
		personas.add(profesor);
		
		// Agregar alumnos
		Alumno alumno1 = new Alumno("Pedro", "López", "11111111X", 18, "Masculino", 12, "Secundaria", true);
		Alumno alumno2 = new Alumno("María", "Sánchez", "22222222Y", 17, "Femenino", 11, "Secundaria", false);
		personas.add(alumno1);
		personas.add(alumno2);
		
		// Mostrar los datos de todas las personas de la lista
		System.out.println("Detalles de las personas: ");
		for (Persona persona : personas) {
			persona.imprimirPersona();
		}
		
		
		// Mostrar el estodo de todos los alumnos
		System.out.println("Estado de los alumnos: ");
		for (Persona persona : personas) {
			if (persona instanceof Alumno) {
				Alumno alumno = (Alumno) persona;
				alumno.consultarEstadoAlumno();
			}
		}
		
		
		// Mostrar presentacion de todas las personas
		System.out.println("Presentación de las personas: ");
		for (Persona persona : personas) {
			persona.presentarse();
		}
		
		
		// Hacer que un director le de una orden al profesor
		director.darOrdenes(profesor, "Tienes que hacer un examen el dia 10 y el dia 11 hacer una exposicion en el aula 15 a todos los profesores.");
		
		
		//Realizar otras acciones específicas de cada trabajador
		director.tabajar();
		profesor.tabajar();
	}

}
