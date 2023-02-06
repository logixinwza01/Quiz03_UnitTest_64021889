import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuizTest {
	
	Quiz obj;
	
	@Before
	public void setUp() {
		obj = new Quiz();
	}
	
	@Test
	// 1. Square Area
	public void test01() {
		assertEquals(obj.square(5), 25);

	}
	// 2. Number of "a" and "A" letters
	public void test02() {
		assertTrue(obj.countLetterA("a", "A", "a"), 1);
		
	}
	// 3. Two Letters are the same
	public void test03() {
		
	}
}
