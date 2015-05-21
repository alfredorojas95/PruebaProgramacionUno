/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateDiagramaetpmData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.DiagramaetpmPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Mensualidad lormMensualidad = orm.MensualidadDAO.createMensualidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estudiante_cursocursoid, estudiante_cursoestudianteid, estudiante_curso
			orm.MensualidadDAO.save(lormMensualidad);
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.createEstudiante();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : matricula, estudiante_curso
			orm.EstudianteDAO.save(lormEstudiante);
			orm.Curso lormCurso = orm.CursoDAO.createCurso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : curso_profesor, estudiante_curso
			orm.CursoDAO.save(lormCurso);
			orm.Profesor lormProfesor = orm.ProfesorDAO.createProfesor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : curso_profesor
			orm.ProfesorDAO.save(lormProfesor);
			orm.Matricula lormMatricula = orm.MatriculaDAO.createMatricula();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estudiante
			orm.MatriculaDAO.save(lormMatricula);
			orm.Secretaria lormSecretaria = orm.SecretariaDAO.createSecretaria();
			// Initialize the properties of the persistent object here
			orm.SecretariaDAO.save(lormSecretaria);
			orm.Persona lormPersona = orm.PersonaDAO.createPersona();
			// Initialize the properties of the persistent object here
			orm.PersonaDAO.save(lormPersona);
			orm.Jefeadministracion lormJefeadministracion = orm.JefeadministracionDAO.createJefeadministracion();
			// Initialize the properties of the persistent object here
			orm.JefeadministracionDAO.save(lormJefeadministracion);
			orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.createEstudiante_curso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mensualidad, curso, estudiante
			orm.Estudiante_cursoDAO.save(lormEstudiante_curso);
			orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.createCurso_profesor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sueldo, profesor, curso
			orm.Curso_profesorDAO.save(lormCurso_profesor);
			orm.Sueldo lormSueldo = orm.SueldoDAO.createSueldo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : curso_profesorprofesorid, curso_profesorcursoid, curso_profesor
			orm.SueldoDAO.save(lormSueldo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateDiagramaetpmData createDiagramaetpmData = new CreateDiagramaetpmData();
			try {
				createDiagramaetpmData.createTestData();
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
