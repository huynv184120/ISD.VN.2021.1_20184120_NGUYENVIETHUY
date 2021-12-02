import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.PlaceOrderController;



class ValidatePhoneNumberTest {
	private PlaceOrderController classUnderTest;
	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new PlaceOrderController();
	}

	@Test
	public void test0() {
		assertEquals(true,classUnderTest.validatePhoneNumber("0393841111"));
		
	}
	@Test
	public void test1() {
		
		assertEquals(true,classUnderTest.validatePhoneNumber("03938411110"));
		
	}
	@Test
	public void test2() {
		
		assertEquals(false,classUnderTest.validatePhoneNumber("3932841111"));
		
	}
	@Test
	public void tes3() {
		
		assertEquals(false,classUnderTest.validatePhoneNumber("03938411ss"));
		
	}
	@Test
	public void test4() {
		
		assertEquals(false,classUnderTest.validatePhoneNumber("03938411sss"));
		
	}
	@Test
	public void test5() {
		
		assertEquals(false,classUnderTest.validatePhoneNumber(""));
		
	}
	@Test
	public void test6() {
	
		assertEquals(false,classUnderTest.validatePhoneNumber("a      aaaa"));
	}

}
