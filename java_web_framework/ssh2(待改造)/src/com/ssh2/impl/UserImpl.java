package com.ssh2.impl;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.ssh2.dao.UserDao;
import com.ssh2.model.PageBean;
import com.ssh2.model.User;

@Transactional
public class UserImpl implements UserDao{
	@Resource private SessionFactory sessionFactory;
	public boolean login(User user) {
		Iterator<User> it;
		String hsql="from User u where u.username=? and u.password=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hsql);
		query.setString(0,user.getUsername());
		query.setString(1, user.getPassword());
		it = query.iterate();
		if(it.hasNext()){
		return true;
		}else{
			return false;
		}
	}

	public void add(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	public List getUser() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	public void delete(int id) {
		sessionFactory.getCurrentSession().delete(
				sessionFactory.getCurrentSession().get(User.class, id));
	}

	public User getUser(int id) {
		return (User)sessionFactory.getCurrentSession().get(User.class, id);
	}

	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);
	}
	
	/**
	 * 查询所有记录
	 */
	public int getAllRowCount(String hql) {
		int allRow = sessionFactory.getCurrentSession().createQuery(hql).list().size();
		return allRow;
	}
	
	/**
	 * 分页查询
	 */
	public List queryForPag(String hql, int start, int size) {
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(start);
		query.setMaxResults(size);
		List list = query.list();
		return list;
	}

	public PageBean queryForPage(int pageSize, int page) {
		String hql = "from User";
		int allRow = this.getAllRowCount(hql);
		int totalPage = PageBean.countTotalPage(pageSize, allRow);
		int size = pageSize;
		int start = PageBean.countStart(pageSize, page);
		int currentPage = PageBean.countCurrentPage(page);
		List list = this.queryForPag(hql, start, size);
		PageBean pb = new PageBean();
		pb.setAllRow(allRow);
		pb.setTotalPage(totalPage);
		pb.setCurrentPage(currentPage);
		pb.setList(list);
		pb.setPageSize(pageSize);
		pb.init();
		return pb;
	}

}
