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

public class MensualidadCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression secretariaId;
	public final AssociationExpression secretaria;
	public final IntegerExpression estudiante_cursoId;
	public final AssociationExpression estudiante_curso;
	public final IntegerExpression estudiante_cursoestudianteid;
	public final IntegerExpression estudiante_cursocursoid;
	
	public MensualidadCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		secretariaId = new IntegerExpression("secretaria.id", this);
		secretaria = new AssociationExpression("secretaria", this);
		estudiante_cursoId = new IntegerExpression("estudiante_curso.id", this);
		estudiante_curso = new AssociationExpression("estudiante_curso", this);
		estudiante_cursoestudianteid = new IntegerExpression("estudiante_cursoestudianteid", this);
		estudiante_cursocursoid = new IntegerExpression("estudiante_cursocursoid", this);
	}
	
	public MensualidadCriteria(PersistentSession session) {
		this(session.createCriteria(Mensualidad.class));
	}
	
	public MensualidadCriteria() throws PersistentException {
		this(orm.DiagramaetpmPersistentManager.instance().getSession());
	}
	
	public SecretariaCriteria createSecretariaCriteria() {
		return new SecretariaCriteria(createCriteria("secretaria"));
	}
	
	public Estudiante_cursoCriteria createEstudiante_cursoCriteria() {
		return new Estudiante_cursoCriteria(createCriteria("estudiante_curso"));
	}
	
	public Mensualidad uniqueMensualidad() {
		return (Mensualidad) super.uniqueResult();
	}
	
	public Mensualidad[] listMensualidad() {
		java.util.List list = super.list();
		return (Mensualidad[]) list.toArray(new Mensualidad[list.size()]);
	}
}

