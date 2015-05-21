package servicios;

import Diagramarefinado.Academico.Curso;

public class ServicioCrearCurso {

	/**
	 * este m�todo crea un nuevo curso, s�lo entreg�ndole un nombre
	 * @param nombre nombre del curso
	 * @return respues confirmaci�n 
	 */
	public String crearCurso(String nombre) {
		// TODO Auto-generated method stub
		return  Curso.crearCurso(new Curso(nombre));
	}
	
	
	/**
	 * este m�todo asigna un profesor a un curso
	 * @param id  c�digo curso
	 * @param nombreCurso  nombre del curso
	 * @param rutProfe  rut del profesor para asignarle un curso
	 * @return respuesta confirmaci�n
	 */
	public String asignarProfesor(int id, String nombreCurso,String rutProfe) {
		return Curso.asignarProfesor(id, nombreCurso, rutProfe);
	}
}
