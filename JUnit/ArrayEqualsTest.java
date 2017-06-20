package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayEqualsTest {
	 String[] expectedArray = {"one", "two", "three"};
	 String[] wrongArray = {"four", "five", "six"};
     String[] resultArray =  {"one", "two", "three"};
     
     @Test
 	public void test(){
 		assertArrayEquals(expectedArray, resultArray);
 	}
     @Test
  	public void test2(){
  		assertArrayEquals(expectedArray, wrongArray);
  	}

}
