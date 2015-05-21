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
public class EstudianteTest {

	/**
	 * Test method for {@link Diagramarefinado.Academico.StaffAcademico.Estudiante#agregarNuevoEstudiante(Diagramarefinado.Persona.Persona, java.lang.String)}.
	 */
	@Test
	public void testAgregarNuevoEstudiante() {
		/*
		 * prueba en que se agrega exitosamente un nuevo estudiante
		 */
		String resultado="";
		resultado = Estudiante.agregarNuevoEstudiante(new Persona("Manuel","Rojas","237657658"), "765546543");
		assertTrue(resultado=="se agregó exitosamente el estudiante");
		
		
		/*
		 * prueba en la que el rut ya había sido ingresado
		 */
//		String resultado2="";
//		resultado2 = Estudiante.agregarNuevoEstudiante(new Persona("Javier","Machuca","144894139"), "765546543");
//		assertTrue(resultado2=="no se pudo agregar el estudiante");
		
	}

}
