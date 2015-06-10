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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Survey_responseDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Survey_responseDetachedCriteria() {
		super(entityclasses.Survey_response.class, entityclasses.Survey_responseCriteria.class);
		response_id = new IntegerExpression("response_id", this.getDetachedCriteria());
		cat = new StringExpression("cat", this.getDetachedCriteria());
		submit_dt = new TimestampExpression("submit_dt", this.getDetachedCriteria());
		rname = new StringExpression("rname", this.getDetachedCriteria());
		gender = new StringExpression("gender", this.getDetachedCriteria());
		agerange = new IntegerExpression("agerange", this.getDetachedCriteria());
		entityn = new StringExpression("entityn", this.getDetachedCriteria());
		entityt = new StringExpression("entityt", this.getDetachedCriteria());
		entityto = new StringExpression("entityto", this.getDetachedCriteria());
		tyears = new IntegerExpression("tyears", this.getDetachedCriteria());
		dyear = new IntegerExpression("dyear", this.getDetachedCriteria());
		cyear = new IntegerExpression("cyear", this.getDetachedCriteria());
		rank = new StringExpression("rank", this.getDetachedCriteria());
		department = new StringExpression("department", this.getDetachedCriteria());
		rship = new StringExpression("rship", this.getDetachedCriteria());
		rshipother = new StringExpression("rshipother", this.getDetachedCriteria());
		aware1 = new IntegerExpression("aware1", this.getDetachedCriteria());
		aware2 = new StringExpression("aware2", this.getDetachedCriteria());
		aware3 = new IntegerExpression("aware3", this.getDetachedCriteria());
		aware4 = new StringExpression("aware4", this.getDetachedCriteria());
		aware5 = new IntegerExpression("aware5", this.getDetachedCriteria());
		aware6 = new StringExpression("aware6", this.getDetachedCriteria());
		lead1 = new IntegerExpression("lead1", this.getDetachedCriteria());
		lead2 = new IntegerExpression("lead2", this.getDetachedCriteria());
		lead3 = new IntegerExpression("lead3", this.getDetachedCriteria());
		lead4 = new IntegerExpression("lead4", this.getDetachedCriteria());
		lead5 = new IntegerExpression("lead5", this.getDetachedCriteria());
		lead6 = new IntegerExpression("lead6", this.getDetachedCriteria());
		lead7 = new IntegerExpression("lead7", this.getDetachedCriteria());
		lead8 = new IntegerExpression("lead8", this.getDetachedCriteria());
		lead9 = new IntegerExpression("lead9", this.getDetachedCriteria());
		lead10 = new IntegerExpression("lead10", this.getDetachedCriteria());
		lead11 = new StringExpression("lead11", this.getDetachedCriteria());
		lead12 = new StringExpression("lead12", this.getDetachedCriteria());
		motiv1 = new IntegerExpression("motiv1", this.getDetachedCriteria());
		motiv2 = new IntegerExpression("motiv2", this.getDetachedCriteria());
		motiv3 = new IntegerExpression("motiv3", this.getDetachedCriteria());
		motiv4 = new IntegerExpression("motiv4", this.getDetachedCriteria());
		motiv5 = new IntegerExpression("motiv5", this.getDetachedCriteria());
		motiv6 = new IntegerExpression("motiv6", this.getDetachedCriteria());
		motiv7 = new IntegerExpression("motiv7", this.getDetachedCriteria());
		motiv8 = new IntegerExpression("motiv8", this.getDetachedCriteria());
		motiv9 = new StringExpression("motiv9", this.getDetachedCriteria());
		motiv10 = new StringExpression("motiv10", this.getDetachedCriteria());
		service1 = new IntegerExpression("service1", this.getDetachedCriteria());
		service2 = new IntegerExpression("service2", this.getDetachedCriteria());
		service3 = new IntegerExpression("service3", this.getDetachedCriteria());
		service4 = new IntegerExpression("service4", this.getDetachedCriteria());
		service5 = new IntegerExpression("service5", this.getDetachedCriteria());
		service6 = new IntegerExpression("service6", this.getDetachedCriteria());
		service7 = new StringExpression("service7", this.getDetachedCriteria());
		service8 = new StringExpression("service8", this.getDetachedCriteria());
		expose1 = new IntegerExpression("expose1", this.getDetachedCriteria());
		expose2 = new IntegerExpression("expose2", this.getDetachedCriteria());
		expose3 = new IntegerExpression("expose3", this.getDetachedCriteria());
		expose4 = new IntegerExpression("expose4", this.getDetachedCriteria());
		expose5 = new IntegerExpression("expose5", this.getDetachedCriteria());
		expose6 = new IntegerExpression("expose6", this.getDetachedCriteria());
		expose7 = new StringExpression("expose7", this.getDetachedCriteria());
		expose8 = new StringExpression("expose8", this.getDetachedCriteria());
		parter1 = new IntegerExpression("parter1", this.getDetachedCriteria());
		parter2 = new IntegerExpression("parter2", this.getDetachedCriteria());
		parter3 = new IntegerExpression("parter3", this.getDetachedCriteria());
		parter4 = new IntegerExpression("parter4", this.getDetachedCriteria());
		parter5 = new IntegerExpression("parter5", this.getDetachedCriteria());
		parter6 = new IntegerExpression("parter6", this.getDetachedCriteria());
		parter7 = new IntegerExpression("parter7", this.getDetachedCriteria());
		parter8 = new StringExpression("parter8", this.getDetachedCriteria());
		parter9 = new StringExpression("parter9", this.getDetachedCriteria());
		parter10 = new StringExpression("parter10", this.getDetachedCriteria());
		rankfact1 = new StringExpression("rankfact1", this.getDetachedCriteria());
		rankfact2 = new IntegerExpression("rankfact2", this.getDetachedCriteria());
		rankfact3 = new IntegerExpression("rankfact3", this.getDetachedCriteria());
		rankfact4 = new IntegerExpression("rankfact4", this.getDetachedCriteria());
		rankfact5 = new IntegerExpression("rankfact5", this.getDetachedCriteria());
		rankfact6 = new IntegerExpression("rankfact6", this.getDetachedCriteria());
		rankfact7 = new StringExpression("rankfact7", this.getDetachedCriteria());
		wayf1 = new IntegerExpression("wayf1", this.getDetachedCriteria());
		wayf2 = new StringExpression("wayf2", this.getDetachedCriteria());
		wayf3 = new StringExpression("wayf3", this.getDetachedCriteria());
		wayf4 = new StringExpression("wayf4", this.getDetachedCriteria());
	}
	
	public Survey_responseDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entityclasses.Survey_responseCriteria.class);
		response_id = new IntegerExpression("response_id", this.getDetachedCriteria());
		cat = new StringExpression("cat", this.getDetachedCriteria());
		submit_dt = new TimestampExpression("submit_dt", this.getDetachedCriteria());
		rname = new StringExpression("rname", this.getDetachedCriteria());
		gender = new StringExpression("gender", this.getDetachedCriteria());
		agerange = new IntegerExpression("agerange", this.getDetachedCriteria());
		entityn = new StringExpression("entityn", this.getDetachedCriteria());
		entityt = new StringExpression("entityt", this.getDetachedCriteria());
		entityto = new StringExpression("entityto", this.getDetachedCriteria());
		tyears = new IntegerExpression("tyears", this.getDetachedCriteria());
		dyear = new IntegerExpression("dyear", this.getDetachedCriteria());
		cyear = new IntegerExpression("cyear", this.getDetachedCriteria());
		rank = new StringExpression("rank", this.getDetachedCriteria());
		department = new StringExpression("department", this.getDetachedCriteria());
		rship = new StringExpression("rship", this.getDetachedCriteria());
		rshipother = new StringExpression("rshipother", this.getDetachedCriteria());
		aware1 = new IntegerExpression("aware1", this.getDetachedCriteria());
		aware2 = new StringExpression("aware2", this.getDetachedCriteria());
		aware3 = new IntegerExpression("aware3", this.getDetachedCriteria());
		aware4 = new StringExpression("aware4", this.getDetachedCriteria());
		aware5 = new IntegerExpression("aware5", this.getDetachedCriteria());
		aware6 = new StringExpression("aware6", this.getDetachedCriteria());
		lead1 = new IntegerExpression("lead1", this.getDetachedCriteria());
		lead2 = new IntegerExpression("lead2", this.getDetachedCriteria());
		lead3 = new IntegerExpression("lead3", this.getDetachedCriteria());
		lead4 = new IntegerExpression("lead4", this.getDetachedCriteria());
		lead5 = new IntegerExpression("lead5", this.getDetachedCriteria());
		lead6 = new IntegerExpression("lead6", this.getDetachedCriteria());
		lead7 = new IntegerExpression("lead7", this.getDetachedCriteria());
		lead8 = new IntegerExpression("lead8", this.getDetachedCriteria());
		lead9 = new IntegerExpression("lead9", this.getDetachedCriteria());
		lead10 = new IntegerExpression("lead10", this.getDetachedCriteria());
		lead11 = new StringExpression("lead11", this.getDetachedCriteria());
		lead12 = new StringExpression("lead12", this.getDetachedCriteria());
		motiv1 = new IntegerExpression("motiv1", this.getDetachedCriteria());
		motiv2 = new IntegerExpression("motiv2", this.getDetachedCriteria());
		motiv3 = new IntegerExpression("motiv3", this.getDetachedCriteria());
		motiv4 = new IntegerExpression("motiv4", this.getDetachedCriteria());
		motiv5 = new IntegerExpression("motiv5", this.getDetachedCriteria());
		motiv6 = new IntegerExpression("motiv6", this.getDetachedCriteria());
		motiv7 = new IntegerExpression("motiv7", this.getDetachedCriteria());
		motiv8 = new IntegerExpression("motiv8", this.getDetachedCriteria());
		motiv9 = new StringExpression("motiv9", this.getDetachedCriteria());
		motiv10 = new StringExpression("motiv10", this.getDetachedCriteria());
		service1 = new IntegerExpression("service1", this.getDetachedCriteria());
		service2 = new IntegerExpression("service2", this.getDetachedCriteria());
		service3 = new IntegerExpression("service3", this.getDetachedCriteria());
		service4 = new IntegerExpression("service4", this.getDetachedCriteria());
		service5 = new IntegerExpression("service5", this.getDetachedCriteria());
		service6 = new IntegerExpression("service6", this.getDetachedCriteria());
		service7 = new StringExpression("service7", this.getDetachedCriteria());
		service8 = new StringExpression("service8", this.getDetachedCriteria());
		expose1 = new IntegerExpression("expose1", this.getDetachedCriteria());
		expose2 = new IntegerExpression("expose2", this.getDetachedCriteria());
		expose3 = new IntegerExpression("expose3", this.getDetachedCriteria());
		expose4 = new IntegerExpression("expose4", this.getDetachedCriteria());
		expose5 = new IntegerExpression("expose5", this.getDetachedCriteria());
		expose6 = new IntegerExpression("expose6", this.getDetachedCriteria());
		expose7 = new StringExpression("expose7", this.getDetachedCriteria());
		expose8 = new StringExpression("expose8", this.getDetachedCriteria());
		parter1 = new IntegerExpression("parter1", this.getDetachedCriteria());
		parter2 = new IntegerExpression("parter2", this.getDetachedCriteria());
		parter3 = new IntegerExpression("parter3", this.getDetachedCriteria());
		parter4 = new IntegerExpression("parter4", this.getDetachedCriteria());
		parter5 = new IntegerExpression("parter5", this.getDetachedCriteria());
		parter6 = new IntegerExpression("parter6", this.getDetachedCriteria());
		parter7 = new IntegerExpression("parter7", this.getDetachedCriteria());
		parter8 = new StringExpression("parter8", this.getDetachedCriteria());
		parter9 = new StringExpression("parter9", this.getDetachedCriteria());
		parter10 = new StringExpression("parter10", this.getDetachedCriteria());
		rankfact1 = new StringExpression("rankfact1", this.getDetachedCriteria());
		rankfact2 = new IntegerExpression("rankfact2", this.getDetachedCriteria());
		rankfact3 = new IntegerExpression("rankfact3", this.getDetachedCriteria());
		rankfact4 = new IntegerExpression("rankfact4", this.getDetachedCriteria());
		rankfact5 = new IntegerExpression("rankfact5", this.getDetachedCriteria());
		rankfact6 = new IntegerExpression("rankfact6", this.getDetachedCriteria());
		rankfact7 = new StringExpression("rankfact7", this.getDetachedCriteria());
		wayf1 = new IntegerExpression("wayf1", this.getDetachedCriteria());
		wayf2 = new StringExpression("wayf2", this.getDetachedCriteria());
		wayf3 = new StringExpression("wayf3", this.getDetachedCriteria());
		wayf4 = new StringExpression("wayf4", this.getDetachedCriteria());
	}
	
	public Survey_response uniqueSurvey_response(PersistentSession session) {
		return (Survey_response) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Survey_response[] listSurvey_response(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Survey_response[]) list.toArray(new Survey_response[list.size()]);
	}
}

