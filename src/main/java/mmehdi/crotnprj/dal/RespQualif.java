package mmehdi.crotnprj.dal;

import java.io.Serializable;

/**
 *
 * @author MMehdi
 */
public class RespQualif implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nomRespQualif;

    public RespQualif(String nomRespQualif) {
        this.nomRespQualif = nomRespQualif;
    }

    public String getNomRespQualif() {
        return nomRespQualif;
    }

    public void setNomRespQualif(String nomRespQualif) {
        this.nomRespQualif = nomRespQualif;
    }
    
}
