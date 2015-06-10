/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.Survey_response;
import entityclasses.UTSPersistentManager;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 *
 * @author btwesigye
 */
@ManagedBean(name = "survey_responseBean")
@SessionScoped
public class Survey_responseBean implements Serializable {

    private Survey_response survey_response;

    /**
     * Creates a new instance of Survey_responseBean
     */
    public Survey_responseBean() {
        survey_response = new Survey_response();
    }

    /**
     * @return the survey_response
     */
    public Survey_response getSurvey_response() {
        return survey_response;
    }

    /**
     * @param survey_response the survey_response to set
     */
    public void setSurvey_response(Survey_response survey_response) {
        this.survey_response = survey_response;
    }

    public void save(int cat, int mod) {//mode:1=SAVE AND CONTINUE,2=SUBMIT cat:1=CUR,2=FOR,3=EXT
        try {
            System.out.println("ENTERED");
            PersistentTransaction t = UTSPersistentManager.instance().getSession().beginTransaction();
            survey_response.setSubmit_dt(new Timestamp(new Date().getTime()));
            if (cat == 1) {
                survey_response.setCat("CUR");
            } else if (cat == 2) {
                survey_response.setCat("FOR");
            } else if (cat == 3) {
                survey_response.setCat("EXT");
            }
            if (survey_response.getResponse_id() > 0) {
                UTSPersistentManager.instance().getSession().merge(survey_response);
                System.out.println("UPDATED");
            } else {
                survey_response.save();
                System.out.println("SAVED");
            }
            t.commit();
            UTSPersistentManager.instance().getSession().evict(survey_response);
            if (mod == 2) {//SUBMIT
                survey_response = new Survey_response();
                FacesContext fc = FacesContext.getCurrentInstance();
                ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) fc.getApplication().getNavigationHandler();
                nav.performNavigation("Submitted?faces-redirect=true");
            } else if (mod == 1) {//SAVE and CONTINUE
                //do nothing
            }

        } catch (PersistentException ex) {
            Logger.getLogger(Survey_responseBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Submit", new FacesMessage(ex.getMessage()));
            GeneralUtility.clearsession();
        }
    }

}
