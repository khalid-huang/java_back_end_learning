package com.ssh2.dao;

import java.util.List;

import com.ssh2.model.PageBean;
import com.ssh2.model.User;

public interface UserDao {
	public void add(User user);
	public boolean login(User user);
	public List getUser();
	public User getUser(int id);
	public void update(User user);
	public void delete(int id);
	public List queryForPag(String hql,int start,int size);
	public int getAllRowCount(String hql);
	public PageBean queryForPage(int pageSize,int currentPage);
}
