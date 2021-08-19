package com.arpan.service.adminService;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;

public interface AdminService {
	public Admin adminLoginValidation(String uname,String pass) throws BusinessException;
	public boolean changeOrderStatusToShipped() throws BusinessException;
}
