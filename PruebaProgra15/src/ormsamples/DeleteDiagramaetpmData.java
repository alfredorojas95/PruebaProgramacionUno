/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteDiagramaetpmData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.DiagramaetpmPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Mensualidad lormMensualidad = orm.MensualidadDAO.loadMensualidadByQuery(null, null);
			// Delete the persistent object
			orm.MensualidadDAO.delete(lormMensualidad);
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(null, null);
			// Delete the persistent object
			orm.EstudianteDAO.delete(lormEstudiante);
			orm.Curso lormCurso = orm.CursoDAO.loadCursoByQuery(null, null);
			// Delete the persistent object
			orm.CursoDAO.delete(lormCurso);
			orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(null, null);
			// Delete the persistent object
			orm.ProfesorDAO.delete(lormProfesor);
			orm.Matricula lormMatricula = orm.MatriculaDAO.loadMatriculaByQuery(null, null);
			// Delete the persistent object
			orm.MatriculaDAO.delete(lormMatricula);
			orm.Secretaria lormSecretaria = orm.SecretariaDAO.loadSecretariaByQuery(null, null);
			// Delete the persistent object
			orm.SecretariaDAO.delete(lormSecretaria);
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Delete the persistent object
			orm.PersonaDAO.delete(lormPersona);
			orm.Jefeadministracion lormJefeadministracion = orm.JefeadministracionDAO.loadJefeadministracionByQuery(null, null);
			// Delete the persistent object
			orm.JefeadministracionDAO.delete(lormJefeadministracion);
			orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.loadEstudiante_cursoByQuery(null, null);
			// Delete the persistent object
			orm.Estudiante_cursoDAO.delete(lormEstudiante_curso);
			orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.loadCurso_profesorByQuery(null, null);
			// Delete the persistent object
			orm.Curso_profesorDAO.delete(lormCurso_profesor);
			orm.Sueldo lormSueldo = orm.SueldoDAO.loadSueldoByQuery(null, null);
			// Delete the persistent object
			orm.SueldoDAO.delete(lormSueldo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteDiagramaetpmData deleteDiagramaetpmData = new DeleteDiagramaetpmData();
			try {
				deleteDiagramaetpmData.deleteTestData();
			}
			finally {
				orm.DiagramaetpmPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
