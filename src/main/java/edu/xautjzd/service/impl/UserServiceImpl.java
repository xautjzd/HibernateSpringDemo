package edu.xautjzd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.xautjzd.dao.UserDao;
import edu.xautjzd.entity.User;
import edu.xautjzd.service.UserService;

/**
 *
 * @author xautjzd
 */
@Service("userService")
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserDao userDao;
    
    public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

    public void save(User user)
    {
        userDao.save(user);
    }
    
    public void update(User user){
    	userDao.update(user);
	}
    
    public void delete(User user){
    	userDao.delete(user);
	}

    
    public User findById(Integer id)
    {
        return userDao.findById(id);
    }
}
