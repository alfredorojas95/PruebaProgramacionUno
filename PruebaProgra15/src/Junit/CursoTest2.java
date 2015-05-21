/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Academico.Curso;

/**
 * @author Alfredo
 *
 */
public class CursoTest2 {

	/**
	 * Test method for {@link Diagramarefinado.Academico.Curso#asignarProfesor(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAsignarProfesor() {
		
		/*
		 * prueba en donde se le asigna un profesor a un curso
		 * 
		 */
		String resultado="";
		resultado =Curso.asignarProfesor(27,"Matemática","165457684");
		assertTrue(resultado=="profesor asignado");
		
		/*
		 * prueba en donde no se puede asignar profesor porque el id no existe
		 * o el rut no pertenece a algun profesor
		 */
//		String resultado2="";
//		resultado2 =Curso.asignarProfesor(10,"Economía","127646522");
//		assertTrue(resultado2=="no se pudo asignar el profesor");
	}

}
