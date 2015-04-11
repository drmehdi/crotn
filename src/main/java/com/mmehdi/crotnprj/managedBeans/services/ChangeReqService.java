package com.mmehdi.crotnprj.managedBeans.services;

import com.mmehdi.crotnprj.dal.ChangeReq;
import com.mmehdi.crotnprj.dal.RespQualif;
import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Mehdi
 */
@Named(value = "crService")
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
