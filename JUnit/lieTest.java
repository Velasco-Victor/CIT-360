package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class lieTest {
	boolean truth = true;
	boolean lie = false;
	@Test
	public void test(){
		assertTrue(truth = lie);
	}
	@Test
	public void test2(){
		assertFalse(truth = lie);
	}
}
