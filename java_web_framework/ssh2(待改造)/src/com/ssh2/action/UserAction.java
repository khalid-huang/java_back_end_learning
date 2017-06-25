package com.ssh2.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.ssh2.dao.UserDao;
import com.ssh2.model.PageBean;
import com.ssh2.model.User;

public class UserAction {
	private String message;
	private UserDao  ud;
	private User user;
	private int page;
	private PageBean pageBean;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public PageBean getPageBean() {
		return pageBean;
	}
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserDao getUd() {
		return ud;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setUd(UserDao ud) {
		this.ud = ud;
	}
	
	public String login(){
		if(ud.login(user)){	
			Map session = ActionContext.getContext().getSession();
			session.put("user", user);
			return "login";		
		}
		else{
			this.setMessage("µÇÂ¼Ê§°Ü£¡");
			return "fail";
		}
	}
	
	public String add(){
		ud.add(user);
		return "suc";
	}
	
	public String list(){
		List list = ud.getUser();
		ServletActionContext.getRequest().setAttribute("list", list);
		return "suc";
	}
	
	public String delete(){
		ud.delete(user.getId());
		return "list";
	}
	
	public String getUserById(){
		user = ud.getUser(user.getId());
		ServletActionContext.getRequest().setAttribute("list", user);
		return "suc";
	}
	
	public String update(){
		ud.update(user);
		return "list";
	}
	
	public String queryForPage(){
		this.pageBean = ud.queryForPage(2, page);
		return "suc";
	}
}
