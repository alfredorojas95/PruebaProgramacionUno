/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Diagramarefinado.Persona.Persona;
import Diagramarefinado.StaffAdministracion.JefeAdm;
import Diagramarefinado.StaffAdministracion.Secretaria;

/**
 * @author Alfredo
 *
 */
public class JefeAdmTest {

	/**
	 * Test method for {@link Diagramarefinado.StaffAdministracion.JefeAdm#agregarJefeAdm(Diagramarefinado.Persona.Persona)}.
	 */
	@Test
	public void testAgregarJefeAdm() {
		
		/*
		 * prueba para agregar un Jefe de Administración a la base de datos
		 */	
		String resultado="";
		resultado =JefeAdm.agregarJefeAdm(new Persona("Adolfo","Gatica","115749802"));
		assertTrue(resultado=="se ingresó el jede de administración");
		
		
		/*
		 * prueba para mensaje de error (rut repetido en la base de datos)
		 */	
		String resultado2="";
		resultado2 =JefeAdm.agregarJefeAdm(new Persona("Felipe","Arias","186548454"));
		assertTrue(resultado2=="el rut del jefe de administracion ya existía");
		
	}

}
