package mmehdi.crotnprj.CDIsBackingBeans;

import mmehdi.crotnprj.dal.ChangeReq;
import mmehdi.crotnprj.ejbservices.ChangeReqServiceEJB;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import mmehdi.crotnprj.dal.BeanToSave;

/**
 *
 * @author Mehdi
 */
@RequestScoped
@Named(value = "createChangeReq")
public class AddCR implements Serializable{
    
    private static final long serialVersionUID = -95577100264326388L;
    
    private ChangeReq changeRequest;
    private BeanToSave beanToSave;

    @Inject
    private ChangeReqServiceEJB crService;
    
    @PostConstruct
    public void init() {
        changeRequest = new ChangeReq();
        beanToSave = new BeanToSave();
    }
    
    public void doAddCr() {
        System.out.println("Adding new CR");
        //crService.insertCR(changeRequest);
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

    public BeanToSave getBeanToSave() {
        return beanToSave;
    }

    public void setBeanToSave(BeanToSave beanToSave) {
        this.beanToSave = beanToSave;
    }
    
    private String testValue = "Greenlight";

    public String getTestValue() {
        return testValue;
    }

    public void setTestValue(String testValue) {
        this.testValue = testValue;
    }
}
