package com.arpan.service.adminService.impl;

import org.apache.log4j.Logger;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.service.adminService.AdminService;
import com.arpan.service.customerService.impl.CustomerServiceImpl;
import com.arpan.dao.AdminDAO;
import com.arpan.dao.impl.AdminDAOImpl;

public class AdminServiceImpl implements AdminService{
	private static Logger log = Logger.getLogger(AdminServiceImpl.class);
	
	@Override
	public Admin adminLoginValidation(String uname, String pass) throws BusinessException {
		AdminDAO adminDAO=new AdminDAOImpl();
		Admin adminNew=null;
		if(uname.matches("^(.+)@(.+)$")) {
			adminNew=adminDAO.adminLoginValidation(uname, pass);
		}
		else {
			log.info("Invalid Username:"+uname+"\n");
		}
		return adminNew;
	}

	@Override
	public boolean changeOrderStatusToShipped(int orderId) throws BusinessException {
		AdminDAO adminDAO=new AdminDAOImpl();
		boolean b =adminDAO.changeOrderStatusToShipped(orderId);
		return b;
	}
}
