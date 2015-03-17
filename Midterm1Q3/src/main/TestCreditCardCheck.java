package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestCreditCardCheck {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_length_test() {
		assertTrue("True: ",CreditCardCheck.length_test(7634567456987L));
		assertTrue("True: ",CreditCardCheck.length_test(86345678769876L));
		assertTrue("True: ",CreditCardCheck.length_test(823456712398765L));
		assertTrue("True: ",CreditCardCheck.length_test(1434567654987654L));
		
		assertFalse("False: ", CreditCardCheck.length_test(6334567890L));
		assertFalse("False: ", CreditCardCheck.length_test(65345678901L));
		assertFalse("False: ", CreditCardCheck.length_test(613456789012L));
		assertFalse("False: ", CreditCardCheck.length_test(15345678901234567L));
	}
	
	private void assertFalse(String string, boolean length_test) {
		// TODO Auto-generated method stub
		
	}

	private void assertTrue(String string, boolean length_test) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void test_check_begin(){
		assertTrue("True: ",CreditCardCheck.check_begin(4L));
		assertTrue("True: ",CreditCardCheck.check_begin(37L));
		assertTrue("True: ",CreditCardCheck.check_begin(5L));
		assertTrue("True: ",CreditCardCheck.check_begin(6L));
		
		assertFalse("False: ", CreditCardCheck.check_begin(7L));
		assertFalse("False: ", CreditCardCheck.check_begin(8L));
		assertFalse("False: ", CreditCardCheck.check_begin(9L));
		assertFalse("False: ", CreditCardCheck.check_begin(0L));
	}

	@Test
	public void test_number_check(){
		assertTrue("True: ", CreditCardCheck.number_check(4430571608754463L));
		assertFalse("False: ", CreditCardCheck.number_check(7126345689087634L));
		
	}
	
}
