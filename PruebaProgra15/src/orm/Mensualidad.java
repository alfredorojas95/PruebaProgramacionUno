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

public class Mensualidad {
	public Mensualidad() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_MENSUALIDAD_SECRETARIA) {
			this.secretaria = (orm.Secretaria) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_MENSUALIDAD_ESTUDIANTE_CURSO) {
			this.estudiante_curso = (orm.Estudiante_curso) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Secretaria secretaria;
	
	private orm.Estudiante_curso estudiante_curso;
	
	private int estudiante_cursoestudianteid;
	
	private int estudiante_cursocursoid;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setEstudiante_cursoestudianteid(int value) {
		this.estudiante_cursoestudianteid = value;
	}
	
	public int getEstudiante_cursoestudianteid() {
		return estudiante_cursoestudianteid;
	}
	
	public void setEstudiante_cursocursoid(int value) {
		this.estudiante_cursocursoid = value;
	}
	
	public int getEstudiante_cursocursoid() {
		return estudiante_cursocursoid;
	}
	
	public void setSecretaria(orm.Secretaria value) {
		if (secretaria != null) {
			secretaria.mensualidad.remove(this);
		}
		if (value != null) {
			value.mensualidad.add(this);
		}
	}
	
	public orm.Secretaria getSecretaria() {
		return secretaria;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Secretaria(orm.Secretaria value) {
		this.secretaria = value;
	}
	
	private orm.Secretaria getORM_Secretaria() {
		return secretaria;
	}
	
	public void setEstudiante_curso(orm.Estudiante_curso value) {
		if (estudiante_curso != null) {
			estudiante_curso.mensualidad.remove(this);
		}
		if (value != null) {
			value.mensualidad.add(this);
		}
	}
	
	public orm.Estudiante_curso getEstudiante_curso() {
		return estudiante_curso;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Estudiante_curso(orm.Estudiante_curso value) {
		this.estudiante_curso = value;
	}
	
	private orm.Estudiante_curso getORM_Estudiante_curso() {
		return estudiante_curso;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
