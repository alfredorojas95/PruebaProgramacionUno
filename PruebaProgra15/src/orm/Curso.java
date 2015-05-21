/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package orm;

public class Curso {
	public Curso() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CURSO_ESTUDIANTE_CURSO) {
			return ORM_estudiante_curso;
		}
		else if (key == orm.ORMConstants.KEY_CURSO_CURSO_PROFESOR) {
			return ORM_curso_profesor;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String nombreCurso;
	
	private java.util.Set ORM_estudiante_curso = new java.util.HashSet();
	
	private java.util.Set ORM_curso_profesor = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombreCurso(String value) {
		this.nombreCurso = value;
	}
	
	public String getNombreCurso() {
		return nombreCurso;
	}
	
	private void setORM_Estudiante_curso(java.util.Set value) {
		this.ORM_estudiante_curso = value;
	}
	
	private java.util.Set getORM_Estudiante_curso() {
		return ORM_estudiante_curso;
	}
	
	public final orm.Estudiante_cursoSetCollection estudiante_curso = new orm.Estudiante_cursoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CURSO_ESTUDIANTE_CURSO, orm.ORMConstants.KEY_ESTUDIANTE_CURSO_CURSO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Curso_profesor(java.util.Set value) {
		this.ORM_curso_profesor = value;
	}
	
	private java.util.Set getORM_Curso_profesor() {
		return ORM_curso_profesor;
	}
	
	public final orm.Curso_profesorSetCollection curso_profesor = new orm.Curso_profesorSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CURSO_CURSO_PROFESOR, orm.ORMConstants.KEY_CURSO_PROFESOR_CURSO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
