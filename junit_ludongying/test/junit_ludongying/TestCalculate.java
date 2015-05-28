package junit_ludongying;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculate {

		private Calculate cal;
		
		@Before
		public void setUp(){
			cal = new Calculate();
		}
		
	 	@Test
		public void testAdd(){
	 		assertEquals("Add Error", 3, cal.add(1,2));
		}
	 	@Test
	 	public void testMinus(){
	 		int res = cal.minus(7, 5);
	 		assertEquals("MINUS Error", 2, res);
	 	}
	 
	 	@Test(expected=ArithmeticException.class)
	 	public void testDivide(){
	 		int res = cal.divide(7, 0);
	 		assertEquals("DIVIDE Error", 5, res);
	 	}
	 	
	 	@Test(timeout=200)
	 	public void testTime() throws InterruptedException{
	 	 	Thread.sleep(195);
	 		int rel = cal.divide(6, 3);
	 	}
	 	
	 	@Test
	 	public void testMulti(){
	 		int res = cal.multi(5, 6);
	 		assertEquals("MULTI Error",30,res);
	 	}

}
