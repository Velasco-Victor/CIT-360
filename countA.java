package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class countA {

	@Test
	public void test() {
		JunitTest test = new JunitTest();
		int output = test.countA("Abra Cadabra");
		assertEquals(5, output);
	}

}
