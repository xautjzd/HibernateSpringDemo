package edu.xautjzd.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class CustomHibernateDaoSupport extends HibernateDaoSupport {

	@Autowired
	public void setFactory(SessionFactory sessionFactory) {
		 setSessionFactory(sessionFactory);
	}
}
