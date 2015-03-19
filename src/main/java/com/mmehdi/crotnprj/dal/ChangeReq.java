package com.mmehdi.crotnprj.dal;

import java.util.Calendar;
import java.util.List;

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
    
    private List<AccesSysteme> accesSystemes;
    private List<Ressource> ressources;
}
