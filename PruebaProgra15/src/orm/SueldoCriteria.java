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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SueldoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression jefeadministracionId;
	public final AssociationExpression jefeadministracion;
	public final IntegerExpression curso_profesorId;
	public final AssociationExpression curso_profesor;
	public final IntegerExpression curso_profesorcursoid;
	public final IntegerExpression curso_profesorprofesorid;
	public final IntegerExpression monto;
	
	public SueldoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this);
		jefeadministracion = new AssociationExpression("jefeadministracion", this);
		curso_profesorId = new IntegerExpression("curso_profesor.id", this);
		curso_profesor = new AssociationExpression("curso_profesor", this);
		curso_profesorcursoid = new IntegerExpression("curso_profesorcursoid", this);
		curso_profesorprofesorid = new IntegerExpression("curso_profesorprofesorid", this);
		monto = new IntegerExpression("monto", this);
	}
	
	public SueldoCriteria(PersistentSession session) {
		this(session.createCriteria(Sueldo.class));
	}
	
	public SueldoCriteria() throws PersistentException {
		this(orm.DiagramaetpmPersistentManager.instance().getSession());
	}
	
	public JefeadministracionCriteria createJefeadministracionCriteria() {
		return new JefeadministracionCriteria(createCriteria("jefeadministracion"));
	}
	
	public Curso_profesorCriteria createCurso_profesorCriteria() {
		return new Curso_profesorCriteria(createCriteria("curso_profesor"));
	}
	
	public Sueldo uniqueSueldo() {
		return (Sueldo) super.uniqueResult();
	}
	
	public Sueldo[] listSueldo() {
		java.util.List list = super.list();
		return (Sueldo[]) list.toArray(new Sueldo[list.size()]);
	}
}

