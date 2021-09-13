package cartServiceImplTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arpan.exception.BusinessException;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.service.cartService.CartService;
import com.arpan.service.cartService.impl.CartServiceImpl;

class CartServiceImplTest {

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
	void testAddToCart() {
		CartService cartService=new CartServiceImpl();
		Product product=new Product(1,"Samsung M31",17000.00,2,"Mobile");
		try {
			assertTrue(cartService.addToCart(product, 2, 9010), "Product Added Successfully");
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void testAddToCartIfQuantityZero() {
		CartService cartService=new CartServiceImpl();
		Product product=new Product(1,"Samsung M31",17000.00,2,"Mobile");
		try {
			assertFalse(cartService.addToCart(product, 0, 9010), "Product Added Successfully");
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testRomoveItemFromCart() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCartDetails() {
		fail("Not yet implemented");
	}

}
