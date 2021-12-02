import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.PlaceOrderController;
import controller.PlaceRushOrderController;

class ValidateAddessRushTest {
	
	private PlaceRushOrderController classUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new PlaceRushOrderController();
		
	}

	@Test
	void test0() {
		assertEquals(false, classUnderTest.validateAddress(""));
	}
	@Test
	void test1() {
		assertEquals(false, classUnderTest.validateAddress("Phu tho"));
	}
	@Test
	void test2() {
		assertEquals(true, classUnderTest.validateAddress("Ha noi"));
	}
	@Test
	void test3() {
		assertEquals(false, classUnderTest.validateAddress("     "));
	}
	@Test
	void test4() {
		assertEquals(true, classUnderTest.validateAddress("Vinh Tuy, Ha noi"));
	}
}
