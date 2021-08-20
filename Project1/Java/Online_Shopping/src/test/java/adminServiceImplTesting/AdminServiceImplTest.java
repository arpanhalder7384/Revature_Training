package adminServiceImplTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arpan.service.adminService.AdminService;
import com.arpan.service.adminService.impl.AdminServiceImpl;
import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;

class AdminServiceImplTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdminLoginValidation() {
		fail("not implemented");
//		AdminService adminService=new AdminServiceImpl();
//		try {
//			Admin admin=adminService.adminLoginValidation("test2@gmail.com","test");
//			assertEquals(admin, adminService.adminLoginValidation("test2@gmail.com","test"));
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
	}
	
	@Test
	void testAdminLoginValidationEmailIdValidation1() {
		AdminService adminService=new AdminServiceImpl();
		try {
			assertNull(adminService.adminLoginValidation("test2","test"));
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Test
	void testAdminLoginValidationEmailIdValidation2() {
		AdminService adminService=new AdminServiceImpl();
		try {
			assertNotNull(adminService.adminLoginValidation("admin1@gmail.com","admin12345@"));
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Test
	void testChangeOrderStatusToShipped() {
		AdminService adminService=new AdminServiceImpl();
		try {
			assertTrue(adminService.changeOrderStatusToShipped(900));
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void testChangeOrderStatusToShipped2() {
		AdminService adminService=new AdminServiceImpl();
		try {
			assertFalse(adminService.changeOrderStatusToShipped(11111));
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
