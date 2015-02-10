package edu.xautjzd.service;

import edu.xautjzd.entity.User;

/**
 *
 * @author xautjzd
 */
public interface UserService
{
	void save(User user);
	void update(User user);
	void delete(User user);
	User findById(Integer id);
}
