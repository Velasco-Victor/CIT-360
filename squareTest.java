package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		JunitTest test = new JunitTest();
		
		int output = test.square(5);
		assertEquals(25, output);
	}

}
