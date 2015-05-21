/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Academico.StaffAcademico.Estudiante;
import Diagramarefinado.Finanza.Matricula;
import Diagramarefinado.Persona.Persona;

/**
 * @author Alfredo
 *
 */
public class MatriculaTest {

	/**
	 * Test method for {@link Diagramarefinado.Finanza.Matricula#pagarMatricula(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testPagarMatricula() {
		
		/*
		 * prueba para pagar la matrícula de un estudiante 
		 */
		String resultado="";
		resultado =Matricula.pagarMatricula("186754327", "765546543");
		assertTrue(resultado=="matrícula pagada");
	
		/*
		 * prueba para pagar la matrícula de un estudiante 
		 */
//		String resultado2="";
//		resultado2 =Matricula.pagarMatricula("196457233", "765546543");
//		assertTrue(resultado2=="no se puedo pagar la matrícula");
		
	}

}
