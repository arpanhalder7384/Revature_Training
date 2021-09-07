package com.arpan.dao;

import com.arpan.exception.BusinessException;
import com.arpan.model.User;

public interface UserDAO {
	public boolean isValidUserCredentials(User user) throws BusinessException;
}
