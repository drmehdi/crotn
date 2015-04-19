package mmehdi.crotnprj.model.backingviews;

import mmehdi.crotnprj.model.dal.ChangeReq;
import mmehdi.crotnprj.model.services.ChangeReqService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Mehdi
 */
@Named(value = "filterCRView")
@RequestScoped
public class FilterCRView implements Serializable{
    
    private List<ChangeReq> changeRequests;
    private List<ChangeReq> filteredChangeRequests;
    private List<String> responsablesQualif = new ArrayList<>();

    @Inject
    private ChangeReqService crService;
    
    @PostConstruct
    public void init() {
        changeRequests = crService.getAllCRs();
        if(changeRequests != null) {
            for(ChangeReq cr : changeRequests) {
                responsablesQualif.add(cr.getRespQualif().getNomRespQualif());
            }
        } else {
            System.out.println("Get all CRs returned null!");
        }
    }
    
    /**
     * Creates a new instance of FilterCRView
     */
    public FilterCRView() {
        int i=33;
        i++;
        i *=2;
        System.out.println(i);
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
