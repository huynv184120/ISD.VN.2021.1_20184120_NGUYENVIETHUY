import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.PlaceOrderController;


class ValidateNameTest {

	
	private PlaceOrderController classUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new PlaceOrderController();
		
	}
	@Test
	void test0() {
		assertEquals(true, classUnderTest.validateName("nguyen viet huy"));
	}
	@Test
	void test1() {
		assertEquals(false,classUnderTest.validateName(""));
		
	}
	@Test
	void test2() {
		
		assertEquals(false,classUnderTest.validateName("    "));
		
	}
	@Test
	void test3() {
		
		assertEquals(false,classUnderTest.validateName("huy123*"));
		
	}
	@Test
	void test4() {
		
		assertEquals(false,classUnderTest.validateName("Huy"));
	}

}
