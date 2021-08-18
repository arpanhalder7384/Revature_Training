package com.arpan.dao;

import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.exception.BusinessException;

public interface AdminDAO {
	public boolean changePassword(String email_id,String password) throws BusinessException;
	public Admin getCustomerDetails(String email_id) throws BusinessException;
	public boolean changeContact(String email_id,Long contact) throws BusinessException;
}
