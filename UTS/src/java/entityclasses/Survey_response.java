/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Twesigye Wence Benda
 * License Type: Purchased
 */
package entityclasses;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="survey_response")
public class Survey_response implements Serializable {
	public Survey_response() {
	}
	
	public static Survey_response loadSurvey_responseByORMID(int response_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.UTSPersistentManager.instance().getSession();
			return loadSurvey_responseByORMID(session, response_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response getSurvey_responseByORMID(int response_id) throws PersistentException {
		try {
			PersistentSession session = entityclasses.UTSPersistentManager.instance().getSession();
			return getSurvey_responseByORMID(session, response_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response loadSurvey_responseByORMID(int response_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.UTSPersistentManager.instance().getSession();
			return loadSurvey_responseByORMID(session, response_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response getSurvey_responseByORMID(int response_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.UTSPersistentManager.instance().getSession();
			return getSurvey_responseByORMID(session, response_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response loadSurvey_responseByORMID(PersistentSession session, int response_id) throws PersistentException {
		try {
			return (Survey_response) session.load(entityclasses.Survey_response.class, new Integer(response_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response getSurvey_responseByORMID(PersistentSession session, int response_id) throws PersistentException {
		try {
			return (Survey_response) session.get(entityclasses.Survey_response.class, new Integer(response_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response loadSurvey_responseByORMID(PersistentSession session, int response_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Survey_response) session.load(entityclasses.Survey_response.class, new Integer(response_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response getSurvey_responseByORMID(PersistentSession session, int response_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Survey_response) session.get(entityclasses.Survey_response.class, new Integer(response_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySurvey_response(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.UTSPersistentManager.instance().getSession();
			return querySurvey_response(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySurvey_response(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.UTSPersistentManager.instance().getSession();
			return querySurvey_response(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response[] listSurvey_responseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.UTSPersistentManager.instance().getSession();
			return listSurvey_responseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response[] listSurvey_responseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.UTSPersistentManager.instance().getSession();
			return listSurvey_responseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySurvey_response(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Survey_response as Survey_response");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySurvey_response(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Survey_response as Survey_response");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Survey_response", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response[] listSurvey_responseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySurvey_response(session, condition, orderBy);
			return (Survey_response[]) list.toArray(new Survey_response[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response[] listSurvey_responseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySurvey_response(session, condition, orderBy, lockMode);
			return (Survey_response[]) list.toArray(new Survey_response[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response loadSurvey_responseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.UTSPersistentManager.instance().getSession();
			return loadSurvey_responseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response loadSurvey_responseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.UTSPersistentManager.instance().getSession();
			return loadSurvey_responseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response loadSurvey_responseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Survey_response[] survey_responses = listSurvey_responseByQuery(session, condition, orderBy);
		if (survey_responses != null && survey_responses.length > 0)
			return survey_responses[0];
		else
			return null;
	}
	
	public static Survey_response loadSurvey_responseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Survey_response[] survey_responses = listSurvey_responseByQuery(session, condition, orderBy, lockMode);
		if (survey_responses != null && survey_responses.length > 0)
			return survey_responses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSurvey_responseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entityclasses.UTSPersistentManager.instance().getSession();
			return iterateSurvey_responseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSurvey_responseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entityclasses.UTSPersistentManager.instance().getSession();
			return iterateSurvey_responseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSurvey_responseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Survey_response as Survey_response");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSurvey_responseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entityclasses.Survey_response as Survey_response");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Survey_response", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Survey_response loadSurvey_responseByCriteria(Survey_responseCriteria survey_responseCriteria) {
		Survey_response[] survey_responses = listSurvey_responseByCriteria(survey_responseCriteria);
		if(survey_responses == null || survey_responses.length == 0) {
			return null;
		}
		return survey_responses[0];
	}
	
	public static Survey_response[] listSurvey_responseByCriteria(Survey_responseCriteria survey_responseCriteria) {
		return survey_responseCriteria.listSurvey_response();
	}
	
	public static Survey_response createSurvey_response() {
		return new entityclasses.Survey_response();
	}
	
	public boolean save() throws PersistentException {
		try {
			entityclasses.UTSPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			entityclasses.UTSPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			entityclasses.UTSPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			entityclasses.UTSPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	@Column(name="response_id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ENTITYCLASSES_SURVEY_RESPONSE_RESPONSE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITYCLASSES_SURVEY_RESPONSE_RESPONSE_ID_GENERATOR", strategy="native")	
	private int response_id;
	
	@Column(name="cat", nullable=false, length=50)	
	private String cat;
	
	@Column(name="submit_dt", nullable=false)	
	private java.sql.Timestamp submit_dt;
	
	@Column(name="rname", nullable=true, length=50)	
	private String rname;
	
	@Column(name="gender", nullable=true, length=50)	
	private String gender;
	
	@Column(name="agerange", nullable=true, length=10)	
	private Integer agerange;
	
	@Column(name="entityn", nullable=true, length=50)	
	private String entityn;
	
	@Column(name="entityt", nullable=true, length=50)	
	private String entityt;
	
	@Column(name="entityto", nullable=true, length=50)	
	private String entityto;
	
	@Column(name="tyears", nullable=true, length=10)	
	private Integer tyears;
	
	@Column(name="dyear", nullable=true, length=10)	
	private Integer dyear;
	
	@Column(name="cyear", nullable=true, length=10)	
	private Integer cyear;
	
	@Column(name="rank", nullable=true, length=50)	
	private String rank;
	
	@Column(name="department", nullable=true, length=50)	
	private String department;
	
	@Column(name="rship", nullable=true, length=50)	
	private String rship;
	
	@Column(name="rshipother", nullable=true, length=50)	
	private String rshipother;
	
	@Column(name="aware1", nullable=true, length=10)	
	private Integer aware1;
	
	@Column(name="aware2", nullable=true, length=250)	
	private String aware2;
	
	@Column(name="aware3", nullable=true, length=10)	
	private Integer aware3;
	
	@Column(name="aware4", nullable=true, length=250)	
	private String aware4;
	
	@Column(name="aware5", nullable=true, length=10)	
	private Integer aware5;
	
	@Column(name="aware6", nullable=true, length=250)	
	private String aware6;
	
	@Column(name="lead1", nullable=true, length=10)	
	private Integer lead1;
	
	@Column(name="lead2", nullable=true, length=10)	
	private Integer lead2;
	
	@Column(name="lead3", nullable=true, length=10)	
	private Integer lead3;
	
	@Column(name="lead4", nullable=true, length=10)	
	private Integer lead4;
	
	@Column(name="lead5", nullable=true, length=10)	
	private Integer lead5;
	
	@Column(name="lead6", nullable=true, length=10)	
	private Integer lead6;
	
	@Column(name="lead7", nullable=true, length=10)	
	private Integer lead7;
	
	@Column(name="lead8", nullable=true, length=10)	
	private Integer lead8;
	
	@Column(name="lead9", nullable=true, length=10)	
	private Integer lead9;
	
	@Column(name="lead10", nullable=true, length=10)	
	private Integer lead10;
	
	@Column(name="lead11", nullable=true, length=250)	
	private String lead11;
	
	@Column(name="lead12", nullable=true, length=250)	
	private String lead12;
	
	@Column(name="motiv1", nullable=true, length=10)	
	private Integer motiv1;
	
	@Column(name="motiv2", nullable=true, length=10)	
	private Integer motiv2;
	
	@Column(name="motiv3", nullable=true, length=10)	
	private Integer motiv3;
	
	@Column(name="motiv4", nullable=true, length=10)	
	private Integer motiv4;
	
	@Column(name="motiv5", nullable=true, length=10)	
	private Integer motiv5;
	
	@Column(name="motiv6", nullable=true, length=10)	
	private Integer motiv6;
	
	@Column(name="motiv7", nullable=true, length=10)	
	private Integer motiv7;
	
	@Column(name="motiv8", nullable=true, length=10)	
	private Integer motiv8;
	
	@Column(name="motiv9", nullable=true, length=250)	
	private String motiv9;
	
	@Column(name="motiv10", nullable=true, length=250)	
	private String motiv10;
	
	@Column(name="service1", nullable=true, length=10)	
	private Integer service1;
	
	@Column(name="service2", nullable=true, length=10)	
	private Integer service2;
	
	@Column(name="service3", nullable=true, length=10)	
	private Integer service3;
	
	@Column(name="service4", nullable=true, length=10)	
	private Integer service4;
	
	@Column(name="service5", nullable=true, length=10)	
	private Integer service5;
	
	@Column(name="service6", nullable=true, length=10)	
	private Integer service6;
	
	@Column(name="service7", nullable=true, length=250)	
	private String service7;
	
	@Column(name="service8", nullable=true, length=250)	
	private String service8;
	
	@Column(name="expose1", nullable=true, length=10)	
	private Integer expose1;
	
	@Column(name="expose2", nullable=true, length=10)	
	private Integer expose2;
	
	@Column(name="expose3", nullable=true, length=10)	
	private Integer expose3;
	
	@Column(name="expose4", nullable=true, length=10)	
	private Integer expose4;
	
	@Column(name="expose5", nullable=true, length=10)	
	private Integer expose5;
	
	@Column(name="expose6", nullable=true, length=10)	
	private Integer expose6;
	
	@Column(name="expose7", nullable=true, length=250)	
	private String expose7;
	
	@Column(name="expose8", nullable=true, length=250)	
	private String expose8;
	
	@Column(name="parter1", nullable=true, length=10)	
	private Integer parter1;
	
	@Column(name="parter2", nullable=true, length=10)	
	private Integer parter2;
	
	@Column(name="parter3", nullable=true, length=10)	
	private Integer parter3;
	
	@Column(name="parter4", nullable=true, length=10)	
	private Integer parter4;
	
	@Column(name="parter5", nullable=true, length=10)	
	private Integer parter5;
	
	@Column(name="parter6", nullable=true, length=10)	
	private Integer parter6;
	
	@Column(name="parter7", nullable=true, length=10)	
	private Integer parter7;
	
	@Column(name="parter8", nullable=true, length=250)	
	private String parter8;
	
	@Column(name="parter9", nullable=true, length=250)	
	private String parter9;
	
	@Column(name="parter10", nullable=true, length=250)	
	private String parter10;
	
	@Column(name="rankfact1", nullable=true, length=250)	
	private String rankfact1;
	
	@Column(name="rankfact2", nullable=true, length=10)	
	private Integer rankfact2;
	
	@Column(name="rankfact3", nullable=true, length=10)	
	private Integer rankfact3;
	
	@Column(name="rankfact4", nullable=true, length=10)	
	private Integer rankfact4;
	
	@Column(name="rankfact5", nullable=true, length=10)	
	private Integer rankfact5;
	
	@Column(name="rankfact6", nullable=true, length=10)	
	private Integer rankfact6;
	
	@Column(name="rankfact7", nullable=true, length=250)	
	private String rankfact7;
	
	@Column(name="wayf1", nullable=true, length=10)	
	private Integer wayf1;
	
	@Column(name="wayf2", nullable=true, length=250)	
	private String wayf2;
	
	@Column(name="wayf3", nullable=true, length=250)	
	private String wayf3;
	
	@Column(name="wayf4", nullable=true, length=250)	
	private String wayf4;
	
	private void setResponse_id(int value) {
		this.response_id = value;
	}
	
	public int getResponse_id() {
		return response_id;
	}
	
	public int getORMID() {
		return getResponse_id();
	}
	
	public void setCat(String value) {
		this.cat = value;
	}
	
	public String getCat() {
		return cat;
	}
	
	public void setSubmit_dt(java.sql.Timestamp value) {
		this.submit_dt = value;
	}
	
	public java.sql.Timestamp getSubmit_dt() {
		return submit_dt;
	}
	
	public void setRname(String value) {
		this.rname = value;
	}
	
	public String getRname() {
		return rname;
	}
	
	public void setGender(String value) {
		this.gender = value;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setAgerange(int value) {
		setAgerange(new Integer(value));
	}
	
	public void setAgerange(Integer value) {
		this.agerange = value;
	}
	
	public Integer getAgerange() {
		return agerange;
	}
	
	public void setEntityn(String value) {
		this.entityn = value;
	}
	
	public String getEntityn() {
		return entityn;
	}
	
	public void setEntityt(String value) {
		this.entityt = value;
	}
	
	public String getEntityt() {
		return entityt;
	}
	
	public void setEntityto(String value) {
		this.entityto = value;
	}
	
	public String getEntityto() {
		return entityto;
	}
	
	public void setTyears(int value) {
		setTyears(new Integer(value));
	}
	
	public void setTyears(Integer value) {
		this.tyears = value;
	}
	
	public Integer getTyears() {
		return tyears;
	}
	
	public void setDyear(int value) {
		setDyear(new Integer(value));
	}
	
	public void setDyear(Integer value) {
		this.dyear = value;
	}
	
	public Integer getDyear() {
		return dyear;
	}
	
	public void setCyear(int value) {
		setCyear(new Integer(value));
	}
	
	public void setCyear(Integer value) {
		this.cyear = value;
	}
	
	public Integer getCyear() {
		return cyear;
	}
	
	public void setRank(String value) {
		this.rank = value;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setDepartment(String value) {
		this.department = value;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setRship(String value) {
		this.rship = value;
	}
	
	public String getRship() {
		return rship;
	}
	
	public void setRshipother(String value) {
		this.rshipother = value;
	}
	
	public String getRshipother() {
		return rshipother;
	}
	
	public void setAware1(int value) {
		setAware1(new Integer(value));
	}
	
	public void setAware1(Integer value) {
		this.aware1 = value;
	}
	
	public Integer getAware1() {
		return aware1;
	}
	
	public void setAware2(String value) {
		this.aware2 = value;
	}
	
	public String getAware2() {
		return aware2;
	}
	
	public void setAware3(int value) {
		setAware3(new Integer(value));
	}
	
	public void setAware3(Integer value) {
		this.aware3 = value;
	}
	
	public Integer getAware3() {
		return aware3;
	}
	
	public void setAware4(String value) {
		this.aware4 = value;
	}
	
	public String getAware4() {
		return aware4;
	}
	
	public void setAware5(int value) {
		setAware5(new Integer(value));
	}
	
	public void setAware5(Integer value) {
		this.aware5 = value;
	}
	
	public Integer getAware5() {
		return aware5;
	}
	
	public void setAware6(String value) {
		this.aware6 = value;
	}
	
	public String getAware6() {
		return aware6;
	}
	
	public void setLead1(int value) {
		setLead1(new Integer(value));
	}
	
	public void setLead1(Integer value) {
		this.lead1 = value;
	}
	
	public Integer getLead1() {
		return lead1;
	}
	
	public void setLead2(int value) {
		setLead2(new Integer(value));
	}
	
	public void setLead2(Integer value) {
		this.lead2 = value;
	}
	
	public Integer getLead2() {
		return lead2;
	}
	
	public void setLead3(int value) {
		setLead3(new Integer(value));
	}
	
	public void setLead3(Integer value) {
		this.lead3 = value;
	}
	
	public Integer getLead3() {
		return lead3;
	}
	
	public void setLead4(int value) {
		setLead4(new Integer(value));
	}
	
	public void setLead4(Integer value) {
		this.lead4 = value;
	}
	
	public Integer getLead4() {
		return lead4;
	}
	
	public void setLead5(int value) {
		setLead5(new Integer(value));
	}
	
	public void setLead5(Integer value) {
		this.lead5 = value;
	}
	
	public Integer getLead5() {
		return lead5;
	}
	
	public void setLead6(int value) {
		setLead6(new Integer(value));
	}
	
	public void setLead6(Integer value) {
		this.lead6 = value;
	}
	
	public Integer getLead6() {
		return lead6;
	}
	
	public void setLead7(int value) {
		setLead7(new Integer(value));
	}
	
	public void setLead7(Integer value) {
		this.lead7 = value;
	}
	
	public Integer getLead7() {
		return lead7;
	}
	
	public void setLead8(int value) {
		setLead8(new Integer(value));
	}
	
	public void setLead8(Integer value) {
		this.lead8 = value;
	}
	
	public Integer getLead8() {
		return lead8;
	}
	
	public void setLead9(int value) {
		setLead9(new Integer(value));
	}
	
	public void setLead9(Integer value) {
		this.lead9 = value;
	}
	
	public Integer getLead9() {
		return lead9;
	}
	
	public void setLead10(int value) {
		setLead10(new Integer(value));
	}
	
	public void setLead10(Integer value) {
		this.lead10 = value;
	}
	
	public Integer getLead10() {
		return lead10;
	}
	
	public void setLead11(String value) {
		this.lead11 = value;
	}
	
	public String getLead11() {
		return lead11;
	}
	
	public void setLead12(String value) {
		this.lead12 = value;
	}
	
	public String getLead12() {
		return lead12;
	}
	
	public void setMotiv1(int value) {
		setMotiv1(new Integer(value));
	}
	
	public void setMotiv1(Integer value) {
		this.motiv1 = value;
	}
	
	public Integer getMotiv1() {
		return motiv1;
	}
	
	public void setMotiv2(int value) {
		setMotiv2(new Integer(value));
	}
	
	public void setMotiv2(Integer value) {
		this.motiv2 = value;
	}
	
	public Integer getMotiv2() {
		return motiv2;
	}
	
	public void setMotiv3(int value) {
		setMotiv3(new Integer(value));
	}
	
	public void setMotiv3(Integer value) {
		this.motiv3 = value;
	}
	
	public Integer getMotiv3() {
		return motiv3;
	}
	
	public void setMotiv4(int value) {
		setMotiv4(new Integer(value));
	}
	
	public void setMotiv4(Integer value) {
		this.motiv4 = value;
	}
	
	public Integer getMotiv4() {
		return motiv4;
	}
	
	public void setMotiv5(int value) {
		setMotiv5(new Integer(value));
	}
	
	public void setMotiv5(Integer value) {
		this.motiv5 = value;
	}
	
	public Integer getMotiv5() {
		return motiv5;
	}
	
	public void setMotiv6(int value) {
		setMotiv6(new Integer(value));
	}
	
	public void setMotiv6(Integer value) {
		this.motiv6 = value;
	}
	
	public Integer getMotiv6() {
		return motiv6;
	}
	
	public void setMotiv7(int value) {
		setMotiv7(new Integer(value));
	}
	
	public void setMotiv7(Integer value) {
		this.motiv7 = value;
	}
	
	public Integer getMotiv7() {
		return motiv7;
	}
	
	public void setMotiv8(int value) {
		setMotiv8(new Integer(value));
	}
	
	public void setMotiv8(Integer value) {
		this.motiv8 = value;
	}
	
	public Integer getMotiv8() {
		return motiv8;
	}
	
	public void setMotiv9(String value) {
		this.motiv9 = value;
	}
	
	public String getMotiv9() {
		return motiv9;
	}
	
	public void setMotiv10(String value) {
		this.motiv10 = value;
	}
	
	public String getMotiv10() {
		return motiv10;
	}
	
	public void setService1(int value) {
		setService1(new Integer(value));
	}
	
	public void setService1(Integer value) {
		this.service1 = value;
	}
	
	public Integer getService1() {
		return service1;
	}
	
	public void setService2(int value) {
		setService2(new Integer(value));
	}
	
	public void setService2(Integer value) {
		this.service2 = value;
	}
	
	public Integer getService2() {
		return service2;
	}
	
	public void setService3(int value) {
		setService3(new Integer(value));
	}
	
	public void setService3(Integer value) {
		this.service3 = value;
	}
	
	public Integer getService3() {
		return service3;
	}
	
	public void setService4(int value) {
		setService4(new Integer(value));
	}
	
	public void setService4(Integer value) {
		this.service4 = value;
	}
	
	public Integer getService4() {
		return service4;
	}
	
	public void setService5(int value) {
		setService5(new Integer(value));
	}
	
	public void setService5(Integer value) {
		this.service5 = value;
	}
	
	public Integer getService5() {
		return service5;
	}
	
	public void setService6(int value) {
		setService6(new Integer(value));
	}
	
	public void setService6(Integer value) {
		this.service6 = value;
	}
	
	public Integer getService6() {
		return service6;
	}
	
	public void setService7(String value) {
		this.service7 = value;
	}
	
	public String getService7() {
		return service7;
	}
	
	public void setService8(String value) {
		this.service8 = value;
	}
	
	public String getService8() {
		return service8;
	}
	
	public void setExpose1(int value) {
		setExpose1(new Integer(value));
	}
	
	public void setExpose1(Integer value) {
		this.expose1 = value;
	}
	
	public Integer getExpose1() {
		return expose1;
	}
	
	public void setExpose2(int value) {
		setExpose2(new Integer(value));
	}
	
	public void setExpose2(Integer value) {
		this.expose2 = value;
	}
	
	public Integer getExpose2() {
		return expose2;
	}
	
	public void setExpose3(int value) {
		setExpose3(new Integer(value));
	}
	
	public void setExpose3(Integer value) {
		this.expose3 = value;
	}
	
	public Integer getExpose3() {
		return expose3;
	}
	
	public void setExpose4(int value) {
		setExpose4(new Integer(value));
	}
	
	public void setExpose4(Integer value) {
		this.expose4 = value;
	}
	
	public Integer getExpose4() {
		return expose4;
	}
	
	public void setExpose5(int value) {
		setExpose5(new Integer(value));
	}
	
	public void setExpose5(Integer value) {
		this.expose5 = value;
	}
	
	public Integer getExpose5() {
		return expose5;
	}
	
	public void setExpose6(int value) {
		setExpose6(new Integer(value));
	}
	
	public void setExpose6(Integer value) {
		this.expose6 = value;
	}
	
	public Integer getExpose6() {
		return expose6;
	}
	
	public void setExpose7(String value) {
		this.expose7 = value;
	}
	
	public String getExpose7() {
		return expose7;
	}
	
	public void setExpose8(String value) {
		this.expose8 = value;
	}
	
	public String getExpose8() {
		return expose8;
	}
	
	public void setParter1(int value) {
		setParter1(new Integer(value));
	}
	
	public void setParter1(Integer value) {
		this.parter1 = value;
	}
	
	public Integer getParter1() {
		return parter1;
	}
	
	public void setParter2(int value) {
		setParter2(new Integer(value));
	}
	
	public void setParter2(Integer value) {
		this.parter2 = value;
	}
	
	public Integer getParter2() {
		return parter2;
	}
	
	public void setParter3(int value) {
		setParter3(new Integer(value));
	}
	
	public void setParter3(Integer value) {
		this.parter3 = value;
	}
	
	public Integer getParter3() {
		return parter3;
	}
	
	public void setParter4(int value) {
		setParter4(new Integer(value));
	}
	
	public void setParter4(Integer value) {
		this.parter4 = value;
	}
	
	public Integer getParter4() {
		return parter4;
	}
	
	public void setParter5(int value) {
		setParter5(new Integer(value));
	}
	
	public void setParter5(Integer value) {
		this.parter5 = value;
	}
	
	public Integer getParter5() {
		return parter5;
	}
	
	public void setParter6(int value) {
		setParter6(new Integer(value));
	}
	
	public void setParter6(Integer value) {
		this.parter6 = value;
	}
	
	public Integer getParter6() {
		return parter6;
	}
	
	public void setParter7(int value) {
		setParter7(new Integer(value));
	}
	
	public void setParter7(Integer value) {
		this.parter7 = value;
	}
	
	public Integer getParter7() {
		return parter7;
	}
	
	public void setParter8(String value) {
		this.parter8 = value;
	}
	
	public String getParter8() {
		return parter8;
	}
	
	public void setParter9(String value) {
		this.parter9 = value;
	}
	
	public String getParter9() {
		return parter9;
	}
	
	public void setParter10(String value) {
		this.parter10 = value;
	}
	
	public String getParter10() {
		return parter10;
	}
	
	public void setRankfact1(String value) {
		this.rankfact1 = value;
	}
	
	public String getRankfact1() {
		return rankfact1;
	}
	
	public void setRankfact2(int value) {
		setRankfact2(new Integer(value));
	}
	
	public void setRankfact2(Integer value) {
		this.rankfact2 = value;
	}
	
	public Integer getRankfact2() {
		return rankfact2;
	}
	
	public void setRankfact3(int value) {
		setRankfact3(new Integer(value));
	}
	
	public void setRankfact3(Integer value) {
		this.rankfact3 = value;
	}
	
	public Integer getRankfact3() {
		return rankfact3;
	}
	
	public void setRankfact4(int value) {
		setRankfact4(new Integer(value));
	}
	
	public void setRankfact4(Integer value) {
		this.rankfact4 = value;
	}
	
	public Integer getRankfact4() {
		return rankfact4;
	}
	
	public void setRankfact5(int value) {
		setRankfact5(new Integer(value));
	}
	
	public void setRankfact5(Integer value) {
		this.rankfact5 = value;
	}
	
	public Integer getRankfact5() {
		return rankfact5;
	}
	
	public void setRankfact6(int value) {
		setRankfact6(new Integer(value));
	}
	
	public void setRankfact6(Integer value) {
		this.rankfact6 = value;
	}
	
	public Integer getRankfact6() {
		return rankfact6;
	}
	
	public void setRankfact7(String value) {
		this.rankfact7 = value;
	}
	
	public String getRankfact7() {
		return rankfact7;
	}
	
	public void setWayf1(int value) {
		setWayf1(new Integer(value));
	}
	
	public void setWayf1(Integer value) {
		this.wayf1 = value;
	}
	
	public Integer getWayf1() {
		return wayf1;
	}
	
	public void setWayf2(String value) {
		this.wayf2 = value;
	}
	
	public String getWayf2() {
		return wayf2;
	}
	
	public void setWayf3(String value) {
		this.wayf3 = value;
	}
	
	public String getWayf3() {
		return wayf3;
	}
	
	public void setWayf4(String value) {
		this.wayf4 = value;
	}
	
	public String getWayf4() {
		return wayf4;
	}
	
	public String toString() {
		return String.valueOf(getResponse_id());
	}
	
}
