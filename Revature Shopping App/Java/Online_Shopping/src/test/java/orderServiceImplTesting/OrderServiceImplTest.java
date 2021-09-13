package orderServiceImplTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arpan.exception.BusinessException;
import com.arpan.model.Product;
import com.arpan.service.orderService.OrderService;
import com.arpan.service.orderService.impl.OrderServiceImpl;

class OrderServiceImplTest {

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
	void testGetOrderDetails() {
		fail("Not yet implemented");
	}

	@Test
	void testCancleOrder() {
		fail("Not yet implemented");
	}

	@Test
	void testPlaceOrder() {
		Product product=new Product(1,"Samsung M31",17000.00,2,"Mobile");
		OrderService orderService=new OrderServiceImpl();
		try {
			assertTrue(orderService.placeOrder(9001, product), "Order is Successfully Placed");
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testNoOfNewPlacedOrder() {
		OrderService orderService=new OrderServiceImpl();
		try {
			assertEquals(9, orderService.noOfNewPlacedOrder());
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testGetAllNewPlacedOrder() {
		fail("Not yet implemented");
	}

	@Test
	void testNoOfShippedOrder() {
		OrderService orderService=new OrderServiceImpl();
		try {
			assertEquals(0, orderService.noOfShippedOrder());
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testGetAllShippedOrderDetails() {
		fail("Not yet implemented");
	}

}
