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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Survey_responseCriteria extends AbstractORMCriteria {
	public final IntegerExpression response_id;
	public final StringExpression cat;
	public final TimestampExpression submit_dt;
	public final StringExpression rname;
	public final StringExpression gender;
	public final IntegerExpression agerange;
	public final StringExpression entityn;
	public final StringExpression entityt;
	public final StringExpression entityto;
	public final IntegerExpression tyears;
	public final IntegerExpression dyear;
	public final IntegerExpression cyear;
	public final StringExpression rank;
	public final StringExpression department;
	public final StringExpression rship;
	public final StringExpression rshipother;
	public final IntegerExpression aware1;
	public final StringExpression aware2;
	public final IntegerExpression aware3;
	public final StringExpression aware4;
	public final IntegerExpression aware5;
	public final StringExpression aware6;
	public final IntegerExpression lead1;
	public final IntegerExpression lead2;
	public final IntegerExpression lead3;
	public final IntegerExpression lead4;
	public final IntegerExpression lead5;
	public final IntegerExpression lead6;
	public final IntegerExpression lead7;
	public final IntegerExpression lead8;
	public final IntegerExpression lead9;
	public final IntegerExpression lead10;
	public final StringExpression lead11;
	public final StringExpression lead12;
	public final IntegerExpression motiv1;
	public final IntegerExpression motiv2;
	public final IntegerExpression motiv3;
	public final IntegerExpression motiv4;
	public final IntegerExpression motiv5;
	public final IntegerExpression motiv6;
	public final IntegerExpression motiv7;
	public final IntegerExpression motiv8;
	public final StringExpression motiv9;
	public final StringExpression motiv10;
	public final IntegerExpression service1;
	public final IntegerExpression service2;
	public final IntegerExpression service3;
	public final IntegerExpression service4;
	public final IntegerExpression service5;
	public final IntegerExpression service6;
	public final StringExpression service7;
	public final StringExpression service8;
	public final IntegerExpression expose1;
	public final IntegerExpression expose2;
	public final IntegerExpression expose3;
	public final IntegerExpression expose4;
	public final IntegerExpression expose5;
	public final IntegerExpression expose6;
	public final StringExpression expose7;
	public final StringExpression expose8;
	public final IntegerExpression parter1;
	public final IntegerExpression parter2;
	public final IntegerExpression parter3;
	public final IntegerExpression parter4;
	public final IntegerExpression parter5;
	public final IntegerExpression parter6;
	public final IntegerExpression parter7;
	public final StringExpression parter8;
	public final StringExpression parter9;
	public final StringExpression parter10;
	public final StringExpression rankfact1;
	public final IntegerExpression rankfact2;
	public final IntegerExpression rankfact3;
	public final IntegerExpression rankfact4;
	public final IntegerExpression rankfact5;
	public final IntegerExpression rankfact6;
	public final StringExpression rankfact7;
	public final IntegerExpression wayf1;
	public final StringExpression wayf2;
	public final StringExpression wayf3;
	public final StringExpression wayf4;
	
	public Survey_responseCriteria(Criteria criteria) {
		super(criteria);
		response_id = new IntegerExpression("response_id", this);
		cat = new StringExpression("cat", this);
		submit_dt = new TimestampExpression("submit_dt", this);
		rname = new StringExpression("rname", this);
		gender = new StringExpression("gender", this);
		agerange = new IntegerExpression("agerange", this);
		entityn = new StringExpression("entityn", this);
		entityt = new StringExpression("entityt", this);
		entityto = new StringExpression("entityto", this);
		tyears = new IntegerExpression("tyears", this);
		dyear = new IntegerExpression("dyear", this);
		cyear = new IntegerExpression("cyear", this);
		rank = new StringExpression("rank", this);
		department = new StringExpression("department", this);
		rship = new StringExpression("rship", this);
		rshipother = new StringExpression("rshipother", this);
		aware1 = new IntegerExpression("aware1", this);
		aware2 = new StringExpression("aware2", this);
		aware3 = new IntegerExpression("aware3", this);
		aware4 = new StringExpression("aware4", this);
		aware5 = new IntegerExpression("aware5", this);
		aware6 = new StringExpression("aware6", this);
		lead1 = new IntegerExpression("lead1", this);
		lead2 = new IntegerExpression("lead2", this);
		lead3 = new IntegerExpression("lead3", this);
		lead4 = new IntegerExpression("lead4", this);
		lead5 = new IntegerExpression("lead5", this);
		lead6 = new IntegerExpression("lead6", this);
		lead7 = new IntegerExpression("lead7", this);
		lead8 = new IntegerExpression("lead8", this);
		lead9 = new IntegerExpression("lead9", this);
		lead10 = new IntegerExpression("lead10", this);
		lead11 = new StringExpression("lead11", this);
		lead12 = new StringExpression("lead12", this);
		motiv1 = new IntegerExpression("motiv1", this);
		motiv2 = new IntegerExpression("motiv2", this);
		motiv3 = new IntegerExpression("motiv3", this);
		motiv4 = new IntegerExpression("motiv4", this);
		motiv5 = new IntegerExpression("motiv5", this);
		motiv6 = new IntegerExpression("motiv6", this);
		motiv7 = new IntegerExpression("motiv7", this);
		motiv8 = new IntegerExpression("motiv8", this);
		motiv9 = new StringExpression("motiv9", this);
		motiv10 = new StringExpression("motiv10", this);
		service1 = new IntegerExpression("service1", this);
		service2 = new IntegerExpression("service2", this);
		service3 = new IntegerExpression("service3", this);
		service4 = new IntegerExpression("service4", this);
		service5 = new IntegerExpression("service5", this);
		service6 = new IntegerExpression("service6", this);
		service7 = new StringExpression("service7", this);
		service8 = new StringExpression("service8", this);
		expose1 = new IntegerExpression("expose1", this);
		expose2 = new IntegerExpression("expose2", this);
		expose3 = new IntegerExpression("expose3", this);
		expose4 = new IntegerExpression("expose4", this);
		expose5 = new IntegerExpression("expose5", this);
		expose6 = new IntegerExpression("expose6", this);
		expose7 = new StringExpression("expose7", this);
		expose8 = new StringExpression("expose8", this);
		parter1 = new IntegerExpression("parter1", this);
		parter2 = new IntegerExpression("parter2", this);
		parter3 = new IntegerExpression("parter3", this);
		parter4 = new IntegerExpression("parter4", this);
		parter5 = new IntegerExpression("parter5", this);
		parter6 = new IntegerExpression("parter6", this);
		parter7 = new IntegerExpression("parter7", this);
		parter8 = new StringExpression("parter8", this);
		parter9 = new StringExpression("parter9", this);
		parter10 = new StringExpression("parter10", this);
		rankfact1 = new StringExpression("rankfact1", this);
		rankfact2 = new IntegerExpression("rankfact2", this);
		rankfact3 = new IntegerExpression("rankfact3", this);
		rankfact4 = new IntegerExpression("rankfact4", this);
		rankfact5 = new IntegerExpression("rankfact5", this);
		rankfact6 = new IntegerExpression("rankfact6", this);
		rankfact7 = new StringExpression("rankfact7", this);
		wayf1 = new IntegerExpression("wayf1", this);
		wayf2 = new StringExpression("wayf2", this);
		wayf3 = new StringExpression("wayf3", this);
		wayf4 = new StringExpression("wayf4", this);
	}
	
	public Survey_responseCriteria(PersistentSession session) {
		this(session.createCriteria(Survey_response.class));
	}
	
	public Survey_responseCriteria() throws PersistentException {
		this(entityclasses.UTSPersistentManager.instance().getSession());
	}
	
	public Survey_response uniqueSurvey_response() {
		return (Survey_response) super.uniqueResult();
	}
	
	public Survey_response[] listSurvey_response() {
		java.util.List list = super.list();
		return (Survey_response[]) list.toArray(new Survey_response[list.size()]);
	}
}

