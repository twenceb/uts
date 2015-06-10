/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entityclasses.UTSPersistentManager;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.Application;
import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class GeneralUtility implements Serializable {

    public static void clearsession() {
        try {
            UTSPersistentManager.instance().disposePersistentManager();
        } catch (PersistentException ex) {
            Logger.getLogger(GeneralUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void clearCache() {
        try {
            UTSPersistentManager.instance().getSession().clear();
            UTSPersistentManager.instance().getSession().getSessionFactory().getCache().evictEntityRegions();
            UTSPersistentManager.instance().getSession().getSessionFactory().getCache().evictCollectionRegions();
            UTSPersistentManager.instance().getSession().getSessionFactory().getCache().evictDefaultQueryRegion();
            UTSPersistentManager.instance().getSession().getSessionFactory().getCache().evictQueryRegions();

        } catch (PersistentException ex) {
            Logger.getLogger(GeneralUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Calendar addBusinessDate(Calendar cal, int numBusinessDays) {
        while (numBusinessDays > 0) {
            cal.add(Calendar.DATE, 1);
            numBusinessDays -= 1;
            if (cal.get(Calendar.DAY_OF_WEEK) == 1 || cal.get(Calendar.DAY_OF_WEEK) == 7) {
                numBusinessDays += 1;
            }
        }
        return cal;
    }

    public static SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("ddMMyyyyHmmss");
    }

    

    private Date CurrentDate;

    /**
     * @return the CurrentDate
     */
    public Date getCurrentDate() {
        CurrentDate = new Date();
        return CurrentDate;
    }

    /**
     * @param CurrentDate the CurrentDate to set
     */
    public void setCurrentDate(Date CurrentDate) {
        this.CurrentDate = CurrentDate;
    }
    
    public void refresh() {
        FacesContext context = FacesContext.getCurrentInstance();
        Application application = context.getApplication();
        ViewHandler viewHandler = application.getViewHandler();
        UIViewRoot viewRoot = viewHandler.createView(context, context
                .getViewRoot().getViewId());
        context.setViewRoot(viewRoot);
        context.renderResponse(); //Optional
    }

}
