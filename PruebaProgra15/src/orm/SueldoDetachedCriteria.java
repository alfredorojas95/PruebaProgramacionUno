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

public class SueldoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression jefeadministracionId;
	public final AssociationExpression jefeadministracion;
	public final IntegerExpression curso_profesorId;
	public final AssociationExpression curso_profesor;
	public final IntegerExpression curso_profesorcursoid;
	public final IntegerExpression curso_profesorprofesorid;
	public final IntegerExpression monto;
	
	public SueldoDetachedCriteria() {
		super(orm.Sueldo.class, orm.SueldoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this.getDetachedCriteria());
		jefeadministracion = new AssociationExpression("jefeadministracion", this.getDetachedCriteria());
		curso_profesorId = new IntegerExpression("curso_profesor.id", this.getDetachedCriteria());
		curso_profesor = new AssociationExpression("curso_profesor", this.getDetachedCriteria());
		curso_profesorcursoid = new IntegerExpression("curso_profesorcursoid", this.getDetachedCriteria());
		curso_profesorprofesorid = new IntegerExpression("curso_profesorprofesorid", this.getDetachedCriteria());
		monto = new IntegerExpression("monto", this.getDetachedCriteria());
	}
	
	public SueldoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.SueldoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this.getDetachedCriteria());
		jefeadministracion = new AssociationExpression("jefeadministracion", this.getDetachedCriteria());
		curso_profesorId = new IntegerExpression("curso_profesor.id", this.getDetachedCriteria());
		curso_profesor = new AssociationExpression("curso_profesor", this.getDetachedCriteria());
		curso_profesorcursoid = new IntegerExpression("curso_profesorcursoid", this.getDetachedCriteria());
		curso_profesorprofesorid = new IntegerExpression("curso_profesorprofesorid", this.getDetachedCriteria());
		monto = new IntegerExpression("monto", this.getDetachedCriteria());
	}
	
	public JefeadministracionDetachedCriteria createJefeadministracionCriteria() {
		return new JefeadministracionDetachedCriteria(createCriteria("jefeadministracion"));
	}
	
	public Curso_profesorDetachedCriteria createCurso_profesorCriteria() {
		return new Curso_profesorDetachedCriteria(createCriteria("curso_profesor"));
	}
	
	public Sueldo uniqueSueldo(PersistentSession session) {
		return (Sueldo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Sueldo[] listSueldo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Sueldo[]) list.toArray(new Sueldo[list.size()]);
	}
}

