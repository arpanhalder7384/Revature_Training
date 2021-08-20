package customerTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arpan.exception.BusinessException;
import com.arpan.service.customerService.CustomerService;
import com.arpan.service.customerService.impl.CustomerServiceImpl;
import com.arpan.model.Customer;


class CustomerServiceImplTest {

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
	void testCustomerLoginValidation() {
		CustomerService customerService=new CustomerServiceImpl();
		try {
			Customer customer=customerService.customerLoginValidation("test2@gmail.com","test");
			assertEquals(customer,customerService.customerLoginValidation("test2@gmail.com","test"));
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	void testCustomerLoginValidation2() {
		CustomerService customerService=new CustomerServiceImpl();
		try {
			assertNotNull(customerService.customerLoginValidation("test2@gmail.com","test"));
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	void testCustomerLoginValidation3() {
		CustomerService customerService=new CustomerServiceImpl();
		try {
			assertNull(customerService.customerLoginValidation("test","test"));
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	void testCreateNewCustomer() {
		fail("Not yet implemented");
	}

	@Test
	void testChangeOrderStatusToReceived() {
		CustomerService customerService=new CustomerServiceImpl();
		try {
			assertTrue(customerService.changeOrderStatusToReceived(900));
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
