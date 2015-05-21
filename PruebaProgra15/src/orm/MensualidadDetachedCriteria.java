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

public class MensualidadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression secretariaId;
	public final AssociationExpression secretaria;
	public final IntegerExpression estudiante_cursoId;
	public final AssociationExpression estudiante_curso;
	public final IntegerExpression estudiante_cursoestudianteid;
	public final IntegerExpression estudiante_cursocursoid;
	
	public MensualidadDetachedCriteria() {
		super(orm.Mensualidad.class, orm.MensualidadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		secretariaId = new IntegerExpression("secretaria.id", this.getDetachedCriteria());
		secretaria = new AssociationExpression("secretaria", this.getDetachedCriteria());
		estudiante_cursoId = new IntegerExpression("estudiante_curso.id", this.getDetachedCriteria());
		estudiante_curso = new AssociationExpression("estudiante_curso", this.getDetachedCriteria());
		estudiante_cursoestudianteid = new IntegerExpression("estudiante_cursoestudianteid", this.getDetachedCriteria());
		estudiante_cursocursoid = new IntegerExpression("estudiante_cursocursoid", this.getDetachedCriteria());
	}
	
	public MensualidadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.MensualidadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		secretariaId = new IntegerExpression("secretaria.id", this.getDetachedCriteria());
		secretaria = new AssociationExpression("secretaria", this.getDetachedCriteria());
		estudiante_cursoId = new IntegerExpression("estudiante_curso.id", this.getDetachedCriteria());
		estudiante_curso = new AssociationExpression("estudiante_curso", this.getDetachedCriteria());
		estudiante_cursoestudianteid = new IntegerExpression("estudiante_cursoestudianteid", this.getDetachedCriteria());
		estudiante_cursocursoid = new IntegerExpression("estudiante_cursocursoid", this.getDetachedCriteria());
	}
	
	public SecretariaDetachedCriteria createSecretariaCriteria() {
		return new SecretariaDetachedCriteria(createCriteria("secretaria"));
	}
	
	public Estudiante_cursoDetachedCriteria createEstudiante_cursoCriteria() {
		return new Estudiante_cursoDetachedCriteria(createCriteria("estudiante_curso"));
	}
	
	public Mensualidad uniqueMensualidad(PersistentSession session) {
		return (Mensualidad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mensualidad[] listMensualidad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mensualidad[]) list.toArray(new Mensualidad[list.size()]);
	}
}

