/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Academico.Curso;
import Diagramarefinado.Academico.StaffAcademico.Estudiante;
import Diagramarefinado.Persona.Persona;

/**
 * @author Alfredo
 *
 */
public class CursoTest {

	/**
	 * Test method for {@link Diagramarefinado.Academico.Curso#crearCurso(Diagramarefinado.Academico.Curso)}.
	 */
	@Test
	public void testCrearCurso() {
		/*
		 * prueba en la que se crea un curso exitosamente
		 */
		String resultado="";
		resultado =Curso.crearCurso(new Curso("Matemática"));
		assertTrue(resultado=="se creó el curso exitosamente");
	}

}
