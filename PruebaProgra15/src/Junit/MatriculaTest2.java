package Junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Diagramarefinado.Academico.StaffAcademico.Estudiante;
import Diagramarefinado.Finanza.Matricula;
/**
 * 
 * @author Alfredo
 *
 */

public class MatriculaTest2 {

	@Test
	public void testMostrarMorososMatricula() {
		String resultado="", cadena="";
		orm.Estudiante []mor = null;
		mor = Matricula.mostrarMorososMatricula();
		for (int i=0; i<mor.length; i++){
			cadena += mor[i].getPersona().getNombre()+"   "+mor[i].getPersona().getApellido()+"    "+mor[i].getPersona().getRut()+"\n";
		}
		System.out.println(cadena);
		assertTrue(mor!=null);
	}

}
