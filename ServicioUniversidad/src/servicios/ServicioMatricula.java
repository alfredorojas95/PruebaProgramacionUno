package servicios;

import Diagramarefinado.Finanza.Matricula;

public class ServicioMatricula {

	/**
	 * Este método busca a los alumnos cuyo estado de matrícula se encuentre en '0'
	 * que representa el estado no pagado.
	 * @return string concatenado con todos los alumnos morosos en el pago de matrícula
	 */
	public String mostrarMorososMatricula(){
		String cadena = "";
		orm.Estudiante[] morosos = Matricula.mostrarMorososMatricula();
		for (int i=0; i<morosos.length; i++){
			cadena += morosos[i].getPersona().getNombre()+"   "+morosos[i].getPersona().getApellido()+"    "+morosos[i].getPersona().getRut()+"\n";
		}
		System.out.println(cadena);
		return cadena;
	}
}
