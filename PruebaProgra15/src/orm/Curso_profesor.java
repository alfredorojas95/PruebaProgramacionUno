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

public class Curso_profesor {
	public Curso_profesor() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CURSO_PROFESOR_SUELDO) {
			return ORM_sueldo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CURSO_PROFESOR_CURSO) {
			this.curso = (orm.Curso) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_CURSO_PROFESOR_PROFESOR) {
			this.profesor = (orm.Profesor) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Curso curso;
	
	private orm.Profesor profesor;
	
	private java.util.Set ORM_sueldo = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setCurso(orm.Curso value) {
		if (curso != null) {
			curso.curso_profesor.remove(this);
		}
		if (value != null) {
			value.curso_profesor.add(this);
		}
	}
	
	public orm.Curso getCurso() {
		return curso;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Curso(orm.Curso value) {
		this.curso = value;
	}
	
	private orm.Curso getORM_Curso() {
		return curso;
	}
	
	public void setProfesor(orm.Profesor value) {
		if (profesor != null) {
			profesor.curso_profesor.remove(this);
		}
		if (value != null) {
			value.curso_profesor.add(this);
		}
	}
	
	public orm.Profesor getProfesor() {
		return profesor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Profesor(orm.Profesor value) {
		this.profesor = value;
	}
	
	private orm.Profesor getORM_Profesor() {
		return profesor;
	}
	
	private void setORM_Sueldo(java.util.Set value) {
		this.ORM_sueldo = value;
	}
	
	private java.util.Set getORM_Sueldo() {
		return ORM_sueldo;
	}
	
	public final orm.SueldoSetCollection sueldo = new orm.SueldoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CURSO_PROFESOR_SUELDO, orm.ORMConstants.KEY_SUELDO_CURSO_PROFESOR, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
