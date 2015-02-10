package edu.xautjzd.dao.impl;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import edu.xautjzd.dao.CustomHibernateDaoSupport;
import edu.xautjzd.dao.UserDao;
import edu.xautjzd.entity.User;

/**
 *
 * @author xautjzd
 */
@Repository("userDao")

public class UserDaoImpl extends CustomHibernateDaoSupport implements UserDao
{

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(UserDaoImpl.class);
    
    public void save(User user) {
    //	getHibernateTemplate().save(user);
    	getHibernateTemplate().getSessionFactory().openSession().save(user);
    	LOG.info("Saved successfully!");
    }
    
    public void update(User user) {
    	getHibernateTemplate().getSessionFactory().openSession().update(user);
    }
    
    public void delete(User user){
    	getHibernateTemplate().getSessionFactory().openSession().delete(user);
	}

    public User findById(Integer id)
    {
        User user = (User)getHibernateTemplate().find("from User where id=?", id).get(0);
        return user;
    }
}
