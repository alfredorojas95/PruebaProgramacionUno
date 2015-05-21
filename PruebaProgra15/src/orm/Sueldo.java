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

public class Sueldo {
	public Sueldo() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_SUELDO_JEFEADMINISTRACION) {
			this.jefeadministracion = (orm.Jefeadministracion) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_SUELDO_CURSO_PROFESOR) {
			this.curso_profesor = (orm.Curso_profesor) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Jefeadministracion jefeadministracion;
	
	private orm.Curso_profesor curso_profesor;
	
	private int curso_profesorcursoid;
	
	private int curso_profesorprofesorid;
	
	private Integer monto;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setCurso_profesorcursoid(int value) {
		this.curso_profesorcursoid = value;
	}
	
	public int getCurso_profesorcursoid() {
		return curso_profesorcursoid;
	}
	
	public void setCurso_profesorprofesorid(int value) {
		this.curso_profesorprofesorid = value;
	}
	
	public int getCurso_profesorprofesorid() {
		return curso_profesorprofesorid;
	}
	
	public void setMonto(int value) {
		setMonto(new Integer(value));
	}
	
	public void setMonto(Integer value) {
		this.monto = value;
	}
	
	public Integer getMonto() {
		return monto;
	}
	
	public void setJefeadministracion(orm.Jefeadministracion value) {
		if (jefeadministracion != null) {
			jefeadministracion.sueldo.remove(this);
		}
		if (value != null) {
			value.sueldo.add(this);
		}
	}
	
	public orm.Jefeadministracion getJefeadministracion() {
		return jefeadministracion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Jefeadministracion(orm.Jefeadministracion value) {
		this.jefeadministracion = value;
	}
	
	private orm.Jefeadministracion getORM_Jefeadministracion() {
		return jefeadministracion;
	}
	
	public void setCurso_profesor(orm.Curso_profesor value) {
		if (curso_profesor != null) {
			curso_profesor.sueldo.remove(this);
		}
		if (value != null) {
			value.sueldo.add(this);
		}
	}
	
	public orm.Curso_profesor getCurso_profesor() {
		return curso_profesor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Curso_profesor(orm.Curso_profesor value) {
		this.curso_profesor = value;
	}
	
	private orm.Curso_profesor getORM_Curso_profesor() {
		return curso_profesor;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
