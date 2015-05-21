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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PersonaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression rut;
	public final IntegerExpression estudianteId;
	public final AssociationExpression estudiante;
	public final IntegerExpression secretariaId;
	public final AssociationExpression secretaria;
	public final IntegerExpression jefeadministracionId;
	public final AssociationExpression jefeadministracion;
	public final IntegerExpression profesorId;
	public final AssociationExpression profesor;
	
	public PersonaDetachedCriteria() {
		super(orm.Persona.class, orm.PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		estudianteId = new IntegerExpression("estudiante.id", this.getDetachedCriteria());
		estudiante = new AssociationExpression("estudiante", this.getDetachedCriteria());
		secretariaId = new IntegerExpression("secretaria.id", this.getDetachedCriteria());
		secretaria = new AssociationExpression("secretaria", this.getDetachedCriteria());
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this.getDetachedCriteria());
		jefeadministracion = new AssociationExpression("jefeadministracion", this.getDetachedCriteria());
		profesorId = new IntegerExpression("profesor.id", this.getDetachedCriteria());
		profesor = new AssociationExpression("profesor", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		estudianteId = new IntegerExpression("estudiante.id", this.getDetachedCriteria());
		estudiante = new AssociationExpression("estudiante", this.getDetachedCriteria());
		secretariaId = new IntegerExpression("secretaria.id", this.getDetachedCriteria());
		secretaria = new AssociationExpression("secretaria", this.getDetachedCriteria());
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this.getDetachedCriteria());
		jefeadministracion = new AssociationExpression("jefeadministracion", this.getDetachedCriteria());
		profesorId = new IntegerExpression("profesor.id", this.getDetachedCriteria());
		profesor = new AssociationExpression("profesor", this.getDetachedCriteria());
	}
	
	public EstudianteDetachedCriteria createEstudianteCriteria() {
		return new EstudianteDetachedCriteria(createCriteria("estudiante"));
	}
	
	public SecretariaDetachedCriteria createSecretariaCriteria() {
		return new SecretariaDetachedCriteria(createCriteria("secretaria"));
	}
	
	public JefeadministracionDetachedCriteria createJefeadministracionCriteria() {
		return new JefeadministracionDetachedCriteria(createCriteria("jefeadministracion"));
	}
	
	public ProfesorDetachedCriteria createProfesorCriteria() {
		return new ProfesorDetachedCriteria(createCriteria("profesor"));
	}
	
	public Persona uniquePersona(PersistentSession session) {
		return (Persona) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona[] listPersona(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

