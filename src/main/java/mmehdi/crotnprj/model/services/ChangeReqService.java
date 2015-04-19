package mmehdi.crotnprj.model.services;

import mmehdi.crotnprj.model.dal.ChangeReq;
import mmehdi.crotnprj.model.dal.RespQualif;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Mehdi
 */
@Dependent
public class ChangeReqService {

public List<ChangeReq> getAllCRs() {
        List<ChangeReq> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ChangeReq cr = new ChangeReq("CR N°" + i, "CR Sim Swap v" + i , "Description: réaliser l'opération de Sim Swap selon la recommandation R_1267_" + i);
            cr.setRespQualif(new RespQualif("Mehdi Mahdi_" + i));
            list.add(cr);
        }
        
        return list;
    }
    
}
