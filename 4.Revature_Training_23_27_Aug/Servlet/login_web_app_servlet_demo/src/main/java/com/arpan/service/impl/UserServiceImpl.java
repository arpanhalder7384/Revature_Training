package com.arpan.service.impl;

import com.arpan.dao.UserDAO;
import com.arpan.dao.impl.UserDAOImpl;
import com.arpan.exception.BusinessException;
import com.arpan.model.User;
import com.arpan.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO=new UserDAOImpl();
	@Override
	public boolean isValidUserCredentials(User user) throws BusinessException {
		boolean b=false;
		if(user!=null && user.getUsername()!=null && user.getPassword()!=null && user.getUsername().matches("[A-Za-z]{3,8}[0-9]{3}") && user.getPassword().matches("[a-z]{3,8}@[0-9]{3,4}")) {
			//code here DAO
			b=userDAO.isValidUserCredentials(user);
		}else {
			throw new BusinessException("Invalid Login Credentials!!!!! Kind try Again.......... :)");
		}
		return b;
	}

}