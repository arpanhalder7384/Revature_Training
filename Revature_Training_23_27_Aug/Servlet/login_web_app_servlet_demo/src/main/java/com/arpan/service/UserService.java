package com.arpan.service;

import com.arpan.exception.BusinessException;
import com.arpan.model.User;

public interface UserService {

	public boolean isValidUserCredentials(User user) throws BusinessException;
}
