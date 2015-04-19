package mmehdi.crotnprj.model.dal;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author MMehdi
 */
public class ChangeReq {
    private String numCr;
    private String nomCr;
    private String descCr;
    private RespMetier respMetier;
    private RespQualif respQualif;
    private Calendar dateVabf;
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
       
    
}
