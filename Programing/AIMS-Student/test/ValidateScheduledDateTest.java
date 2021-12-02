import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.PlaceOrderController;
import controller.PlaceRushOrderController;

class ValidateScheduledDateTest {
	private PlaceRushOrderController classUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new PlaceRushOrderController();
	}

	@Test
	void test0() {
		assertEquals(false, classUnderTest.validateScheduledDate("1-1-2021"));
	}
	@Test
	void test1() {
		assertEquals(true, classUnderTest.validateScheduledDate("1/1/2021"));
		
	}

}
