package mmehdi.crotnprj.ejbservices;

import mmehdi.crotnprj.dal.ChangeReq;
import mmehdi.crotnprj.dal.RespQualif;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mmehdi.crotnprj.dal.BeanToSave;

/**
 *
 * @author Mehdi
 */
@Stateless
@Dependent
public class ChangeReqServiceEJB {

    @PersistenceContext(unitName="com.mmehdi_crotnprj_war_1.0PU")
    private EntityManager entityManager;         
    
    public List<ChangeReq> getAllCRs() {
        List<ChangeReq> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ChangeReq cr = new ChangeReq("CR N°" + i, "CR Sim Swap v" + i , "Description: réaliser l'opération de Sim Swap selon la recommandation R_1267_" + i);
            cr.setRespQualif(new RespQualif("Mehdi Mahdi_" + i));
            list.add(cr);
        }
        
        return list;
    }

    public void insertCR(ChangeReq cr) {
        entityManager.persist(cr);
    }

    public void testInsertCR(BeanToSave beanToSave) {
        entityManager.persist(beanToSave);
    }
    
}
