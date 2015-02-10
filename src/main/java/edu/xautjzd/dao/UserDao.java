package edu.xautjzd.dao;

import edu.xautjzd.entity.User;
/**
 *
 * @author xautjzd
 */
public interface UserDao
{

	void save(User user);
    void update(User user);
    void delete(User user);
    User findById(Integer id);
}
