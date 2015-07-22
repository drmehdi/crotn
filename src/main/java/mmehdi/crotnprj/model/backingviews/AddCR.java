package mmehdi.crotnprj.model.backingviews;

import mmehdi.crotnprj.model.dal.ChangeReq;
import mmehdi.crotnprj.model.services.ChangeReqService;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;
import mmehdi.crotnprj.model.dal.BeanToSave;

/**
 *
 * @author Mehdi
 */
@Named(value = "addCR")
@RequestScoped
public class AddCR implements Serializable{
    
    @ManagedProperty(value = "changeRequest")
    private ChangeReq changeRequest;
    
    @ManagedProperty(value = "beanToSave")
    private BeanToSave beanToSave;

    @Inject
    private ChangeReqService crService;
    
    @PostConstruct
    public void init() {

    }
    
    public void addCr() {
        System.out.println("Adding new CR");
        crService.insertCR(changeRequest);
        crService.testInsertCR(beanToSave);
    }
    
    /**
     * Creates a new instance of FilterCRView
     */
    public AddCR() {
        System.out.println("AddCR instanciated");
    }

    public ChangeReq getChangeRequest() {
        return changeRequest;
    }

    public void setChangeRequest(ChangeReq changeRequest) {
        this.changeRequest = changeRequest;
    }    
    
}
