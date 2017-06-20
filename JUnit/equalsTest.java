package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class equalsTest {
	String one = new String ("abc");
	String two = new String ("def");
	
	@Test
	public void test(){
		assertSame(one, two);
	}
	@Test
	public void test2(){
		assertNotSame(one, two);
	}

}
