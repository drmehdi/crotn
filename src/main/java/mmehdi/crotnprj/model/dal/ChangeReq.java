package mmehdi.crotnprj.model.dal;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author MMehdi
 */
//@Entity
@Named(value = "changeRequest")
@RequestScoped
@Table(name = "CHANGE_REQ")
public class ChangeReq implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @NotNull
    @Column(name = "CR_ID")
    private String idCr;
    private String numCr;
    private String nomCr;
    private String descCr;
    private RespMetier respMetier;
    private RespQualif respQualif;
    @Temporal(TemporalType.DATE)
    private Calendar dateVabf;
    @Temporal(TemporalType.DATE)
    private final Calendar dateCreation;
    private boolean isCrClosed;
    
    private List<AccesSysteme> accesSystemes;
    private List<Ressource> ressources;

    public ChangeReq(String numCr, String nomCr, String descCr) {
        this.numCr = numCr;
        this.nomCr = nomCr;
        this.descCr = descCr;
        this.dateCreation = Calendar.getInstance(new Locale("fr", "fr"));
        this.isCrClosed = false;
    }
    
    public ChangeReq() {
        this.dateCreation = Calendar.getInstance(new Locale("fr", "fr"));
    }

    public String getNumCr() {
        return numCr;
    }

    public void setNumCr(String numCr) {
        this.numCr = numCr;
    }

    public String getNomCr() {
        return nomCr;
    }

    public void setNomCr(String nomCr) {
        this.nomCr = nomCr;
    }

    public String getDescCr() {
        return descCr;
    }

    public void setDescCr(String descCr) {
        this.descCr = descCr;
    }

    public RespMetier getRespMetier() {
        return respMetier;
    }

    public void setRespMetier(RespMetier respMetier) {
        this.respMetier = respMetier;
    }

    public RespQualif getRespQualif() {
        return respQualif;
    }

    public void setRespQualif(RespQualif respQualif) {
        this.respQualif = respQualif;
    }

    public Calendar getDateVabf() {
        return dateVabf;
    }

    public void setDateVabf(Calendar dateVabf) {
        this.dateVabf = dateVabf;
    }

    public Calendar getDateCreation() {
        return dateCreation;
    }

    public List<AccesSysteme> getAccesSystemes() {
        return accesSystemes;
    }

    public void setAccesSystemes(List<AccesSysteme> accesSystemes) {
        this.accesSystemes = accesSystemes;
    }

    public List<Ressource> getRessources() {
        return ressources;
    }

    public void setRessources(List<Ressource> ressources) {
        this.ressources = ressources;
    }

    public boolean isIsCrClosed() {
        return isCrClosed;
    }

    public void setIsCrClosed(boolean isCrClosed) {
        this.isCrClosed = isCrClosed;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ChangeReq)) {
            return false;
        } 
        ChangeReq other = (ChangeReq) obj;
        if (!this.idCr.equals(other.idCr)) {
            return false;
        }
        return true;
    }

   @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCr != null ? idCr.hashCode() : 0);
        return hash;
    }
       
    
}
