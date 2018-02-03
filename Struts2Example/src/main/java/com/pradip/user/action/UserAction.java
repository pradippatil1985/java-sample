package com.pradip.user.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.pradip.pojo.User;
import com.pradip.user.service.UserBo;

public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserBo userBo;
	
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String execute() throws Exception {
		if (null == this.userBo) {
			WebApplicationContext context = WebApplicationContextUtils
					.getRequiredWebApplicationContext(ServletActionContext.getServletContext());
			this.userBo = (UserBo) context.getBean("userBo");
		}
//		this.userBo.printUser();
		this.userBo.addDummyUsers();
		this.users = this.userBo.getUsers();

		return SUCCESS;
	}
}