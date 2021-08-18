package com.arpan.dao;

import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.exception.BusinessException;

public interface AdminDAO {
	public Customer adminLoginValidation(String n,String p) throws BusinessException;
}
