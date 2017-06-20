package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class nullTest {
	String Empty = null;
	String Full = "Full";

	@Test
	public void test(){
		assertNotNull(Full);
	}
	@Test
	public void test2(){
		assertNull(Full);
	}
	@Test
	public void test3(){
		assertNotNull(Empty);
	}
	@Test
	public void test4(){
		assertNull(Empty);
	}
}
