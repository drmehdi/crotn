package mmehdi.crotnprj.model.dal;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author MMehdi
 */
@Entity
@Named(value = "beanToSave")
@RequestScoped
@Table(name = "BEAN_TO_SAVE")
public class BeanToSave implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @NotNull
    @Column(name = "nomBeanTest")
    private String nomBeanTest;
   
    public BeanToSave(String nomBeanTest) {
        this.nomBeanTest = nomBeanTest;
    }
    
    public BeanToSave() {

    }

    public String getNomBeanTest() {
        return nomBeanTest;
    }

    public void setNomBeanTest(String nomBeanTest) {
        this.nomBeanTest = nomBeanTest;
    }
    
}
