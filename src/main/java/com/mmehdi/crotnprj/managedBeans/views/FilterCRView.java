package com.mmehdi.crotnprj.managedBeans.views;

import com.mmehdi.crotnprj.dal.ChangeReq;
import com.mmehdi.crotnprj.managedBeans.services.ChangeReqService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Mehdi
 */
@Named(value = "filterCRView")
@ViewScoped
public class FilterCRView implements Serializable{
    
    private List<ChangeReq> changeRequests;
    private List<ChangeReq> filteredChangeRequests;
    private List<String> responsablesQualif;

    @ManagedProperty("#crService")
    private ChangeReqService crServ;
    
    @PostConstruct
    public void init() {
        changeRequests = crServ.getAllCRs();
        for(ChangeReq cr : changeRequests) {
            responsablesQualif.add(cr.getRespQualif().getNomRespQualif());
        }
    }
    
    /**
     * Creates a new instance of FilterCRView
     */
    public FilterCRView() {
        int i=33;
        i++;
        i *=2;
        System.out.print(i);
    }

    public List<ChangeReq> getChangeRequests() {
        return changeRequests;
    }

    public void setChangeRequests(List<ChangeReq> changeRequests) {
        this.changeRequests = changeRequests;
    }

    public List<ChangeReq> getFilteredChangeRequests() {
        return filteredChangeRequests;
    }

    public void setFilteredChangeRequests(List<ChangeReq> filteredChangeRequests) {
        this.filteredChangeRequests = filteredChangeRequests;
    }
        
    public List<String> getResponsablesQualif() {
        return responsablesQualif;
    }

    public void setResponsablesQualif(List<String> responsablesQualif) {
        this.responsablesQualif = responsablesQualif;
    }
    
}
