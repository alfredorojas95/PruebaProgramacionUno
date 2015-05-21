package servicios;

import Diagramarefinado.Academico.Curso;

public class ServicioCrearCurso {

	/**
	 * este método crea un nuevo curso, sólo entregándole un nombre
	 * @param nombre nombre del curso
	 * @return respues confirmación 
	 */
	public String crearCurso(String nombre) {
		// TODO Auto-generated method stub
		return  Curso.crearCurso(new Curso(nombre));
	}
	
	
	/**
	 * este método asigna un profesor a un curso
	 * @param id  código curso
	 * @param nombreCurso  nombre del curso
	 * @param rutProfe  rut del profesor para asignarle un curso
	 * @return respuesta confirmación
	 */
	public String asignarProfesor(int id, String nombreCurso,String rutProfe) {
		return Curso.asignarProfesor(id, nombreCurso, rutProfe);
	}
}
